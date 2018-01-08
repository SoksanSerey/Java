import java.util.Scanner;
public class CotrolStucure {
	int age=0;
	
	public static void main(String[] args){
		CotrolStucure san=new CotrolStucure();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age: ");
		san.age=s.nextInt();
		if(san.age>=18){
			System.out.println("You can vote");
		}
		else{
			System.out.println("wait for next year");
		}
	}
}
