package Theory.PartI.UserDefPackages;

import Theory.PartI.UserDefPackages.Pack1.*;
import Theory.PartI.UserDefPackages.Pack1.SubPack.*;

public class CentralClass extends Class1 implements Inter1, SubInter{
    @Override
    public void interSum(int a, int b) {
        System.out.println("Sum from Inter1: " + (a+b));
    }

    @Override
    public void interDiff(int a, int b) {
        System.out.println("Difference from Inter1: " + (a-b));
    }

    @Override
    public void interMethod() {
        System.out.println("Inside interface of subpack...");
    }

    public static void main(String[] args) {
        CentralClass obj1 = new CentralClass();
        int x = obj1.display();
        System.out.println("Value from class1: "+ x);

        SubClass.subMethod();

        Theory.PartI.UserDefPackages.Pack1.Inter1 obj2 = new CentralClass();
        obj2.interSum(15, 15);
        obj2.interDiff(60, 30);

        Theory.PartI.UserDefPackages.Pack1.SubPack.SubInter obj3 = new CentralClass();
        obj3.interMethod();
    }

}
