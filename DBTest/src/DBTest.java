import java.sql.DriverManager;
import java.sql.SQLException;


public class DBTest
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class Loaded successfully");
			DriverManager.getConnection("localhost:8080/Bike","root","shiro");
			System.out.println("Connection Success");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
