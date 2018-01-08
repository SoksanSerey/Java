import java.util.Scanner;


public class Exception {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value a and b");
		a=s.nextInt();
		b=s.nextInt();
		try{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae){
			System.out.println("error "+ae.getMessage());
		}

	}

}
