import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RpnCalculatorTest {
    @Test
    void should_return_1_when_given_1() {
        // given
        final String input = "1";
        final int output = 1;

        // when
        RpnCalculator rpnCalculator = new RpnCalculator();
        int result = rpnCalculator.calculate(input);

        // then
        assertThat(result).isEqualTo(output);
    }

    @Test
    void should_return_2_when_given_1_plus_1() {
        // given
        final String input = "1 1 +";
        final int output = 2;

        // when
        RpnCalculator rpnCalculator = new RpnCalculator();
        int result = rpnCalculator.calculate(input);

        // then
        assertThat(result).isEqualTo(output);
    }

    @Test
    void should_return_5_when_given_2_plus_3() {
        // given
        final String input = "2 3 +";
        final int output = 5;

        // when
        RpnCalculator rpnCalculator = new RpnCalculator();
        int result = rpnCalculator.calculate(input);

        // then
        assertThat(result).isEqualTo(output);
    }

    @Test
    void should_return_3_when_given_6_minus_3() {
        // given
        final String input = "6 3 -";
        final int output = 3;

        // when
        RpnCalculator rpnCalculator = new RpnCalculator();
        int result = rpnCalculator.calculate(input);

        // then
        assertThat(result).isEqualTo(output);
    }
}
