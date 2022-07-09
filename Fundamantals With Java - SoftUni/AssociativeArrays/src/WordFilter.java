import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // създаваме масив от думи и го сплитваме по интервал
        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                // филтрираме всяка прочетена дума и проверяваме (според дължината на масива) на всеки индекс,
                // дали думата е с четен брой букви
                .filter(word -> word.length() % 2 == 0)
                // тъй като трябва да върнем String[], а в момента имаме Object[]
                // инициализираме НОВ String[] масив
                .toArray(String[]::new);

        // System.out.println(String.join(System.lineSeparator(), words)); <- друг начин за принтиране
        
        for (String word : words) {
            System.out.println(word);
        }
    }
}
