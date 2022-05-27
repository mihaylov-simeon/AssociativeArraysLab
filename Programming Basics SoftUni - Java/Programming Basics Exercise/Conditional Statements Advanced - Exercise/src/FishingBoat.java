import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupBudget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersNum = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (season) {
            case "Spring":
                price += 3000;
                break;
            case "Summer":
            case "Autumn":
                price += 4200;
                break;
            case "Winter":
                price += 2600;
                break;
        }

        if (fishersNum <= 6) {
            price *= 0.9;
        } else if (fishersNum <= 11) {
            price *= 0.85;
        } else {
            price *= 0.75;
        }

        if (fishersNum % 2 == 0 && !season.equals("Autumn")) {
            price *= 0.95;
        }

        double moneyLeft = Math.abs(groupBudget - price);

        if (groupBudget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", (moneyLeft));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", (moneyLeft));
        }
    }
}
