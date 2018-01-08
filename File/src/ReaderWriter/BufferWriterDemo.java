package ReaderWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferWriterDemo {

	public static void main(String[] args) {
		Scanner san=new Scanner(System.in);
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter("B:\\Test\\heyhey.txt"));
			
			System.out.println("Enter a text : ");
			String str=san.nextLine();
			
			//char ch[]=str.toCharArray();
			bw.write(str);
			
			bw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
