import java.util.ArrayList;

public class Person {
    private ArrayList<Wallet> walletList;

    public ArrayList<Wallet> getWalletList() {
        return walletList;
    }

    public void setWalletList(ArrayList<Wallet> walletList) {
        this.walletList = walletList;
    }

    public Person(ArrayList<Wallet> walletList) {
        this.walletList = walletList;
    }

    public Person(){
        this.walletList = new ArrayList<Wallet>();
    }
}
