
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution31test {
    @Test
    void TargetHeartRate() {
        int intensity = 55;
        int age = 22;
        int restingHR = 65;
        double expected = ((((200 - age) - 50) * intensity/100) + restingHR);
        double actual = (135);

        assertEquals(expected,actual);


    }
}