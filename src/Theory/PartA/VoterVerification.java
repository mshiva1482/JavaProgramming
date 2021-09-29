package Theory.PartA;

import java.util.Scanner;

//Assumption: election takes place on the month of november

public class VoterVerification {
    public static void main(String[] args) {
        int month, year, age;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter Birth year: ");
        year = sc.nextInt();
        System.out.println("Enter Birth month: ");
        month = sc.nextInt();

        age = 2021 - year;

        if(age>=18) {
            System.out.println(name + " of age " + age + " is eligible to vote");
        }
        else if (age==17){
            if(month>=1 && month<11)
                System.out.println(name + " of age " + age + " will be eligible to vote at the time of election");
            else
                System.out.println(name + " of age " + age + " is not eligible to vote");
        }
        else {
            System.out.println(name + " of age " + age + " is not eligible to vote");
        }
    }
}
