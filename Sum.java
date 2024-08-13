import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number");
        int firstNumber = in.nextInt();

        System.out.print("Input second number");
        int secondNumber = in.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.print(sum);

        in.close(); 
    }
}
