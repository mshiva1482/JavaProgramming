package Theory.PartF;

class callme
{
    public void call(String msg)
    {
        System.out.println(msg); // [Hello][Welcome][To VIT]
        try
        {
            Thread.sleep(1000);
        } catch(InterruptedException e){ }
    }
}

class caller implements Runnable
{
    String msg;
    callme target;
    Thread t;
    public caller(callme targ, String s)
    {
        target =targ;
        msg=s;
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
//synchronized (target)
        {
            target.call(msg);
        }
    }
}
public class ThreadPractice3 {

    public static void main(String[] args) {
        callme target=new callme();
        caller ob1=new caller(target,"20BPS1028");
        caller ob2=new caller(target,"CSE1007");
        caller ob3=new caller(target,"Shiva Gurunath");
        try
        {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch(InterruptedException e){ }
    }
}
