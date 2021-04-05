import log.Ln;
import log.Log;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogarithmicTest {
    final double eps = 0.00001;
    @ParameterizedTest
    @ValueSource(doubles = {0.0, 0.3, 1.0, 1.5, 3.0})
    void custom_ln_check(double x) {
        Ln ln = new Ln(eps);
        assertEquals(ActualImplementation.ln(x, eps), ln.calculate(x), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {0.0, 0.3, 1.0, 1.5, 3.0})
    void custom_log2_check(double x) {
        Log log2 = new Log(2,eps);
        assertEquals(ActualImplementation.log_2(x, eps), log2.calculate(x), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {0.0, 0.3, 1.0, 1.5, 3.0})
    void custom_log3_check(double x) {
        Log log3 = new Log(3, eps);
        assertEquals(ActualImplementation.log_3(x, eps), log3.calculate(x), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {0.0, 0.3, 1.0, 1.5, 3.0})
    void custom_log10_check(double x) {
        Log log10 = new Log(10, eps);
        assertEquals(ActualImplementation.log_10(x, eps), log10.calculate(x), eps);
    }
}
