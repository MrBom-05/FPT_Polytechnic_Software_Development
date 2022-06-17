package Demo_Threading;

public class Main {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable(1), r2 = new MyRunnable(2);
        
        Thread t1 = new Thread(r1), t2 = new Thread(r2);
        
        t1.start();
        t2.start();
    }
}
