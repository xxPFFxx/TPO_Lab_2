public class Test {
    public static void main(String[] args) {
        FunctionsImplementation functionsImplementation = new FunctionsImplementation();
        System.out.println(functionsImplementation.sin(Math.PI/2, 0.0001));
        System.out.println(functionsImplementation.ln(Math.E, 0.0001));
        System.out.println(FunctionSystem.functionSystem(-2, 0.0001));
    }
}