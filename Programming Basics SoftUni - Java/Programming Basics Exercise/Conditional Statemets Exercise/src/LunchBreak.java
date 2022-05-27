import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tvShowName = scanner.nextLine();
        int durationPerEpisode = Integer.parseInt(scanner.nextLine());
        int durationOfLunchBreak = Integer.parseInt(scanner.nextLine());

        double lunchTime = durationOfLunchBreak / 8.0;
        double chillTime = durationOfLunchBreak / 4.0;

        double timeLeft = durationOfLunchBreak - lunchTime - chillTime;

        double difference = Math.abs(timeLeft - durationPerEpisode);

        if (timeLeft >= durationPerEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    tvShowName, Math.ceil(difference));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    tvShowName, Math.ceil(difference));
        }
    }
}
