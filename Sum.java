import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        double firstNumber = in.nextDouble();

        System.out.print("Input second number: ");
        double secondNumber = in.nextDouble();

        System.out.print("Input operator(+, -, *, /, %): ");
        char operator = in.next().charAt(0);

        double sum;
        if (operator == '+' ){
            sum = firstNumber + secondNumber;
            System.out.print(sum);
        }

        if (operator == '-'){
            sum = firstNumber - secondNumber;
            System.out.print(sum);
        }

        if (operator == '*') {
            sum = firstNumber * secondNumber;
            System.out.print(sum);
        }

        if (operator == '/') {
            sum = firstNumber / secondNumber;
            System.out.print(sum);
        }

        if (operator == '%') {
            sum = firstNumber % secondNumber;
            System.out.print(sum);
        }

        in.close(); 
    }
}

