import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void getMaskedCard() {
        Card test = new Card("00000000000000", 444,"08/23");
        assertEquals("**********0000",test.getMaskedCard());
    }


}