import cart.Cart;

import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by miguelliberta on 25.05.2023.
 */
public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();
        String user = (String)session.getAttribute("current_user");
        if (user == null){
            // response for anonymous user
            // authorisation
            // registration
            // session.setAttribute("current-user", ID);
        } else {
            // response for authorized user

        }







        /*Cart cart = (Cart)session.getAttribute("cart");
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        if (cart == null){
            cart = new Cart();
        cart.setName(name);
        cart.setQuantity(quantity);
        }
        session.setAttribute("cart",cart);*/





/*        Integer count = (Integer)session.getAttribute("cart");
        if (count==null)
            session.setAttribute("count", 1);
        else
            session.setAttribute("count", count + 1);*/

//       String name = request.getParameter("name");
//       String surname = request.getParameter("surname");
  //        PrintWriter pw = response.getWriter();
//        pw.println("<html>");
//        pw.println("<h1> Your count is: " + count + " </h1>");
  //      pw.println("<h1> Your count is: " +  + " </h1>");
//        pw.println("<h1>Hello, " + name + " " + surname +"</h1>");
  //    pw.println("</html>");

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);
    }
}
