package Welcome;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        String firstname = request.getParameter("firstName");
        String lastname = request.getParameter("lastName");
        String age = request.getParameter("age");
        PrintWriter writer = response.getWriter();

        if (firstname != null)
            writer.print("Cześć " + firstname + " ");
        else
            writer.print("Cześć nieznajomy");

        if (lastname != null)
            writer.print("Wiem że masz na nazwisko " + lastname);
        else
            writer.print("Nie wiem jak masz na nazwisko");

        if (age != null)
            writer.print("Wiem że masz lat " + age);
        else
            writer.print("Nie wiem ile masz lat");

    }
}

