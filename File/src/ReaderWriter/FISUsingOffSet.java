package ReaderWriter;

import java.io.FileInputStream;
import java.io.IOException;

public class FISUsingOffSet 
{

	public static void main(String[] args) 
	{
		String str="";
		byte b[]=new byte[500];
		try
		{
			FileInputStream fis=new FileInputStream("B:\\Test\\Hello.txt");
			fis.read(b,5,7);
			fis.read(b,15,21);
			fis.read(b,46,5);
			str=new String(b);
			System.out.println(str);
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}

	}

}