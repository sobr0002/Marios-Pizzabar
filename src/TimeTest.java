import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalTime;
public class TimeTest {

    private Time time;

    @BeforeEach
    void setUp() {
        //Initialiserer Time-objektet for at kunne teste det
        time = new Time();
    }
    @Test
    void testConstructorInitializesValuesCorrectly() {
        assertEquals(10,1);
    }

    @Test
    void testGetTime() {
        //Tester getter-metode for time
        time.getTime();

    }






}
