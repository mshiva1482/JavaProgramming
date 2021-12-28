package Lab;

import java.util.Scanner;

class InvalidNameException extends Exception{
    public InvalidNameException(String s) {
        super(s);
    }
}

class InvalidCardNumberException extends Exception {
    public InvalidCardNumberException(String s) {
        super(s);
    }
}

class InvalidCVVException extends Exception {
    public InvalidCVVException(String s) {
        super(s);
    }
}

public class CreditCardVerification {
    public static void main(String[] args) {
        System.out.println("\nWelcome to credit card validation software!");
        Scanner scan = new Scanner(System.in);
        String name, cNumber;
        int cvv;
        boolean overallCheck = true;
        //Accepting name from user.
        System.out.println("\nEnter your name: ");
        name = scan.next();
        //try-catch block to check if the given name is valid or not.
        try {
            int n = name.length();
            String toUpper = name.toUpperCase();
            if(n>=15) {
                overallCheck = false;
                throw new InvalidNameException("\nEntered name is Invalid...");
            }
            if(!name.equals(toUpper)) {
                overallCheck = false;
                throw new InvalidNameException("\nEntered name is Invalid...");
            }
        }catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }
        //Accepting card number from user.
        System.out.println("\nEnter card number: ");
        cNumber = scan.next();
        //try-catch block to check if the given credit card number is valid or not.
        try{
            int x = String.valueOf(cNumber).length();
            int first = Integer.parseInt(String.valueOf(cNumber.charAt(x-1)));
            int last = Integer.parseInt(String.valueOf(cNumber.charAt(0)));
            if(x<14 || x>16) {
                overallCheck = false;
                throw new InvalidCardNumberException("\nEntered card number is Invalid...");
            }
            if (first == last) {
                overallCheck = false;
                throw new InvalidCardNumberException("\nEntered card number is Invalid...");
            }
        }catch (InvalidCardNumberException e) {
            System.out.println(e.getMessage());
        }
        //Accepting cvv details from user.
        System.out.println("\nEnter cvv: ");
        cvv = scan.nextInt();
        //try-catch block to check if the given cvv is valid or not.
        try{
            int digit, sum=0;
            int y = String.valueOf(cvv).length();
            int num = cvv;
            while(num > 0) {
                digit = num%10;
                sum += digit;
                num = num/10;
            }
            int x = Integer.parseInt(String.valueOf(cNumber.charAt(0)));
            if(y!=3 && sum!=x) {
                overallCheck = false;
                throw new InvalidCVVException("\nEntered cvv is invalid...");
            }
        }catch (InvalidCVVException e) {
            System.out.println(e.getMessage());
        }
        if(overallCheck==false)
            System.out.println("\nYou have entered invalid details... please try again.");
        else
            System.out.println("\nEntered details are valid \nthanks for using our validation software.");
    }
}
