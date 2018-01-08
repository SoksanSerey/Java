package ReaderWriter;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		char ch='A';
		String str="B:\\Word\\Test";
		for(int i=0;i<26;i++)
		{
			str+=ch;
			str+="\\";
			ch++;
		}
		File folder=new File(str);
		if(folder.exists())
		{
			System.out.println("Exist...");
		}else
		{
			folder.mkdirs();
			System.out.println("File Created");
		}
	}

}
