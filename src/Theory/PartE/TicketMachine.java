//1. Assume ticket issuing machine. The following are the methods to be discussed with the system: getBalance, getPrice,insertMoney, and printTicket. Given a ticket number t1,t2,t3, or t4, the getPrice method should return a value containing the price of the corresponding ticket that was set. The insertMoney method to should accept the user input of money and the getBalance to check if the amount entered is greater or equal to the price and display the balance to be returned. Once you have inserted enough money, the printTicket method will display the ticket number, amount entered and the balance amount given.

package Theory.PartE;

import java.util.Scanner;

class TicketData{
    int t1 = 150, t2 = 200, t3 = 250, t4 = 300;
    int moneyPaid, balanceToBeReturned, actualPrice;
    public void getPrice(int ch){
        if(ch==1) {
            System.out.println("Price of chosen ticked is Rs." + t1);
            actualPrice = t1;
        }
        else if(ch==2){
            System.out.println("Price of chosen ticket is Rs." + t2);
            actualPrice = t2;
        }
        else if(ch==3){
            System.out.println("Price of chosen ticket is Rs." + t3);
            actualPrice = t3;
        }
        else if(ch==4){
            System.out.println("Price of chosen ticket is Rs." + t4);
            actualPrice = t4;
        }
        else{
            System.out.println("Invalid choice!");
            System.exit(0);
        }
    }

    private void getBalance(){
        balanceToBeReturned = moneyPaid - actualPrice;
        if(balanceToBeReturned == 0) {
            System.out.println("No balance to be paid!");
        }
        else{
            System.out.println("Here's your balance: " + balanceToBeReturned);
        }
    }

    private void printTicket(){
        System.out.println("\nTicket confirmed!");
        int ticketNo = (int)(Math.random()*(2001)+2000);
        System.out.println("Ticket no: " + ticketNo);
        System.out.println("Cost of ticket: " + actualPrice);

    }

    public void insertMoney(int cash){
        moneyPaid = cash;
        getBalance();
        printTicket();
    }

}

public class TicketMachine extends TicketData {
    public static void newCust(){
        System.out.println("Hello, please Enter your ticket of choice(in number): ");
        System.out.println("1. t1\n2. t2\n3. t3\n4. t4");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketMachine ob = new TicketMachine();
        newCust();
        int ch2 = sc.nextInt();
        ob.getPrice(ch2);

        System.out.print("Pay the above mentioned price for your choice of ticket: ");
        int money = sc.nextInt();
        ob.insertMoney(money);

    }
}
