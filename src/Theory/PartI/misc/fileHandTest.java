package Theory.PartI.misc;

import java.io.*;

public class fileHandTest {
    public static void main(String[] args) throws IOException {
        char[] data = new char[100];
        String si;
        char i;

        File f = new File("/Users/shiva/IdeaProjects/test_project/src/Theory/PartI/misc/samplex.txt");
        String s = "vestibulum morbi blandit cursus risus\nat ultrices mi tempus imperdiet nulla \nmalesuada pellentesque elit eget gravida";
        System.out.println("File status: " + f.exists());

        FileWriter fw = new FileWriter(f);
        fw.write(s);
        fw.close();
        FileReader fr = new FileReader(f);

        System.out.println("Bulk read from file: ");
        fr.read(data);
        System.out.println(data);


        System.out.println("Line by line read: ");
        BufferedReader br = new BufferedReader(fr);
        while((si = br.readLine())!=null) {
            System.out.println(si);
        }

//        System.out.println("Character by Character read: ");
//        while((i=(char)fr.read())!=-1) {
//            System.out.println((char)i);
//        }

        fr.close();

    }
}
