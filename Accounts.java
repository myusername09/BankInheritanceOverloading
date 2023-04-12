class Accounts {
    private int accno;
    private long balance;
    protected int custId;

    // constructor overloading

    Accounts() {
    }

    Accounts(int acc, long bal, int ctid) {
        this.accno = acc;
        this.balance = bal;
        this.custId = ctid;
    }

    public int getAccno() {
        return this.accno;
    }

    public void setBalance(long bal) {
        this.balance = bal;
    }

    public long getBalance() {
        return this.balance;
    }

    public void displayAccount() {
        System.out.println(accno + "           " + balance + "          " + custId);
    }

}