package Theory.DigitalAssignment1;

public class GirlsContest {
    public static void main(String[] args) {
        double absScore[][] = {{16.4, 19, 17.5}, {12.4, 13, 16}, {15, 20, 17.5}};
        double diffScore[][] = {{2, 3, 1}, {1, 2, 3}, {2, 1, 2}};
        double result[][] = new double[5][5];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                double sum = 0;
                for(int k=0;k<3;k++){
                    sum += absScore[i][k]*diffScore[k][j];
                }
            result[i][j] = sum;
            }
        }
        System.out.println("-----State fair girls contest result-----");
        System.out.println("Brielle's score is: "+ result[0][0]);
        System.out.println("Brynn's score is: "+ result[1][1]);
        System.out.println("Briana's score is: "+ result[2][2]);
    }
}
