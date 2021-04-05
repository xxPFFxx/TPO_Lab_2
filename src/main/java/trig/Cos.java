package trig;

public class Cos {
    private double eps;
    private Sin sin;
    public Cos(double eps){
        this.eps = eps;
        this.sin = new Sin(eps);
    }
    public double calculate(double x){
        return 1 - 2 * Math.pow(sin.calculate(x / 2),2);
    }
}
