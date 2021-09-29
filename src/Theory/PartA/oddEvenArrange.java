//Get n integer values and arrange all the arrange all even numbers in the beginning and the odd numbers in the end

package Theory.PartA;

import java.util.Scanner;

public class oddEvenArrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        int arr[] = new int[20];

        System.out.println("Enter value of m: ");
        m = sc.nextInt();
        System.out.println("Enter all the " + m + " numbers: ");
        for(int i=0;i<m;i++){
            arr[i] = sc.nextInt();
        }

        int sorted[] = new int[m];
        int j=0, k=(m-1);
        for(int i=0;i<m;i++){
            if(arr[i]%2==0){
                sorted[j] = arr[i];
                j++;
            }
            else{
                sorted[k] = arr[i];
                k--;
            }
        }

        System.out.println("\nArranged values: ");
        for(int i=0;i<m;i++){
            System.out.println(sorted[i]);
        }

    }
}
