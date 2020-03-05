public class Threaddemo1 {
    public static void main(String[] args) {
        demo d = new demo();
        d.start();
        demo d2= new demo();
        d2.start();
    }


    }

    class demo extends Thread{
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

