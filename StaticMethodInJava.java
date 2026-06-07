public class StaticMethodInJava {

    public static void main(String[] args) {

        // Calling the static add method
        int sum = add(70, 50, 80);
        System.out.printf("The sum of all the numbers is %d%n", sum);

        // Creating an object to call the instance add method
        StaticMethodInJava obj = new StaticMethodInJava();
        sum = obj.add(90, 40, 30);
        System.out.printf("The sum of all the numbers is %d%n", sum);

        // Calling the static details method
        details(21, "Kate Henry");
        details(35, "John Doe");
        details(22, "Frank Franklin");
    }

    // Instance method
    public int add(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    // Static method
    public static int add(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    // Static method
    public static void details(int age, String name) {
        System.out.printf("Your name is %s%n", name);
        System.out.printf("You are %d years old%n", age);
    }
}
