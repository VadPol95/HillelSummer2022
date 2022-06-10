public interface StringArrayService {

    boolean add(String value);

    boolean add(int index, String value);

    boolean delete(int index);

    boolean delete(String value);

    String get(int index);

    void printArray();
}
