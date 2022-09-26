package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import methods.MultivariableNR;

public class MultivariableNrTests {

    @Test
    void test1() throws Exception {
        double [] res = MultivariableNR.multivariableNR(0, 0);
        double[] expected = new double[] {1, 1};
        for(int i = 0; i < res.length; i++) {
            assertEquals(expected[i], res[i], 0.001);
        }
    }

}
