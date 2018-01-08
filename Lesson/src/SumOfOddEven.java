import java.util.Scanner;


public class SumOfOddEven {

	public static void main(String[] args) {
		int num,ch,i,temp=0,j=1;
		System.out.println("Enter your choice\n1. Sum of odd number\n2. Sum of even number");
		ch=new Scanner(System.in).nextInt();
		if(ch==1){
			i=1;
		}else{
			i=2;
		}
		System.out.println("Enter the digit of nature number to sum it: ");
		num=new Scanner(System.in).nextInt();
		while(j<=num){
			temp=temp+i;
			i+=2;
			j++;
		}
		System.out.println(temp);
	}

}
