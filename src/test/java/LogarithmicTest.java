import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogarithmicTest {
    final double eps = 0.00001;
    FunctionsImplementation functionsImplementation = new FunctionsImplementation();
    @ParameterizedTest
    @ValueSource(doubles = {0.0, 0.3, 1.0, 1.5, 3.0})
    void custom_ln_check(double x) {
        assertEquals(ActualImplementation.ln(x, eps), functionsImplementation.ln(x, eps), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {0.0, 0.3, 1.0, 1.5, 3.0})
    void custom_log2_check(double x) {
        assertEquals(ActualImplementation.log_2(x, eps), functionsImplementation.log_2(x, eps), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {0.0, 0.3, 1.0, 1.5, 3.0})
    void custom_log3_check(double x) {
        assertEquals(ActualImplementation.log_3(x, eps), functionsImplementation.log_3(x, eps), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {0.0, 0.3, 1.0, 1.5, 3.0})
    void custom_log10_check(double x) {
        assertEquals(ActualImplementation.log_10(x, eps), functionsImplementation.log_10(x, eps), eps);
    }
}
