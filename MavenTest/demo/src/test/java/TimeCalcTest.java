
import com.example.TimeCalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeCalcTest {

    @Test
    public void calcTime() {
        assertEquals(1.0, TimeCalc.calculateTime(100, 100), 0.001);
    }
}