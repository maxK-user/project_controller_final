package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String name = (String) session.getAttribute("name");
        if("qwe".equals(name)){

            resp.setContentType("text/html");
            try(PrintWriter out = resp.getWriter()){
                out.println("This is Second Servlet<br>");
                out.println("this is SECRET information:<br>");
                out.println("You are amazing ;)<br>");
                out.println("<a href = \"logOutServlet\">Log out</a>");
            }

        } else {
            resp.sendRedirect("firstPage.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
