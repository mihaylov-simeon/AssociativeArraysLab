import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());
        String symbol = scanner.nextLine();
        double result;

        switch (symbol) {
            case ("+"):
                result = firstNum + secondNum;
                System.out.printf("%.0f + %.0f = %.0f - ", firstNum, secondNum, result);

                if (result % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
                break;
            case ("-"):
                result = firstNum - secondNum;
                System.out.printf("%.0f - %.0f = %.0f - ", firstNum, secondNum, result);
                if (result % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
                break;
            case ("*"):
                result = firstNum * secondNum;
                System.out.printf("%.0f * %.0f = %.0f - ", firstNum, secondNum, result);
                if (result % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
                break;
            case ("/"):
                result = firstNum / secondNum;
                if (secondNum != 0) {;
                    System.out.printf("%.0f / %.0f = %.2f", firstNum, secondNum, result);
                } else {
                    System.out.printf("Cannot divide %.0f by zero", firstNum);
                }
                break;
            case ("%"):
                result = firstNum % secondNum;
                if (secondNum != 0) {
                    System.out.printf("%.0f %% %.0f = %.0f", firstNum, secondNum, result);
                } else {
                    System.out.printf("Cannot divide %.0f by zero", firstNum);
                }
                break;
        }
    }
}
