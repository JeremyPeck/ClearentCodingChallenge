import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void getInterest() {
        Card test = new Card(Card.brandName.DISCOVER, 10000);
        assertEquals(100,test.getInterest());


    }


}