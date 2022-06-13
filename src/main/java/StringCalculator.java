import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {
    public static int add(String string) {
        if(!string.isEmpty()){
            List<Integer> stringNumbers = Arrays.stream(string.split(",|\n"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            return stringNumbers.stream()
                    .reduce(Integer::sum)
                    .orElseThrow();
        }
        return 0;
    }
}