import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataStringCalculatorTest {

    @Test
        void twoIntegers(){
        // given
        String s = "5";
        String s1 = "10";
        // when
        int runMethod = StringCalculator.add("10", "20");
        //then
        Assertions.assertEquals(30, runMethod);
        }
}
