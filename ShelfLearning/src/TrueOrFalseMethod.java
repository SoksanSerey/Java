import java.util.Scanner;


public class TrueOrFalseMethod {

	private static Scanner san;

	public static void main(String[] args) {
		int a;
		String name;
		san = new Scanner(System.in);
		System.out.println("Enter your name:");
		name=san.nextLine();
		System.out.println("Enter your age: ");
		a=san.nextInt();
		System.out.println("Name: "+name+"\nYou are "+a+" years old");
		System.out.println(a>50 ? "You are old" : "You are young");
	}

}
