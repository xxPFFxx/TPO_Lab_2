
public class FunctionSystem {
    static double functionSystem(double x, double eps){
        if (x<=0){
            return Math.pow(Math.pow(((FunctionsImplementation.tan(x, eps) - FunctionsImplementation.sec(x, eps))*FunctionsImplementation.sin(x, eps))*(Math.pow(FunctionsImplementation.cot(x, eps),2)*FunctionsImplementation.sec(x,eps)),2),3);
        }
        else {
            return Math.pow(((FunctionsImplementation.log_2(x,eps)*FunctionsImplementation.log_10(x,eps) / FunctionsImplementation.ln(x,eps))+Math.pow(FunctionsImplementation.ln(x, eps), 2)) * FunctionsImplementation.log_3(x, eps),2);
        }
    }
}
