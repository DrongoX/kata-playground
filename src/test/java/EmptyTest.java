import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class EmptyTest {
    @Test
    public void calculate_with5_shouldReturn5()
    {
        //Given
        String entry = "5";

        //When
        int result = RPNCalculator.calculate(entry);

        //Then
        Assert.assertEquals(5, result);
    }

    @Test
    public void calculate_with7_shouldReturn7()
    {
        //Given
        String entry = "7";

        //When
        int result = RPNCalculator.calculate(entry);

        //Then
        Assert.assertEquals(7, result);
    }

    @Test
    public void calculate_with9_shouldReturn9()
    {
        //Given
        String entry = "9";

        //When
        int result = RPNCalculator.calculate(entry);

        //Then
        Assert.assertEquals(9, result);
    }
}
