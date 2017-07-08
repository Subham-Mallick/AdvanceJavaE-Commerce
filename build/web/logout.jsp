<%-- 
    Document   : logout
    Created on : 20 Jul, 2016, 10:12:20 AM
    Author     : Subham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
    if(request.getSession(false)!=null)
    {
        session.invalidate();
        response.sendRedirect("login2.jsp");
    }
    else
    {
      
    }
    %>