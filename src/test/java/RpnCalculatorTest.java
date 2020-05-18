import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RpnCalculatorTest {

    @Test
    void should_display_7_when_7_is_input(){
        // Given
        String input = "7";
        // When
        RpnCalculator rpnCalculator = new RpnCalculator();
        Integer result = rpnCalculator.calculate(input);
        // Then
        Integer expected = 7;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_display_17_when_17_is_input(){
        // Given
        String input = "17";
        // When
        RpnCalculator rpnCalculator = new RpnCalculator();
        Integer result = rpnCalculator.calculate(input);
        // Then
        Integer expected = 17;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_display_117_when_117_is_input(){
        // Given
        String input = "117";
        // When
        RpnCalculator rpnCalculator = new RpnCalculator();
        Integer result = rpnCalculator.calculate(input);
        // Then
        Integer expected = 117;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_return_7_for_addition_of_2_and_5(){
        // Given
        String input = "2 5 +";
        // When
        RpnCalculator rpnCalculator = new RpnCalculator();
        Integer result = rpnCalculator.calculate(input);
        // Then
        Integer expected = 7;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_return_14_for_addition_of_8_and_6(){
        // Given
        String input = "8 6 +";
        // When
        RpnCalculator rpnCalculator = new RpnCalculator();
        Integer result = rpnCalculator.calculate(input);
        // Then
        Integer expected = 14;
        Assertions.assertThat(result).isEqualTo(expected);
    }
}
