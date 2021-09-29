package Lab;

import java.util.Scanner;

public class LabOne {
    int age;
    static String name;
    public static void main(String[] args) {

        //Local variables
        //int n1, n2;
        String regno, qual, gender, address;
        int dd, mm, yyyy;
        double phno;

        //Creating a class for LabOne to use non-static variable (n3) within (static) main
        LabOne obj = new LabOne();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter registration no: ");
        regno = sc.nextLine();
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Qualification: ");
        qual = sc.nextLine();
        System.out.println("Enter Gender: ");
        gender = sc.nextLine();
        System.out.println("Enter Address: ");
        address = sc.nextLine();
        System.out.println("Enter Age: ");
        obj.age = sc.nextInt();
        System.out.println("Enter Date of birth: ");
        dd = sc.nextInt();
        System.out.println("Enter Month of birth: ");
        mm = sc.nextInt();
        System.out.println("Enter year of birth: ");
        yyyy = sc.nextInt();
        System.out.println("Enter Phone number: ");
        phno = sc.nextDouble();

        System.out.println("Student information: ");
        System.out.println("Registration number: " + regno);
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qual);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + obj.age);
        System.out.println("Date of birth: " + dd + "/" + mm + "/" + yyyy);
        System.out.println("Phone number: " + phno);

    }
}
