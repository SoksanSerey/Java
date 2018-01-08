import java.util.Scanner;


public class Rectangle {
	static double lenght, widge,area;
	public static void main(String[] args) {
		Scanner san=new Scanner(System.in);
		Rectangle s=new Rectangle();
		System.out.println("Enter the lenght of rectangle: ");
		s.lenght=san.nextDouble();
		System.out.println("Enter the widge of rectangle: ");
		s.widge=san.nextDouble();
		
		area=lenght*widge;
		if(area>=0){
			System.out.println("The area of rectangle is "+area);
		}else{
			System.out.println("Somethng error(the length must be positive)");
		}
	}

}
