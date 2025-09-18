package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import static com.example.App.degreeToYears;

public class DegreeTest {
    @Test
    public void bachelorsDegree() throws Exception {
        assertEquals(4, degreeToYears("bsc"));
    }

    @Test
    public void mastersDegree() throws Exception {
        assertEquals(6, degreeToYears("msc"));
    }

    @Test
    public void phdDegree() throws Exception {
        assertEquals(8, degreeToYears("phd"));
    }
    @Test
    public void invalidDegree() throws Exception {
        assertThrows(NullPointerException.class, () -> {
            degreeToYears("abc");
        });
    }

    @Test
    public void longDegree() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> {
            degreeToYears("fawf");
        });
    }
}
