import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfStay = Integer.parseInt(scanner.nextLine());
        String typeOfAccommodation = scanner.nextLine();
        String feedback = scanner.nextLine();
        int nightsOfStay = daysOfStay - 1;

        double totalPrice = 0;

        switch (typeOfAccommodation) {
            case "room for one person":
                    totalPrice = nightsOfStay * 18;
                break;

            case "apartment":
                totalPrice = nightsOfStay * 25;

                if (nightsOfStay < 10) {
                    totalPrice = totalPrice * 0.70;
                } else if (nightsOfStay <= 15) {
                    totalPrice = totalPrice * 0.65;
                } else {
                    totalPrice = totalPrice * 0.50;
                } break;

            case "president apartment":
                totalPrice = nightsOfStay * 35;

                if (nightsOfStay < 10) {
                    totalPrice = totalPrice * 0.90;
                } else if (nightsOfStay <= 15) {
                    totalPrice = totalPrice * 0.85;
                } else {
                    totalPrice = totalPrice * 0.80;
                } break;
        }
                if (feedback.equals("positive")) {
                    totalPrice = totalPrice + (totalPrice * 0.25);
                } else if (feedback.equals("negative")) {
                    totalPrice = totalPrice - (totalPrice * 0.10);
                }

        System.out.printf("%.2f", totalPrice);
    }
}
