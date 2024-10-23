import java.util.Scanner;
public class simpcalc {
    public static void main(String[] args) {
        char operator;
        double number1 = 0, number2 = 0, result;
        Scanner obj = new Scanner(System.in);
        boolean ifValidOP = false;
        //
        while (true) {
            try {
                System.out.println("Please, enter your first number: ");
                number1 = obj.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                obj.next(); 
            }
        }
        //
        while (true) {
            try {
                System.out.print("Please, enter your second number: ");
                number2 = obj.nextDouble();
                break; 
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                obj.next();
            }
        }
        do {
            System.out.println("Please, choose your operation:\n+\n-\n*\n/\n%\n^");
            operator = obj.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%' || operator == '^') {
                ifValidOP = true;
            } else {
                System.out.println("Operation is not allowed! Please try again.");
            }
        } while (!ifValidOP);
        //
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero is not allowed!");
                }
                break;
            case '%':
                if (number2 != 0) {
                    result = number1 % number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Modulo by zero is not allowed!");
                }
                break;
            case '^':
                result = Math.pow(number1, number2);
                System.out.println("Result: " + result);
                break;
        }
    }
}