import log.Ln;
import log.Log;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
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
    public void testCos(){
        Cos cos = new Cos(eps, sinStub);
        assertEquals(cos.stubCalculate(Math.PI), cos.calculate(Math.PI),eps);
        assertEquals(cos.stubCalculate(Math.PI/2), cos.calculate(Math.PI/2),eps);
        assertEquals(cos.stubCalculate(Math.PI/4), cos.calculate(Math.PI/4),eps);
    }
    @Test
    public void testSec(){
        Sec sec = new Sec(eps, cosStub);
        assertEquals(sec.stubCalculate(Math.PI), sec.calculate(Math.PI),eps);
        assertEquals(sec.stubCalculate(Math.PI/2), sec.calculate(Math.PI/2),eps);
        assertEquals(sec.stubCalculate(Math.PI/4), sec.calculate(Math.PI/4),eps);
    }
    @Test
    public void testTanWithSin(){
        Tan tan = new Tan(eps, sinStub);
        assertEquals(tan.stubCalculate(Math.PI), tan.calculate(Math.PI),eps);
        assertEquals(tan.stubCalculate(Math.PI/2), tan.calculate(Math.PI/2),eps);
        assertEquals(tan.stubCalculate(Math.PI/4), tan.calculate(Math.PI/4),eps);
    }
    @Test
    public void testTanWithCos(){
        Tan tan = new Tan(eps, cosStub);
        assertEquals(tan.stubCalculate(Math.PI), tan.calculate(Math.PI),eps);
        assertEquals(tan.stubCalculate(Math.PI/2), tan.calculate(Math.PI/2),eps);
        assertEquals(tan.stubCalculate(Math.PI/4), tan.calculate(Math.PI/4),eps);
    }
    @Test
    public void testCotWithSin(){
        Cot cot = new Cot(eps, sinStub);
        assertEquals(cot.stubCalculate(Math.PI), cot.calculate(Math.PI),eps);
        assertEquals(cot.stubCalculate(Math.PI/2), cot.calculate(Math.PI/2),eps);
        assertEquals(cot.stubCalculate(Math.PI/4), cot.calculate(Math.PI/4),eps);
    }
    @Test
    public void testCotWithCos(){
        Cot cot = new Cot(eps, sinStub);
        assertEquals(cot.stubCalculate(Math.PI), cot.calculate(Math.PI),eps);
        assertEquals(cot.stubCalculate(Math.PI/2), cot.calculate(Math.PI/2),eps);
        assertEquals(cot.stubCalculate(Math.PI/4), cot.calculate(Math.PI/4),eps);
    }
    @Test
    public void testLogWithLn(){
        Log log2 = new Log(2,eps, lnStub);
        Log log3 = new Log(3,eps, lnStub);
        Log log10 = new Log(10,eps, lnStub);
        assertEquals(log2.stubCalculate(Math.PI), log2.calculate(Math.PI),eps);
        assertEquals(log2.stubCalculate(Math.PI/2), log2.calculate(Math.PI/2),eps);
        assertEquals(log2.stubCalculate(Math.PI/4), log2.calculate(Math.PI/4),eps);
        assertEquals(log3.stubCalculate(Math.PI), log3.calculate(Math.PI),eps);
        assertEquals(log3.stubCalculate(Math.PI/2), log3.calculate(Math.PI/2),eps);
        assertEquals(log3.stubCalculate(Math.PI/4), log3.calculate(Math.PI/4),eps);
        assertEquals(log10.stubCalculate(Math.PI), log10.calculate(Math.PI),eps);
        assertEquals(log10.stubCalculate(Math.PI/2), log10.calculate(Math.PI/2),eps);
        assertEquals(log10.stubCalculate(Math.PI/4), log10.calculate(Math.PI/4),eps);
    }
}
