package ex_19_OOPs_Part2.encap;

public class Lab177_Bank {
    public static void main(String[] args) {
        HDFC ac1 = new HDFC("vikash", 10000);

        System.out.println(ac1.bank);
        System.out.println(ac1.getAccount());
        System.out.println(ac1.getBal());
        System.out.println(ac1.setBal(2000,false));
        System.out.println(ac1.getBal());
    }
}

class HDFC{
    private String account;
    private long bal;
    public String bank = "HDFC";

    public HDFC(String account, long bal){
        this.account = account;
        this.bal = bal;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public long getBal() {
        return bal;
    }

    public boolean setBal(long bal, boolean cashier) {
        if(cashier){
            System.out.println("update the val");
        }else {
            System.out.println("unauthorised");
        }
        return cashier;
    }
}
