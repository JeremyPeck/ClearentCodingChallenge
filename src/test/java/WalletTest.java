import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class WalletTest {

    @Test
    public void newWallet() {
        ArrayList<Card> cardsList = new ArrayList<Card>();
        cardsList.add(new Card(Card.brandName.DISCOVER,10000));
        Wallet test = new Wallet(cardsList);
        assertEquals(test.getInterest(),100);

    }
}
