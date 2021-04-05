import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrigonometryTest {
    final double eps = 0.000001;
    FunctionsImplementation functionsImplementation = new FunctionsImplementation();
    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/6 - 2*Math.PI, -Math.PI, -Math.PI/2, -Math.PI/6, 0, Math.PI/6, Math.PI/2, Math.PI, Math.PI/6+2*Math.PI})
    void custom_sin_check(double x) {
        assertEquals(ActualImplementation.sin(x, eps), functionsImplementation.sin(x, eps), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/6 - 2*Math.PI, -Math.PI, -Math.PI/2, -Math.PI/6, 0, Math.PI/6, Math.PI/2, Math.PI, Math.PI/6+2*Math.PI})
    void custom_cos_check(double x) {
        assertEquals(ActualImplementation.cos(x, eps), functionsImplementation.cos(x, eps), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/6 - 2*Math.PI, -Math.PI, -Math.PI/2, -Math.PI/6, 0, Math.PI/6, Math.PI/2, Math.PI, Math.PI/6+2*Math.PI})
    void custom_sec_check(double x) {
        assertEquals(ActualImplementation.sec(x, eps), functionsImplementation.sec(x, eps), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/6 - 2*Math.PI, -Math.PI, -Math.PI/2, -Math.PI/6, 0, Math.PI/6, Math.PI/2, Math.PI, Math.PI/6+2*Math.PI})
    void custom_tan_check(double x) {
        assertEquals(ActualImplementation.tan(x, eps), functionsImplementation.tan(x, eps), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/6 - 2*Math.PI, -Math.PI, -Math.PI/2, -Math.PI/6, 0, Math.PI/6, Math.PI/2, Math.PI, Math.PI/6+2*Math.PI})
    void custom_cot_check(double x) {
        assertEquals(ActualImplementation.cot(x, eps), functionsImplementation.cot(x, eps), eps);
    }
}
