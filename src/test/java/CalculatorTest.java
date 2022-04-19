import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void shouldReturn2() {
        Calculator calculator = new Calculator();
        int calculateRes = calculator.compute(1,1, '+');
        int exceptionRes = 2;
        Assert.assertEquals(exceptionRes, calculateRes);
    }

    @Test
    public void shouldReturn0() {
        Calculator calculator = new Calculator();
        int calculateRes = calculator.compute(1,1, '-');
        int exceptionRes = 0;
        Assert.assertEquals(exceptionRes, calculateRes);
    }
}