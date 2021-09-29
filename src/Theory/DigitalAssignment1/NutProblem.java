package Theory.DigitalAssignment1;

import java.util.Scanner;

public class NutProblem {
    public static void main(String[] args) {
        float mat1[][] = new float[5][5];
        float mat2[][] = new float[5][5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first matrix data: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat1[i][j] = sc.nextFloat();
            }
        }
        System.out.println("Enter second matrix data: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat2[i][j] = sc.nextFloat();
            }
        }

        float result[][] = new float[5][5];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                float sum = 0;
                for(int k=0;k<3;k++){
                    float res = mat1[i][k] * mat2[k][j];
                    sum += res;
                }
                result[i][j] = sum;
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                result[i][j] = result[i][j]/10;
            }
        }

        System.out.println("Results -- Protein -> Carbs -> Fat (g/cup) ");
        System.out.println("Almonds");
        for(int i=0;i<3;i++){
            System.out.print(result[i][0] + " -> ");
        }

        System.out.println("\nCashews");
        for(int i=0;i<3;i++){
            System.out.print(result[i][1] + " -> ");
        }
        System.out.println("\nPecans");
        for(int i=0;i<3;i++){
            System.out.print(result[i][2] + " -> ");
        }
    }
}
