package Theory.PartI.misc.StudentNames;

import java.io.*;
import java.util.Scanner;

public class StudentFileManip {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/shiva/IdeaProjects/test_project/src/Theory/PartI/misc/StudentNames/orig");
        if(!f.exists())
            f.createNewFile();

        String names = "Shiva\nGurunath\nSandeep\nNanoori\nChidambaram\nHarshini\nShibani\nNithin";
        FileWriter fw = new FileWriter(f);
        fw.write(names);
        fw.close();

        FileWriter fv = new FileWriter("/Users/shiva/IdeaProjects/test_project/src/Theory/PartI/misc/StudentNames/Vow");
        FileWriter fc = new FileWriter("/Users/shiva/IdeaProjects/test_project/src/Theory/PartI/misc/StudentNames/cons");
        FileReader fr = new FileReader(f);

        Scanner allNames = new Scanner(f);
        String si;
        int len;
        while((allNames.hasNext())) {
            si = allNames.next();
            len = si.length();
            if(len%2==0)
                fv.write(si + "\n");
            else
                fc.write(si + "\n");
        }
        fr.close();
        fw.close();

    }
}
