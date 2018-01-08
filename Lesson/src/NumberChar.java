import java.util.Scanner;


public class NumberChar {

	public static void main(String[] args) {
		char san;
		int i,j;
		System.out.println("Enter the character ");
		char ch=new Scanner(System.in).next().charAt(0);
		if(ch>='A'&&ch<='Z'){
			i=(ch-'A');
			j=('Z'-ch);
			System.out.println("The letter before "+ch+" have "+i);
			System.out.println("The letter after "+ch+" have "+j);
		}
		if(ch>='a'&&ch<='z'){
			i=(ch-'a');
			j=('z'-ch);
			System.out.println("The letter before "+ch+" have "+i);
			System.out.println("The letter after "+ch+" have "+j);
		}

	}

}
