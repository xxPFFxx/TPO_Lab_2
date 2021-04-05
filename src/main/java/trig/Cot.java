package trig;

public class Cot {
    private double eps;
    private Cos cos;
    private Sin sin;
    public Cot(double eps){
        this.eps = eps;
        this.cos = new Cos(eps);
        this.sin = new Sin(eps);
    }
    public double calculate(double x){
        if (x % Math.PI != 0){
            return cos.calculate(x) / sin.calculate(x);
        }
        else {
            return Double.NaN;
        }

    }
    public double stubCalculate(double x){
        if (x % Math.PI != 0){
            return Math.cos(x)/Math.sin(x);
        }
        else {
            return Double.NaN;
        }
    }
}
