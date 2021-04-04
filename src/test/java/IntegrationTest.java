import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationTest {
    @ParameterizedTest
    @CsvSource({
            "-7, 0.000001",
            "-5, 0.000001",
            "-2.03, 0.000001",
            "-1.1, 0.000001",
            "0, 0.000001",
            "0.2, 0.000001",
            "1.55, 0.000001",
            "3.7, 0.000001",
            "5.7, 0.000001",
            "6.78, 0.000001"}
    )
    void custom_sin_check(double x, double eps) {
        assertEquals(ActualImplementation.sin(x, eps), FunctionsImplementation.sin(x, eps), eps);
    }
}
