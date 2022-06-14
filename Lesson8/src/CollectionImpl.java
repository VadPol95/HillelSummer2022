
import java.util.Objects;

/**
 * метод add - добавляет значение и значение по индексу.
 * метод delete - удаляет значение.
 * метод get - получает значение по индексу.
 * метод contain - проверяет список на содержание какого-либо обьекта.
 * метод equals - сравнивает обьекты по размеру и значению.
 * метод clear - очищает массив от всех обьектов.
 * метод size - получает размер списка.
 */

public class CollectionImpl implements Collection {
    private String[] array;
    private int count;
    private final int INITIAL_CAPACITY = 10;

    public CollectionImpl() {
        this.array = new String[INITIAL_CAPACITY];
        this.count = 0;
    }

    @Override
    public boolean add(String o) {
        if (count == array.length) {
            grow(array.length * 2);
        }
        array[count++] = o;
        return true;
    }

    @Override
    public boolean add(int index, String o) {
        if (index < 0 || index > count) {
            return false;
        }
        if (index == array.length) {
            grow(array.length * 2);
        }
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = o;

        count++;
        return true;
    }


    @Override
    public boolean delete(String o) {
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], o)) {
                delete(i);
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        isOutOfBound(index);
        return array[index];
    }

    @Override
    public boolean contain(String value) {
        for (int i = 0; i < count; i++) {
            if (value == null & array[i] == null) {
                return true;
            }
            if (value == null | array[i] == null) {
                continue;
            }
            if (value.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Collection str) {
        for (int i = 0; i < str.size(); i++) {
            for (int j = 0; j < str.size(); j++) {
                if (!(str.get(i).contains(array[j]))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean clear() {
        array = new String[10];
        this.count = 0;
        return true;
    }

    @Override
    public int size() {
        return count;
    }


    private void grow(int newLength) {
        String[] newArray = new String[newLength];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;

    }

    private void isOutOfBound(int index) {
        if (index > count || index < 0) {
            throw new IndexOutOfBoundsException("Incorrect index entry");

        }
    }

    private boolean delete(int index) {
        if (index > count || index < 0) {
            return false;
        }
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
            array[count] = null;
        }
        count--;
        return true;
    }

}
