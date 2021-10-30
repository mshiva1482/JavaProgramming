package Theory.PartH.oddEvenNames;

import java.io.*;
import java.util.*;

public class oddEvenNameFile {
    public static void main(String[] args) throws IOException{
        File f = new File("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/oddEvenNames/names");

        FileWriter fwo = new FileWriter("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/oddEvenNames/odd");
        FileWriter fwe = new FileWriter("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/oddEvenNames/even");

        Scanner allNames = new Scanner(f);
        String name;

        while(allNames.hasNext()) {
            name = allNames.next();
            if(name.length()%2==0) {
                fwe.write(name+"\n");
            }
            else {
                fwo.write(name+"\n");
            }
        }
        System.out.println("\nSegregation complete!");
        fwe.close();
        fwo.close();
    }
}
