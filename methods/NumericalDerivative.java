package methods;

public class NumericalDerivative {
    
    // Using Newton's finite differences formula
    public static double numericalDerivative(double[] coefficients, double target){
        Function fx = new Function(coefficients);
        double interval = 0.00001;
        double back = Function.evaluateFunction(fx.functionCoefficients, target - interval, fx.degree);
        double front = Function.evaluateFunction(fx.functionCoefficients, target + interval, fx.degree);

        return (front - back) / ( 2 * interval);
    }
}
