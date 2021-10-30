package Theory.PartI.MT1;

class myThread2 {
    int u_p=20, t_p=1;

    public synchronized boolean treat(String dno) {
        if(t_p <= u_p) {
            System.out.println("Doctor " + dno + " treated patient no. " + t_p);
            t_p++;
            return true;
        }
        return false;
    }
}

class MTmanager implements Runnable{
    String dno;
    Thread t;
    myThread2 target;
    int Treated = 0;

    public MTmanager(myThread2 targ, String dno) {
        this.dno = dno;
        this.target = targ;

        t = new Thread(this, dno);
        t.start();
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            boolean ret = target.treat(dno);
            if(ret){
                try{
                    Treated++;
                    Thread.sleep(300);
                }catch (InterruptedException e) {e.printStackTrace();}
            }
        }
    }
}

public class MTDoctor {
    public static void main(String[] args) throws Exception{
        myThread2 target = new myThread2();
        MTmanager t1 = new MTmanager(target, "d1");
        MTmanager t2 = new MTmanager(target, "d2");
        MTmanager t3 = new MTmanager(target, "d3");

        t1.t.join();
        t2.t.join();
        t3.t.join();
    }
}
