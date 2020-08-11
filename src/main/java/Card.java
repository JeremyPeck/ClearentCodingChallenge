public class Card {
    private String cardNumber;
    private int cvv;
    private String expDate;

    public Card(String cardNumber, int cvv, String expDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expDate = expDate;
    }

    public String getMaskedCard(){
        return "hello";
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
}
