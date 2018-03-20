import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Next")
public class Next extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String name=request.getParameter("name");
        Integer age=Integer.parseInt(request.getParameter("age"));
        Integer phone=Integer.parseInt(request.getParameter("phone"));
        String email=request.getParameter("email");
        Test test=new Test();
        test.getCon();
        test.setName(name);
        test.setAge(age);
        test.setEmail(email);
        test.setPhone(phone);

        test.insert(test);
    }
}
