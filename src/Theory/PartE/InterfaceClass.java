package Theory.PartE;

import java.util.Scanner;

class getInterface implements inter1{

    @Override
    public void add(int a, int b) {
        System.out.println("Sum: " + (a+b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Difference: " + (a-b));
    }
}

public class InterfaceClass extends getInterface{
    public static void main(String[] args) {
        System.out.print("What's your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + ", Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        InterfaceClass obj = new InterfaceClass();
        obj.add(a, b);
        obj.sub(a, b);

        System.out.println("Also, you wanna know my name?");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                inter1.myName();
                break;
            case 0:
                System.out.println("Okay... :(");
                break;
            default:
                System.out.println("Wrong option dummy");
                break;
        }
    }
}
