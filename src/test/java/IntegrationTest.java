import log.Ln;
import log.Log;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import trig.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationTest {
    final double eps = 0.00001;

    static Sin sinStub = Mockito.mock(Sin.class);
    static Cos cosStub = Mockito.mock(Cos.class);
    static Sec secStub = Mockito.mock(Sec.class);
    static Tan tanStub = Mockito.mock(Tan.class);
    static Cot cotStub = Mockito.mock(Cot.class);
    static Ln lnStub = Mockito.mock(Ln.class);
    static Log log2Stub = Mockito.mock(Log.class);
    static Log log3Stub = Mockito.mock(Log.class);
    static Log log10Stub = Mockito.mock(Log.class);

    @BeforeClass
    public static void setupStubs(){
        log2Stub.setBase(2);
        log3Stub.setBase(3);
        log10Stub.setBase(10);
        Mockito.when(sinStub.calculate(Mockito.anyDouble())).thenAnswer(i -> Math.sin((Double) i.getArguments()[0]));
        Mockito.when(cosStub.calculate(Mockito.anyDouble())).thenAnswer(i -> Math.cos((Double) i.getArguments()[0]));
        Mockito.when(secStub.calculate(Mockito.anyDouble())).thenAnswer(i -> {
            if (((Double) i.getArguments()[0]-Math.PI/2) % Math.PI != 0){
                return 1/Math.cos((Double) i.getArguments()[0]);
            }
            else {
                return Double.NaN;
            }
        });
        Mockito.when(tanStub.calculate(Mockito.anyDouble())).thenAnswer(i -> {
            if (((Double) i.getArguments()[0]-Math.PI/2) % Math.PI != 0){
                return Math.tan((Double) i.getArguments()[0]);
            }
            else {
                return Double.NaN;
            }
        });
        Mockito.when(cotStub.calculate(Mockito.anyDouble())).thenAnswer(i -> {
            if ((Double) i.getArguments()[0] % Math.PI != 0){
                return Math.cos((Double) i.getArguments()[0])/Math.sin((Double) i.getArguments()[0]);
            }
            else {
                return Double.NaN;
            }
        });
        Mockito.when(lnStub.calculate(Mockito.anyDouble())).thenAnswer(i -> Math.log((Double) i.getArguments()[0]));
        Mockito.when(log2Stub.calculate(Mockito.anyDouble())).thenAnswer(i -> Math.log((Double) i.getArguments()[0]) / Math.log(2));
        Mockito.when(log3Stub.calculate(Mockito.anyDouble())).thenAnswer(i -> Math.log((Double) i.getArguments()[0]) / Math.log(3));
        Mockito.when(log10Stub.calculate(Mockito.anyDouble())).thenAnswer(i -> Math.log((Double) i.getArguments()[0]) / Math.log(10));
    }
    @Test
    public void easyTest(){
        //sinStub.setEps(eps);
        Cos cos = new Cos(eps, sinStub);
        //assertEquals(0, cos.calculate(Math.PI/2),eps);
        //assertEquals(1, sinStub.calculate(Math.PI/2),eps);
        System.out.println(secStub.calculate(Math.PI/2));

    }
}
