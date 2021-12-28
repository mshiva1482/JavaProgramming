//Create a list having book id, book name, year, cost as it's input. Find those books that has its name starting with a vowel, and all books that are published between 2020-2021, and all books that cost between 500-1000
package Theory.PartJ;

import java.util.*;

public class BookList {
    int id, cost, year;
    String name;

    public BookList(int id, String name, int year, int cost) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.cost = cost;
    }

    public static void main(String[] args) {
        List<BookList> bookData = new ArrayList<BookList>();
        BookList b[] = new BookList[20];
        ListIterator<BookList> trav = bookData.listIterator();

        b[0] = new BookList(101, "Harry potter", 2005, 600);
        b[1] = new BookList(102, "Hunger games", 2006, 350);
        b[2] = new BookList(103, "Power of Habit", 2020, 250);
        b[3] = new BookList(104, "Cloud Atlas", 2021, 400);
        b[4] = new BookList(105, "Eclipse", 2010, 550);

        for(int i=0;i<5;i++) {
            bookData.add(b[i]);
        }

        System.out.println("\nPart 1: Books whose name start with a vowel:");
        for(BookList bl:bookData) {
            if(bl.name.charAt(0) == 'A' || bl.name.charAt(0) == 'E' || bl.name.charAt(0) == 'I' || bl.name.charAt(0) == 'O' || bl.name.charAt(0) == 'U') {
                System.out.println(bl.name);
            }
        }

        System.out.println("\nPart 2: Books published between 2020 and 2021: ");
        for(BookList bl:bookData) {
            if(bl.year==2020 || bl.year == 2021) {
                System.out.println(bl.name);
            }
        }

        System.out.println("\nPart 3: Books that cost between 500 and 1000: ");
        for(BookList bl:bookData) {
            if(bl.cost>500 && bl.cost<1000) {
                System.out.println(bl.name);
            }
        }

    }

}
