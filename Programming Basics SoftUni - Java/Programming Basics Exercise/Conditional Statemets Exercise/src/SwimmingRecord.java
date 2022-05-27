import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeToSwimOneMeter = Double.parseDouble(scanner.nextLine());

        double allDistanceTime =  distanceInMeters * timeToSwimOneMeter;

        double waterResistance = Math.floor(distanceInMeters / 15) * 12.5;
        double timeWithWaterResistance = allDistanceTime + waterResistance;

        if (timeWithWaterResistance < recordInSec) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeWithWaterResistance);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeWithWaterResistance - recordInSec);
        }

    }
}
