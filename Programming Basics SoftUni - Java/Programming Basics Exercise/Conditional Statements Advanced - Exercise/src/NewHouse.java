import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerNum = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double rosePrice = flowerNum * 5;
        double dahliasPrice = flowerNum * 3.80;
        double tulipPrice = flowerNum * 2.8;
        double narcissusPrice = flowerNum * 3;
        double gladiolusPrice = flowerNum * 2.50;
        double allFlowersPrice = 0.0;

        if (flowerType.equalsIgnoreCase("roses") && flowerNum > 80) {
            allFlowersPrice = rosePrice - rosePrice * 0.1;
        } else if (flowerType.equalsIgnoreCase("roses") && flowerNum <= 80) {
            allFlowersPrice = rosePrice;
        } else if (flowerType.equalsIgnoreCase("dahlias") && flowerNum > 90) {
            allFlowersPrice = dahliasPrice - dahliasPrice * 0.15;
        } else if (flowerType.equalsIgnoreCase("dahlias") && flowerNum <= 90) {
            allFlowersPrice = dahliasPrice;
        } else if (flowerType.equalsIgnoreCase("tulips") && flowerNum > 80) {
            allFlowersPrice = tulipPrice - tulipPrice * 0.15;
        } else if ((flowerType.equalsIgnoreCase("tulips") && flowerNum <= 80)) {
            allFlowersPrice = tulipPrice;
        } else if (flowerType.equalsIgnoreCase("narcissus") && flowerNum < 120) {
            allFlowersPrice = narcissusPrice + narcissusPrice * 0.15;
        } else if (flowerType.equalsIgnoreCase("narcissus") && flowerNum >= 120) {
            allFlowersPrice = narcissusPrice;
        } else if (flowerType.equalsIgnoreCase("gladiolus") && flowerNum < 80) {
            allFlowersPrice = gladiolusPrice + gladiolusPrice * 0.2;
        } else if (flowerType.equalsIgnoreCase("gladiolus") && flowerNum >= 80) {
            allFlowersPrice = gladiolusPrice;
        }

        if (budget >= allFlowersPrice) {
            double moneyLeft = budget - allFlowersPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerNum, flowerType, moneyLeft);
        } else {
            double moneyLeft = allFlowersPrice - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", moneyLeft);
        }
    }
}
