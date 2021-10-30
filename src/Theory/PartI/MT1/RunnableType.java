package Theory.PartI.MT1;

public class RunnableType implements Runnable{
    private Thread t;
    private String tName;

    public RunnableType(String name) {
        this.tName = name;
    }

    @Override
    public void run() {
        try {
            for(int i=4;i>0;i--) {
                System.out.println(tName + ": " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println(tName + " has been interrupted :/");
        }
    }

    public void start() {
        if(t==null) {
            t = new Thread(this, tName);
            t.start();
        }
    }

    public static void main(String[] args) {
        RunnableType t1 = new RunnableType("Thread1");
        t1.start();

        RunnableType t2 = new RunnableType("Thread2");
        t2.start();
    }
}
