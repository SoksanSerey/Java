import java.util.Scanner;


public class ElectricityBill {
	static int unit, price;
	public static void main(String[] args){
		Scanner san=new Scanner(System.in);
		ElectricityBill s=new ElectricityBill();
		
		System.out.println("Enter unit that you use this month: ");
		s.unit=san.nextInt();
		if (unit<=100){
			price=unit*1200;
		}
		else if(unit>100 && unit<=200){
			price=unit*1500;
		}
		else if(unit>200){
			price=unit*2000;
		}
		System.out.println("Your must pay "+price+" tis month");
	}
}
