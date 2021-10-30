package Theory.PartF;

class RunnableDemo implements Runnable {
    private Thread t;
    private String name;

    RunnableDemo (String tname) {
        name = tname;
    }

    public void start() {
        System.out.println("Starting thread " + name);
        if(t==null) {
            t = new Thread(name);
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println("Running thread " + name);
        try {
            for(int i=0;i<=10;i+=2){
                System.out.println(i);
                Thread.sleep(50);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Thread " + name + " interrupted");
        }
        System.out.println("Exiting thread " + name);
    }
}

public class ThreadPractice2 {
    public static void main(String[] args) {
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();
        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.start();
    }
}
