package methods;
import methods.SupportMethods.Function;

public class NewtonRaphson {
    public static double newtonRaphson(double[] coefficients, double x0) throws Exception {
        final int iterations = 1000;
        final double tolerance = 0.00001;
        Function fx = new Function(coefficients);

        for(int i = 0; i < iterations; i++) {
            double f0 = Function.evaluateFunction(fx.functionCoefficients, x0, fx.degree);
            double derivative = NumericalDerivative.numericalDerivative(fx.functionCoefficients, x0);
            if(derivative == 0) {
                throw new Exception("Mathematical Error");
            }
            if(i == iterations) {
                throw new Exception("Not Convergent");
            }
            if(f0 <= tolerance) {
                break;
            }
            else{
                x0 = x0 - f0 / derivative;
            }    
        }
        return x0;
    }

    

}

