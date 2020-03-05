public class Ques4 {
    void show(int n){
        synchronized (this){
            for(int i=1;i<n;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(100);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Ques4 q=new Ques4();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                q.show(5);
            }
        };
        new Thread(r).start();
        new Thread(r).start();
    }
}
