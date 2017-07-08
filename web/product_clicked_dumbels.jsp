<%-- 
    Document   : product_clicked
    Created on : 20 Jul, 2016, 11:41:36 AM
    Author     : Subham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>
<%
    
    String name_dumbel1 = request.getParameter("dumbel1");
    
    if(name_dumbel1.equalsIgnoreCase("dumbel1"))
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='dumbbell1'");
            if(rs.next())
            {
               String pname = rs.getString(2);
               String pcontact = rs.getString(4);
               String pcity = rs.getString(5);
               String pdetails = rs.getString(3);
               
               session.setAttribute("pname", pname.toUpperCase());
               session.setAttribute("pcontact", pcontact);
               session.setAttribute("pcity", pcity);
               session.setAttribute("pdetails", pdetails);
               response.sendRedirect("product_details.jsp");
        
            }
        }
        catch (Exception e) 
        {
            out.println(e.toString());
        }
    }
    
    if(name_dumbel1.equalsIgnoreCase("dumbel2"))
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='dumbbell2'");
            if(rs.next())
            {
                out.print("here");
               String pname = rs.getString(2);
               String pcontact = rs.getString(4);
               String pcity = rs.getString(5);
               String pdetails = rs.getString(3);
               
               session.setAttribute("pname", pname.toUpperCase());
               session.setAttribute("pcontact", pcontact);
               session.setAttribute("pcity", pcity);
               session.setAttribute("pdetails", pdetails);
               response.sendRedirect("product_details.jsp");
               
            }
        }
        catch (Exception e) 
        {
            out.println(e.toString());
        }
        
    }
    
    if(request.getParameter("dumbel1").equalsIgnoreCase("dumbel3"))
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='dumbbell3'");
            if(rs.next())
            {
               String pname = rs.getString(2);
               String pcontact = rs.getString(4);
               String pcity = rs.getString(5);
               String pdetails = rs.getString(3);
               
               session.setAttribute("pname", pname.toUpperCase());
               session.setAttribute("pcontact", pcontact);
               session.setAttribute("pcity", pcity);
               session.setAttribute("pdetails", pdetails);
               response.sendRedirect("product_details.jsp");
                
            }
        }
        catch (Exception e) 
        {
            out.println(e.toString());
        }
        
    }
    if(request.getParameter("dumbel1").equalsIgnoreCase("dumbel4"))
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='dumbbell4'");
            if(rs.next())
            {
               String pname = rs.getString(2);
               String pcontact = rs.getString(4);
               String pcity = rs.getString(5);
               String pdetails = rs.getString(3);
               
               session.setAttribute("pname", pname.toUpperCase());
               session.setAttribute("pcontact", pcontact);
               session.setAttribute("pcity", pcity);
               session.setAttribute("pdetails", pdetails);
               response.sendRedirect("product_details.jsp");
                
            }
        }
        catch (Exception e) 
        {
            out.println(e.toString());
        }
        
    }
    if(request.getParameter("dumbel1").equalsIgnoreCase("dumbel5"))
    {
        out.print("here1");
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='dumbbell5'");
            if(rs.next())
            {
               String pname = rs.getString(2);
               String pcontact = rs.getString(4);
               String pcity = rs.getString(5);
               String pdetails = rs.getString(3);
               
               session.setAttribute("pname", pname.toUpperCase());
               session.setAttribute("pcontact", pcontact);
               session.setAttribute("pcity", pcity);
               session.setAttribute("pdetails", pdetails);
               response.sendRedirect("product_details.jsp");
                
            }
        }
        catch (Exception e) 
        {
            out.println(e.toString());
        }
        
    }
    if(request.getParameter("dumbel1").equalsIgnoreCase("dumbel6"))
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='dumbbell6'");
            if(rs.next())
            {
               String pname = rs.getString(2);
               String pcontact = rs.getString(4);
               String pcity = rs.getString(5);
               String pdetails = rs.getString(3);
               
               session.setAttribute("pname", pname.toUpperCase());
               session.setAttribute("pcontact", pcontact);
               session.setAttribute("pcity", pcity);
               session.setAttribute("pdetails", pdetails);
               response.sendRedirect("product_details.jsp");
                
            }
        }
        catch (Exception e) 
        {
            out.println(e.toString());
        }
        
    }
    else
    {
        out.println("Nhi chal raha!");
    }
    


%>