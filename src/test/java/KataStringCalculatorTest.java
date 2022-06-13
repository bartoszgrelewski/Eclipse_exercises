import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataStringCalculatorTest {

    @Test
        void resultEmptyString(){
        Assertions.assertThat(StringCalculator.add("")).isEqualTo(0);
    }
    @Test
        void resultNumberForOne(){
        Assertions.assertThat(StringCalculator.add("15")).isEqualTo(15);
        }
}