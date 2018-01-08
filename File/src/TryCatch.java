import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class TryCatch {
	private static FileInputStream fis;

	public static void main(String[] args){
		byte b[]=new byte[200];
		try{
			fis = new FileInputStream("C:\\Users\\SokSanSok\\Desktop\\file.txt");
			System.out.println("Success open the file");
			fis.read(b);
		}
		catch (FileNotFoundException e){
			System.out.println("Exception occurred");
		}
		catch(IOException ioe){
			System.out.println("Not able to read file");
		}
	}
}