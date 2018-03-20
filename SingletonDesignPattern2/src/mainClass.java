//Thread thief singleton pattern
public class mainClass {
    public static void main(String[] args)
    {
//        SingleTonClass sc=SingleTonClass.getInstance();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                mainClass singleTonClass=SingleTonClass.getInstance();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                mainClass singleTonClass1=SingleTonClass.getInstance();
            }
        });
        thread.start();
        thread2.start();
    }
}
