class Customer extends Accounts {
    protected int custId;
    protected String name;

    Customer() {
    }

    public void displayCustomer() {
        System.out.println(custId + "           " + name);
    }
}
