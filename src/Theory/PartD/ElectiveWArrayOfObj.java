package Theory.PartD;

import java.util.Arrays;
import java.util.Scanner;

public class ElectiveWArrayOfObj {
    Scanner sc = new Scanner(System.in);
    String name;
    int vote[] = {0, 0, 0};

    public void getData(){
        int temp;

        System.out.print("Enter your name: ");
        name = sc.next();
        System.out.print("Cast your vote: ");
        temp = sc.nextInt();
        if(temp==1)
            vote[0] = 1;
        else if(temp==2)
            vote[1] = 1;
        else if(temp==3)
            vote[2] = 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectiveWArrayOfObj ob[] = new ElectiveWArrayOfObj[10];
        int n, counter1=0, counter2=0, counter3=0;

        System.out.print("Enter number of students: ");
        n = sc.nextInt();
        System.out.println("Elective course voting system: ");
        System.out.println("1 - Operating system \n2 - Network communication \n3 - IoT");
        for(int i=0;i<n;i++){
            ob[i] = new ElectiveWArrayOfObj();
            ob[i].getData();
        }

        for(int i=0;i<n;i++){
            if(ob[i].vote[0]==1)
                counter1+=1;
            else if(ob[i].vote[1] == 1)
                counter2+=1;
            else
                counter3+=1;
        }

        int result[] = {counter1, counter2, counter3};
        Arrays.sort(result);

        if(result[2]==counter1)
            System.out.println("Operating system is the chosen elective course");
        else if(result[2] == counter2)
            System.out.println("Network communication  is the chosen elective course");
        else
            System.out.println("IoT is the chosen elective course");
    }
}
