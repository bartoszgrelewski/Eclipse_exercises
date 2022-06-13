import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {
    public static int add(String string) {
        if(!string.isEmpty()){
            List<Integer> stringNumbers = Arrays.stream(string.split("[,\n]"))
                    .map(Integer::parseInt).filter(num->num<=1000)
                    .collect(Collectors.toList());
            negativesNumbers(stringNumbers);
            return stringNumbers.stream()
                    .reduce(Integer::sum)
                    .orElseThrow();
        }
        return 0;
    }

    private static void negativesNumbers(List<Integer> stringNumbers) {
        StringBuilder stringBuilder = new StringBuilder();
        stringNumbers.stream()
                .filter(num->num<0)
                .forEach(num->stringBuilder.append(num).append(","));
        if(!stringBuilder.toString().isEmpty()){
            throw new RuntimeException("negatives not allowed"+ stringBuilder);
        }
    }
}