package Theory.DigitalAssignment1;

public class Florist {
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
        int mat[][] = {{6, 4, 3}, {1, -2, -2}, {1, 1, 1}};
        int Dx[][] = {{610, 4, 3}, {0, -2, -2}, {120, 1, 1}};
        int Dy[][] = {{6, 610, 3}, {1, 0, -2}, {1, 120, 1}};
        int Dz[][] = {{6, 4, 610}, {1, -2, 0}, {1, 1, 120}};
        double x = determinant(Dx)/determinant(mat);
        double y = determinant(Dy)/determinant(mat);
        double z = determinant(Dz)/determinant(mat);

        System.out.println("In one bouquet, there will be...");
        System.out.println(x/5 + " Roses");
        System.out.println(y/5 + " Tulips");
        System.out.println(z/5 + " lilies");

    }
}
