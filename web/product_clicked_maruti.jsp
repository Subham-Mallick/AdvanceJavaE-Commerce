<%-- 
    Document   : product_clicked
    Created on : 20 Jul, 2016, 11:41:36 AM
    Author     : Subham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>
<%
    
    String name_maruti1 = request.getParameter("maruti1");
    
    if(name_maruti1.equalsIgnoreCase("maruti1"))
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='maruti1'");
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
    
    if(name_maruti1.equalsIgnoreCase("maruti2"))
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='maruti2'");
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
    
    if(request.getParameter("maruti1").equalsIgnoreCase("maruti3"))
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='maruti3'");
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
    if(request.getParameter("maruti1").equalsIgnoreCase("maruti4"))
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='maruti4'");
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
    if(request.getParameter("maruti1").equalsIgnoreCase("maruti5"))
    {
        out.print("here1");
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='maruti5'");
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
    if(request.getParameter("maruti1").equalsIgnoreCase("maruti6"))
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","subham");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pdetails where id='maruti6'");
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