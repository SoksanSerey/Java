import java.util.Scanner;


public class Example {
	public static void main(String[] args){
		int num;
		System.out.println("Enter num");
		num=new Scanner(System.in).nextInt();
		for(int i=1;i<10;i+=2){
			System.out.print(i+" ");
		}
	}
}
