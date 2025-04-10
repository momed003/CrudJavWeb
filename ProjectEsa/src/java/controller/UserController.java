package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author yassimin
 */
@WebServlet(name = "UserController", urlPatterns = {"/UserController", "/GetAllUsers"})
public class UserController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        String accao = request.getParameter("accao");
        PrintWriter pw = response.getWriter();
        UserDao user = new UserDao();
        ObjectMapper maper= new ObjectMapper();

        switch (accao) {
            case "getAllUsers":
                pw.print(maper.writeValueAsString(user.getAllUsers()) );
                break;
            default:
                throw new AssertionError();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("user");
        PrintWriter pw = response.getWriter();
        pw.print("nome de utilizador: " + user);
        // processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
