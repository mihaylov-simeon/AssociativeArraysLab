import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = "";
        String finalDestination = "";

        if(budget <= 100) {
            finalDestination = "Bulgaria";
            if ("summer".equals(season)) {
                place = "Camp";
                budget *= 0.30;
            } else if ("winter".equals(season)) {
                place = "Hotel";
                budget *= 0.70;
            }
        }
        else if (budget <= 1000) {
            finalDestination = "Balkans";
            if ("summer".equals(season)) {
                place = "Camp";
                budget *= 0.40;
            } else if ("winter".equals(season)) {
                place = "Hotel";
                budget *= 0.80;
            }
        } else {
            finalDestination = "Europe";
            budget *= 0.90;
            place = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", finalDestination);
        System.out.printf("%s - %.2f ", place, budget);
    }
}