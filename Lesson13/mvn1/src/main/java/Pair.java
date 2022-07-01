public class Pair {
    private final String lowerValue;
    private final String upperValue;

    public Pair(String lowerValue, String upperValue) {
        this.lowerValue = lowerValue;
        this.upperValue = upperValue;
    }


    @Override
    public String toString() {
        return "Pair{" +
                lowerValue + " : "
                + upperValue +
                '}';
    }

}