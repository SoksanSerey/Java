package ReaderWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FOSDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner san=new Scanner(System.in);
		try
		{
			FileOutputStream fos=new FileOutputStream("B:\\test\\demo.txt");
			System.out.println("Enter your name : ");
			String name=san.nextLine();
			
			byte b[]=name.getBytes();
			fos.write(b);
			System.out.println("Success....");
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
