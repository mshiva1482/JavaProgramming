//Create two arrays, and add both the array values and store it in a thrid array
package Theory.PartD;

import java.util.Scanner;

public class ParallelArrayAddition {
    int arr1[] = new int[6];
    int arr2[] = new int[6];
    Scanner sc = new Scanner(System.in);

    public void get(){
        System.out.println("Enter values for array 1: ");
        for(int i=0;i<5;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter values for array 2: ");
        for(int i=0;i<5;i++){
            arr2[i] = sc.nextInt();
        }
    }

    public static void display(int a[]){
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }

    public int[] calculate(){
        int result[] = new int[6];
        for(int i=0;i<5;i++){
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ParallelArrayAddition ob = new ParallelArrayAddition();
        ob.get();

        int res[] = new int[6];
        res = ob.calculate();
        System.out.println("Result array: ");
        display(res);
    }
}
