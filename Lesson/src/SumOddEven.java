import java.util.Scanner;


public class SumOddEven {

	public static void main(String[] args) {
		int num,ch,temp=0;
		System.out.println("Enter a number: ");
		num=new Scanner(System.in).nextInt();
		System.out.println("Enter your choise");
		System.out.println("1. For odd number");
		System.out.println("2. For Even number");
		ch=new Scanner(System.in).nextInt();
		int i=0;
		if(ch==1){
			i=1;
			while(i<=num){
				temp=temp+i;
				i+=2;
			}
		}else{
			i=2;
			while(i<=num){
				temp=temp+i;
				i+=2;
			}
		}
		System.out.println("The sum of number is "+temp);
	}
}
