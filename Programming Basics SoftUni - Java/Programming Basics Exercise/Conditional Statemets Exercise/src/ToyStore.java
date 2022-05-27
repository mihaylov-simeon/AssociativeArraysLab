import java.util.Scanner;

public class ToyStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int toyTrucks = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = puzzles * 2.60;
        double talkingDollsPrice = talkingDolls * 3;
        double teddyBearsPrice = teddyBears * 4.10;
        double minionsPrice = minions * 8.2;
        double trucksPrice = toyTrucks * 2;

        int allToysCount = puzzles + talkingDolls + teddyBears + minions + toyTrucks;
        double allToysPrice = puzzlePrice + talkingDollsPrice + teddyBearsPrice + minionsPrice + trucksPrice;

        if (allToysCount >= 50) {
            double allToysPriceWithDiscount = allToysPrice * 0.25;
            allToysPrice = allToysPrice - allToysPriceWithDiscount;
        }

        double rent = allToysPrice * 0.10;
        double priceWithRent = allToysPrice - rent;

        if (priceWithRent >= tripPrice) {
            double totalPrice = priceWithRent - tripPrice;
            System.out.printf("Yes! " + "%.2f" + " lv left.", totalPrice);
        } else {
            double notEnoughMoney = tripPrice - priceWithRent;
            System.out.printf("Not enough money! " + "%.2f" + " lv needed.", notEnoughMoney);
        }
    }
}
