package methods;
import methods.SupportMethods.Function;

/**
 * Secant
 */
public class Secant {

    public static double secant(Function fx, double x0, double x1) throws Exception {
        final double tolerance = 1e-5;
        final int maxIterations = 1000;
        double x2 = 0;

        for (int i = 0; i < maxIterations; i++){
            double f0 = Function.evaluateFunction(fx.functionCoefficients, x0, fx.degree);
            double f1 = Function.evaluateFunction(fx.functionCoefficients, x1, fx.degree);
            if(f0 == f1) {
                throw new Exception("Mathematical error");
            }
            else {
                x2 = x1 - (x1-x0) * f1 / ( f1 - f0 );    
            }
            if( i == maxIterations){
                throw new Exception("Max number of iterations reached");
            }
            double f2 = Function.evaluateFunction(fx.functionCoefficients, x2, fx.degree);
            if(Math.abs(f2) < tolerance){
                break;
            }
            else{
                x0 = x1;
                x1 = x2;
            }   
        }
        return x2;
    }
}