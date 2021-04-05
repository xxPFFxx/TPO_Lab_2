import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class FunctionsImplementation {
    double  sin(double x, double eps) {

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

    double cos(double x, double eps){
        return 1 - 2 * Math.pow(sin(x / 2, eps),2);
    }


    double sec(double x, double eps){
        if ((x-Math.PI/2) % Math.PI != 0){
            return 1 / cos(x, eps);
        }
        else {
            return Double.NaN;
        }
    }

    double tan(double x, double eps){
        if ((x-Math.PI/2) % Math.PI != 0){
            return sin(x, eps) / cos(x, eps);
        }
        else {
            return Double.NaN;
        }

    }

    double cot(double x, double eps){
        if (x % Math.PI != 0){
            return cos(x, eps) / sin(x, eps);
        }
        else {
            return Double.NaN;
        }

    }

    double ln(double x, double eps){
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

    double log_2(double x, double eps){
        return ln(x, eps) / ln(2.0, eps);
    }
    double log_3(double x, double eps){
        return ln(x, eps) / ln(3.0, eps);
    }
    double log_10(double x, double eps){
        return ln(x, eps) / ln(10.0, eps);
    }
}
