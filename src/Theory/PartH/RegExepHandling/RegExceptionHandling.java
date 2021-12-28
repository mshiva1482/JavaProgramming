package Theory.PartH.RegExepHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class InvalidYearException extends Exception {
    public InvalidYearException(String s) { super(s); }
}
class InvalidRnoException extends Exception {
    public InvalidRnoException(String s) {
        super(s);
    }
}
class InvalidCourseException extends Exception {
    public InvalidCourseException(String s) {
        super(s);
    }
}
class InvalidSchoolException extends Exception {
    public InvalidSchoolException(String s) {
        super(s);
    }
}

public class RegExceptionHandling {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean regFlag = true, schoolFlag = true;
        String name, school, regno;
        System.out.print("Enter number of students: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.print("Enter your register number: ");
            regno = sc.next();
            //To check if the year is valid
            try {
                if(!regno.substring(0, 2).equals("20")){
                    regFlag = false;
                    throw new InvalidYearException("Invalid year :/");
                }

            }catch (InvalidYearException e) {
                System.out.println(e.getMessage());
            }
            //To check if the course code is  valid
            try {
                if(!regno.substring(2, 5).equals("BCE") && !regno.substring(2, 5).equals("BPS") && !regno.substring(2, 5).equals("BAI") && !regno.substring(2, 5).equals("BRS")) {
                    regFlag = false;
                    throw new InvalidCourseException("Invalid course :/");
                }
            }catch (InvalidCourseException e) {
                System.out.println(e.getMessage());
            }
            //To check if the roll number is valid
            int rno = Integer.parseInt(regno.substring(5));
            try {
                if((rno<1000 || rno>=9999)) {
                    regFlag = false;
                    throw  new InvalidRnoException("Invalid roll number :/");
                }
            }catch (InvalidRnoException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("Enter your name: ");
            name = sc.next();
            System.out.print("Enter school: ");
            school = sc.next();
            //To check if the entered school is valid
            try {
                if(!school.equals("SCOPE") && !school.equals("SENSE") && !school.equals("SELECT") && !school.equals("SMBS")){
                    schoolFlag = false;
                    throw new InvalidSchoolException("Invalid school name :/");
                }
            }catch (InvalidSchoolException e) {
                System.out.println(e.getMessage());
            }
            if(schoolFlag && regFlag){
                System.out.println("Entered data is valid!");
                String val = name + " " + regno + " " + school;
                File fl = new File("/Users/shiva/IdeaProjects/test_project/src/Theory/PartH/RegExepHandling/output");
                FileWriter fw = new FileWriter(fl, true);
                fw.append(val).append("\n");
                System.out.println("Data written successfully into file");
                fw.close();
            }
            else
                System.out.println("Entered data is invalid...");
        }
    }
}
