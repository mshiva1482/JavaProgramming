package Theory.PartB;

public class MethodsInJava {

    public MethodsInJava(int x, int y){
        System.out.println("Argument constructor invoked: " + x + " " + y);
        diff();
    }
    public MethodsInJava(){
        System.out.println("Non-argument constructor invoked!");
        sum();
    }

    public static void sum(){
        int a=10, b=5;
        int sum = a+b;
        System.out.println("Sum is " + sum);
    }

    public void diff(){
        int a=10, b=5;
        int diff = a-b;
        System.out.println("Diff is "+ diff);
    }

    public static void main(String[] args) {
        MethodsInJava obj = new MethodsInJava();
        new MethodsInJava(10, 10);
        obj.diff();
    }

}

