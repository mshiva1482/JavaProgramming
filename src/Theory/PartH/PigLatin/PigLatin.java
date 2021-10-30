package Theory.PartH.PigLatin;

import java.io.*;
import java.util.*;

public class PigLatin {


    static int vIndex(String word) {
        int ind = -1;
        Character a = 'a';
        Character e = 'e';
        Character ii = 'i';
        Character o = 'o';
        Character u = 'u';

        for(int i=0;i<word.length();i++) {
            Character letter = word.charAt(i);
            int check1=Character.compare(letter, a);
            int check2 = Character.compare(letter, e);
            int check3 = Character.compare(letter, ii);
            int check4 = Character.compare(letter, o);
            int check5 = Character.compare(letter, u);
            if(check1 == 0 || check2 == 0 || check3 == 0 || check4 == 0 || check5 == 0) {
                ind = i;
                break;
            }
        }
        return ind;
    }

    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/PigLatin/original");
        String words = "happy\nchild\nawesome\nair";
        fw.write(words);
        fw.close();

        FileReader fr = new FileReader("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/PigLatin/original");
        BufferedReader br = new BufferedReader(fr);
        String word;
        String pl;

        FileWriter fwp = new FileWriter("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/PigLatin/piglatConverted");
        while((word = br.readLine()) != null) {
            int index = vIndex(word);
            if(index == -1) {
                pl = word;
            }
            else if (index == 0) {
                int next = vIndex(word.substring(1));
                if(next == 0)
                    pl = word+"ay";
                else
                    pl = word+"way";
            }
            else {
                pl = word.substring(index) + word.substring(0, index) + "ay";
            }
            fwp.write(pl+"\n");
        }
        fwp.close();
        System.out.println("Conversion complete.");
    }
}
