//name ,age and bank balance of 2 customers - these values must be retrieved using objects
//whose bank balance is greater and who is older.
package Theory.PartC;

import java.util.Scanner;

public class BankBalanceWObj {
    float bbalance;
    int age;
    String name;
    Scanner sc = new Scanner(System.in);

    public void getData(){
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Enter your bank balance: ");
        bbalance = sc.nextFloat();
    }

    public void calculate(BankBalanceWObj objx){
        if(objx.bbalance>bbalance)
            System.out.println(objx.name + " has a greater bank balance than " + name);
        else
            System.out.println(name + " has a greater bank balance than " + objx.name);

        if(objx.age>age)
            System.out.println(objx.name + " is older than " + name);
        else
            System.out.println(name + " is older than " + objx.name);

    }

    public static void main(String[] args) {
        BankBalanceWObj ob1, ob2;
        ob1 = new BankBalanceWObj();
        ob2 = new BankBalanceWObj();
        ob1.getData();
        ob2.getData();

        ob1.calculate(ob2);
    }
}

