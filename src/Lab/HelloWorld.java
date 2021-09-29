package Lab;

import java.util.Scanner;

public class HelloWorld {
    int n3 = 15;
    public static void main(String[] args)
    {
        int n1, n2, sum;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        HelloWorld obj = new HelloWorld();
        sum = n1+n2+obj.n3;
/*
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
*/
        System.out.println("sum: " + sum);
    }
}