import java.util.Scanner;


public class Reverse {

	public static void main(String[] args) {
		int num,temp=0,n;
		System.out.println("Enter the number you want to reverse: ");
		num=new Scanner(System.in).nextInt();
		while(num!=0){
			n=num%10;
			num=num/10;
			temp=temp*10+n;
		}
		System.out.println("After reverse we get "+temp);
	}

}
