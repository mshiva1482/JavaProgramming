package Theory.PartB;

import java.util.Scanner;

public class PizzaJohn {
    String custName, pizzaName, size;
    float weight, price, totalPrice;
    public void get(){
        Scanner get = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        custName = get.next();
        System.out.println("Enter Name of pizza: ");
        pizzaName = get.next();
        System.out.println("Enter size of pizza: ");
        size = get.next();
        System.out.println("Enter weight of pizza(in grams): ");
        weight = get.nextFloat();
        System.out.println("Enter price per kilogram: ");
        price = get.nextFloat();
        totalPrice = (weight/1000)*price;
    }

    public void display(){
        System.out.println("Name: " + custName + "\nPizza name: " + pizzaName + "\nSize: " + size+ "\nTotal price: " + totalPrice);
    }

    public static void main(String[] args) {
        int n, ch;
        Scanner get = new Scanner(System.in);
        PizzaJohn obj[] = new PizzaJohn[10];


        n = get.nextInt();
        for(int i=0;i<n;i++){
            obj[i] = new PizzaJohn();
            obj[i].get();
        }

        while(true){
            System.out.println("1. Get data based on customer name\n 2. Based on weight\n 3. Sort data in ascending order\n 4.Exit");
            ch = get.nextInt();
            if(ch==1){
                String name;
                int flag=0;
                System.out.println("Enter customer name to be searched: ");
                name = get.next();
                for(int i=0;i<n;i++){
                    if(obj[i].custName.equals(name)){
                        System.out.println("Customer found!\n");
                        obj[i].display();
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                    System.out.println("Customer not found :/");
            }
            else if(ch==2){
                float weightThreshold;
                System.out.println("Enter weight threshold: ");
                weightThreshold = get.nextFloat();
                for(int i=0;i<n;i++){
                    if(obj[i].weight > weightThreshold){
                        obj[i].display();
                    }
                }
            }
            else if(ch==3){
                PizzaJohn temp = new PizzaJohn();
                System.out.println("Pizza data sorted in ascending order: \n");
                for(int i=0;i<n-1;i++){
                    for(int j=0;j<n-i-1;j++){
                        if(obj[j].totalPrice > obj[j+1].totalPrice){
                            temp = obj[j];
                            obj[j] = obj[j+1];
                            obj[j+1] = temp;
                        }
                    }
                }
                for(int i=0;i<n;i++){
                    obj[i].display();
                }
            }
            else if(ch==4){
                break;
            }
        }
    }
}