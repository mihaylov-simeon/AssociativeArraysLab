import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double customerBudget = Double.parseDouble(scanner.nextLine());
        int videoCardsCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int ramMemoryCount = Integer.parseInt(scanner.nextLine());

        double priceOfAllTech = (videoCardsCount * 250) + (processorsCount * ((videoCardsCount * 250) * 0.35)) +
                (ramMemoryCount * ((videoCardsCount * 250) * 0.10));

        if (videoCardsCount > processorsCount) {
             priceOfAllTech = priceOfAllTech - (priceOfAllTech * 0.15);
        }

        if (priceOfAllTech <= customerBudget) {
            System.out.printf("You have %.2f leva left!", Math.abs(priceOfAllTech - customerBudget));
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(customerBudget - priceOfAllTech));
        }
    }
}
