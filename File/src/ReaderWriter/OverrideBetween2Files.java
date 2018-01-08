package ReaderWriter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class OverrideBetween2Files {

	public static void main(String[] args) {
		byte b[]=new byte[200];
		try{
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("B:\\Test\\hehe.txt"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("B:\\Test\\demo.txt"));
		
		bis.read(b);
		bos.write(b);
		
		bis.close();
		bos.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
