package methods;

public class SupportMethods {
    public static class Function {

        public double[] functionCoefficients;
        public int degree;

        public Function(double[] coefficients) {
            functionCoefficients = coefficients;
            degree = coefficients.length;

        }

        public static double evaluateFunction(double[] coefficients, double x, int degree) {
            double res = 0;
            for (int i = 0; i < degree; i++) {
                res += coefficients[i] * Math.pow(x, (degree - 1 - i));
            }
            return res;
        }
    }
}