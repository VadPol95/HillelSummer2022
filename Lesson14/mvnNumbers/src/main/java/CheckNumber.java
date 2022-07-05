import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckNumber {
    public static String[] stringsArray() throws IOException {
        System.out.println("Enter a number, not a letter");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numbers = br.readLine();

        if (isDigit(numbers)) {
            String[] arrayNumbers = numbers.split("");
            String[] numbersFromConsole = new String[numbers.length()];

            for (int i = 0; i < arrayNumbers.length; i++) {
                numbersFromConsole[i] = String.valueOf(arrayNumbers[i]);

            }
            return numbersFromConsole;
        } else System.out.println("Invalid input, please try again)");
        return stringsArray();
    }


    public static boolean isDigit(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            String l = strNum;
        } catch (NumberFormatException exception) {
            return false;
        }
        return true;
    }
}
