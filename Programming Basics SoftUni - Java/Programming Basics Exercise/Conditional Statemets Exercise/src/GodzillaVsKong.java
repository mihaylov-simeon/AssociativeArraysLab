import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double movieBudget = Double.parseDouble(scanner.nextLine());
        int numberOfAssistants = Integer.parseInt(scanner.nextLine());
        double budgetForAssistantClothing = Double.parseDouble(scanner.nextLine());

        double movieDecorPrice = 0.10 * movieBudget;
        double assistantClothingPrice = numberOfAssistants * budgetForAssistantClothing;

        if (numberOfAssistants >= 150) {
            assistantClothingPrice = assistantClothingPrice - (0.10 * assistantClothingPrice);
        }

        double totalMoneyNeeded = assistantClothingPrice + movieDecorPrice;
        double totalMoneyLeft = movieBudget - totalMoneyNeeded;

        if (totalMoneyNeeded > movieBudget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs " + "%.2f" + " leva more.", Math.abs(totalMoneyLeft));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with " + "%.2f" + " leva left.", totalMoneyLeft);
        }
    }
}
