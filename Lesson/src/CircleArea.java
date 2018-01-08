import java.util.Scanner;


public class CircleArea {
	static double radius, area;
	public static void main(String[] args){
		Scanner san=new Scanner(System.in);
		CircleArea s=new CircleArea();
		System.out.println("Enter the unit of radius: ");
		s.radius=san.nextDouble();
		
		area=Math.PI*Math.pow(radius, 2);
		System.out.println("The area of the circle is "+area);
	}
}