import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class WalletTest {

    @Test
    public void newWallet() {
        ArrayList<Card> cardsList = new ArrayList<Card>();
        cardsList.add(new Card("00000000000000",333,"08/23"));
        Wallet test = new Wallet(cardsList);
        assertNotNull(test.getCardsList().get(1));

    }
}
