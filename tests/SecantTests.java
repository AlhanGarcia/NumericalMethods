package tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import methods.SupportMethods.Function;
import methods.Secant;

public class SecantTests {

    @Test
    void test1() throws Exception{
        // Function to test is x2 + x - 12, roots are -4 and 3
        // Initial guesses for negativeRoot are -5 and 0
        var negativeRoot = Secant.secant(new Function(new double[] {1.0, 1.0, -12.0}), -5, 0);
        // Initial guesses for positiveRoot are 0 and 5 
        var positiveRoot = Secant.secant(new Function(new double[] {1.0, 1.0, -12.0}), 0, 5);
        assertEquals(-4, negativeRoot, 0.001);
        assertEquals(3, positiveRoot, 0.001);

    }


}
