<%-- 
    Document   : database
    Created on : 17 Jul, 2016, 6:00:00 PM
    Author     : Subham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import = "java.sql.*" %>

<%  
    String email= request.getParameter("userLoginEmail").toLowerCase();
    String password= request.getParameter("userLoginPassword").toLowerCase();
    
    //String signinemail= request.getParameter("textEmail2").toLowerCase();
    //String signinpassword= request.getParameter("textPassword2").toLowerCase();

    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
        
        Statement stmt;
        stmt = conn.createStatement();
        
        ResultSet rs = stmt.executeQuery("select firstname from userproject where email='"+ email +"' and password='"+ password +"'");
        
        //int c = stmt.("select firstname from userproject where email='"+ email +"', password='"+ password +"'");
        
      
            
	if(rs.next())
        {
            session.setAttribute("cusName",rs.getString(1));
            response.sendRedirect("index2.jsp");
					//check_cmb_topic.addItem(rs.getString(1));
	}
        else
        { 
            session.setAttribute("cusName","Log in");
%>          
        <script>
            window.alert("User does not found");
            window.location="index2.jsp";
        </script>
        
        <%
        }
         } catch (Exception e) {
        out.println(e.toString());
         }
%>
