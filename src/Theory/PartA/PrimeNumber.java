package Theory.PartA;

public class PrimeNumber {
    public static void main(String[] args) {
        int i, j;
        for(i=2;i<=50;i++){
            int flag=0;
            for(j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.println(i + " is a prime number!");
        }
    }
}
