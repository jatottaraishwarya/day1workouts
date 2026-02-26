class Bank{
    private int balance;
    public void getBalance(){
      System.out.println(balance);
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
}
class BankDetails{
    public static void main(String[] args){
        Bank b1 = new Bank();
        b1.setBalance(100);
        Bank b2 = new Bank();
        b2.setBalance(1000);

        b2.getBalance();
        b1.getBalance();

    }
}