import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {
	public void openFile(String path)throws FileNotFoundException{
		FileInputStream fis=new FileInputStream(path);
	}
	public static void main(String[] args) {
		
	}
}
