import java.sql.Connection;
import java.util.List;

public interface TestDao {

    public Connection getCon();
    public int insert(Test test);
    //public List<Test> select();
}
