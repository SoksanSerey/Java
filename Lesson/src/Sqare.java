import java.util.Scanner;


public class Sqare {
	static double edge, area;
	public static void main(String[] args){
		Scanner san=new Scanner(System.in);
		Sqare s=new Sqare();
		
		System.out.println("Enter the lengh of sqare: ");
		s.edge=san.nextDouble();
		area=edge*edge;
		System.out.println("The area of the sqare is "+area);
	}
}
