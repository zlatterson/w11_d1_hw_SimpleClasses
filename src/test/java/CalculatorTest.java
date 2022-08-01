import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }
    @Test
    public void canAdd(){
        assertEquals(10, calculator.add(5,5));
    }
    @Test
    public void canSubtract(){
        assertEquals(10,calculator.subtract(20,10));
    }
    @Test
    public void canMultiply(){
        assertEquals(25, calculator.multiply(5,5));
    }
    @Test
    public void canDivide(){
        assertEquals(2.5, calculator.divide(5,2),0.001);
    }
}
