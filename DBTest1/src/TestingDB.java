import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class TestingDB {
	static int balance=0;
	public static void main(String[] args)
	{
		String user,pass;
		String account_no="", branch_name="";
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter database user name : ");
		user=s.next().trim();
//		System.out.println("Enter database password : ");
		pass="    ".trim();
		try 
		{
			System.out.println("Enter account number, Branch name and balance : ");
			account_no=s.nextLine();
			branch_name=s.nextLine();
			balance=10000;
			
			

			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", user, pass);
			PreparedStatement ps=con.prepareStatement("insert into account values (?,?,?)");
			
			ps.setString(1, account_no);
			ps.setString(2, branch_name);
			ps.setFloat(3, balance);
			
			ps.execute();
			System.out.println("Data Inserted successfully...");
//			Statement stt=con.createStatement();
//			ResultSet rs=stt.executeQuery("select * from account");
//			
//			while(rs.next())
//			{
//				System.out.println(rs.getString("account_number"));
//			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
