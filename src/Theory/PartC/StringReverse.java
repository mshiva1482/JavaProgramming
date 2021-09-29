package Theory.PartC;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string to be reversed: ");
        str = sc.next();
        int j=0;
        int len = str.length();
        char rev[] = new char[len];
        System.out.println("\nReverse of given string: ");
        for(int i=len-1;i>=0;i--){
            rev[j] = str.charAt(i);
            j+=1;
        }
        String revStr = new String(rev);
        System.out.println(revStr);
    }
}
