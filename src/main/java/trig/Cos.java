package trig;

public class Cos implements FunctionInterface {
    private double eps;
    private Sin sin;
    public Cos(double eps){
        this.eps = eps;
        this.sin = new Sin(eps);
    }
    public Cos(double eps, Sin sin){
        this.eps = eps;
        this.sin = sin;
    }
    public double calculate(double x){
        return 1 - 2 * Math.pow(sin.calculate(x / 2),2);
    }
    public double stubCalculate(double x){
        return Math.cos(x);
    }

    public Sin getSin() {
        return sin;
    }

    public void setSin(Sin sin) {
        this.sin = sin;
    }

    public void setEps(double eps) {
        this.eps = eps;
        this.sin.setEps(eps);
    }
}
