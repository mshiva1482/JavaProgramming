package Theory.Inventory.CustomerInventory.SellerInventory;

import java.util.Scanner;
import Theory.Inventory.CustomerInventory.ProducerInventory.*;

public class SellerInventory extends ProducerInventory{

    public int Availability(String item, int qty) {
        int flag = 0;
        if(item.equals("Apple") && i1>qty)
            flag = -1;
        else if(item.equals("Banana") && i2>qty)
            flag = -1;
        else if(item.equals("Grapes") && i3>qty)
            flag = -1;

        return flag;
    }

    public void checkout(String item, int qty) {
        Scanner sc = new Scanner(System.in);
        int paidAmt;
        int total = 0;
        if(item.equals("Apple"))
            total = qty*20;
        else if(item.equals("Banana"))
            total = qty*10;
        else if(item.equals("Grapes"))
            total = qty*40;

        System.out.println("Amount to be paid: " + total);
        paidAmt = sc.nextInt();
        int balance = paidAmt - total;
        System.out.println("Here's your balance: " + balance);
        System.out.println("Thank you for purchasing!");

        update(item, qty);
    }

}
