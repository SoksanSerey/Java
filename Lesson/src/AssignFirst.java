import java.util.Scanner;


public class AssignFirst {
	static String name;
	static int roll;
	static double mark1, mark2, mark3, total, avr;
	static char grade;
	public static void main(String[] args){
		AssignFirst m=new AssignFirst();
		Scanner san=new Scanner(System.in);
		System.out.println("Enter your name: ");
		m.name=san.nextLine();
		System.out.println("Enter you roll number: ");
		m.roll=san.nextInt();
		System.out.println("Enter your mark of Java: ");
		m.mark1=san.nextFloat();
		System.out.println("Enter your mark of DBMS: ");
		m.mark2=san.nextFloat();
		System.out.println("Enter your mark of network: ");
		m.mark3=san.nextFloat();
		total=mark1+mark2+mark3;
		avr=total/3;
		if (avr>=90){
			grade='A';
		}
		else if (avr>=80){
			grade='B';
		}
		else if (avr>=70){
			grade='C';
		}
		else if (avr>=60){
			grade='D';
		}
		else if (avr<60){
			grade='F';
		}
		
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+roll);
		System.out.println("Mark of Java: "+mark1);
		System.out.println("Mark of DBMS: "+mark2);
		System.out.println("Mark of Network: "+mark3);
		System.out.println("Total mark: "+total);
		System.out.println("Average: "+avr);
		System.out.println("Grade: "+grade);
		System.out.println("Testing from D:");
		System.out.println("this is testing");
	}
}
