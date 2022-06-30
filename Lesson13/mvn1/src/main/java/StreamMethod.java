
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMethod {
    public static List<String> FilterStringByLengthAndCase(List<String> strings) {
        Predicate<String> isLowerCase = str -> str.equals(str.toLowerCase());
        Predicate<String> isFourSymbols = str -> (str.length() == 4);

        return strings.stream()
                .filter(isLowerCase.and(isFourSymbols))
                .collect(Collectors.toList());
    }

    public static List<Pair> toUpperCase(List<String> strings) {
        List<Pair> pairList = new ArrayList<>();
        strings.forEach(str -> pairList.add(new Pair(str)));
        return pairList;
    }

    public static double listsAverage(List<Integer> integers) {
        return integers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics()
                .getAverage();

    }
}
