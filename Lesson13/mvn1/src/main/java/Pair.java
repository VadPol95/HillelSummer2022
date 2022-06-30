public class Pair {
    private final String lowerCaseValue;
    private final String upperCaseValue;

    public Pair(String lowerCaseValue) {
        this.lowerCaseValue = lowerCaseValue;
        this.upperCaseValue = lowerCaseValue.toUpperCase();
    }


    @Override
    public String toString() {
        return "Pair{" +
                "lowerCaseValue='" + lowerCaseValue + '\'' +
                ", upperCaseValue='" + upperCaseValue + '\'' +
                '}';
    }
}