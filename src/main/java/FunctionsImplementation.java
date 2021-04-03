import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class FunctionsImplementation {
    static double  sin(double x, double eps) {

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

    static double cos(double x, double eps){
        return 1 - 2 * Math.pow(sin(x / 2, eps),2);
    }


    static double sec(double x, double eps){
        return 1 / cos(x, eps);
    }

    static double tan(double x, double eps){
        return sin(x, eps) / cos(x, eps);
    }

    static double cot(double x, double eps){
        return cos(x, eps) / sin(x, eps);
    }

    static double ln(double x, double eps){
        if (x < 0) return Double.NaN;

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

    static double log_2(double x, double eps){
        return ln(x, eps) / ln(2.0, eps);
    }
    static double log_3(double x, double eps){
        return ln(x, eps) / ln(3.0, eps);
    }
    static double log_10(double x, double eps){
        return ln(x, eps) / ln(10.0, eps);
    }
}
