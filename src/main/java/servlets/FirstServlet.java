package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    /*
        req - request - то что пришло в метод
        resp - response - то что отправляем назад
     */

    // http://localhost:8080/myServlet
    // замість цього (замість просто виклику сервлета в браузері) викликаю fistPage.jsp
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        try(PrintWriter out = resp.getWriter()){
            out.println("Registration from \"firstServlet\" (doGet)");
            out.println("<form action=\"firstServlet\" method=\"post\">"); // get / post
            out.println("<input name=\"myName\" type=\"text\" value=\"\">");
            out.println("<input value=\"Submit Button\" type=\"submit\">");
            out.println("</form>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        // парметр - это информация переданная от пользователем
        String name = req.getParameter("name");

        try(PrintWriter out = resp.getWriter()){
            out.println("Answer from doPost:<br>");
            if(!"qwe".equals(name)){
                out.println("No. You should enter \"qwe\".<br>");
                out.println("<a href=\"firstPage.jsp\">Try again</a>");
            } else {
                HttpSession session = req.getSession(); // эта вресия метода (без параметра) - создаст сессию, если ее небыло
                session.setAttribute("name", name);

                // атрибут - это информация, которую мы записываем, чтобы, к примеру, передать ее
                // с сервлета в jsp (что м сдесь и делаем):
                req.setAttribute("name", name);
                // перенаправление на greeting.jsp:
                req.getRequestDispatcher("greeting.jsp").forward(req, resp);

                //resp.sendRedirect("secondServlet");
            }

        }
    }
}
