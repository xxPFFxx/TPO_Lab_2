package log;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Ln {
    private double eps;
    public Ln(double eps){
        this.eps = eps;
    }
    public double calculate(double x){
        if (x < 0) return Double.NaN;
        if (x == 0) return Double.NEGATIVE_INFINITY;
        double result = Double.MAX_VALUE;
        double n = 1.0;
        double newResult = 0.0;

        while (abs(result - newResult) > eps) {
            result = newResult;
            newResult += (Math.pow((x - 1) / (x + 1), 2 * n - 1)) / (2 * n - 1);
            n++;
        }
        return 2 * newResult;
    }

    public double stubCalculate(double x){
        return Math.log(x);
    }
}
