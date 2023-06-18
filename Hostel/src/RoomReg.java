

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class RoomReg
 */
@WebServlet("/RoomReg")
public class RoomReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String id1 = request.getParameter("id");
		int id = Integer.parseInt(id1);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","sparsh1574");
			String qr1 = "select *  from room where id=? and name=?";
			java.sql.PreparedStatement ps1 = con.prepareStatement(qr1);
			ps1.setInt(1, id);
			ps1.setString(2, name);
			ResultSet rs = ps1.executeQuery();
			if(rs.next())
			{
				RequestDispatcher rd = request.getRequestDispatcher("adminroom.jsp");
				rd.include(request, response);
				out.println("<script>window.alert('Room Number Already Exists');</script>");
			}
			else
			{
				String qr = "insert into room(id,name) values(?,?)";
				java.sql.PreparedStatement ps = con.prepareStatement(qr);
				ps.setInt(1, id);
				ps.setString(2, name);
				int i = ps.executeUpdate();
				if(i>0)
				{
					RequestDispatcher rd = request.getRequestDispatcher("adminroom.jsp");
					rd.include(request, response);
				}
				else
				{
					out.println("room not added");
				}
				
			}
			}
			
		catch(Exception e)
		{
			out.println(e);
		}
	}


}
