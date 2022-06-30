import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StreamMethodTest {

    @Test
    void filterStringByLengthAndCase() {
        List<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("five");
        strings.add("Vadym");
        strings.add("Arnold");
        strings.add("four");
        assertEquals("[five, four]", StreamMethod.filterStringByLengthAndCase(strings).toString());
    }

    @Test
    void toUpperCase() {
        List<String> strings = new ArrayList<>();
        List<Pair> pairs = new ArrayList<>();
        strings.add("one");
        Pair pair = new Pair("one");
        pairs.add(pair);

        assertEquals(pairs.toString(), StreamMethod.toUpperCase(strings).toString());
    }


    @Test
    void listsAverage() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(5);
        integerList.add(5);
        assertEquals(5, StreamMethod.listsAverage(integerList));
    }
}