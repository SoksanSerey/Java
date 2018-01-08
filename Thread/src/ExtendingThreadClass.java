
public class ExtendingThreadClass extends ThreadCall{
	public void run(){
		System.out.println("Hello from run");
	}
	public static void main(String[] args) {
		ExtendingThreadClass et1=new ExtendingThreadClass();
		ExtendingThreadClass et2=new ExtendingThreadClass();
		ExtendingThreadClass et3=new ExtendingThreadClass();
		
		et1.start();
		et2.start();
		et3.start();
	}
	private void start() {
		System.out.println("I'm here");	
	}
}