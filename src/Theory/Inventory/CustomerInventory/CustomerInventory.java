package Theory.Inventory.CustomerInventory;

import Theory.Inventory.CustomerInventory.ProducerInventory.*;
import Theory.Inventory.CustomerInventory.SellerInventory.*;

import java.util.Scanner;

public class CustomerInventory {
    public static void main(String[] args) {
        int n, qty;
        String item;

        SellerInventory si = new SellerInventory();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of customers waiting: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("\nWelcome customer no." + (i+1));
            System.out.print("Enter the name of product you'd like to purchase: ");
            item = sc.next();
            System.out.print("Enter quantity: ");
            qty = sc.nextInt();
            int check = si.Availability(item, qty);
            if(check==0)
                System.out.println("Item not available");
            else if(check==-1) {
                si.checkout(item, qty);
            }
        }
    }
}