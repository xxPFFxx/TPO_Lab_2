
public class FunctionSystem {
    static double functionSystem(double x, double eps){
        FunctionsImplementation functionsImplementation = new FunctionsImplementation();
        if (x<=0){
            return Math.pow(Math.pow(((functionsImplementation.tan(x, eps) - functionsImplementation.sec(x, eps))*functionsImplementation.sin(x, eps))*(Math.pow(functionsImplementation.cot(x, eps),2)*functionsImplementation.sec(x,eps)),2),3);
        }
        else {
            return Math.pow(((functionsImplementation.log_2(x,eps)*functionsImplementation.log_10(x,eps) / functionsImplementation.ln(x,eps))+Math.pow(functionsImplementation.ln(x, eps), 2)) * functionsImplementation.log_3(x, eps),2);
        }
    }
}
