import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class IntegrationTest {
    FunctionsImplementation functionsImplementation = Mockito.mock(FunctionsImplementation.class);

    @Test
    public void easyTest(){
        when(functionsImplementation.sin(Math.PI/6, 0.00001)).thenReturn(0.5);
        assertEquals(functionsImplementation.sin(Math.PI/6, 0.00001), 0.5);
    }
}
