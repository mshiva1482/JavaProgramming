package Theory.PartE.AptProblem;

import java.util.Scanner;

class utility {
    private String name;
    private int blockNo, flatNo;
    private float dueAmt;
    private double mobileNo;
    private boolean paid;
    Scanner scan = new Scanner(System.in);

    public utility(){
        dueAmt = 2500;
        paid = false;
    }

    public void pay() {
        int paying = scan.nextInt();
        if(paying > dueAmt) {
            float balance = paying - dueAmt;
            System.out.println("Here's your balance: " + balance + "\n");
            paid = true;
            dueAmt = 0;
        }
        else {
            float balance = dueAmt - paying;
            System.out.println("Remaining maintenance to be paid late: " + balance + "\n");
            dueAmt = balance;
        }
    }
    public void getData(int num) {
        System.out.println("Hello resident " + num);
        System.out.print("Enter your name: ");
        name = scan.next();
        System.out.print("Enter your Block number: ");
        blockNo = scan.nextInt();
        System.out.print("Enter your Flat number: ");
        flatNo = scan.nextInt();
        System.out.print("Enter your mobile number: ");
        mobileNo = scan.nextDouble();

        if(paid)
            System.out.println("You have already paid this month's maintenance");
        else {
            System.out.println("Pay the following maintenance due... Rs." + dueAmt + " below");
            pay();
        }

    }

}

public class AptMaintenance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter number of residents in your society: ");
        n = scan.nextInt();
        utility res[] = new utility[15];
        for(int i=1;i<=n;i++) {
            res[i] = new utility();
            res[i].getData(i);
        }


    }
}
