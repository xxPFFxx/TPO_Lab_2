import log.Ln;
import log.Log;
import trig.*;

public class FunctionSystem implements FunctionInterface {
    private double eps;
    private Sin sin;
    private Cos cos;
    private Sec sec;
    private Tan tan;
    private Cot cot;
    private Ln ln;
    private Log log2;
    private Log log3;
    private Log log10;

    public FunctionSystem(Sin sin, Cos cos, Sec sec, Tan tan, Cot cot, Ln ln, Log log2, Log log3, Log log10) {
        this.sin = sin;
        this.cos = cos;
        this.sec = sec;
        this.tan = tan;
        this.cot = cot;
        this.ln = ln;
        this.log2 = log2;
        this.log3 = log3;
        this.log10 = log10;
    }

    public double calculate(double x){
//        Sin sin = new Sin(eps);
//        Sec sec = new Sec(eps);
//        Tan tan = new Tan(eps);
//        Cot cot = new Cot(eps);
//        Ln ln = new Ln(eps);
//        Log log2 = new Log(2, eps);
//        Log log3 = new Log(3, eps);
//        Log log10 = new Log(10, eps);
        if (x<=0){
            return Math.pow(Math.pow(((tan.calculate(x) - sec.calculate(x))* sin.calculate(x))*(Math.pow(cot.calculate(x), 2)* sec.calculate(x)),2),3);
        }
        else {
            return Math.pow(((log2.calculate(x)* log10.calculate(x) / ln.calculate(x))+Math.pow(ln.calculate(x), 2)) * log3.calculate(x),2);
        }
    }

    @Override
    public void setEps(double eps) {
        this.eps = eps;
    }
}
