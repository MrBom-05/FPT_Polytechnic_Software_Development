package Demo_Threading;

public class MyRunnable implements Runnable{
    private int Start;

    public MyRunnable() {
    }

    public MyRunnable(int Start) {
        this.Start = Start;
    }
    
    @Override
    public void run() {
        for (int i = Start; i <= Start + 10; i+=2) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
