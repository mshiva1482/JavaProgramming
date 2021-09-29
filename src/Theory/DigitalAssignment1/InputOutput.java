package Theory.DigitalAssignment1;

public class InputOutput {
    public static double[][] diff(double a[][], double b[][]){
        double result[][] = new double[10][10];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double iomat[][] = {{0.4, 0.25}, {0.25, 0.10}};
        System.out.println("-----Part A-----");
        double prodCapacity[][] = {{15}, {20}};

        double result[][] = new double[5][5];
        for(int i=0;i<2;i++){
            for(int j=0;j<1;j++){
                double sum = 0;
                for(int k=0;k<2;k++){
                    double res = iomat[i][k] * prodCapacity[k][j];
                    sum += res;
                }
                result[i][j] = sum;
            }
        }
        System.out.println("The industries produce $" + result[0][0] + " million worth of energy and $" + result[1][0] + " million worth of manufacturing");

        System.out.println("\n-----Part B-----");
        double I[][] = {{1, 0}, {0, 1}};
        double X[][] = new double[10][10];
        double D[][] = {{8}, {5}};
        X = diff(I, iomat);

        double result2[][] = new double[5][5];
        for(int i=0;i<2;i++){
            for(int j=0;j<1;j++){
                double sum = 0;
                for(int k=0;k<2;k++){
                    double res = X[i][k] * D[k][j];
                    sum += res;
                }
                result2[i][j] = sum;
            }
        }
        System.out.println("The industries produce $" + result2[0][0] + " million worth of energy and $" + result2[1][0] + " million worth of manufacturing");

    }
}
