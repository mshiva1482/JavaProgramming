package Theory.PartC;

import java.util.Scanner;

public class ElectricityBill {
    String custName;
    int cid;
    double pReading, cReading, totalPrice;

    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        custName = sc.next();
        System.out.println("Enter ID: ");
        cid = sc.nextInt();
        System.out.println("Enter previous reading: ");
        pReading = sc.nextDouble();
        System.out.println("Enter current reading: ");
        cReading = sc.nextDouble();
    }

    public void calculate(){
        double unitsUsed = cReading - pReading;

        if(unitsUsed<100)
            totalPrice = 0;
        else if(unitsUsed>=100 && unitsUsed<200)
            totalPrice = (unitsUsed-100)*1.5;
        else if(unitsUsed>=201 && unitsUsed<500)
            totalPrice = 100*1.5 + (unitsUsed-200)*3;
        else
            totalPrice = 100*1.5 + 300*3 + (unitsUsed-500)*6.6;

    }

    public void display(){
        System.out.println("Electricity bill price for " + custName + " is Rs. " + totalPrice);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        ElectricityBill data[] = new ElectricityBill[15];

        System.out.println("Enter number of customers: ");
        n = sc.nextInt();

        for(int i=0;i<n;i++){
            data[i] = new ElectricityBill();
            data[i].getData();
        }
        for(int i=0;i<n;i++){
            data[i].calculate();
            data[i].display();
        }
    }
}
