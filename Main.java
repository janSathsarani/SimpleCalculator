import java.util.Scanner;
public class Main {
    public static double add (double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return a / b;
    }
public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("--- Simple Calculate v1.0---");
    System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");

    System.out.println("Enter choice (1-4): ");
    int choice = scanner.nextInt();

    System.out.print("Enter first number: ");
    double num1 = scanner.nextDouble();

    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble();

    switch (choice) {
        case 1 -> System.out.println("Result: " + add(num1, num2));
        case 2 -> System.out.println("Result: " + subtract(num1, num2));
        case 3 -> System.out.println("Result: " + multiply(num1, num2));
        case 4 -> System.out.println("Result: " + divide(num1, num2));
        default -> System.out.println("Invalid Choice");
    }
}
}