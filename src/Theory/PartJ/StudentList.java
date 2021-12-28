//Create a list with subject code, subject name, semester, category of paper(elective, core). Every student given the semester
// is supposed to select two core and one elective listed for the given semester.
//Write a code that validates the student subject selection based on his semester input and display the correct selection finally.
package Theory.PartJ;

import java.util.*;

public class StudentList {
    String code, name, cat;
    int sem;

    public StudentList(String code, String name, int sem, String cat) {
        this.code = code;
        this.name = name;
        this.sem = sem;
        this.cat = cat;
    }

    public static void main(String[] args) {
        List<StudentList> studentData = new ArrayList<StudentList>();
        StudentList s[] = new StudentList[12];
        Scanner sc = new Scanner(System.in);
        int n;
        int counter[] = new int[10];
        String sName[] = new String[10];
        String c1, c2, e1;
        for(int i=0;i<6;i++) {
            counter[i] = 0;
        }
        s[0] = new StudentList("CSE1001", "Computer science", 3, "core");
        s[2] = new StudentList("CSE1002", "OOP concepts", 3, "core");
        s[3] = new StudentList("CSE2005", "Operating systems", 3, "core");
        s[4] = new StudentList("CSE2006", "Microprocessor", 3, "core");
        s[1] = new StudentList("MAT1001", "Mathematics", 3, "elective");
        s[5] = new StudentList("CSE1007", "Java programming", 3, "elective");

        System.out.print("Enter number of students: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("Student #" + (i+1));
            System.out.print("Enter your name: ");
            sName[i] = sc.next();
            System.out.println("Enter two choice of core subjects");
            c1 = sc.next();
            c2 = sc.next();
            System.out.print("Enter one choice of elective subject");
            e1 = sc.next();
            if(c1.equals("CSE1001") || c2.equals("CSE1001"))
                counter[0]++;
            else if(c1.equals("CSE1002") || c2.equals("CSE1002"))
                counter[1]++;
            else if(c1.equals("CSE2005") || c2.equals("CSE2005"))
                counter[2]++;
            else if(c1.equals("CSE2006") || c2.equals("CSE2006"))
                counter[3]++;
            else if(e1.equals("CSE1007"))
                counter[4]++;
            else if(e1.equals("MAT1001"))
                counter[5]++;
        }
    }

}
