import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        // създаваме MAP, който има за ключ - STRING и за стойност приема лист от STRING
        Map<String, List<String>> wordMap = new LinkedHashMap<>();

        // обхождаме броя n команди
        for (int i = 0; i < n; i++) {
            // създаваме променливи за думата и синонимите, които четат следващите редове
            String inputWord = scanner.nextLine();
            String synonym = scanner.nextLine();

            // в случай, че този ключ (inputWord) го няма
            if (!wordMap.containsKey(inputWord)) {
                // вземи го и го сложи, а на стойност слагаме НОВ ArrayList
                wordMap.put(inputWord, new ArrayList<>());
                // след като имаме листа, можем да го достъпим
                // взимаме ключа (.get) и към ТОЗИ ключ, добавяме като стойност прочетения synonym
                wordMap.get(inputWord).add(synonym);
            } else {
                // в противен случай, ако ключа съществува, просто добавяме към него synonym като достъпваме отново листа
                wordMap.get(inputWord).add(synonym);
            }
        }
        for (Map.Entry<String, List<String>> entry : wordMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
