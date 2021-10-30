package Theory.PartH.Conversation;

import java.io.*;

public class convo {

    static String speakerName(String sentence) {
        String speaker = null;
        for(int i=0;i<sentence.length();i++) {
            if(sentence.charAt(i) == ':') {
                speaker = sentence.substring(0, i);
            }
        }
        return speaker;
    }

    static String splitSentence(String sentence) {
        String splitSentence = null;
        for(int i=0;i<sentence.length();i++) {
            if(sentence.charAt(i)==':') {
                splitSentence = sentence.substring(i+1);
            }
        }
        return splitSentence;
    }

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/Conversation/fileConversation");
        BufferedReader br = new BufferedReader(fr);

        FileWriter p1 = new FileWriter("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/Conversation/Person1");
        FileWriter p2 = new FileWriter("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/Conversation/Person2");
        String sentence, splitSentence;
        while((sentence = br.readLine()) != null) {
            String speaker = speakerName(sentence);
            if(speaker.equals("Person1")) {
                splitSentence = splitSentence(sentence);
                p1.write("Person1: " + splitSentence+"\n");
            }
            else if(speaker.equals("Person2")) {
                splitSentence = splitSentence(sentence);
                p2.write("Person2: "+splitSentence+"\n");
            }
        }
        p1.close();
        p2.close();
        System.out.println("Conversation split complete.");
    }
}
