import examplesJaCoCo.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSumPositiveValues_withNegativeValues() {
        int result = calculator.sumPositiveValues(-10, -20, -30);
        assertTrue(result == 0);
    }

    /*complemento del testeo para todo escenario*/
    @Test
    public void testSumPositiveValues_withPositiveValues() {
        int result = calculator.sumPositiveValues(10, 20, 30);
        assertTrue(result == 60);
    }
}
