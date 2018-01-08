import java.util.Scanner;


public class NewJava {
	volatile boolean status=true;
	@Override
	public void run(){
		while(status){
			try{
				Thread.sleep(1000);
				System.out.println("Hell");
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	public void stopTheLoop(){
		status=false;
	}
	}
	public static void main(String[] args) {
		 NewJava nj=new NewJava();
		 nj.start();
		 
		 System.out.println("Enter char to stop");
		 new Scanner(System.in).next().charAt(0);
		 nj.stopTheLoop();
	}

}
