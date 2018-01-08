import java.util.Scanner;


public class IfElse {
	float mark;
	char grade;
	public static void main(String[] args){
		Scanner san= new Scanner(System.in);
		IfElse g=new IfElse();
		System.out.println("Enter your mark: ");
		
		g.mark=san.nextFloat();
		
		if (g.mark>=90){
			g.grade='S';
		}
		else if (g.mark>80){
			g.grade='A';
		}
		else if (g.mark>70){
			g.grade='B';
		}
		else if (g.mark<70){
			g.grade='F';
		}
		System.out.println(g.grade);
	}
}
