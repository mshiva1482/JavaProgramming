package Theory.PartG;


public class multiThreadingPractice implements Runnable {
    private String tName;
    Thread t;

    public multiThreadingPractice(String s) {
        tName = s;
        t = new Thread(this);
    }

    @Override
    public void run() {
        for(int i=0;i<10;i+=2) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        multiThreadingPractice obj1 = new multiThreadingPractice("Thread 1");
        multiThreadingPractice obj2 = new multiThreadingPractice("Thread 2");
        System.out.println("");
        obj1.t.start();
        obj2.t.start();
    }
}
