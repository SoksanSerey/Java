package ReaderWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BifferReaderDemo {

	public static void main(String[] args) {
		char ch[]=new char[300];
		try {
			BufferedReader br=new BufferedReader(new FileReader("B:\\Test\\hehe.txt"));
			int c;
			while((c=br.read())!=-1){
				System.out.print((char)c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
