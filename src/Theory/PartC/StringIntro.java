package Theory.PartC;

import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {
        String s[] = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 names: ");
        for(int i=0;i<5;i++){
            s[i] = sc.next();
        }

        String odd[] = new String[5];
        int j=0;
        String even[] = new String[5];
        int k=0;
        for(int i=0;i<5;i++){
            if(s[i].length()%2==0){
                even[k] = s[i];
                k++;
            }
            else if(s[i].length()%2!=0){
                odd[j] = s[i];
                j+=1;
            }
        }
        System.out.println("Names with even number of letter: ");
        for(int i=0;i<k;i++){
            System.out.println(even[i]);
        }
        System.out.println("\nNames with odd number of letters: ");
        for(int i=0;i<j;i++){
            System.out.println(odd[i]);
        }
    }
}
