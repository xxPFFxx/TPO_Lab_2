import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import trig.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrigonometryTest {
    final double eps = 0.000001;
    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/6 - 2*Math.PI, -Math.PI, -Math.PI/2, -Math.PI/6, 0, Math.PI/6, Math.PI/2, Math.PI, Math.PI/6+2*Math.PI})
    void custom_sin_check(double x) {
        Sin sin = new Sin(eps);
        assertEquals(sin.stubCalculate(x), sin.calculate(x), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/6 - 2*Math.PI, -Math.PI, -Math.PI/2, -Math.PI/6, 0, Math.PI/6, Math.PI/2, Math.PI, Math.PI/6+2*Math.PI})
    void custom_cos_check(double x) {
        Cos cos = new Cos(eps);
        assertEquals(cos.stubCalculate(x), cos.calculate(x), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/6 - 2*Math.PI, -Math.PI, -Math.PI/2, -Math.PI/6, 0, Math.PI/6, Math.PI/2, Math.PI, Math.PI/6+2*Math.PI})
    void custom_sec_check(double x) {
        Sec sec = new Sec(eps);
        assertEquals(sec.stubCalculate(x), sec.calculate(x), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/6 - 2*Math.PI, -Math.PI, -Math.PI/2, -Math.PI/6, 0, Math.PI/6, Math.PI/2, Math.PI, Math.PI/6+2*Math.PI})
    void custom_tan_check(double x) {
        Tan tan = new Tan(eps);
        assertEquals(tan.stubCalculate(x), tan.calculate(x), eps);
    }
    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/6 - 2*Math.PI, -Math.PI, -Math.PI/2, -Math.PI/6, 0, Math.PI/6, Math.PI/2, Math.PI, Math.PI/6+2*Math.PI})
    void custom_cot_check(double x) {
        Cot cot = new Cot(eps);
        assertEquals(cot.stubCalculate(x), cot.calculate(x), eps);
    }
}
