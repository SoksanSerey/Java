import java.util.Scanner;


public class SumOfDigit {
	public static void main(String[] args) {
		int num,temp=0,n;
		System.out.println("Enter the number you want to sum of digit: ");
		num=new Scanner(System.in).nextInt();
		while(num!=0){
			n=num%10;
			num=num/10;
			temp=temp+n;
		}
		System.out.println("After reverse we get "+temp);
	}
}
