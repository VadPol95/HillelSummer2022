public class RunCollection {
    public static void main(String[] args) {

        CollectionImpl stringCollection = new CollectionImpl();

        stringCollection.add("Vadym");
        stringCollection.add("Artem");
        stringCollection.add("Vladislav");
        stringCollection.add("Arnold");
        System.out.println(stringCollection.get(0).equals(stringCollection.get(1)));
        System.out.println(stringCollection.get(0));
        stringCollection.add(4, "Kostya");
        stringCollection.delete("Kostya");
        System.out.println(stringCollection.contain("Vadym"));
        stringCollection.iterator.remove();
        System.out.println(stringCollection.contain("Vadym"));
        System.out.println(stringCollection.iterator.hasNext());
        stringCollection.clear();
        System.out.println(stringCollection.contain("Vadym"));




    }
}