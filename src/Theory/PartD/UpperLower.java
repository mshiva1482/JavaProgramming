package Theory.PartD;

import java.util.Locale;
import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String splitStr[] = new String[20];

        splitStr = str.split(" ", 0);
        System.out.println("Original string: " + str);

        System.out.println("Spit string: ");
        for(int i=0;i<splitStr.length;i++){
            System.out.println(splitStr[i]);
        }

    }
}
