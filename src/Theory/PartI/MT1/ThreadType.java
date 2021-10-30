package Theory.PartI.MT1;

public class ThreadType extends Thread{
    private Thread t1;
    private String tName;

    public ThreadType(String name) {
        this.tName = name;
    }

    @Override
    public void run() {
        try{
            for(int i=0;i<10;i++) {
                System.out.println(tName + ": " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) { }
    }

    public static void main(String[] args) {
        ThreadType t1 = new ThreadType("Thread1");
        ThreadType t2 = new ThreadType("Thread2");

        t1.start();
        t2.start();
    }
}
