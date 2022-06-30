
import java.util.*;

public class RunStream {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 312, 1, 23, 12, 3, 123, 12, 3, 12, 11);
        System.out.println(StreamMethod.listsAverage(integers));
        System.out.println("-------------------------------------------");
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        strings.add("five");
        strings.add("six");
        strings.add("seven");
        System.out.println(StreamMethod.toUpperCase(strings));
        System.out.println("-------------------------------------------");
        List<String> strings1 = new ArrayList<>();
        strings1.add("One");
        strings1.add("Two");
        strings1.add("three");
        strings1.add("four");
        strings1.add("five");
        System.out.println(StreamMethod.FilterStringByLengthAndCase(strings1));
    }
}
