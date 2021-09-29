//You are given a choice for selecting electives - OS, Network comms, IoT - Get voting from n students - name, regno & choice
//OP - Display the no. of students that opted choice 1, choice 2 & choice 3
//Also display the  highest voted Elective course.
//If two electives have same no. of votes, then both courses will be offered

package Theory.PartA;

import java.util.Scanner;

public class ElectiveCourseVoting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, counter1 = 0, counter2 = 0, counter3 = 0;
        String c1[] = new String[20];
        String c2[] = new String[20];
        String c3[] = new String[20];

        System.out.println("Enter total number of students: ");
        n = sc.nextInt();

        System.out.println("1 - Operating system");
        System.out.println("2 - Network communication");
        System.out.println("3 - IoT");

        for (int i = 0; i < n; i++) {
            int vote;
            System.out.println("Hello student #" + (i + 1));
            System.out.println("Please enter cast your vote and enter your name below: ");
            vote = sc.nextInt();
            if (vote == 1) {
                c1[i] = sc.next();
                counter1 += 1;
            }
            else if (vote == 2) {
                c2[i] = sc.next();
                counter2 += 1;
            }
            else if (vote == 3) {
                c3[i] = sc.next();
                counter3 += 1;
            }
            else
                System.out.println("Invalid vote!");
        }

        System.out.println("--Voting results--");
        System.out.println("\nNumber  of students that voted for Operating Systems: " + counter1);
        System.out.println("Name of students that voted for Operating systems");
        for (int i = 0; i < counter1; i++) {
            System.out.println(c1[i]);
        }
        System.out.println("\nNumber  of students that voted for Network communication: " + counter2);
        System.out.println("Name of students that voted for Network communication");
        for (int i = 0; i < counter2; i++) {
            System.out.println(c2[i]);
        }
        System.out.println("\nNumber  of students that voted for IoT: " + counter3);
        System.out.println("Name of students that voted for IoT");
        for (int i = 0; i < counter3; i++) {
            System.out.println(c3[i]);
        }

        int max;

        if (counter1 > counter2) {
            if (counter1 > counter3)
                max = counter1;
            else
                max = counter3;
        } else
            max = counter2;

        System.out.println("\n");
        if(max==counter1)
            System.out.println("The elective course offered this semester is Operating Systems");
        else if(max==counter2)
            System.out.println("The elective course offered this semester is Network communication");
        else
            System.out.println("The elective course offered this semester is IoT");



    }
}

