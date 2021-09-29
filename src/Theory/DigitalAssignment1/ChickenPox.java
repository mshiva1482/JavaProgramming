package Theory.DigitalAssignment1;

public class ChickenPox {

    public static void main(String[] args) {
        double mat1[][] = {{100, 80}, {120, 100}};
        double mat2[][] = {{0.15, 0.35, 0.5}, {0.25, 0.3, 0.45}};

        double result[][] = new double[5][5];

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                double sum = 0;
                for(int k=0;k<2;k++){
                    double res = mat1[i][k] * mat2[k][j];
                    sum += res;
                }
                result[i][j] = sum;
            }
        }
        System.out.println("----High school chicken pox breakout data----\n");
        System.out.println("Number of healthy males: " + result[0][0]);
        System.out.println("Number of sick males: " + result[0][1]);
        System.out.println("Number of carrier males: " + result[0][2]);
        System.out.println("Number of healthy females: " + result[1][0]);
        System.out.println("Number of sick females: " + result[1][1]);
        System.out.println("Number of carrier females: " + result[1][2]);
    }


}
