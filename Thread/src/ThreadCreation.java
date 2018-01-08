
public class ThreadCreation extends Thread{
	@Override
	public void run(){
		System.out.print("Hello ");
		for(int i=0;i<100;i++){
			try{
				Thread.sleep(-1000);
				System.out.print(i+1+" ");
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ThreadCreation t1=new ThreadCreation();
		Thread t2=new Thread(new ThreadCreation());
		ThreadCreation t3=new ThreadCreation();
		
		t1.run();
		t2.run();
		t3.run();
	}

}
