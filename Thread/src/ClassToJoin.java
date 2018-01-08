
public class ClassToJoin {

	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable()
		{
			@Override
			public void run(){
				System.out.println("Shall I move on?");
				for(int i=0;i<10;i++){
					try{
						Thread.sleep(1000);
						System.out.println("Yes.");
					}catch(InterruptedException ie ){
						
					}
				}
			}
		});
		Thread t2=new Thread(new Runnable(){
			@Override
			public void run(){
				System.out.println("It is nth but...");
				for (int i=0;i<10;i++){
					try{
						Thread.sleep(1000);
						System.out.println("very complex");
					}catch(InterruptedException ie){
						ie.printStackTrace();
					}
				}
			}
		});
		t1.start();
		try{
			t1.join();
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println("After first Thread");
		t2.start();
		try{
			t2.join();
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println("After second Thread");
	}
}
