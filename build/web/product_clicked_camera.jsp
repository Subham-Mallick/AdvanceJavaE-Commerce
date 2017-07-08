<%-- 
    Document   : product_clicked
    Created on : 20 Jul, 2016, 11:41:36 AM
    Author     : Subham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>
<%
    
    String name_camera1 = request.getParameter("camera1");
    
    if(name_camera1.equalsIgnoreCase("camera1"))
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='camera1'");
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
    
    if(name_camera1.equalsIgnoreCase("camera2"))
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='camera2'");
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
    
    if(request.getParameter("camera1").equalsIgnoreCase("camera3"))
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='camera3'");
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
    if(request.getParameter("camera1").equalsIgnoreCase("camera4"))
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='camera4'");
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
    if(request.getParameter("camera1").equalsIgnoreCase("camera5"))
    {
        out.print("here1");
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='camera5'");
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
    if(request.getParameter("camera1").equalsIgnoreCase("camera6"))
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='camera6'");
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