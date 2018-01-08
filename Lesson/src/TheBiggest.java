import java.util.Scanner;


public class TheBiggest {
	public static void main(String[] args){
		double a,b,c,d,e=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any 4 numbers to compare ");
		a=s.nextDouble();
		b=s.nextDouble();
		c=s.nextDouble();
		d=s.nextDouble();
		if (a>=b && a>=c && a>=d){
			e=a;
		}
		else if(b>=a && b>=c && b>=d){
			e=b;
		}
		else if(c>=a && c>=b && c>=d){
			e=c;
		}
		else if(d>=a && d>=b && d>=c){
			e=d;
		}
		System.out.println("The biggest number is "+e);
	}
}
