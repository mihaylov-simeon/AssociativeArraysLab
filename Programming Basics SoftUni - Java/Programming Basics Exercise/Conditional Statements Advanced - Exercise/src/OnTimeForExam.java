import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examTime = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int timeOfArrival = Integer.parseInt(scanner.nextLine());
        int minuteOfArrival = Integer.parseInt(scanner.nextLine());
        int timeDifference = (examTime * 60 + examMinute) - (timeOfArrival * 60 + minuteOfArrival);
        int hour = timeDifference / 60;
        int minute = timeDifference % 60;

        if (timeDifference > 30) {
            System.out.println("Early");
            if (timeDifference <= 59) {
                System.out.printf("%02d minutes before the start", timeDifference);;
            } else {
                System.out.printf("%d:%02d hours before the start", hour, minute);
            }
        } else if (timeDifference >= 0) {
            System.out.println("On time");
            if (timeDifference > 0) {
                System.out.printf("%d minutes before the start", timeDifference);
            }
        } else {
            System.out.println("Late");
            if (timeDifference >= -9) {
                System.out.printf("%2d minutes after the start", Math.abs(timeDifference));
            } else if (timeDifference >= -59) {
                System.out.printf("%d minutes after the start", Math.abs(timeDifference));
            } else {
                System.out.printf("%d:%02d hours after the start", Math.abs(hour), Math.abs(minute));
            }
        }
    }
}