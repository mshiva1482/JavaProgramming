package Theory.PartB;

import java.util.Scanner;

public class DrinkShop {
    int start[][] = new int[10][10];
    int end[][] = new int[10][10];
    public DrinkShop(){
        System.out.println("Welcome to the drink shop!\n");
    }
    public void get(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Drinks data from the beginning of the today: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                start[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter drinks data from the end of today: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                end[i][j] = input.nextInt();
            }
        }
    }
    public void calculate(){
        int diff[][] = new int[10][10];
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                diff[i][j] = start[i][j] - end[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                sum += diff[i][j];
            }
        }
        System.out.println("Total items sold today: " + sum);
    }
    public static void main(String[] args) {
        DrinkShop obj = new DrinkShop();
        obj.get();
        obj.calculate();


    }
}
