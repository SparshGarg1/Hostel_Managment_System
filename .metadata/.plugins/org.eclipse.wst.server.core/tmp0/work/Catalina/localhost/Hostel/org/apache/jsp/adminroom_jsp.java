/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2023-06-18 07:37:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sun.font.CreatedFontTracker;
import com.sun.org.glassfish.gmbal.IncludeSubclass;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public final class adminroom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/component/allcss.jsp", Long.valueOf(1686970239481L));
    _jspx_dependants.put("/component/db.jsp", Long.valueOf(1686999230541L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("com.sun.org.glassfish.gmbal.IncludeSubclass");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.Statement");
    _jspx_imports_classes.add("sun.font.CreatedFontTracker");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("java.sql.DriverManager");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"component/error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("        @import url('https://fonts.googleapis.com/css2?family=Poppins&display=swap');\r\n");
      out.write("        \r\n");
      out.write("        .main{\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-direction: row;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            flex-wrap: wrap;\r\n");
      out.write("        }\r\n");
      out.write("        table {\r\n");
      out.write("            font-family: arial, sans-serif;\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            margin:auto;\r\n");
      out.write("            background:black;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("       .tr1 {\r\n");
      out.write("            border: 1px solid #dddddd;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            padding: 8px;\r\n");
      out.write("        }\r\n");
      out.write("        .show1{\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin: 5vh 2vw;\r\n");
      out.write("            width:60%;\r\n");
      out.write("            background: rgb(15, 15, 15);\r\n");
      out.write("            border-radius: 20px;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 2em;\r\n");
      out.write("        }\r\n");
      out.write("        .contain{\r\n");
      out.write("            margin: 5vh 2vw;\r\n");
      out.write("            width:80%;\r\n");
      out.write("            background: rgb(15, 15, 15);\r\n");
      out.write("            width: 350px;\r\n");
      out.write("         \r\n");
      out.write("            border-radius: 20px;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 2em;\r\n");
      out.write("        }\r\n");
      out.write("        .head{\r\n");
      out.write("            font-size: 2em;\r\n");
      out.write("            margin-bottom: 0.5em;\r\n");
      out.write("        }\r\n");
      out.write("        .bo {\r\n");
      out.write("            margin: 0.2em 0;\r\n");
      out.write("        }\r\n");
      out.write("        .contain .bo p{\r\n");
      out.write("            color: rgba(255, 255, 255, 0.781);\r\n");
      out.write("        }\r\n");
      out.write("        .contain .bo div{\r\n");
      out.write("            position: relative;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            margin: 0.5em 0;\r\n");
      out.write("        }\r\n");
      out.write("        .contain .bo input{\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            background: rgb(255, 255, 255);\r\n");
      out.write("            color: rgb(0, 0, 0);\r\n");
      out.write("            border: none;\r\n");
      out.write("            outline: none;\r\n");
      out.write("            padding-left: 0.8em;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            transition: all .4s\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .contain .bo input:focus::placeholder{\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("        .contain .bo div::before{\r\n");
      out.write("            content: '';\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: 50%;\r\n");
      out.write("            left: 50%;\r\n");
      out.write("            transform: translate(-50%, -50%);\r\n");
      out.write("            width: 102%;\r\n");
      out.write("            height: 105%;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            background: linear-gradient(to right, #ff416c, #ff4b2b);\r\n");
      out.write("        }\r\n");
      out.write("        .loginBtn{\r\n");
      out.write("            width: 102%;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            margin: 0.5em 0;\r\n");
      out.write("            transform: translate(-1%);\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            color: white;\r\n");
      out.write("            background: linear-gradient(to right, #ff416c, #ff4b2b);\r\n");
      out.write("            transition: all .4s;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .loginBtn:hover{\r\n");
      out.write("            transform: translate(-1%, 5%);\r\n");
      out.write("            box-shadow: 0 0 10px #ff416d65;\r\n");
      out.write("        }\r\n");
      out.write("        .text{\r\n");
      out.write("            font-size: 0.8em;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            color: rgba(255, 255, 255, 0.623);\r\n");
      out.write("        }\r\n");
      out.write("        .text a{\r\n");
      out.write("            color: rgba(255, 255, 255, 0.911);\r\n");
      out.write("        }\r\n");
      out.write("        </style>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\" integrity=\"sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>HostelHome</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	HttpSession ses=request.getSession();
	String id=(String) ses.getAttribute("uid");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Navbar -->\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark\" style=\"background-color:#222831;\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\"><i class=\"fas fa-hotel\"></i> Hostel<span style=\"color:red;\">Home</span></a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("      <ul class=\"navbar-nav mb-2 mb-lg-0\">\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"adminportal.jsp\">HOME</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"adminroom.jsp\">ROOM</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"adminstudent.jsp\">STUDENT</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("            Admin\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"AdminLogout\">Logout</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<section class=\"main\">\r\n");
      out.write("    <div class=\"contain\">\r\n");
      out.write("        <p class=\"head\">Room Registration</p>\r\n");
      out.write("        <form action=\"RoomReg\" method=\"post\">\r\n");
      out.write("        <div class=\"bo\">\r\n");
      out.write("            <p>Hostel Name</p>\r\n");
      out.write("            <div>\r\n");
      out.write("                <input type=\"text\" name=\"name\" id=\"\" placeholder=\"Enter Name\" required/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"bo\">\r\n");
      out.write("            <p>Room Number</p>\r\n");
      out.write("            <div>\r\n");
      out.write("                <input type=\"text\" name=\"id\" id=\"\" placeholder=\"Enter Room Number\" required/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <button type=\"submit\"  class=\"loginBtn\">Register Room</button> \r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","sparsh1574");

      out.write("\r\n");
      out.write("    <div class=\"show1\">\r\n");
      out.write("        <p class=\"head\">Room Details</p>\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr class=\"tr1\">\r\n");
      out.write("              <th class=\"tr1\">Room No.</th>\r\n");
      out.write("              <th class=\"tr1\">Hostel Name</th>\r\n");
      out.write("              <th class=\"tr1\">Action</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            ");

             String qr = "select * from room";
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(qr);
             if(rs.next())
             {
            	 do{
            	int id1 = rs.getInt("id");
            	String name = rs.getString("name");
         		
         		
      out.write("\r\n");
      out.write("         		<tr CLASS=\"tr1\">\r\n");
      out.write("                <th class=\"tr1\">");
      out.print(id1 );
      out.write("</th>\r\n");
      out.write("                <th class=\"tr1\">");
      out.print(name );
      out.write("</th>\r\n");
      out.write("                <th class=\"tr1\"><a href=\"RoomDelete?id=");
      out.print(id1 );
      out.write("\" style=\"color: red; text-decoration:none;\"> Delete <i class=\"fa-solid fa-trash-can\"></i></a></th>\r\n");
      out.write("              </tr>\r\n");
      out.write("              ");
 
            	 }while(rs.next());
             }
             else{
            	 out.println("no record found");
             }
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("          </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
