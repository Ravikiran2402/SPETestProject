import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator c = new Calculator();

    @Test
    public void testPower() {
        Assert.assertEquals(125, c.power(5,3), 0);
    }

    @Test
    public void testFactorial() {
        Assert.assertEquals(120, c.factorial(5), 0);
    }

    @Test
    public void testLog() {
        Assert.assertEquals(2.63905732 , c.naturalLog(14), 0.1);
    }

    @Test
    public void testRoot() {
        Assert.assertEquals(4, c.squareRoot(16), 0);
    }
}