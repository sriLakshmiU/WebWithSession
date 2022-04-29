package servlets;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbconfig.DbManager;

/**
 * Servlet implementation class validationServlet
 */
@WebServlet("/validationServlet")
public class validationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public validationServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		final DbManager dbmanager = new DbManager();
		String query = "insert into user(FirstName,MiddleName,LastName,Gender,Address,City,State,Country,Phone,BankName,AccountNumber,SSN)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement statement;
		try {
			statement = dbmanager.mySqlConnect().prepareStatement(query);
			statement.setString(1, (String) session.getAttribute("ofname"));
			statement.setString(2, (String) session.getAttribute("omname"));
			statement.setString(3, (String) session.getAttribute("olname"));
			statement.setString(4,(String) session.getAttribute("gender"));
			statement.setString(5, (String) session.getAttribute("address"));
			statement.setString(6, (String) session.getAttribute("city"));
			statement.setString(7, (String) session.getAttribute("state"));
			statement.setString(8, (String) session.getAttribute("country"));
			statement.setString(9, (String) session.getAttribute("phone"));
			statement.setString(10, (String) session.getAttribute("bankName"));
			statement.setString(11, (String) session.getAttribute("accountNumber"));
			statement.setString(12, (String) session.getAttribute("ssn"));
			
			int numberOfRecords = statement.executeUpdate();
			System.out.println(numberOfRecords+" records updated");
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		response.setContentType("text/html");
		response.sendRedirect("jsp/success.jsp");
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
