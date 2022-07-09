import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        // създаваме празен мап
        Map<Double, Integer> map = new TreeMap<>();

        for (double currentNumber : numbers) {
            // ако този номер липсва в мапа, сложи го като ключ и добави стойност 0
            map.putIfAbsent(currentNumber, 0);
            // след като добавим стойност 0, можем да я присвоим в променлива с примитивен тип данни,
            // в която държим текущия номер
            int currentValue = map.get(currentNumber);
            // слагаме в мапа текущия номер на "ключ" и на стойност - текущия номер (стойност) + 1
            // - за отброяване на повтарящи се числа
            map.put(currentNumber, currentValue + 1);

            // това е друг начин -> :
//            if (map.containsKey(currentNumber)) {
//                map.put(currentNumber, map.get(currentNumber) + 1);
//            } else {
//                map.put(currentNumber, 1);
//            }
        }
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
