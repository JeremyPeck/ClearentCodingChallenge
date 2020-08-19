public class Card {
//    private String cardNumber;
//    private int cvv;
//    private String expDate;

    public enum brandName{
        VISA,
        MASTERCARD,
        DISCOVER
    }

    public Card(brandName cardBrand, int balance) {
        this.cardBrand = cardBrand;
        this.balance = balance;
    }
    private int balance;

    private brandName cardBrand;

    public int getInterest(){
        int result;
        switch (cardBrand) {
            case VISA:
                result = (int) (balance * 0.1);
                break;
            case MASTERCARD:
                result = (int) (balance * 0.05);
                break;
            case DISCOVER:
                result = (int) (balance * .01);
                break;
            default:
                System.out.println("Brand not set");
                result = 0;
        }
        return result;
    }
    /*public String getMaskedCard(){
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
    }*/
}
