package Theory.PartI.MT1;

class myThread {
    public synchronized void threadCall(String msg) {
        System.out.print("[" + msg);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e) { }
        System.out.println("]");
    }
}

class mtx implements Runnable {
    String msg;
    Thread t;
    myThread target;

    public mtx(myThread targ, String s) {
        this.msg = s;
        this.target = targ;

        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.threadCall(msg);
    }
}

public class MultiThreadingWSync {
    public static void main(String[] args) throws Exception{
        myThread target = new myThread();

        mtx t1 = new mtx(target, "Hello");
        mtx t2 = new mtx(target, "Welcome");
        mtx t3 = new mtx(target, "To VIT");

        t1.t.join();
        t2.t.join();
        t3.t.join();
    }
}

