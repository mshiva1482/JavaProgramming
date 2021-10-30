package Lab.CAT1;

import java.util.Scanner;

public class ScoreBoard {
    String name;
    int runs, balls, boundaries, sixes;
    String status;
    float strikeRate;

    ScoreBoard() {
        System.out.println("\nGame analysis...");
    }

    ScoreBoard(String name, int runs, int balls, int boundaries, int sixes, String status) {
        this.name = name;
        this.runs = runs;
        this.balls = balls;
        this.boundaries = boundaries;
        this.sixes = sixes;
        this.status = status;
        this.strikeRate = strikeRateCalculator(runs, balls);
    }

    public float strikeRateCalculator(int runs, int balls) {
        //Strike rate calculated using the formula:
        //strikeRate = (Runs scored/number of balls faced)*100
        return (float) ((runs/balls)*100);

    }

    public void HighestStrikeRate(ScoreBoard sb[], int n) {
        float max = 0;
        int index = 0;
        for(int i=0;i<n;i++) {
            if(sb[i].strikeRate>max){
                max = sb[i].strikeRate;
                index = i;
            }
        }
        System.out.println("\n" + sb[index].name +" had the highest strike rate!");
    }

    public void GameAnalysis(ScoreBoard sb[], int n) {
        int totRuns=0, totBounds=0, totSixes=0;
        float byBounds, bySixes;
        for(int i=0;i<n;i++) {
            totBounds += sb[i].boundaries;
            totSixes += sb[i].sixes;
            totRuns += sb[i].runs;
        }
        byBounds = (float)(totBounds/totRuns) * 100;
        bySixes = (float)(totSixes/totRuns) * 100;

        System.out.println("\nTotal number of boundaries scored: " + totBounds);
        System.out.println("Total number of sixes scored: " + totSixes);
        System.out.println("Percentage of runs scored by boundaries: " + byBounds + "%");
        System.out.println("Percentage of runs scored by sixes: " + bySixes + "%");
    }

    public void GameStatus(ScoreBoard sb[], int n) {
        int out=0, notOut=0, notPlayed=0;
        for(int i=0;i<n;i++) {
            if(sb[i].status.equals("O"))
                out++;
            else if(sb[i].status.equals("NO"))
                notOut++;
            else if(sb[i].status.equals("NP"))
                notPlayed++;
        }

        System.out.println("\nNumber of players out: " + out);
        System.out.println("Number of players not out: " + notOut);
        System.out.println("Number of players not played: " + notPlayed);
    }

    public static void main(String[] args) {
        String name;
        int runs, balls, boundaries, sixes;
        String status;
        Scanner scan = new Scanner(System.in);
        int n;
        ScoreBoard sb[] = new ScoreBoard[10];
        System.out.print("Enter number of players: ");
        n = scan.nextInt();

        for(int i=0;i<n;i++) {
            System.out.println("\nEnter data for batsman #" + (i+1));
            System.out.print("Enter name of batsman: ");
            name = scan.next();
            System.out.print("Enter total runs scored: ");
            runs = scan.nextInt();
            System.out.print("Enter total number of balls face: ");
            balls = scan.nextInt();
            System.out.print("Enter number of boundaries: ");
            boundaries = scan.nextInt();
            System.out.print("Enter number of sixes: ");
            sixes = scan.nextInt();
            System.out.print("Enter current status");
            status = scan.next();
            sb[i] = new ScoreBoard(name, runs, balls, boundaries, sixes, status);
        }

        ScoreBoard sba = new ScoreBoard();
        sba.HighestStrikeRate(sb, n);
        sba.GameAnalysis(sb, n);
        sba.GameStatus(sb, n);
    }
}
