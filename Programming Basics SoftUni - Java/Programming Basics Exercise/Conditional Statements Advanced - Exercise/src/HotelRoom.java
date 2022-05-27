import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int vacationDays = Integer.parseInt(scanner.nextLine());

        double priceSt = 0.0;
        double priceAp = 0.0;

        switch (month) {
            case "May":
            case "October":
                priceSt = vacationDays * 50;
                priceAp = vacationDays * 65;

                if (vacationDays > 7 && vacationDays < 14) {
                    priceSt *= 0.95;
                } else if (vacationDays > 14) {
                    priceSt *= 0.70;
                    priceAp *= 0.90;
                } break;

                case "June":
                case "September":
                    priceSt = vacationDays * 75.20;
                    priceAp = vacationDays * 68.70;

                    if (vacationDays > 14) {
                        priceSt *= 0.80;
                        priceAp *= 0.90;
                    } break;

                case "July":
                case "August":
                    priceSt = vacationDays * 76;
                    priceAp = vacationDays * 77;

                    if (vacationDays > 14) {
                        priceAp *= 0.90;
                    } break;
            }

        System.out.printf("Apartment: %.2f lv.%n", priceAp);
        System.out.printf("Studio: %.2f lv.%n", priceSt);
        }
    }