package log;

import trig.FunctionInterface;

public class Log implements FunctionInterface {
    private double eps;
    private Ln ln;
    private double base;
    public Log(double base, double eps){
        this.eps = eps;
        this.ln = new Ln(eps);
        this.base = base;
    }
    public Log(double base, double eps, Ln ln){
        this.eps = eps;
        this.ln = ln;
        this.base = base;
    }
    public double calculate(double x){
        if (this.base <= 0 || this.base == 1) return Double.NaN;
        return ln.calculate(x) / ln.calculate(base);
    }

    public double stubCalculate(double x){
        return Math.log(x) / Math.log(base);
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setEps(double eps) {
        this.eps = eps;
        this.ln.setEps(eps);
    }
}
