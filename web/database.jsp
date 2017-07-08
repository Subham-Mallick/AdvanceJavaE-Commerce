<%-- 
    Document   : database
    Created on : 17 Jul, 2016, 6:00:00 PM
    Author     : Subham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import = "java.sql.*" %>

<%  String fname= request.getParameter("textFirstName").toLowerCase();  
    String lname= request.getParameter("textLastName").toLowerCase();
    String email= request.getParameter("textEmail").toLowerCase();
    String password= request.getParameter("textPassword").toLowerCase();
    
    //String signinemail= request.getParameter("textEmail2").toLowerCase();
    //String signinpassword= request.getParameter("textPassword2").toLowerCase();

    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
        
        Statement stmt;
        stmt = conn.createStatement();
        int c = stmt.executeUpdate("insert into userproject values('"+ fname +"','"+ lname +"','"+ email +"','"+ password +"')");
        if(c>0)
        {
            //session.setAttribute("userFirstName",fname);
            //session.setAttribute("userLastName",lname);
            //session.setAttribute("userEmail",email);
            //session.setAttribute("userPassword",password);
            
            //session.setAttribute("usersigninEmail",signinemail);
            //session.setAttribute("usersigninPassword",signinpassword);
            
            response.sendRedirect("index2.jsp");
        }
        else
        {
            out.println("failed");
        }
         } catch (Exception e) {
        out.println(e.toString());
         }
%>
