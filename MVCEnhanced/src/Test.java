import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class Test {
    String name,email;
    int age,phone;

    public int getAge() {
        return age;
    }

    public String getName(){
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Connection getCon(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest","root","");
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
            PreparedStatement ps= connection.prepareStatement("INSERT INTO studentmodel VALUES (?,?,?,?);");
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
//    public List<Test> select()
//    {
//        Test test=new Test();
//        Connection connection=getCon();
//        List<test> list=new LinkedList<test>();
//
//        return null;
//    }
}
