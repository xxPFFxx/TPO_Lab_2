import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrigonometryTest {
    final double eps = 0.000001;
    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/6 - 2*Math.PI, -Math.PI, -Math.PI/2, -Math.PI/6, 0, Math.PI/6, Math.PI/2, Math.PI, Math.PI/6+2*Math.PI})
    void custom_sin_check(double x) {
        assertEquals(ActualImplementation.sin(x, eps), FunctionsImplementation.sin(x, eps), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/6 - 2*Math.PI, -Math.PI, -Math.PI/2, -Math.PI/6, 0, Math.PI/6, Math.PI/2, Math.PI, Math.PI/6+2*Math.PI})
    void custom_cos_check(double x) {
        assertEquals(ActualImplementation.cos(x, eps), FunctionsImplementation.cos(x, eps), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/6 - 2*Math.PI, -Math.PI, -Math.PI/2, -Math.PI/6, 0, Math.PI/6, Math.PI/2, Math.PI, Math.PI/6+2*Math.PI})
    void custom_sec_check(double x) {
        assertEquals(ActualImplementation.sec(x, eps), FunctionsImplementation.sec(x, eps), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/6 - 2*Math.PI, -Math.PI, -Math.PI/2, -Math.PI/6, 0, Math.PI/6, Math.PI/2, Math.PI, Math.PI/6+2*Math.PI})
    void custom_tan_check(double x) {
        assertEquals(ActualImplementation.tan(x, eps), FunctionsImplementation.tan(x, eps), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/6 - 2*Math.PI, -Math.PI, -Math.PI/2, -Math.PI/6, 0, Math.PI/6, Math.PI/2, Math.PI, Math.PI/6+2*Math.PI})
    void custom_cot_check(double x) {
        assertEquals(ActualImplementation.cot(x, eps), FunctionsImplementation.cot(x, eps), eps);
    }
}
