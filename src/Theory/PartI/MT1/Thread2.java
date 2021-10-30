package Theory.PartI.MT1;

class multiThreader extends Thread{
    Thread t;
    String tName;

    public multiThreader(String name) {
        this.tName = name;
        start();
    }

    @Override
    public void run() {
        try{
            for(int i=1;i<=5;i++) {
                System.out.println(tName + ": " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) { }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        multiThreader t1 = new multiThreader("Child1");
        multiThreader t2 = new multiThreader("Child2");

        try{
            for(int i=1;i<=4;i++) {
                System.out.println("Main: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) { }
    }
}
