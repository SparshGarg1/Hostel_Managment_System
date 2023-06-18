<%@page import="java.sql.ResultSet"%>
<%@page errorPage="component/error.jsp" %>
<%@ include file="component/db.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HostelHome</title>
<%@ include file="component/allcss.jsp" %>
<style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins&display=swap');
        .main{
            display: flex;
            align-items: center;
            justify-content:space-between;
            flex-wrap: wrap;
        }
        .image img{
            margin: 5vh 30vh;
            border-radius: 15px;
            filter: brightness(80%);
        }
        .contain{
            margin: 5vh 30vh;
            background: rgb(15, 15, 15);
            width: 350px;
            border-radius: 20px;
            display: flex;
            justify-content: center;
            flex-direction: column;
            color: white;
            padding: 2em;
            
        }
        .head{
            font-size: 2em;
            margin-bottom: 0.5em;
            text-align: center;
        }
        .bo {
            margin: 0.2em 0;
        }
        .contain .bo p{
            color: rgba(255, 255, 255, 0.781);
        }
        .contain .bo div{
            position: relative;
            width: 100%;
            height: 40px;
            margin: 0.5em 0;
        }
        .contain .bo input{
            position: absolute;
            width: 100%;
            height: 100%;
            background: rgb(255, 255, 255);
            color: rgb(0, 0, 0);
            border: none;
            outline: none;
            padding-left: 0.8em;
            border-radius: 10px;
            transition: all .4s
        }
        
        .contain .bo input:focus::placeholder{
            color: white;
        }
        .contain .bo div::before{
            content: '';
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            width: 102%;
            height: 105%;
            border-radius: 10px;
            background: linear-gradient(to right, #ff416c, #ff4b2b);
        }
       
        select{
            position: relative;
            width: 100%;
            height: 40px;
            margin: 0.5em 0;
            border-radius: 10px;
            /* background: linear-gradient(to right, #ff416c, #ff4b2b); */
        }
        .loginBtn{
            width: 102%;
            height: 40px;
            border: none;
            border-radius: 10px;
            margin: 0.5em 0;
            transform: translate(-1%);
            cursor: pointer;
            color: white;
            background: linear-gradient(to right, #ff416c, #ff4b2b);
            transition: all .4s;
        }
        
        .loginBtn:hover{
            transform: translate(-1%, 5%);
            box-shadow: 0 0 10px #ff416d65;
        }
        .text{
            font-size: 0.8em;
            margin-top: 0.5em;
            text-align: center;
            color: rgba(255, 255, 255, 0.623);
        }
        .text a{
            color: rgba(255, 255, 255, 0.911);
        }
        </style>
</head>
<body>
<!-- Fetching Detail os User -->
<%
	HttpSession ses = request.getSession();
	String email = (String) ses.getAttribute("email");
	String qrp = "select * from student where email=?";
	PreparedStatement ps = con.prepareStatement(qrp);
	ps.setString(1, email);
	String name="";
	int id =0;
	String gender="";
	int age=0;
	int room=0;
	String hostel_name="";
	ResultSet rsp = ps.executeQuery();
	if(rsp.next())
	{
	name = rsp.getString("name");
	id = rsp.getInt("student_id");
	gender = rsp.getString("gender");
	age = rsp.getInt("age");
	room = rsp.getInt("room_no");
	hostel_name = rsp.getString("hostel_name");
	}
%>

<!-- for hostel name -->
<%
String qrs = "select * from room where id=?";
		PreparedStatement pss = con.prepareStatement(qrs);
		pss.setInt(1, room);
		ResultSet rss = pss.executeQuery();
		if(rss.next())
		{
			hostel_name = rss.getString("name");
		}
%>
<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark" style="background-color:#222831;">
  <div class="container-fluid">
<a class="navbar-brand" href="index.jsp"><i class="fas fa-hotel"></i> Hostel<span style="color:red;">Home</span></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav  mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="studentportal.jsp">HOME</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="studentbookroom.jsp">BOOK ROOM</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="studentviewappoinment.jsp">VIEW PROFILE</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
           <%=name %>
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
          	<li><a class="dropdown-item" href="userchangepassword.jsp?email=<%= email %>">Change Password</a></li>
            <li><a class="dropdown-item" href="UserLogout">Logout</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>

<div class="main">
    
    <div class="contain">
        <p class="head">View Profile</p>
        <form>
        <div class="bo">
            <p>Full Name</p>
            <div>
                <input value=<%=name%> readonly>
            </div>
        </div>
        <div class="bo">
            <p>Student ID</p>
            <div>
                <input value=<%=id%> readonly>
            </div>
        </div>
        <div class="bo">
            <p>Gender</p>
            <div>
                <input value=<%=gender%> readonly>
            </div>
        </div>
       <div class="bo">
            <p>Age</p>
            <div>
                <input value=<%=age%> readonly>
            </div>
        </div>
        <div class="bo">
            <p>Room No.</p>
            <div>
                <input value=<%=room%> readonly>
            </div>
        </div>
     <div class="bo">
            <p>Hostel Alloted</p>
            <div>
                <input value=<%=hostel_name%> readonly>
            </div>
        </div>
        </form>
    </div>
</div>

</body>
</html>