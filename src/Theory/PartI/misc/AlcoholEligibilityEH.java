package Theory.PartI.misc;

import java.util.Scanner;

class AgeInvalidException extends Exception {
    public AgeInvalidException(String s) {
        super(s);
    }
}

class NotEligibleException extends Exception {
    public NotEligibleException(String s) {
        super(s);
    }
}

public class AlcoholEligibilityEH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;

        try {
            for(int i=0;i<3;i++) {
                System.out.println("Enter your age");
                age = sc.nextInt();
                if(age<0)
                    throw new AgeInvalidException("Enter a valid age...");
                else if(age<21 && age>0)
                    throw new NotEligibleException("You are not eligible to purchase alcohol");
            }
            }catch (AgeInvalidException | NotEligibleException e1) {
            System.out.println(e1.getMessage());
            }
    }
}
