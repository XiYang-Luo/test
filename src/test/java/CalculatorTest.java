import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void shouldReturn2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int calculateRes = calculator.compute(1,1, "Add");
        int exceptionRes = 2;
        Assert.assertEquals(exceptionRes, calculateRes);
    }

    @Test
    public void shouldReturn0() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int calculateRes = calculator.compute(1,1, "Sub");
        int exceptionRes = 0;
        Assert.assertEquals(exceptionRes, calculateRes);
    }

    @Test
    public void shouldReturnMutil() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int calculateRes = calculator.compute(2,3, "Mutil");
        int exceptionRes = 6;
        Assert.assertEquals(exceptionRes, calculateRes);
    }
}