package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class products_005fchair2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/online_user.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

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
    
    

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Classifieds! Find anything you want</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("<!--Less styles -->\r\n");
      out.write("   <!-- Other Less css file //different less files has different color scheam\r\n");
      out.write("\t<link rel=\"stylesheet/less\" type=\"text/css\" href=\"themes/less/simplex.less\">\r\n");
      out.write("\t<link rel=\"stylesheet/less\" type=\"text/css\" href=\"themes/less/classified.less\">\r\n");
      out.write("\t<link rel=\"stylesheet/less\" type=\"text/css\" href=\"themes/less/amelia.less\">  MOVE DOWN TO activate\r\n");
      out.write("\t-->\r\n");
      out.write("\t<!--<link rel=\"stylesheet/less\" type=\"text/css\" href=\"themes/less/bootshop.less\">\r\n");
      out.write("\t<script src=\"themes/js/less.js\" type=\"text/javascript\"></script> -->\r\n");
      out.write("\t\r\n");
      out.write("<!-- Bootstrap style --> \r\n");
      out.write("    <link id=\"callCss\" rel=\"stylesheet\" href=\"themes/bootshop/bootstrap.min.css\" media=\"screen\"/>\r\n");
      out.write("    <link href=\"themes/css/base.css\" rel=\"stylesheet\" media=\"screen\"/>\r\n");
      out.write("<!-- Bootstrap style responsive -->\t\r\n");
      out.write("\t<link href=\"themes/css/bootstrap-responsive.min.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\t<link href=\"themes/css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<!-- Google-code-prettify -->\t\r\n");
      out.write("\t<link href=\"themes/js/google-code-prettify/prettify.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<!-- fav and touch icons -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"themes/images/ico/favicon.ico\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"themes/images/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"themes/images/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"themes/images/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"themes/images/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("\t<style type=\"text/css\" id=\"enject\"></style>\r\n");
      out.write("  </head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div id=\"welcomeLine\" class=\"row\">\r\n");
      out.write("\t<div class=\"span6\">Welcome!<strong> User</strong></div>\r\n");
      out.write("\t<div class=\"span6\">\r\n");
      out.write("\t \r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Navbar ================================================== -->\r\n");
      out.write("<div id=\"logoArea\" class=\"navbar\">\r\n");
      out.write("<a id=\"smallScreen\" data-target=\"#topMenu\" data-toggle=\"collapse\" class=\"btn btn-navbar\">\r\n");
      out.write("\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t<span class=\"icon-bar\"></span>\r\n");
      out.write("</a>\r\n");
      out.write("  <div class=\"navbar-inner\">\r\n");
      out.write("    <a class=\"brand\" href=\"index2.jsp\"><img src=\"themes/images/logo.png\" alt=\"Bootsshop\"/></a>\r\n");
      out.write("\t\t \r\n");
      out.write("    <ul id=\"topMenu\" class=\"nav pull-right\">\r\n");
      out.write("\t <li class=\"\"><a href=\"special_offer2.jsp\">Products</a></li>\r\n");
      out.write("     <li class=\"\"><a href=\"register2.jsp\">Sign Up</a></li>\r\n");
      out.write("\t <li class=\"\"><a href=\"contact2.jsp\">Details</a></li>\r\n");
      out.write("         ");

             if(request.getSession(false)!=null)
             {
         
      out.write("\r\n");
      out.write("         <li class=\"\"><a href=\"logout.jsp\">Log out</a></li>\r\n");
      out.write("         ");

             }
             else
            {}
         
      out.write("\r\n");
      out.write("         <li class=\"\"><a href=\"login2.jsp\">");
      out.print( userOnline );
      out.write("</a></li>\r\n");
      out.write("\t <!--<a href=\"login2.jsp\" role=\"button\" data-toggle=\"modal\" style=\"padding-right:0\"><span class=\"btn btn-large btn-success\">Log in</span></a>\r\n");
      out.write("         <!--<div id=\"login\" class=\"modal hide fade in\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"login\" aria-hidden=\"false\" >\r\n");
      out.write("\t\t  <div class=\"modal-header\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">x</button>\r\n");
      out.write("\t\t\t<h3>Login Block</h3>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"modal-body\">\r\n");
      out.write("\t\t\t<form class=\"form-horizontal loginFrm\">\r\n");
      out.write("\t\t\t  <div class=\"control-group\">\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"inputEmail\" placeholder=\"Email\">\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<input type=\"password\" id=\"inputPassword\" placeholder=\"Password\">\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"checkbox\">\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\"> Remember me\r\n");
      out.write("\t\t\t\t</label>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</form>\t\t\r\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-success\">Sign in</button>\r\n");
      out.write("\t\t\t<button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">Close</button>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</li>-->\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Header End====================================================================== -->\r\n");
      out.write("<div id=\"mainBody\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("<!-- Sidebar ================================================== -->\r\n");
      out.write("\t<div id=\"sidebar\" class=\"span3\">\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t<ul id=\"sideManu\" class=\"nav nav-tabs nav-stacked\">\r\n");
      out.write("\t\t\t<li class=\"subMenu open\"><a>Electronics</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a class=\"active\" href=\"products_camera2.jsp\"><i class=\"icon-chevron-right\"></i>Cameras</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"products_laptops2.jsp\"><i class=\"icon-chevron-right\"></i>Computers, Tablets & laptop</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"subMenu\"><a>Cars</a>\r\n");
      out.write("\t\t\t<ul style=\"display:none\">\r\n");
      out.write("\t\t\t\t<li><a href=\"products_maruti2.jsp\"><i class=\"icon-chevron-right\"></i>Maruti</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"products_honda2.jsp\"><i class=\"icon-chevron-right\"></i>Honda</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"subMenu\"><a>Furnitures</a>\r\n");
      out.write("\t\t\t\t<ul style=\"display:none\">\r\n");
      out.write("\t\t\t\t<li><a href=\"products_sofa2.jsp\"><i class=\"icon-chevron-right\"></i>Sofa</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"products_chair2.jsp\"><i class=\"icon-chevron-right\"></i>Chair</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("            <li class=\"subMenu\"><a>Sports and Gym</a>\r\n");
      out.write("\t\t\t\t<ul style=\"display:none\">\r\n");
      out.write("\t\t\t\t<li><a href=\"products_bat2.jsp\"><i class=\"icon-chevron-right\"></i>Bat</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"products_dumbels2.jsp\"><i class=\"icon-chevron-right\"></i>Dumbells</a></li>\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("<br/>\r\n");
      out.write("\t\t   \r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- Sidebar end=============================================== -->\r\n");
      out.write("\t<div class=\"span9\">\r\n");
      out.write("    <ul class=\"breadcrumb\">\r\n");
      out.write("\t\t<li><a href=\"index.html\">Home</a> <span class=\"divider\">/</span></li>\r\n");
      out.write("\t\t<li class=\"active\">Products Name: Chairs</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\t<h3> Chairs </h3>\t\r\n");
      out.write("\t<hr class=\"soft\"/>\r\n");
      out.write("\t\r\n");
      out.write("\t <div class=\"tab-pane  active\" id=\"blockView\">\r\n");
      out.write("\t\t<ul class=\"thumbnails\">\r\n");
      out.write("\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t  <div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t<img src=\"pimages/Chair/1.jpg\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t  <h5>Chair1</h5>\r\n");
      out.write("\t\t\t\t  <p> \r\n");
      out.write("\t\t\t\t\tI'm a paragraph. Click here \r\n");
      out.write("\t\t\t\t  </p>\r\n");
      out.write("\t\t\t\t   <h4 style=\"text-align:center\"></h4>\r\n");
      out.write("                   <form method=\"post\" action=\"product_clicked_chair.jsp\">\r\n");
      out.write("                   <button type=\"submit\" id=\"chair1\" name=\"chair1\" value=\"chair1\">View</button>\r\n");
      out.write("                   </form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t  <div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t<img src=\"pimages/Chair/2.jpg\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t  <h5>Chair2</h5>\r\n");
      out.write("\t\t\t\t  <p> \r\n");
      out.write("\t\t\t\t\tI'm a paragraph. Click here \r\n");
      out.write("\t\t\t\t  </p>\r\n");
      out.write("\t\t\t\t   <h4 style=\"text-align:center\"></h4>\r\n");
      out.write("                   <form method=\"post\" action=\"product_clicked_chair.jsp\">\r\n");
      out.write("                   <button type=\"submit\" id=\"chair2\" name=\"chair1\" value=\"chair2\">View</button>\r\n");
      out.write("                   </form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t  <div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t<img src=\"pimages/Chair/3.jpg\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t  <h5>Chair3</h5>\r\n");
      out.write("\t\t\t\t  <p> \r\n");
      out.write("\t\t\t\t\tI'm a paragraph. Click here \r\n");
      out.write("\t\t\t\t  </p>\r\n");
      out.write("\t\t\t\t    <h4 style=\"text-align:center\"></h4>\r\n");
      out.write("                   <form method=\"post\" action=\"product_clicked_chair.jsp\">\r\n");
      out.write("                   <button type=\"submit\" id=\"chair3\" name=\"chair1\" value=\"chair3\">View</button>\r\n");
      out.write("                   </form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t  <div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t<img src=\"pimages/Chair/4.jpg\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t  <h5>Chair4</h5>\r\n");
      out.write("\t\t\t\t  <p> \r\n");
      out.write("\t\t\t\t\tI'm a paragraph. Click here \r\n");
      out.write("\t\t\t\t  </p>\r\n");
      out.write("\t\t\t\t    <h4 style=\"text-align:center\"></h4>\r\n");
      out.write("                   <form method=\"post\" action=\"product_clicked_chair.jsp\">\r\n");
      out.write("                   <button type=\"submit\" id=\"chair4\" name=\"chair1\" value=\"chair4\">View</button>\r\n");
      out.write("                   </form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t  <div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t<img src=\"pimages/Chair/5.jpg\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t  <h5>Chair5</h5>\r\n");
      out.write("\t\t\t\t  <p> \r\n");
      out.write("\t\t\t\t\tI'm a paragraph. Click here \r\n");
      out.write("\t\t\t\t  </p>\r\n");
      out.write("\t\t\t\t    <h4 style=\"text-align:center\"></h4>\r\n");
      out.write("                   <form method=\"post\" action=\"product_clicked_chair.jsp\">\r\n");
      out.write("                   <button type=\"submit\" id=\"chair5\" name=\"chair1\" value=\"chair5\">View</button>\r\n");
      out.write("                   </form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"span3\">\r\n");
      out.write("\t\t\t  <div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t<img src=\"pimages/Chair/6.jpg\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t  <h5>Chair6</h5>\r\n");
      out.write("\t\t\t\t  <p> \r\n");
      out.write("\t\t\t\t\tI'm a paragraph. Click here \r\n");
      out.write("\t\t\t\t  </p>\r\n");
      out.write("\t\t\t\t    <h4 style=\"text-align:center\"></h4>\r\n");
      out.write("                   <form method=\"post\" action=\"product_clicked_chair.jsp\">\r\n");
      out.write("                   <button type=\"submit\" id=\"chair6\" name=\"chair1\" value=\"chair6\">View</button>\r\n");
      out.write("                   </form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t  </ul>\r\n");
      out.write("\t<hr class=\"soft\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- MainBody End ============================= -->\r\n");
      out.write("<!-- Footer ================================================================== -->\r\n");
      out.write("\t \r\n");
      out.write("<!-- Placed at the end of the document so the pages load faster ============================================= -->\r\n");
      out.write("\t<script src=\"themes/js/jquery.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"themes/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"themes/js/google-code-prettify/prettify.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"themes/js/bootshop.js\"></script>\r\n");
      out.write("    <script src=\"themes/js/jquery.lightbox-0.5.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Themes switcher section ============================================================================================= -->\r\n");
      out.write("<div id=\"secectionBox\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"themes/switch/themeswitch.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<script src=\"themes/switch/theamswitcher.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t<div id=\"themeContainer\">\r\n");
      out.write("\t<div id=\"hideme\" class=\"themeTitle\">Style Selector</div>\r\n");
      out.write("\t<div class=\"themeName\">Oregional Skin</div>\r\n");
      out.write("\t<div class=\"images style\">\r\n");
      out.write("\t<a href=\"themes/css/#\" name=\"bootshop\"><img src=\"themes/switch/images/clr/bootshop.png\" alt=\"bootstrap business templates\" class=\"active\"></a>\r\n");
      out.write("\t<a href=\"themes/css/#\" name=\"businessltd\"><img src=\"themes/switch/images/clr/businessltd.png\" alt=\"bootstrap business templates\" class=\"active\"></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"themeName\">Bootswatch Skins (11)</div>\r\n");
      out.write("\t<div class=\"images style\">\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"amelia\" title=\"Amelia\"><img src=\"themes/switch/images/clr/amelia.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"spruce\" title=\"Spruce\"><img src=\"themes/switch/images/clr/spruce.png\" alt=\"bootstrap business templates\" ></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"superhero\" title=\"Superhero\"><img src=\"themes/switch/images/clr/superhero.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"cyborg\"><img src=\"themes/switch/images/clr/cyborg.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"cerulean\"><img src=\"themes/switch/images/clr/cerulean.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"journal\"><img src=\"themes/switch/images/clr/journal.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"readable\"><img src=\"themes/switch/images/clr/readable.png\" alt=\"bootstrap business templates\"></a>\t\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"simplex\"><img src=\"themes/switch/images/clr/simplex.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"slate\"><img src=\"themes/switch/images/clr/slate.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"spacelab\"><img src=\"themes/switch/images/clr/spacelab.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"united\"><img src=\"themes/switch/images/clr/united.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<p style=\"margin:0;line-height:normal;margin-left:-10px;display:none;\"><small>These are just examples and you can build your own color scheme in the backend.</small></p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"themeName\">Background Patterns </div>\r\n");
      out.write("\t<div class=\"images patterns\">\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern1\"><img src=\"themes/switch/images/pattern/pattern1.png\" alt=\"bootstrap business templates\" class=\"active\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern2\"><img src=\"themes/switch/images/pattern/pattern2.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern3\"><img src=\"themes/switch/images/pattern/pattern3.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern4\"><img src=\"themes/switch/images/pattern/pattern4.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern5\"><img src=\"themes/switch/images/pattern/pattern5.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern6\"><img src=\"themes/switch/images/pattern/pattern6.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern7\"><img src=\"themes/switch/images/pattern/pattern7.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern8\"><img src=\"themes/switch/images/pattern/pattern8.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern9\"><img src=\"themes/switch/images/pattern/pattern9.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern10\"><img src=\"themes/switch/images/pattern/pattern10.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern11\"><img src=\"themes/switch/images/pattern/pattern11.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern12\"><img src=\"themes/switch/images/pattern/pattern12.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern13\"><img src=\"themes/switch/images/pattern/pattern13.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern14\"><img src=\"themes/switch/images/pattern/pattern14.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern15\"><img src=\"themes/switch/images/pattern/pattern15.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern16\"><img src=\"themes/switch/images/pattern/pattern16.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern17\"><img src=\"themes/switch/images/pattern/pattern17.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern18\"><img src=\"themes/switch/images/pattern/pattern18.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern19\"><img src=\"themes/switch/images/pattern/pattern19.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t<a href=\"themes/css/#\" name=\"pattern20\"><img src=\"themes/switch/images/pattern/pattern20.png\" alt=\"bootstrap business templates\"></a>\r\n");
      out.write("\t\t \r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<span id=\"themesBtn\"></span>\r\n");
      out.write("</body>\r\n");
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
