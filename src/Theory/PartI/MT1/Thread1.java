package Theory.PartI.MT1;

public class Thread1 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1);
        t1.setName("Thread1");
        t1.setPriority(Thread.MAX_PRIORITY-3);
        System.out.println(t1);
    }
}
