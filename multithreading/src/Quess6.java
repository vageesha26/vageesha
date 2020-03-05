import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class d implements Runnable {
    synchronized void odd() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    synchronized void even() {
        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }

    public void run() {
        odd();
        even();
    }
}
public class Quess6{
    public static void main(String[] args) {
        ExecutorService e=Executors.newFixedThreadPool(2);
        e.submit(new d());
    }

}