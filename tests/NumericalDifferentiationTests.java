package tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import methods.*;

public class NumericalDifferentiationTests {

    @Test
    void test1() throws Exception{
        // Function to test is x2 + x - 12, roots are -4 and 3
        // Initial guesses for negativeRoot are -5 and 0
        var res = NumericalDerivative.numericalDerivative(new double[] {1.0, 1.0, -12.0}, 2);
        // Initial guesses for positiveRoot are 0 and 5 
        assertEquals(5, res, 0.001);
    }

    @Test
    void test2() throws Exception{
        // Function to test is x2 + x - 12, roots are -4 and 3
        // Initial guesses for negativeRoot are -5 and 0
        var res = NumericalDerivative.numericalDerivative(new double[] {1.0, 1.0, -12.0}, 0);
        // Initial guesses for positiveRoot are 0 and 5 
        assertEquals(1, res, 0.001);
    }

    @Test
    void test3() throws Exception{
        // Function to test is x2 + x - 12, roots are -4 and 3
        // Initial guesses for negativeRoot are -5 and 0
        var res = NumericalDerivative.numericalDerivative(new double[] {1.0, 1.0, -12.0}, -5);
        // Initial guesses for positiveRoot are 0 and 5 
        assertEquals(-9, res, 0.001);
    }


}
