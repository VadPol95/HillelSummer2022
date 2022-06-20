public class Root {
    public static void main(String[] args) {

        calculateRoots(5, -4, 71);
        System.out.println();
        calculateRoots(1, -1, -1);
        System.out.println();
        calculateRoots(3, -6, 3);
    }


    public static double calculateRoots(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double resultOne, resultTwo = 0;

        if (discriminant < 0) {
            System.out.println("Does not solution");
            return 0;
        } else if (discriminant == 0) {
            System.out.println("The expression has one root.");
            resultOne = -b / (2 * a);
            System.out.println("x1,2 = " + resultOne);
            return resultOne;
        } else {
            System.out.println("The expression has two root.");
            resultOne = (-b + Math.sqrt(discriminant)) / (2 * a);
            resultTwo = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("x1 = " + resultOne + "; x2 = " + resultTwo);
            return resultOne;
        }
    }
}
