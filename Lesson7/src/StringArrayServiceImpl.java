import java.util.Objects;

public class StringArrayServiceImpl implements StringArrayService {
    private String[] array;
    private int count;

    public StringArrayServiceImpl() {
        this.array = new String[10];
        this.count = 0;
    }

    @Override
    public boolean add(String value) {
        if (count == array.length)
            grow(array.length * 2);
        array[count++] = value;
        return false;
    }

    @Override
    public boolean add(int index, String value) {
        if (index > count) {
            add(value);
        }
        if (index <= count) {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
        }
        count++;
        return false;
    }

    @Override
    public boolean delete(int index) {
        if (index > count) {
            return false;
        }
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
            array[count] = null;
        }
        count--;
        return true;
    }

    @Override
    public boolean delete(String value) {
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], value)) {
                delete(i);
            }
        }
        return false;

    }

    @Override
    public String get(int index) {
        return array[index];
    }

    @Override
    public void printArray() {
        for (String schedule : array) {
            System.out.println(schedule);
        }
    }

    private void grow(int newLength) {
        String[] newArray = new String[newLength];
        for (int i = 0; i < count; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
