package Theory.DigitalAssignment1;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void calculate(int a[], int b[]){
        double result = (0.5) * (a[0]*(b[1] - b[2]) - b[0] *(a[1] - a[2]) + ((a[1]*b[2]) - (b[1]*a[2])) );
        System.out.println("The area of given triangle is " + result);
    }

    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++){
            System.out.println("Enter coordinates x and y of point #" + (i+1));
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        calculate(a, b);

    }
}
