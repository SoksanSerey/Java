import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDaoImp implements TestDao{
    public Connection getCon()
    {
        Connection connection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest","root","");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public int insert(Test test)
    {
        Connection connection=getCon();
        try
        {
            PreparedStatement ps= connection.prepareStatement("INSERT INTO studentmodel VALUES (?,?,?,?)");
            ps.setString(1,test.getName());
            ps.setInt(2,test.getAge());
            ps.setInt(3,test.getPhone());
            ps.setString(4,test.getEmail());

            ps.execute();
            return 1;
        } catch (SQLException e) {
            return 0;
        }
    }
}
