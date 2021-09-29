//There are n sticks of different heights - One needs to choose the shortest stick & cut the height of it on all the remaining sticks.
//Find the number of iterations required to completely get rid off all other sticks.

package Theory.PartB;

import java.util.Scanner;

public class StickIteration {
    public static void main(String[] args) {
        //Initialization
        Scanner sc = new Scanner(System.in);
        int n, temp=0;
        int arr[] = new int[25];

        //Inputs
        System.out.println("Enter number of sticks: ");
        n = sc.nextInt();
        System.out.println("Enter the length of each stick in order: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //Sorting the sticks in ascending order of their length

    }
}


