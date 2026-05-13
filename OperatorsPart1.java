public class OperatorsPart1 {
    public static void main(String[] args) {

        // Assignment Operator (=)
        int num = 200;
        System.out.printf("The value of num is %d%n", num);

        System.out.println();
        System.out.println("=====================================");

        // Arithmetic Operators (+, -, /, *, %)
        int num1 = 800;
        int num2 = 100;

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        double division = (double) num1 / num2;
        int multiplication = num1 * num2;
        int remainder = num1 % num2;

        System.out.println();
        System.out.println("=====================================");
        System.out.printf("The sum of %d + %d = %d%n", num1, num2, addition);
        System.out.printf("The difference of %d - %d = %d%n", num1, num2, subtraction);
        System.out.printf("The quotient of %d / %d = %.1f%n", num1, num2, division);
        System.out.printf("The product of %d * %d = %d%n", num1, num2, multiplication);
        System.out.printf("The remainder of %d %% %d = %d%n", num1, num2, remainder);
        System.out.println("=====================================");
    }
}
