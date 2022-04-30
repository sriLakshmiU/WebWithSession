package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BankPageServlet
 */
@WebServlet("/bankPageServlet")
public class BankPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BankPageServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bankName = request.getParameter("bankName");
		String accountNumber = request.getParameter("accountNumber");
		String ssn = request.getParameter("ssn");
		
		HttpSession  session = request.getSession();
		session.setAttribute("bankName", bankName);
		session.setAttribute("accountNumber", accountNumber);
		session.setAttribute("ssn", ssn);
		
		request.getRequestDispatcher("/InsertServlet").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
