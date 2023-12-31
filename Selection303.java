import java.util.Scanner;
public class Selection303 {
    
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        double operand1, operand2, result;
        char operator;

        System.out.print("Input operand 1: ");
        operand1 = input03.nextDouble();
        System.out.print("Input operand 2: ");
        operand2 = input03.nextDouble();
        System.out.print("Input operator (+ - * /): ");
        operator = input03.next().charAt(0);

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                System.out.println(operand1 + " + " + operand2 + "=" + result);
                break;
            
            case '-':
                result = operand1 - operand2;
                System.out.println(operand1 + " - " + operand2 + "=" + result);
                break;

            case '*':
                result = operand1 * operand2;
                System.out.println(operand1 + " * " + operand2 + "=" + result);
                break;

            case '/':
                result = operand1 / operand2;
                System.out.println(operand1 + " / " + operand2 + "=" + result);
                break;
        }
    }
}