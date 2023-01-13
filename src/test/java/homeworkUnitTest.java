import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class homeworkUnitTest {
    @Test
    public void testDay() {
        String day = homework8.getDay(1);
        assertEquals("Sunday", day);



    }

    @Test
    public void negativeTest() {
        String day = homework8.getDay(8);
        assertEquals("The number should be equal or smaller than 7", day);


    }

    @Test
    public void nullTest() {
        String day = homework8.getDay(3);
        assertThrows(NullPointerException.class,() -> {homework8.getDay(null);} );


    }
    @Test
    public void negativeTest2() {
        String day = homework8.getDay(-1);
        assertEquals("The number should be equal or larger than 1", day);


    }
}
