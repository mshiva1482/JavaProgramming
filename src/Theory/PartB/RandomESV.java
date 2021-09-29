package Theory.PartB;

import java.util.Random;

public class RandomESV {

    public static void main(String[] args) {
        Random ran = new Random();
        int m1[] = new int[10];
        int m2[] = new int[10];
        int m3[] = new int[10];
        int diff[] = new int[10];
        String s1, s2;
        int temp1, temp2;

        for(int i=0;i<5;i++){
            m1[i] = ran.nextInt(50);
            m2[i] = ran.nextInt(50);
            s1 = Integer.toString(m1[i]);
            s2 = Integer.toString(m2[i]);
            m3[i] = Integer.parseInt(s1 + s2);
            diff[i] = Math.abs(m1[i] - m2[i]);
        }

        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(diff[i] > diff[j]){
                    temp1 = diff[i];
                    diff[i] = diff[j];
                    diff[j] = temp1;
                    temp2 = m3[i];
                    m3[i] = m3[j];
                    m3[j] = temp2;
                }
            }
        }

        for(int i=0;i<5;i++){
            System.out.println("Diff = " + diff[i] + "  Concatenated value m3 = " + m3[i]);
        }

    }
}
