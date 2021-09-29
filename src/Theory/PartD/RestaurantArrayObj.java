//wrtie a program using array of objects to conclude what the started, main course and desert record

package Theory.PartD;

import java.util.Arrays;
import java.util.Scanner;

public class RestaurantArrayObj {
    String custName;
    int starter[] = {0, 0, 0};
    int mainCourse[] = {0, 0, 0};
    int deserts[] = {0, 0, 0};

    Scanner sc = new Scanner(System.in);

    public void get(){
        System.out.print("Please enter your name: ");
        custName = sc.next();
        int ch;
        System.out.println("1. Honey Chilli Potatoes \n2. Dragon Chicken \n3. Spring Rolls");
        System.out.print("Enter Starter of choice: ");
        ch = sc.nextInt();
        if(ch==1)
            starter[0] = 1;
        else if(ch==2)
            starter[1] = 1;
        else if(ch==3)
            starter[2] = 1;
        else
            System.out.println("Enter a valid choice!");

        System.out.println("1. Pecking roasted duck \n2. Dumplings \n3. Chow mein");
        System.out.print("Enter Main Course of choice: ");
        ch = sc.nextInt();
        if(ch==1)
            mainCourse[0] = 1;
        else if(ch==2)
            mainCourse[1] = 1;
        else if(ch==3)
            mainCourse[2] = 1;
        else
            System.out.println("Enter a valid choice!");

        System.out.println("1. Cheese cake \n2. Lemon pie \n3. Chocolate cake");
        System.out.print("Enter Dessert of choice: ");
        ch = sc.nextInt();
        if(ch==1)
            deserts[0] = 1;
        else if(ch==2)
            deserts[1] = 1;
        else if(ch==3)
            deserts[2] = 1;
        else
            System.out.println("Enter a valid choice!");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RestaurantArrayObj obj[] = new RestaurantArrayObj[10];
        int n;
        System.out.print("Enter number of customers: ");
        n = sc.nextInt();

        for(int i=0;i<n;i++){
            obj[i] = new RestaurantArrayObj();
            obj[i].get();
        }

        int st1=0, st2=0, st3=0;
        for(int i=0;i<n;i++){
            if(obj[i].starter[0]==1)
                st1++;
            else if(obj[i].starter[1]==1)
                st2++;
            else
                st3++;
        }
        int st[] = {st1, st2, st3};
        Arrays.sort(st);
        if(st[2]==st1)
            System.out.println("Popular choice of starters was Honey chilli potatoes");
        else if(st[2]==st2)
            System.out.println("Popular choice of starters was Dragon chicken");
        else
            System.out.println("Popular choice of starters was Spring rolls");

        int mc1=0, mc2=0, mc3=0;
        for(int i=0;i<n;i++){
            if(obj[i].mainCourse[0]==1)
                mc1++;
            else if(obj[i].mainCourse[1]==1)
                mc2++;
            else
                mc3++;
        }
        int mc[] = {mc1, mc2, mc3};
        Arrays.sort(mc);
        if(mc[2]==mc1)
            System.out.println("Popular choice of starters was Pecking roast duck");
        else if(mc[2]==mc2)
            System.out.println("Popular choice of main course was Dumplings");
        else
            System.out.println("Popular choice of desserts was Chow mein");

        int ds1=0, ds2=0, ds3=0;
        for(int i=0;i<n;i++){
            if(obj[i].deserts[0]==1)
                ds1++;
            else if(obj[i].deserts[1]==1)
                ds2++;
            else
                ds3++;
        }
        int ds[] = {ds1, ds2, ds3};
        Arrays.sort(ds);
        if(ds[2]==ds1)
            System.out.println("Popular choice of starters was Pecking roast duck");
        else if(ds[2]==ds2)
            System.out.println("Popular choice of starters was Dumplings");
        else
            System.out.println("Popular choice of starters was Chow mein");
    }

}
