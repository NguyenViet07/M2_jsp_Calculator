import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

@WebServlet(name = "Calculator_Servlet", urlPatterns = "/calculator")
public class Calculator_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float num1 = Float.parseFloat(request.getParameter("num1"));
        float num2 = Float.parseFloat(request.getParameter("num2"));
        char operator = request.getParameter("Operator").charAt(0);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h3> Result: </h3>");
        try {
            float result = Calculator.calculate(num1, num2, operator);
            writer.println(num1 + "" + operator + "" + num2 + "= " + result);
        } catch (Exception ex) {
            writer.println("Error: " + ex.getMessage());
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}