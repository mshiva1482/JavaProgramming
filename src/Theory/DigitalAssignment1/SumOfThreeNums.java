package Theory.DigitalAssignment1;

public class SumOfThreeNums {
    public static double findCofactor(int a[][], int p, int q){
        int temp[] = new int[10];
        int x=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i!=p && j!=q){
                    temp[x] = a[i][j];
                    x++;
                }
            }
        }
        double cofactor = temp[0]*temp[3] - temp[1]*temp[2];
        return cofactor;
    }

    public static double determinant(int a[][]){
        double determinant = 0;
        for(int i=0;i<3;i++){
            double tempVar = a[0][i]*findCofactor(a, 0, i);
            if(i==1){
                tempVar = tempVar*-1;
            }
            determinant += tempVar;
        }
        return determinant;
    }

    public static void main(String[] args) {
        int mat[][] = {{1, 1, 1}, {0, -2, 1}, {-3, 0, 1}};
        int Dx[][] = {{26, 1, 1}, {0, -2, 1}, {-1, 0, 1}};
        int Dy[][] = {{1, 26, 1}, {0, 0, 1}, {-3, -1, 1}};
        int Dz[][] = {{1, 1, 26}, {0, -2, 0}, {-3, 0, -1}};
        double x = determinant(Dx)/determinant(mat);
        double y = determinant(Dy)/determinant(mat);
        double z = determinant(Dz)/determinant(mat);

        System.out.println("The numbers are " + (int)x + ", " + (int)y + " & " + (int)z);
    }
}
