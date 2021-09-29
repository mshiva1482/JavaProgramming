package Theory.PartC;

import java.util.Scanner;

public class ReadingData {
    int june[][] = new int[10][10];
    int july[][] = new int[10][10];
    int august[][] = new int[10][10];

    Scanner sc = new Scanner(System.in);

    public void get(){
        System.out.println("Enter data for the month of june: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                june[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter data for the month of july: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                july[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter data for the month of august: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                august[i][j] = sc.nextInt();
            }
        }
    }

    public void calculate(){
        int sum = 0;
        for(int i=0;i<3;i++){
            sum += july[0][i] + june[0][i] + august[0][i];
        }
        System.out.println("The total number of books read in paper in all three months is " + sum);
    }

    public static void main(String[] args) {
        ReadingData obj = new ReadingData();

        obj.get();
        obj.calculate();
    }
}

