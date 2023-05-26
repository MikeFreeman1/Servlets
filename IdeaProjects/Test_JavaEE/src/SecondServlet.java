import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by miguelliberta on 25.05.2023.
 */
@WebServlet(name = "test-servlet")
public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    response.sendRedirect("https://www.google.com");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/testJsp.jsp");
        dispatcher.forward(request, response);
    }
}
