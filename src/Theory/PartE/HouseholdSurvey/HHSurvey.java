package Theory.PartE.HouseholdSurvey;

import java.util.Random;
import java.util.Scanner;

class Survery implements SurveyDB{
    int income, m, id;
    Scanner scan = new Scanner(System.in);

    public Survery() {
        Random rnd = new Random();
        id = rnd.nextInt(9999);
    }

    @Override
    public void startSurvey() {
        System.out.println("Your unique ID is " + id);
        System.out.print("Enter your annual income: ");
        income = scan.nextInt();
    }

}

public class HHSurvey {
    public static void calculate(Survery obj[], int n) {
        float sum=0, avg, pov;
        for(int i=0;i<n;i++){
            sum += obj[i].income;
        }
        avg = sum/n;
        System.out.println("\nAverage income is Rs." + avg);
        pov = 7500 + 950 * (n-2);
        System.out.println("\nHouseholds with income above average");
        for(int i=0;i<n;i++){
            if(obj[i].income > avg) {
                System.out.println("ID: " + obj[i].id  + " Income: Rs." + obj[i].income);
            }
        }
        System.out.println("\nHouseholds with income below poverty line");
        int count = 0;
        for(int i=0;i<n;i++) {
            if(obj[i].income < pov) {
                count++;
            }
        }
        float percent = (count/n)*100;
        System.out.println("Percentage of households living below the poverty line: " + percent + "%");


    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Survery obj[] = new Survery[15];
        System.out.print("Enter number of survey participants: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            obj[i] = new Survery();
            obj[i].startSurvey();
        }
        calculate(obj, n);

    }
}
