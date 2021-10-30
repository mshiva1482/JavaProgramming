package Theory.PartH.vowelsConsonants;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class vowelsConsonants {
    public static void main(String[] args) throws IOException {
        File fl = new File("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/vowelsConsonants/original");
        String para = "vestibulum morbi blandit cursus risus at ultrices mi tempus imperdiet nulla malesuada pellentesque elit eget gravida cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus mauris vitae ultricies leo integer malesuada nunc vel risus commodo viverra maecenas accumsan lacus vel facilisis volutpat est velit egestas dui id ornare arcu odio ut sem nulla pharetra diam sit amet nisl suscipit adipiscing bibendum est ultricies integer quis auctor elit sed vulputate mi sit amet mauris commodo quis imperdiet massa tincidunt nunc pulvinar sapien et ligula ullamcorper malesuada proin libero nunc consequat interdum varius sit amet mattis vulputate enim nulla";

        FileWriter fw = new FileWriter("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/vowelsConsonants/original");
        FileWriter vowels = new FileWriter("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/vowelsConsonants/vowels");
        FileWriter consonants = new FileWriter("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/vowelsConsonants/consonants");
        fw.write(para);
        fw.close();

        FileReader fr = new FileReader("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/vowelsConsonants/original");
        FileWriter fwvowels = new FileWriter("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/vowelsConsonants/vowels");
        FileWriter fwcons = new FileWriter("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/vowelsConsonants/consonants");

        Scanner input = new Scanner(fr);
        Character a = 'a';
        Character e = 'e';
        Character i = 'i';
        Character o = 'o';
        Character u = 'u';

        int vcount=0, ccount=0;
        while(input.hasNext()){
            String word = input.next();
            Character fLetter = word.charAt(0);
            int check1=Character.compare(fLetter, a);
            int check2 = Character.compare(fLetter, e);
            int check3 = Character.compare(fLetter, i);
            int check4 = Character.compare(fLetter, o);
            int check5 = Character.compare(fLetter, u);
            if(check1 == 0 || check2 == 0 || check3 == 0 || check4 == 0 || check5 == 0) {
                fwvowels.write(word+"\n");
                vcount++;
            }
            else {
                fwcons.write(word+"\n");
                ccount++;
            }
        }

        fwvowels.close();
        fwcons.close();

        System.out.println("Segregation complete!");
        System.out.println("Number of vowels: " + vcount);
        System.out.println("Number of consonants: " + ccount);


    }
}
