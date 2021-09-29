package Theory.PartB;

import java.util.Scanner;

public class BakerDiff {
    public static void main(String[] args) {
        //Initialization of variables & initial input
        int s, b, c1, c2, c3, temp, diff;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of stores: ");
        s = sc.nextInt();
        System.out.println("Enter number of bakers: ");
        b = sc.nextInt();
        int s1, s2, s3;

        for(int i=0;i<b;i++){
            System.out.println("Baker no. " + (b+1));
            System.out.println("Enter number of cakes delivered for each store: ");
            if(s<2)
                System.out.println("Invalid input!");
            else if(s==2){
                c1 = sc.nextInt();
                c2 = sc.nextInt();
                diff = Math.abs(c2-c1);
            }
            else{
                c1 = sc.nextInt();
                c2 = sc.nextInt();
                c3 = sc.nextInt();

            }
        }


    }
}
