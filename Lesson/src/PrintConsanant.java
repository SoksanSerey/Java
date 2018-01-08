import java.util.Scanner;


public class PrintConsanant {

	public static void main(String[] args) {
		char start;
		//char stop;
		//int i,j;
		System.out.println("Enter the start character ");
		char ch=new Scanner(System.in).next().charAt(0);
		//i=(int)(ch);
		if(ch>='A'&&ch<='Z'){
			do{
				System.out.print(ch+" ");
				ch++;
			}
			while(ch<='Z');
		}
		if(ch>='a'&&ch<='z'){
			do{
				System.out.print(ch+" ");
				ch++;
			}
			while(ch<='z');
		}
	}

}
