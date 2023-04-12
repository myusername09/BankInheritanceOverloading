import java.util.Scanner;
import java.util.ArrayList;

public class Transaction {

    static int cid;
    static int acc;
    static {
        cid = 100;
        acc = 1;
    }

    public static void main(String[] args) {

        Customer obj[] = new Customer[5];
        ArrayList<Accounts> AL = new ArrayList<Accounts>();

        String choice = "Y";
        String accoption = "Y";
        while (!(choice.equals("N") || choice.equals("n"))) {

            System.out.printf(" %50s \n", "Main Menu");
            System.out.printf("%s",
                    "___________________________________________________________________________________\n");
            System.out.printf("| %-30s %-30s %20s\n", " ", "1: Open Account ", " | ");
            System.out.printf("| %-30s %-30s %20s\n", " ", "2: Register Customer ", " | ");
            System.out.printf("| %-30s %-30s %20s\n", " ", "3: Deposit ", " | ");
            System.out.printf("| %-30s %-30s %20s\n", " ", "4: Withdraw ", " | ");
            System.out.printf("| %-30s %-30s %20s\n", " ", "5: List Accounts ", " | ");
            System.out.printf("| %-30s %-30s %20s\n", " ", "6: List Customers ", " | ");
            System.out.printf("| %-30s %-30s %20s\n", " ", "7: Exit ", " | ");
            System.out.printf("%s",
                    "___________________________________________________________________________________\n");
            System.out.printf("%30s", "Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    while (!(choice.equals("N") || choice.equals("n"))) {

                        System.out.println("Enter the Customer ID  : ");
                        int cd = sc.nextInt();

                        System.out.println("Enter the Balance : ");
                        long bal = sc.nextLong();

                        Accounts ac = new Accounts(acc, bal, cd);
                        acc++;
                        AL.add(ac);

                        System.out.println("\nDo you want to open more account : ");
                        choice = sc.next();
                    }

                    break;
                case 2:

                    for (int i = 0; i < 5; i++) {
                        obj[i] = new Customer();
                        System.out.println("Enter the name: ");
                        obj[i].name = sc.next();
                        obj[i].custId = cid;
                        System.out.println("Generated Customer ID : " + cid);
                        cid++;
                    }

                    break;
                case 3:
                    System.out.println("Enter the account to search: ");
                    int acno = sc.nextInt();
                    System.out.println("Enter the amount to deposit: ");
                    long amt = sc.nextLong();
                    for (Accounts A : AL) {
                        if (A.getAccno() == acno) {
                            A.setBalance(A.getBalance() + amt);
                            break;
                        }
                    }

                    break;
                case 4:
                    System.out.println("Enter the account to search: ");
                    int acno1 = sc.nextInt();
                    System.out.println("Enter the amount to withdraw: ");
                    long amt1 = sc.nextLong();
                    for (Accounts A : AL) {
                        if (A.getAccno() == acno1) {
                            A.setBalance(A.getBalance() - amt1);
                            break;
                        }
                    }
                    break;
                case 5:

                    System.out.printf(" %50s \n", "Accounts List");
                    System.out.println("Acc/No" + "   " + "Balance" + "   " + "Customer ID");
                    for (Accounts A : AL) {
                        A.displayAccount();
                    }
                    break;
                case 6:
                    System.out.printf(" %50s \n", "Customer List");
                    System.out.println("CustomerID" + "   " + "Name");
                    for (Customer c : obj) {
                        c.displayCustomer();
                    }

                    break;
                case 7:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice ");
                    break;
            }

            System.out.println("\nDo you want to continue: ");
            choice = sc.next();
        } // while ends
    }
}
