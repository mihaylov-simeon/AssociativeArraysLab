import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginningPoints = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (beginningPoints <= 100) {
            bonus = 5;
        } else if (beginningPoints > 1000) {
            bonus = beginningPoints * 0.1;
        } else {
            bonus = beginningPoints * 0.2;
        }

        if (beginningPoints % 2==0) {
            bonus = bonus + 1;
        } else if (beginningPoints % 10 == 5){
            bonus = bonus + 2;
        }

        System.out.println(bonus);
        System.out.println(beginningPoints + bonus);
    }
}
