
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


public class DBServlet extends HttpServlet {

    QuizQuestion questions[];
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            int index = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                PrintWriter out = response.getWriter();
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "root");
                if (!connection.isClosed()) {
                    out.println("Connected");
                }
                Statement statement = connection.createStatement();
                ResultSet results = statement.executeQuery("SELECT * FROM questions");
                while(results.next()){
                    questions[index] = new QuizQuestion(results);
                    index++;
                }
                System.out.print(questions);
                out.println(questions);
            }
            catch (Exception e){
                PrintWriter out = response.getWriter();
                System.out.print(e);
                out.println(e);
            }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
