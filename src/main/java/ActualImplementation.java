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
        return 1/Math.cos(x);
    }

    static double tan(double x, double eps){
        return Math.tan(x);
    }

    static double cot(double x, double eps){
        return 1/Math.sin(x);
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
