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
    @Test
        void resultTwoNumbersBetween(){
        Assertions.assertThat(StringCalculator.add("1,2")).isEqualTo(3);
    }
    @Test
        void resultSumNumbers(){
        Assertions.assertThat(StringCalculator.add("1,2,3,4,5")).isEqualTo(15);
    }
    @Test
    void resultCommasAndNline(){
        Assertions.assertThat(StringCalculator.add("1\n2,3")).isEqualTo(6);
    }


}