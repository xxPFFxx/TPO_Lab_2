import log.Ln;
import log.Log;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import trig.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;

public class IntegrationTest {
    Sin sinStub = Mockito.mock(Sin.class);
    Cos cosStub = Mockito.mock(Cos.class);
    Sec secStub = Mockito.mock(Sec.class);
    Tan tanStub = Mockito.mock(Tan.class);
    Cot cotStub = Mockito.mock(Cot.class);
    Ln lnStub = Mockito.mock(Ln.class);
    Log log2Stub = Mockito.mock(Log.class);
    Log log3Stub = Mockito.mock(Log.class);
    Log log10Stub = Mockito.mock(Log.class);

    @BeforeAll
    void setupStubs(){
        log2Stub.setBase(2);
        log3Stub.setBase(3);
        log10Stub.setBase(10);
//        Mockito.when(sinStub.calculate(anyDouble())).
    }
}
