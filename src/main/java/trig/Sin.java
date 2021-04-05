package trig;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Sin {
    private double eps;
    public Sin(double eps){
        this.eps = eps;
    }

    public double calculate(double x){
        double result= Double.MAX_VALUE;
        double n = 1.0;
        double topFact= 1.0;
        double botFact= 1.0;
        double newResult= x;

        while (abs(result - newResult) > eps) {
            result = newResult;
            topFact = Math.pow(-1.0, n) * pow(x, 2*n + 1);
            botFact *= (2 * n) * (2 * n + 1);
            newResult += topFact / botFact;
            n++;
        }
        return newResult;
    }
    public double stubCalculate(double x){
        return Math.sin(x);
    }

    public double getEps() {
        return eps;
    }

    public void setEps(double eps) {
        this.eps = eps;
    }
}
