import java.util.ArrayList;
import java.util.List;

public class RunDuplicate {
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
        System.out.println(Duplicate.nonDuplicate(arrayList));
    }
}
