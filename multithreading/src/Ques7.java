public class Ques7 {
     public static void main(String[] args) throws InterruptedException {
         d obj = new d();
         Thread t = new Thread(new Runnable() {
             @Override
             public void run() {
                 try {
                     obj.start1();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         });
         Thread t1 = new Thread(new Runnable() {
             @Override
             public void run() {
                 try {
                     obj.end();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }

         });
         t.start();
         t1.start();
     }

     static class d {
         public void start1() throws InterruptedException {
             synchronized (this) {
                 System.out.println("starting");
                 wait();
                 System.out.println("resumed");
             }
         }

         public void end() throws InterruptedException{
             synchronized (this) {
                 System.out.println("waiting");
                 notify();
             }
         }
     }
 }

