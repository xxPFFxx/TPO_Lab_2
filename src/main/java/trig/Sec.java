package trig;

public class Sec implements FunctionInterface {
    private double eps;
    private Cos cos;
    public Sec(double eps){
        this.eps = eps;
        this.cos = new Cos(eps);
    }
    public Sec(double eps, Cos cos){
        this.eps = eps;
        this.cos = cos;
    }
    public double calculate(double x){
        if ((x-Math.PI/2) % Math.PI != 0){
            return 1 / cos.calculate(x);
        }
        else {
            return Double.NaN;
        }
    }
    public double stubCalculate(double x){
        if ((x-Math.PI/2) % Math.PI != 0){
            return 1 / Math.cos(x);
        }
        else {
            return Double.NaN;
        }
    }

    public void setEps(double eps) {
        this.eps = eps;
        this.cos.setEps(eps);
    }
}
