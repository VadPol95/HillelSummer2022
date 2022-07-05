import java.io.IOException;

public class BuildDigit {
    public static void start() throws IOException {
        String[] array = CheckNumber.stringsArray();
        String[][] matrix = makeMatrix(array.length);

        for (int i = 0; i < array.length; i++) {
            String[][] bufferMatrix = DigitMatrix.getDigitsMatrix(Math.toIntExact(Long.parseLong(array[i])));

            for (int j = 0; j < bufferMatrix.length; j++) {
                System.arraycopy(bufferMatrix[j], 0, matrix[j], i, bufferMatrix[j].length);
            }
        }

        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string);
                System.out.print(" ");
            }
            System.out.println();

        }

    }

    public static String[][] makeMatrix(int index) {
        return new String[6][index];
    }

}
