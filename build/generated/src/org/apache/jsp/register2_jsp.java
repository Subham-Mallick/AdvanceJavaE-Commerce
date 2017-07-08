package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("﻿\n");
      out.write("﻿<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("  \n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>JSP Project</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write(" <link id=\"callCss\" rel=\"stylesheet\" href=\"themes/bootshop/bootstrap.min.css\" media=\"screen\"/>\n");
      out.write("    <link href=\"themes/css/base.css\" rel=\"stylesheet\" media=\"screen\"/>\n");
      out.write("<!-- Bootstrap style responsive -->\t\n");
      out.write("\t<link href=\"themes/css/bootstrap-responsive.min.css\" rel=\"stylesheet\"/>\n");
      out.write("\t<link href=\"themes/css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<!-- Google-code-prettify -->\t\n");
      out.write("\t<link href=\"themes/js/google-code-prettify/prettify.css\" rel=\"stylesheet\"/>\n");
      out.write("<!-- fav and touch icons -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"themes/images/ico/favicon.ico\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"themes/images/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"themes/images/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"themes/images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"themes/images/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("\t<style type=\"text/css\" id=\"enject\"></style>\n");
      out.write("  </head>\n");
      out.write("<body>\n");
      out.write("<div id=\"header\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<div id=\"welcomeLine\" class=\"row\">\n");
      out.write("\t<div class=\"span6\">Welcome!<strong> User</strong></div>\n");
      out.write("\t<div class=\"span6\">\n");
      out.write("\t \n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- Navbar ================================================== -->\n");
      out.write("<div id=\"logoArea\" class=\"navbar\">\n");
      out.write("<a id=\"smallScreen\" data-target=\"#topMenu\" data-toggle=\"collapse\" class=\"btn btn-navbar\">\n");
      out.write("\t<span class=\"icon-bar\"></span>\n");
      out.write("\t<span class=\"icon-bar\"></span>\n");
      out.write("\t<span class=\"icon-bar\"></span>\n");
      out.write("</a>\n");
      out.write("  <div class=\"navbar-inner\">\n");
      out.write("    <a class=\"brand\" href=\"index.html\"><img src=\"themes/images/logo.png\" alt=\"Bootsshop\"/></a>\n");
      out.write("\t\t \n");
      out.write("    <ul id=\"topMenu\" class=\"nav pull-right\">\n");
      out.write("\t <li class=\"\"><a href=\"special_offer.html\">Products</a></li>\n");
      out.write("     <li class=\"\"><a href=\"register.html\">Sign Up</a></li>\n");
      out.write("\t <li class=\"\"><a href=\"contact2.jsp\">Details</a></li>\n");
      out.write("\t <li class=\"\"><a href=\"login2.jsp\">Log in</a></li>\n");
      out.write("\t <!--<a href=\"login2.jsp\" role=\"button\" data-toggle=\"modal\" style=\"padding-right:0\"><span class=\"btn btn-large btn-success\">Log in</span></a>\n");
      out.write("         <!--<div id=\"login\" class=\"modal hide fade in\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"login\" aria-hidden=\"false\" >\n");
      out.write("\t\t  <div class=\"modal-header\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">x</button>\n");
      out.write("\t\t\t<h3>Login Block</h3>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t  <div class=\"modal-body\">\n");
      out.write("\t\t\t<form class=\"form-horizontal loginFrm\">\n");
      out.write("\t\t\t  <div class=\"control-group\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"inputEmail\" placeholder=\"Email\">\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div class=\"control-group\">\n");
      out.write("\t\t\t\t<input type=\"password\" id=\"inputPassword\" placeholder=\"Password\">\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div class=\"control-group\">\n");
      out.write("\t\t\t\t<label class=\"checkbox\">\n");
      out.write("\t\t\t\t<input type=\"checkbox\"> Remember me\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t</form>\t\t\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-success\">Sign in</button>\n");
      out.write("\t\t\t<button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">Close</button>\n");
      out.write("\t\t  </div>\n");
      out.write("\t</div>-->\n");
      out.write("\t</li>-->\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- Header End====================================================================== -->\n");
      out.write("<div id=\"mainBody\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("<!-- Sidebar ================================================== -->\n");
      out.write("\t<div id=\"sidebar\" class=\"span3\">\n");
      out.write("\t\t\n");
      out.write("\t\t<ul id=\"sideManu\" class=\"nav nav-tabs nav-stacked\">\n");
      out.write("\t\t\t<li class=\"subMenu open\"><a>Electronics</a>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a class=\"active\" href=\"products.html\"><i class=\"icon-chevron-right\"></i>Cameras</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Computers, Tablets & laptop</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"subMenu\"><a>Cars</a>\n");
      out.write("\t\t\t<ul style=\"display:none\">\n");
      out.write("\t\t\t\t<li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Maruti</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Honda</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"subMenu\"><a>Furnitures</a>\n");
      out.write("\t\t\t\t<ul style=\"display:none\">\n");
      out.write("\t\t\t\t<li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Sofa</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Chair</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("            <li class=\"subMenu\"><a>Sports and Gym</a>\n");
      out.write("\t\t\t\t<ul style=\"display:none\">\n");
      out.write("\t\t\t\t<li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Bat</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Dumbells</a></li>\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("<br/>\n");
      out.write("\t\t   \n");
      out.write("\t</div>\n");
      out.write("<!-- Sidebar end=============================================== -->\n");
      out.write("\t<div class=\"span9\">\n");
      out.write("    <ul class=\"breadcrumb\">\n");
      out.write("\t\t<li><a href=\"index.html\">Home</a> <span class=\"divider\">/</span></li>\n");
      out.write("\t\t<li class=\"active\">Registration</li>\n");
      out.write("    </ul>\n");
      out.write("\t<h3> Registration</h3>\t\n");
      out.write("\t<div class=\"well\">\n");
      out.write("\t<!--\n");
      out.write("\t<div class=\"alert alert-info fade in\">\n");
      out.write("\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">×</button>\n");
      out.write("\t\t<strong>Lorem Ipsum is simply dummy</strong> text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s\n");
      out.write("\t </div>\n");
      out.write("\t<div class=\"alert fade in\">\n");
      out.write("\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">×</button>\n");
      out.write("\t\t<strong>Lorem Ipsum is simply dummy</strong> text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s\n");
      out.write("\t </div>\n");
      out.write("\t <div class=\"alert alert-block alert-error fade in\">\n");
      out.write("\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">×</button>\n");
      out.write("\t\t<strong>Lorem Ipsum is simply</strong> dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s\n");
      out.write("\t </div> -->\n");
      out.write("\t<form class=\"form-horizontal\"  method=\"get\" action=\"database.jsp\">\n");
      out.write("\t\t<h4>Your personal information</h4>\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t<label class=\"control-label\">Title <sup>*</sup></label>\n");
      out.write("\t\t<div class=\"controls\">\n");
      out.write("\t\t<select class=\"span1\" name=\"days\">\n");
      out.write("\t\t\t<option value=\"\">-</option>\n");
      out.write("\t\t\t<option value=\"1\">Mr.</option>\n");
      out.write("\t\t\t<option value=\"2\">Mrs</option>\n");
      out.write("\t\t\t<option value=\"3\">Miss</option>\n");
      out.write("\t\t</select>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t<label class=\"control-label\" for=\"inputFname1\">First name <sup>*</sup></label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t  <input type=\"text\" name=\"textFirstName\" id=\"textFirstName\" placeholder=\"First Name\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t <div class=\"control-group\">\n");
      out.write("\t\t\t<label class=\"control-label\" for=\"inputLnam\">Last name <sup>*</sup></label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t  <input type=\"text\" name=\"textLastName\" id=\"textLastName\" placeholder=\"Last Name\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t<label class=\"control-label\" for=\"input_email\">Email <sup>*</sup></label>\n");
      out.write("\t\t<div class=\"controls\">\n");
      out.write("\t\t  <input type=\"email\" name=\"textEmail\" id=\"textEmail\" placeholder=\"Email\">\n");
      out.write("\t\t</div>\n");
      out.write("\t  </div>\t  \n");
      out.write("\t<div class=\"control-group\">\n");
      out.write("\t\t<label class=\"control-label\" for=\"inputPassword1\">Password <sup>*</sup></label>\n");
      out.write("\t\t<div class=\"controls\">\n");
      out.write("\t\t  <input type=\"password\" name=\"textPassword\" id=\"textPassword\" placeholder=\"Password\">\n");
      out.write("\t\t</div>\n");
      out.write("\t  </div>\t  \n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t<label class=\"control-label\">Date of Birth <sup>*</sup></label>\n");
      out.write("\t\t<div class=\"controls\">\n");
      out.write("\t\t  <select class=\"span1\" name=\"days\">\n");
      out.write("\t\t\t\t<option value=\"\">-</option>\n");
      out.write("\t\t\t\t\t<option value=\"1\">1&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"2\">2&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"3\">3&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"4\">4&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"5\">5&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"6\">6&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"7\">7&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t</select>\n");
      out.write("\t\t\t<select class=\"span1\" name=\"days\">\n");
      out.write("\t\t\t\t<option value=\"\">-</option>\n");
      out.write("\t\t\t\t\t<option value=\"1\">1&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"2\">2&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"3\">3&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"4\">4&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"5\">5&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"6\">6&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"7\">7&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t</select>\n");
      out.write("\t\t\t<select class=\"span1\" name=\"days\">\n");
      out.write("\t\t\t\t<option value=\"\">-</option>\n");
      out.write("\t\t\t\t\t<option value=\"1\">1&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"2\">2&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"3\">3&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"4\">4&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"5\">5&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"6\">6&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t\t\t<option value=\"7\">7&nbsp;&nbsp;</option>\n");
      out.write("\t\t\t</select>\n");
      out.write("\t\t</div>\n");
      out.write("\t  </div>\n");
      out.write("\n");
      out.write("\t<!--<div class=\"alert alert-block alert-error fade in\">\n");
      out.write("\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">×</button>\n");
      out.write("\t\t<strong>Lorem Ipsum is simply</strong> dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s\n");
      out.write("\t </div>-->\t\n");
      out.write("\n");
      out.write("\t\t<h4>Your address</h4>\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t<label class=\"control-label\" for=\"inputFname\">First name <sup>*</sup></label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t  <input type=\"text\" id=\"inputFname\" placeholder=\"First Name\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t<label class=\"control-label\" for=\"inputLname\">Last name <sup>*</sup></label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t  <input type=\"text\" id=\"inputLname\" placeholder=\"Last Name\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t<label class=\"control-label\" for=\"company\">Company</label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t  <input type=\"text\" id=\"company\" placeholder=\"company\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t<label class=\"control-label\" for=\"address\">Address<sup>*</sup></label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t  <input type=\"text\" id=\"address\" placeholder=\"Adress\"/> <span>Street address, P.O. box, company name, c/o</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t<label class=\"control-label\" for=\"address2\">Address (Line 2)<sup>*</sup></label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t  <input type=\"text\" id=\"address2\" placeholder=\"Adress line 2\"/> <span>Apartment, suite, unit, building, floor, etc.</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t<label class=\"control-label\" for=\"city\">City<sup>*</sup></label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t  <input type=\"text\" id=\"city\" placeholder=\"city\"/> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t<label class=\"control-label\" for=\"state\">State<sup>*</sup></label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t  <select id=\"state\" >\n");
      out.write("\t\t\t\t<option value=\"\">-</option>\n");
      out.write("\t\t\t\t<option value=\"1\">Alabama</option><option value=\"2\">Alaska</option><option value=\"3\">Arizona</option><option value=\"4\">Arkansas</option><option value=\"5\">California</option><option value=\"6\">Colorado</option><option value=\"7\">Connecticut</option><option value=\"8\">Delaware</option><option value=\"53\">District of Columbia</option><option value=\"9\">Florida</option><option value=\"10\">Georgia</option><option value=\"11\">Hawaii</option><option value=\"12\">Idaho</option><option value=\"13\">Illinois</option><option value=\"14\">Indiana</option><option value=\"15\">Iowa</option><option value=\"16\">Kansas</option><option value=\"17\">Kentucky</option><option value=\"18\">Louisiana</option><option value=\"19\">Maine</option><option value=\"20\">Maryland</option><option value=\"21\">Massachusetts</option><option value=\"22\">Michigan</option><option value=\"23\">Minnesota</option><option value=\"24\">Mississippi</option><option value=\"25\">Missouri</option><option value=\"26\">Montana</option><option value=\"27\">Nebraska</option><option value=\"28\">Nevada</option><option value=\"29\">New Hampshire</option><option value=\"30\">New Jersey</option><option value=\"31\">New Mexico</option><option value=\"32\">New York</option><option value=\"33\">North Carolina</option><option value=\"34\">North Dakota</option><option value=\"35\">Ohio</option><option value=\"36\">Oklahoma</option><option value=\"37\">Oregon</option><option value=\"38\">Pennsylvania</option><option value=\"51\">Puerto Rico</option><option value=\"39\">Rhode Island</option><option value=\"40\">South Carolina</option><option value=\"41\">South Dakota</option><option value=\"42\">Tennessee</option><option value=\"43\">Texas</option><option value=\"52\">US Virgin Islands</option><option value=\"44\">Utah</option><option value=\"45\">Vermont</option><option value=\"46\">Virginia</option><option value=\"47\">Washington</option><option value=\"48\">West Virginia</option><option value=\"49\">Wisconsin</option><option value=\"50\">Wyoming</option></select>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t<label class=\"control-label\" for=\"postcode\">Zip / Postal Code<sup>*</sup></label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t  <input type=\"text\" id=\"postcode\" placeholder=\"Zip / Postal Code\"/> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t<label class=\"control-label\" for=\"country\">Country<sup>*</sup></label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t<select id=\"country\" >\n");
      out.write("\t\t\t\t<option value=\"\">-</option>\n");
      out.write("\t\t\t\t<option value=\"1\">India</option>\n");
      out.write("                                <option value=\"2\">China</option>\n");
      out.write("                                <option value=\"3\">Brazil</option>\n");
      out.write("                                <option value=\"4\">Mountain view</option>\n");
      out.write("                                \n");
      out.write("\t\t\t</select>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t<label class=\"control-label\" for=\"aditionalInfo\">Additional information</label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("                            <textarea name=\"aditionalInfo\" id=\"aditionalInfo\" cols=\"26\" rows=\"3\" placeholder=\"Additional information\"></textarea>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t<label class=\"control-label\" for=\"phone\">Home phone <sup>*</sup></label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t  <input type=\"text\"  name=\"phone\" id=\"phone\" placeholder=\"phone\"/> <span>You must register at least one phone number</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t<label class=\"control-label\" for=\"mobile\">Mobile Phone </label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t  <input type=\"text\"  name=\"mobile\" id=\"mobile\" placeholder=\"Mobile Phone\"/> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t<p><sup>*</sup>Required field\t</p>\n");
      out.write("\t\n");
      out.write("\t<div class=\"control-group\">\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"email_create\" value=\"1\">\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"is_new_customer\" value=\"1\">\n");
      out.write("\t\t\t\t<input class=\"btn btn-large btn-success\" type=\"submit\" value=\"Register\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- MainBody End ============================= -->\n");
      out.write("<!-- Footer ================================================================== -->\n");
      out.write("\t\n");
      out.write("<!-- Placed at the end of the document so the pages load faster ============================================= -->\n");
      out.write("\t<script src=\"themes/js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"themes/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"themes/js/google-code-prettify/prettify.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<script src=\"themes/js/bootshop.js\"></script>\n");
      out.write("    <script src=\"themes/js/jquery.lightbox-0.5.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Themes switcher section ============================================================================================= -->\n");
      out.write("<div id=\"secectionBox\">\n");
      out.write("<link rel=\"stylesheet\" href=\"themes/switch/themeswitch.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<script src=\"themes/switch/theamswitcher.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("\t<div id=\"themeContainer\">\n");
      out.write("\t<div id=\"hideme\" class=\"themeTitle\">Style Selector</div>\n");
      out.write("\t<div class=\"themeName\">Oregional Skin</div>\n");
      out.write("\t<div class=\"images style\">\n");
      out.write("\t<a href=\"themes/css/#\" name=\"bootshop\"><img src=\"themes/switch/images/clr/bootshop.png\" alt=\"bootstrap business templates\" class=\"active\"></a>\n");
      out.write("\t<a href=\"themes/css/#\" name=\"businessltd\"><img src=\"themes/switch/images/clr/businessltd.png\" alt=\"bootstrap business templates\" class=\"active\"></a>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"themeName\">Bootswatch Skins (11)</div>\n");
      out.write("\t<div class=\"images style\">\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"amelia\" title=\"Amelia\"><img src=\"themes/switch/images/clr/amelia.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"spruce\" title=\"Spruce\"><img src=\"themes/switch/images/clr/spruce.png\" alt=\"bootstrap business templates\" ></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"superhero\" title=\"Superhero\"><img src=\"themes/switch/images/clr/superhero.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"cyborg\"><img src=\"themes/switch/images/clr/cyborg.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"cerulean\"><img src=\"themes/switch/images/clr/cerulean.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"journal\"><img src=\"themes/switch/images/clr/journal.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"readable\"><img src=\"themes/switch/images/clr/readable.png\" alt=\"bootstrap business templates\"></a>\t\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"simplex\"><img src=\"themes/switch/images/clr/simplex.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"slate\"><img src=\"themes/switch/images/clr/slate.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"spacelab\"><img src=\"themes/switch/images/clr/spacelab.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"united\"><img src=\"themes/switch/images/clr/united.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<p style=\"margin:0;line-height:normal;margin-left:-10px;display:none;\"><small>These are just examples and you can build your own color scheme in the backend.</small></p>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"themeName\">Background Patterns </div>\n");
      out.write("\t<div class=\"images patterns\">\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern1\"><img src=\"themes/switch/images/pattern/pattern1.png\" alt=\"bootstrap business templates\" class=\"active\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern2\"><img src=\"themes/switch/images/pattern/pattern2.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern3\"><img src=\"themes/switch/images/pattern/pattern3.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern4\"><img src=\"themes/switch/images/pattern/pattern4.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern5\"><img src=\"themes/switch/images/pattern/pattern5.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern6\"><img src=\"themes/switch/images/pattern/pattern6.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern7\"><img src=\"themes/switch/images/pattern/pattern7.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern8\"><img src=\"themes/switch/images/pattern/pattern8.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern9\"><img src=\"themes/switch/images/pattern/pattern9.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern10\"><img src=\"themes/switch/images/pattern/pattern10.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern11\"><img src=\"themes/switch/images/pattern/pattern11.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern12\"><img src=\"themes/switch/images/pattern/pattern12.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern13\"><img src=\"themes/switch/images/pattern/pattern13.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern14\"><img src=\"themes/switch/images/pattern/pattern14.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern15\"><img src=\"themes/switch/images/pattern/pattern15.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern16\"><img src=\"themes/switch/images/pattern/pattern16.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern17\"><img src=\"themes/switch/images/pattern/pattern17.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern18\"><img src=\"themes/switch/images/pattern/pattern18.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern19\"><img src=\"themes/switch/images/pattern/pattern19.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern20\"><img src=\"themes/switch/images/pattern/pattern20.png\" alt=\"bootstrap business templates\"></a>\n");
      out.write("\t\t \n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<span id=\"themesBtn\"></span>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\tfunction logOut()\n");
      out.write("\t{\n");
      out.write("\t\twindow.alert(\"Logged Out Successfully\");\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}