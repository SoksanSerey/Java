
public class TimeToMinunte implements Runnable {
	@Override
	public void run(){
		for(int i=100;i>1;i--){
			System.out.print(i+" ");
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		TimeToMinunte ttm=new TimeToMinunte();
		Thread t1=new Thread(ttm);
		
		t1.start();
		ClassAbstract cas=new ClassAbstract();
		Thread t2=new Thread();
		t2.start();
	}

}
