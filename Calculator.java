package all_java;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("\033c");
        Scanner sc = new Scanner(System.in);
        double final_result = 0;

        while (true) {
            System.out.println("Enter any operation from these (+, -, *, /) or 'q' to quit: ");
            String op = sc.next();

            if (op.equals("q")) {
                break;
            }

            System.out.println("Enter the value of num1: ");
            double value1 = sc.nextDouble();

            System.out.println("Enter the value of num2: ");
            double value2 = sc.nextDouble();

            try {
                switch (op) {
                    case "+":
                        final_result = value1 + value2;
                        break;
                    case "-":
                        final_result = value1 - value2;
                        break;
                    case "*":
                        final_result = value1 * value2;
                        break;
                    case "/":
                        if (value2 == 0) {
                            throw new ArithmeticException("Divided by zero");
                        }
                        else{
                            final_result = value1 / value2;
                        }
                        break;
                    default:
                        System.out.println("Invalid task is asked to perform");
                        continue;
                }

                System.out.println("Result: " + final_result);
            } catch (ArithmeticException ae) {
                System.out.println("Error!!");
            }
        }
        sc.close();
    }
}

