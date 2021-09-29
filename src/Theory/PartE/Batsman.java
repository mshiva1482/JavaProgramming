package Theory.PartE;

import java.util.Random;
import java.util.Scanner;

public class Batsman {
    int bcode, innings, notout, runs;
    float batavg;
    String bname;

    public Batsman() {
        Random rnd = new Random();
        bcode = rnd.nextInt(9999);
    }

    private void calcAvg() {
        batavg = (float)runs / (innings-notout);
    }

    public void readData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Innings: ");
        innings = scan.nextInt();
        System.out.println("Notout: ");
        notout = scan.nextInt();
        System.out.println("Runs: ");
        runs = scan.nextInt();
        System.out.println("Enter player name: ");
        bname = scan.next();

        calcAvg();
    }

    public static void displayData(Batsman obj[], int n) {
        System.out.println("\nPlayer data");
        for(int i=0;i<n;i++) {
            System.out.print("Batsman name: " + obj[i].bname);
            System.out.print("\nInnings: " + obj[i].innings);
            System.out.print("\nNot out: " + obj[i].notout);
            System.out.print("\nRuns: " + obj[i].runs);
            System.out.print("\nBat average: " + obj[i].batavg + "\n");
        }
    }

    public static void main(String[] args) {
        int n;
        Batsman obj[] = new Batsman[15];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of batsman: ");
        n = sc.nextInt();

        for(int i=0;i<n;i++) {
            System.out.println("Enter data for player " + (i+1));
            obj[i] = new Batsman();
            obj[i].readData();
        }
        displayData(obj, n);

    }
}
