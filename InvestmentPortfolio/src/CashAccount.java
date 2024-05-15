public class CashAccount extends Asset{

    private String accountNum;

    public CashAccount(String name, String accountNum, Money price) {
        super(name, price);
        this.accountNum = accountNum;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public void makeTransaction() {

    }
}
