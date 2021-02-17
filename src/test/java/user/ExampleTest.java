package user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ExampleTest {

    @Test
    public void isAcceptedTest() {
        Example example = new Example();
        assertTrue(example.isAccepted(54));
        assertFalse(example.isAccepted(35));
        assertTrue(example.isAccepted(87));
    }
}
