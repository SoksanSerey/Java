import java.util.Scanner;


public class WhileEvenOdd {
	public static void main(String[] args){
		int num,ch;
		System.out.println("Enter a number: ");
		num=new Scanner(System.in).nextInt();
		System.out.println("Enter your choise");
		System.out.println("1. For odd number");
		System.out.println("2. For Even number");
		ch=new Scanner(System.in).nextInt();
		int i=0;
		if(ch==1){
			while(i<num){
				System.out.println(i+1);
				i+=2;
			}
		}else{
			while(i<num){
				System.out.println(i+2);
				i+=2;
			}
		}
	}
}
