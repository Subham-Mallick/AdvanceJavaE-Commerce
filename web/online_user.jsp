<%-- 
    Document   : online_user
    Created on : 19 Jul, 2016, 12:16:11 PM
    Author     : Subham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String userOnline = " Login";
    if(session.getAttribute("cusName")!=null)
    {
        userOnline = session.getAttribute("cusName").toString();
    }
    else
    {
        userOnline = " Login";
    }
    /*if(session.getAttribute("cusName").toString()==" Login")
    {
        userOnline = session.getAttribute("cusName").toString();
    }*/
    
    
%>