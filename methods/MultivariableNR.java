package methods;

public class MultivariableNR {

    // f1 = x2 - 10x + y2 + 8 = 0
    // f2 = xy2 + x - 10y + 8 = 0

    // Jacobian matrix
    // df1/dx = 2x - 10 ; df1/dy = 2y
    // df2/dx = y2 + 1 ; df2/dy = 2xy - 10
    public static double[] multivariableNR(double x0, double y0) throws Exception {
        final double tolerance = 0.001;
        double module = tolerance + 1;
        while (module > tolerance) {
            double[][] Expandedjacobian = { { 2 * x0 - 10, 2 * y0, -Math.pow(x0, 2) + 10 * x0 - Math.pow(y0, 2) - 8 },
                    { Math.pow(y0, 2) + 1, 2 * x0 * y0 - 10, -x0 * Math.pow(y0, 2) - x0 + 10 * y0 - 8 } };
            int n = Math.min(Expandedjacobian.length, Expandedjacobian[0].length);
            GaussElimination.PerformOperation(Expandedjacobian, n);
            double h = Expandedjacobian[0][2] / Expandedjacobian[0][0];
            double j = Expandedjacobian[1][2] / Expandedjacobian[1][1];
            double x1 = x0 + h;
            double y1 = y0 + j;
            module = Math.pow((Math.pow((x1 - x0), 2) + Math.pow((y1 - y0), 2)), 0.5);
            x0 = x1; y0 = y1;
        }
        return new double[] {x0, y0};
    }
}
