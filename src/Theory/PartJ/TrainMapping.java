package Theory.PartJ;

import java.util.*;
import java.util.Map.Entry;

public class TrainMapping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trNo;
        String trName;
        Map<Integer, String> trData = new HashMap<>();
        trData.put(1324, "Capital Express");
        trData.put(1412, "Chennai mail");
        trData.put(1344, "Coalfield Express");
        trData.put(1244, "Goa Express");
        trData.put(1778, "Gujarat Express");

        System.out.print("Enter train number: ");
        trNo = sc.nextInt();
        System.out.println("Train name: " + trData.get(trNo));

        System.out.print("Enter train name: ");
        trName = sc.next();
        String name = trName;
        for(Entry<Integer, String> entry: trData.entrySet()) {
            if(entry.getValue().equals(trName)) {
                System.out.println("Train Number: " + entry.getKey());
            }
        }
    }
}
