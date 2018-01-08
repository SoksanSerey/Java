
public class ImplementClass implements Runnable {
	@Override
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Hello from implement class ");
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ImplementClass ipc=new ImplementClass();
		Thread t1=new Thread(ipc);
		t1.start();
		
	}

}