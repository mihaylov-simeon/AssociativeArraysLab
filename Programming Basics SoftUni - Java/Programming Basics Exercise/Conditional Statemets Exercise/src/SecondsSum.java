import java.util.Scanner;

public class SecondsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int runnerOneTime = Integer.parseInt(scanner.nextLine());
        int runnerTwoTime = Integer.parseInt(scanner.nextLine());
        int runnerThreeTime = Integer.parseInt(scanner.nextLine());

        int totalTime = runnerOneTime + runnerTwoTime + runnerThreeTime;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
