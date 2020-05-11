import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RPNCalculatorTest {

    @Test
    void should_calculate_0_when_input_0() {
        String input = "0";
        int expected = 0;
        RPNCalculator calculator = new RPNCalculator();

        int result = calculator.calculate(input);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_calculate_1_when_input_1() {
        String input = "1";
        int expected = 1;
        RPNCalculator calculator = new RPNCalculator();

        int result = calculator.calculate(input);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_calculate_2_when_input_2() {
        String input = "2";
        int expected = 2;
        RPNCalculator calculator = new RPNCalculator();

        int result = calculator.calculate(input);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}
