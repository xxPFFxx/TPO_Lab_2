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
    public Cot(double eps, Sin sin){
        this.eps = eps;
        this.cos = new Cos(eps);
        this.sin = sin;
    }
    public Cot(double eps, Cos cos){
        this.eps = eps;
        this.cos = cos;
        this.sin = new Sin(eps);
    }
    public Cot(double eps, Sin sin, Cos cos){
        this.eps = eps;
        this.cos = cos;
        this.sin = sin;
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
