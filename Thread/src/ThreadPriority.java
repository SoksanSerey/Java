
public class ThreadPriority {

	public static void main(String[] args) {
		Thread t1= new Thread(new Runnable(){
			@Override
			public void run(){
				System.out.println("Hello from "+Thread.currentThread());
			}
		});
		t1.setName("Soksan");
		Thread t2= new Thread(new Runnable(){
			@Override
			public void run(){
				System.out.println("Hello from "+Thread.currentThread());
			}
		});
		t2.setName("Ching");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		try{
			t1.sleep(1000);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		t2.start();
		try{
			t2.sleep(1000);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		t2.stop();
		t1.stop();
	}
}