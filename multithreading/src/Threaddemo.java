class Runner implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" Hello " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class Threaddemo {

    public static void main(String[] args) {
        Thread t = new Thread(new Runner());
        Thread t1=new Thread(new Runner());
        t.start();
        t1.start();
    }
}

