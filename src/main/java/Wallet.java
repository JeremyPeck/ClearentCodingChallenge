import java.util.ArrayList;

public class Wallet {
    private ArrayList<Card> cardsList;

    public ArrayList<Card> getCardsList() {
        return cardsList;
    }

    public void setCardsList(ArrayList<Card> cardsList) {
        this.cardsList = cardsList;
    }

    public Wallet(ArrayList<Card> cardsList) {
        this.cardsList = cardsList;
    }

    public int getInterest(){
        int result = 0;
        for (Card n : cardsList) {
            result += n.getInterest();
        }
        return result;
    }

    public Wallet() {
        this.cardsList = new ArrayList<Card>();
    }

}