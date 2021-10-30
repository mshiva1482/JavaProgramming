package Theory.PartG;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;

public class fileCopy {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/shiva/IdeaProjects/test_project/src/Theory/PartG/sample");
        FileWriter fw = new FileWriter("/Users/shiva/IdeaProjects/test_project/src/Theory/PartG/sampleCopy");

        int ch, count=0;
        while((ch = fr.read()) != -1) {
            fw.write(ch);
            count++;
        }
        System.out.println("Copy over complete");
        System.out.println("Total number of words: " + count);
        fr.close();
        fw.close();

    }
}
