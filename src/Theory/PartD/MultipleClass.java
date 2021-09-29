package Theory.PartD;
class SecondClass{
    public void method1(){
        System.out.println("Method 1 has been invoked!");
    }

    public static void smethod1(){
        System.out.println("Static method 1 has been invoked!");
    }

}

public class MultipleClass {
    public void method2(){
        System.out.println("Method 2 has been invoked!");
    }

    public static void smethod2(){
        System.out.println("Static method 2 has been invoked!");
    }

    public static void main(String[] args) {
        MultipleClass mc1 = new MultipleClass();
        SecondClass sc1 = new SecondClass();

        mc1.method2();
        smethod2();

        sc1.method1();
        SecondClass.smethod1();
    }
}
