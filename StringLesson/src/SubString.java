import java.util.Scanner;
public class SubString 
{

	public static void main(String[] args) 
	{
		String name; 
		int pass;
		Scanner san=new Scanner(System.in);
		System.out.println("Enter your full name: ");
		name=san.nextLine();
		System.out.println("Enter your password");
		pass=san.nextInt();
		if(name.equals(new String("Serey Soksan"))&&pass==12345)
		{
			System.out.println("You have login succesfully");
		}
		else
		{
			System.out.println("You are not belong here");
		}
	}
}