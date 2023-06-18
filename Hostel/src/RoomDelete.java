

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RoomDelete")
public class RoomDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","sparsh1574");
			String qr = "delete from room where id=?";
			PreparedStatement ps = con.prepareStatement(qr);
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if(i>0)
			{
				RequestDispatcher rd = request.getRequestDispatcher("adminroom.jsp");
				rd.include(request, response);
				out.println("<script>window.alert('Room Detail Deleted from Records Succesfully')</script>");
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("adminroom.jsp");
				rd.include(request, response);
				out.println("<script>window.alert('unable to delete room detail from record')</script>");
			}
		} catch (Exception e) {
			// TODO: handle exception
			out.println(e);
		}
	}

}
