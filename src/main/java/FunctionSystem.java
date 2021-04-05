import log.Ln;
import log.Log;
import trig.*;

public class FunctionSystem {
    static double functionSystem(double x, double eps){
        Sin sin = new Sin(eps);
        Sec sec = new Sec(eps);
        Tan tan = new Tan(eps);
        Cot cot = new Cot(eps);
        Ln ln = new Ln(eps);
        Log log2 = new Log(2, eps);
        Log log3 = new Log(3, eps);
        Log log10 = new Log(10, eps);
        if (x<=0){
            return Math.pow(Math.pow(((tan.calculate(x) - sec.calculate(x))* sin.calculate(x))*(Math.pow(cot.calculate(x), 2)* sec.calculate(x)),2),3);
        }
        else {
            return Math.pow(((log2.calculate(x)* log10.calculate(x) / ln.calculate(x))+Math.pow(ln.calculate(x), 2)) * log3.calculate(x),2);
        }
    }
}
