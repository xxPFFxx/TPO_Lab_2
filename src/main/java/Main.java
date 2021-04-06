import log.Ln;
import log.Log;
import trig.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double eps = 0.00001;
        boolean cycle = true;
        boolean isFunc;
        String inputFunc;
        double base;
        double start;
        double end;
        double step;
        double epsInput = Double.NaN;
        String parameters;
        Sin sin = new Sin(eps);
        Cos cos = new Cos(eps);
        Sec sec = new Sec(eps);
        Tan tan = new Tan(eps);
        Cot cot = new Cot(eps);
        Ln ln = new Ln(eps);
        Log log2 = new Log(2, eps);
        Log log3 = new Log(3, eps);
        Log log10 = new Log(10, eps);
        FunctionSystem functionSystem = new FunctionSystem(sin, cos, sec, tan,cot,ln,log2,log3,log10);
        Scanner in = new Scanner(System.in);
        ArrayList<FunctionInterface> functions = new ArrayList<>();
        while (cycle){
            isFunc = true;
            while (isFunc){
                System.out.println("Choose on of the functions to add: sin\n cos\n sec\n tan\n cot\n ln\n log\n funcSystem\n");
                inputFunc = in.nextLine();
                switch (inputFunc){
                    case ("sin"):
                        functions.add(sin);
                        break;
                    case ("cos"):
                        functions.add(cos);
                        break;
                    case ("sec"):
                        functions.add(sec);
                        break;
                    case ("tan"):
                        functions.add(tan);
                        break;
                    case ("cot"):
                        functions.add(cot);
                        break;
                    case ("ln"):
                        functions.add(ln);
                        break;
                    case ("log"):
                        System.out.println("Enter base of log");
                        base = in.nextDouble();
                        if (base <= 0 || base == 1){
                            System.out.println("Incorrect base");
                            break;
                        }if (base % 1 != 0) {
                        System.out.println("Base should be integer");
                        break;
                    }
                        Log logBase = new Log(base, eps);
                        functions.add(logBase);
                        break;
                    case ("funcSystem"):
                        functions.add(functionSystem);
                        break;
                    default:
                        System.out.println("Function adding is over");
                        isFunc = false;
                        break;
                }
            }
                System.out.println("Enter precision");
                try{epsInput = in.nextDouble();}
                catch (Exception e){
                    System.out.println("Enter a number");
                }

                for (FunctionInterface func: functions){
                    func.setEps(epsInput);
                }

                System.out.println("Enter start, end and step");
                parameters = in.nextLine();
                String[] params = parameters.split(" ");
                start = Double.parseDouble(params[0]);
                end = Double.parseDouble(params[1]);
                step = Double.parseDouble(params[2]);

        }
    }
}