import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class ActualImplementation {
    static double  sin(double x, double eps) {
        return Math.sin(x);
    }

    static double cos(double x, double eps){
        return Math.cos(x);
    }


    static double sec(double x, double eps){
        if ((x-Math.PI/2) % Math.PI != 0){
            return 1 / Math.cos(x);
        }
        else {
            return Double.NaN;
        }
    }

    static double tan(double x, double eps){
        if ((x-Math.PI/2) % Math.PI != 0){
            return Math.tan(x);
        }
        else {
            return Double.NaN;
        }

    }

    static double cot(double x, double eps){
        if (x % Math.PI != 0){
            return Math.cos(x)/Math.sin(x);
        }
        else {
            return Double.NaN;
        }
    }

    static double ln(double x, double eps){
        return Math.log(x);
    }

    static double log_2(double x, double eps){
        return Math.log(x) / Math.log(2);
    }
    static double log_3(double x, double eps){
        return Math.log(x) / Math.log(3);
    }
    static double log_10(double x, double eps){
        return Math.log10(x);
    }
}
