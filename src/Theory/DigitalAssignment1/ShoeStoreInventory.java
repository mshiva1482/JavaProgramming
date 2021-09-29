package Theory.DigitalAssignment1;

import java.util.Scanner;

public class ShoeStoreInventory {

    public static void main(String[] args) {
        int inventory[][] = new int[5][5];
        int price[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details about store inventory: ");
        for(int i=0;i<3;i++){
            System.out.println("Enter quantity details of type #" + (i+1) + " shoes in order of small, medium and large");
            for(int j=0;j<3;j++){
                inventory[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter price of each type of shoes (#1, #2, #3...)");
        for(int i=0;i<3;i++){
            price[i] = sc.nextInt();
        }

        int topSum[] = new int[5];
        for(int i=0;i<3;i++){
            int sum = 0;
            for(int j=0;j<3;j++){
                sum += inventory[i][j] * price[i];
            }
            topSum[i] = sum;
        }

        int sum = 0;
        for(int i=0;i<3;i++){
            System.out.print("Price of type #" + (i+1) + " shoes is: ");
            System.out.println(topSum[i]);
            sum += topSum[i];
        }
        System.out.print("Total price of inventory is: " + sum + "\n");

    }
}
