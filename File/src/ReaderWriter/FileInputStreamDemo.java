package ReaderWriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo 
{

	public static void main(String[] args) 
	{
		try
		{
			int ch=-1;
			FileInputStream fis=new FileInputStream("B:\\Test\\Hello.txt");
			while((ch=fis.read())!=-1)
			{
				System.out.println((char)ch+" : "+ch);
				//ch++;
			}
		}
		catch(FileNotFoundException fne)
		{
			fne.printStackTrace();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}

	}

}
