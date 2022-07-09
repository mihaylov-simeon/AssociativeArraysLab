import java.util.*;
import java.util.stream.Collectors;

public class AddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        Map<String, Integer> wordMap = new LinkedHashMap<>();
        for (String word : wordList) {
            String currentWord = word.toLowerCase();
            Integer count = wordMap.get(currentWord);
            if (wordMap.containsKey(currentWord)) {
                wordMap.put(currentWord, count + 1);
            } else {
                wordMap.put(currentWord, 1);
            }
        }
        List<String> oddWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                oddWords.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", oddWords));
    }
}
