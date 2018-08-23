package formularz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/formularz")
public class FormularzServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        login(request, response);
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String admin = request.getParameter("admin");
        String password = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        if(admin != null && password.equals("admin")) {
            writer.print("Zalogowano pomyslnie");
        }else{
            writer.print("logowanie nie powiodło się");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
