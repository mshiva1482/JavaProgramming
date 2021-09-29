package Theory.PartA;

import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        int n;
        int regno[] = new int[10];
        String name[] = new String[10];
        double cgpa[] = new double[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number students: ");
        n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter Regno of student #" + (i+1));
            regno[i] = sc.nextInt();
            System.out.println("Enter cgpa of student #" + (i+1));
            cgpa[i] = sc.nextDouble();
            System.out.println("Enter name of student #" + (i+1));
            name[i] = sc.next();
        }

        System.out.println("\nStudent details: \n");
        for(int i=0;i<n;i++){
            System.out.println("Regno: " + regno[i]);
            System.out.println("Name: " + name[i]);
            System.out.println("CGPA: " + cgpa[i] + "\n");
        }

    }
}
