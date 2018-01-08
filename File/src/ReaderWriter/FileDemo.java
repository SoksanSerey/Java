package ReaderWriter;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		File file=new File("B:\\Word\\Mr. Dinesh\\presentation.txt");
		if(file.exists())
		{
			System.out.println("Exist...");
		}
		else
		{
			System.out.println("Press 1 to create a new file");
			int i=new Scanner(System.in).nextInt();
			try
			{
				if(i==1)
				{
					file.createNewFile();
					System.out.println("File created...");
				}
			}catch (IOException ioe)
			{
				System.out.println("Fail to create file");
			}
			
		}

	}

}
