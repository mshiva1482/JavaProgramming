package Lab.CAT1;

import java.util.Scanner;

class service {
    Scanner scan = new Scanner(System.in);
    class Date {
        int day, month, year;
        public Date() {
            day = scan.nextInt();
            month = scan.nextInt();
            year = scan.nextInt();
        }
    }
    public double srno;
    public String cName, AMCstatus, serviceType;
    public float billAmt;
    public Date complaintDate;

    public service() {
        srno = Math.random()*(5000)+500;
        System.out.print("Enter your name: ");
        cName = scan.next();
        System.out.print("Enter AMC Status: ");
        AMCstatus = scan.next();
        System.out.print("Enter service type: ");
        serviceType = scan.next();
        System.out.println("Enter complaint date in dd, mm, yyyy format ");
        complaintDate = new Date();
    }

    public void getBillAmount() {
        if(AMCstatus.equals("Y")){
            if(serviceType.equals("GS"))
                billAmt = 0;
            else
                billAmt = 1000;
        }
        else {
            if(serviceType.equals("GS"))
                billAmt = 500;
            else
                billAmt = 2000;
        }
    }


}

public class ServiceProcess extends service{
    public void complaintHistory(service sr[], int n) {
        for(int i=0;i<n;i++) {
            System.out.println("\nComplaint no. " + (i+1));
            System.out.println("Service request no: " + sr[i].srno);
            System.out.println("Customer name: " + sr[i].cName);
            System.out.println("Service type: " + sr[i].serviceType);
            System.out.println("Complaint date: " + sr[i].complaintDate.day+"/"+sr[i].complaintDate.month+"/"+sr[i].complaintDate.year);
            System.out.println("Bill amount: " + sr[i].billAmt);
        }
    }

    public void byMonth(service sr[], int n) {
        Scanner scan = new Scanner(System.in);
        int count=0, month;
        System.out.print("Enter month to find number of complaints: ");
        month = scan.nextInt();

        System.out.println("Complaints raised in the" + month +"th month");
        for(int i=0;i<n;i++) {
            if(sr[i].complaintDate.month==month){
                count++;
                System.out.println("\nService request no: " + sr[i].srno);
                System.out.println("Customer name: " + sr[i].cName);
                System.out.println("Service type: " + sr[i].serviceType);
                System.out.println("Complaint date: " + sr[i].complaintDate.day+"/"+sr[i].complaintDate.month+"/"+sr[i].complaintDate.year);
                System.out.println("Bill amount: " + sr[i].billAmt);
            }
        }
        System.out.println("\nNumber of complaints in requested month is "+ count);

    }

    public static void main(String[] args) {
        service sr[] = new service[10];
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter number of customers: ");
        n = scan.nextInt();
        for(int i=0;i<n;i++) {
            sr[i] = new service();
            sr[i].getBillAmount();
        }

        ServiceProcess sp = new ServiceProcess();
        System.out.println("\nComplaint History");
        sp.complaintHistory(sr, n);
        sp.byMonth(sr, n);

    }
}
