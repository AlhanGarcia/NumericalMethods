package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import methods.GaussElimination;

public class GaussJordanTests {

    @Test
    void test1() throws Exception {
        // x + y = 4
        // 2x - 3y = 9
        // x = 4.2, y = -0.2
        double matrix[][] = { { 1, 1, 4 },
                { 2, -3, 9 }};

        // Order of Matrix(n)
        int n = Math.min(matrix.length, matrix[0].length), flag = 0;

        // Performing Matrix transformation
        flag = GaussElimination.PerformOperation(matrix, n);

        if (flag == 1)
            flag = GaussElimination.CheckConsistency(matrix, n, flag);

        GaussElimination.PrintResult(matrix, n, flag);
        assertEquals(4.2, matrix[0][2] / matrix[0][0], 0.001);
        assertEquals(-0.2, matrix[1][2] / matrix[1][1], 0.001);
    }

}
