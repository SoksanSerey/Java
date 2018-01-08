package ReaderWriter;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BOSDemo {

	public static void main(String[] args) {
		String name;
		Scanner san=new Scanner(System.in);
		try {
			FileOutputStream fos=new FileOutputStream("B:\\Test\\hehe.txt");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			System.out.println("Enter name: ");
			name=san.nextLine();
			byte b[]=name.getBytes();
			bos.write(b);
			
			bos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
