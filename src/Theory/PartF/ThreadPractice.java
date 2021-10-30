package Theory.PartF;

class Multithread extends Thread {
    public String name;
    Multithread(String name) {
        name = this.name;
    }

    @Override
    public void run() {
        System.out.println("\nThread " + name + " is under usage...");
        try{
            for(int i=0;i<10;i+=2) {
                System.out.println(i+"\t");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {

        }
    }
}

public class ThreadPractice {
    public static void main(String[] args) {
        Multithread t1 = new Multithread("Thread1");
        t1.start();
        Multithread t2 = new Multithread("Thread2");
        t2.start();
    }
}
