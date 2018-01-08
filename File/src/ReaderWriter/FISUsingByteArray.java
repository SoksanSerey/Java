package ReaderWriter;

import java.io.FileInputStream;
import java.io.IOException;

public class FISUsingByteArray 
{

	public static void main(String[] args) 
	{
		String str="";
		byte b[]=new byte[500];
		try
		{
			FileInputStream fis=new FileInputStream("B:\\Test\\Hello.txt");
			fis.read(b);
			str=new String(b);
			System.out.println(str.trim());
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}

	}

}
