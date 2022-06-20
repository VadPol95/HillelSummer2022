import java.util.*;
import java.util.Collection;

public class Duplicate {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Vadym");
        arrayList.add("Vasiliy");
        arrayList.add("Artem");
        arrayList.add("Vadym");
        arrayList.add("Olesya");
        arrayList.add("Katya");
        arrayList.add("Katya");
        System.out.println(arrayList);
        nonDuplicate(arrayList);
        System.out.println(arrayList);

    }
    public static Collection nonDuplicate(Collection collection){
        Set<Object> set = new HashSet<>(collection);
        collection.clear();
        collection.addAll(set);
        return collection;
    }
}
