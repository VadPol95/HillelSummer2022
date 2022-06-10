public class RunApp {
    public static void main(String[] args) {
        StringArrayServiceImpl stringArray = new StringArrayServiceImpl();
        stringArray.add("Vadym");
        stringArray.add("Artem");
        stringArray.add("Vladislav");
        stringArray.add("Arnold");
        stringArray.printArray();
        System.out.println();
        System.out.println(stringArray.get(0));
        System.out.println();
        stringArray.add(4, "Kostya");
        stringArray.printArray();
        System.out.println();
        stringArray.delete("Kostya");
        stringArray.delete(4);
        System.out.println();
        stringArray.printArray();


    }
}
