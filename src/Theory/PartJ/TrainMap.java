package Theory.PartJ;

import java.util.*;
public class TrainMap {
    public static void main(String[] arg){
        Map<Integer, String> trains = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter tht number of trains - ");
        n = sc.nextInt();

        String tname;
        int tno=1000;

        System.out.println("Enter the train names -");
        for(int i=0;i<n;i++){
            tname = sc.next();
            trains.put(tno++,tname);
        }

        System.out.println("Enter the train name to be searched - ");
        tname = sc.next();
        String finalTname = tname;
        trains.entrySet().forEach((d) ->
        {
            if (d.getValue().equals(finalTname))
            {
                System.out.println("Train found!\nTrain name - "+ finalTname +"\nTrain no - "+d.getKey());
            }
        });

        System.out.println("Enter the train no to be searched - ");
        tno = sc.nextInt();
        int finalTno = tno;
        trains.entrySet().forEach((d) ->
        {
            if (d.getKey()==finalTno)
            {
                System.out.println("Train found!\nTrain name - "+ d.getValue() +"\nTrain no - "+finalTno);
            }
        });
    }
}
