package calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//
//
//        System.out.println(suma);
//        Double odejmowanie = Double.valueOf(number1) - Double.valueOf(number2);
//        System.out.println(odejmowanie);
//        Double mnozenie = Double.valueOf(number1) * Double.valueOf(number2);
//        System.out.println(mnozenie);
//        Double dzielenie = Double.valueOf(number1) / Double.valueOf(number2);
//        System.out.println(dzielenie);
//
//



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        calculate(request, response);
    }

    private void calculate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String number1 = request.getParameter("number1");
        String number2 = request.getParameter("number2");
        PrintWriter writer = response.getWriter();
        Double suma = Double.valueOf(number1) + Double.valueOf(number2);
        writer.println(number1 + "+" + number2 + "=" + suma);
    }


}
