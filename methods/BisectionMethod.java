package methods;
public class BisectionMethod {
    public static double bisection(double[] coefficients, double x0, double x1) throws Exception {
        int degree = coefficients.length;
        double tolerance = 1e-5;

        double f0 = evaluateFunction(coefficients, x0, degree);
        double f1 = evaluateFunction(coefficients, x1, degree);
        if(f0*f1 > 0){
            throw new Exception("Initial guesses are not correct, try with other initial guesses");
        }

        double f2 = Double.MAX_VALUE;
        double x2 = 0;
        while(Math.abs(f2) > tolerance){
            x2 = (x0 + x1) / 2;
            f0 = evaluateFunction(coefficients, x0, degree);
            f2 = evaluateFunction(coefficients, x2, degree);
            if(f0*f2 < 0){
                x1 = x2;
            }
            else{
                x0 = x2;
            }
        }
        return x2;
    }

    private static double evaluateFunction(double[] coefficients, double x, int degree){
        double res = 0;
        for(int i = 0; i < degree; i++) {
            res += coefficients[i] * Math.pow(x, (degree - 1 - i));
        }
        return res;
    }
}
