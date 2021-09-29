package Theory.PartC;

import java.util.Scanner;

public class HobbySurvey {
    int hobby[] = new int[4];
    String name;
    public void getData(){
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Is reading book your hobby? (0/1)");
        ch = sc.nextInt();
        if(ch==1)
            hobby[0] = 1;
        System.out.println("Is watching movies your hobby? (0/1)");
        ch = sc.nextInt();
        if(ch==1)
            hobby[1] = 1;
        System.out.println("Is dancing your hobby? (0/1)");
        ch = sc.nextInt();
        if(ch==1)
            hobby[2] = 1;
        System.out.println("Is sports your hobby? (0/1)");
        ch = sc.nextInt();
        if(ch==1)
            hobby[3] = 1;

    }


    public static void main(String[] args) {
        HobbySurvey obj[] = new HobbySurvey[5];
        for(int i=0;i<5;i++){
            obj[i] = new HobbySurvey();
            obj[i].getData();
        }

        System.out.println("Candidates who like both reading books and playing sports");
        for(int i=0;i<5;i++){
            if(obj[i].hobby[0]==1 && obj[i].hobby[3]==1)
                System.out.println(obj[i].name);
        }

        System.out.println("Candidates who like both reading books and watching movies");
        for(int i=0;i<5;i++){
            if(obj[i].hobby[0]==1 && obj[i].hobby[1]==1)
                System.out.println(obj[i].name);
        }

        System.out.println("Candidates who only like to watch movies ");
        for(int i=0;i<5;i++){
            if(obj[i].hobby[1]==1 && obj[i].hobby[0]==0 && obj[i].hobby[2]==0 && obj[i].hobby[3]==0)
                System.out.println(obj[i].name);
        }


    }
}
