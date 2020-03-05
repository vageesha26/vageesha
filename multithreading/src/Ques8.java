public class Ques8{
    public static void main(String[] args){
        method m=new method();
        method m1=new method();
        method m2=new method();
        m.start();
        try {
            m.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m1.start();
        m2.start();
    }
}

class method extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
