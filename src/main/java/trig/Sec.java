package trig;

public class Sec {
    private double eps;
    private Cos cos;
    public Sec(double eps){
        this.eps = eps;
        this.cos = new Cos(eps);
    }
    public double calculate(double x){
        if ((x-Math.PI/2) % Math.PI != 0){
            return 1 / cos.calculate(x);
        }
        else {
            return Double.NaN;
        }
    }
}
