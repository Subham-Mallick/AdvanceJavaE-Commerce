<%-- 
    Document   : products_maruti2
    Created on : 21 Jul, 2016, 12:11:50 AM
    Author     : Subham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="online_user.jsp"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Classifieds! Find anything you want</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
<!--Less styles -->
   <!-- Other Less css file //different less files has different color scheam
	<link rel="stylesheet/less" type="text/css" href="themes/less/simplex.less">
	<link rel="stylesheet/less" type="text/css" href="themes/less/classified.less">
	<link rel="stylesheet/less" type="text/css" href="themes/less/amelia.less">  MOVE DOWN TO activate
	-->
	<!--<link rel="stylesheet/less" type="text/css" href="themes/less/bootshop.less">
	<script src="themes/js/less.js" type="text/javascript"></script> -->
	
<!-- Bootstrap style --> 
    <link id="callCss" rel="stylesheet" href="themes/bootshop/bootstrap.min.css" media="screen"/>
    <link href="themes/css/base.css" rel="stylesheet" media="screen"/>
<!-- Bootstrap style responsive -->	
	<link href="themes/css/bootstrap-responsive.min.css" rel="stylesheet"/>
	<link href="themes/css/font-awesome.css" rel="stylesheet" type="text/css">
<!-- Google-code-prettify -->	
	<link href="themes/js/google-code-prettify/prettify.css" rel="stylesheet"/>
<!-- fav and touch icons -->
    <link rel="shortcut icon" href="themes/images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="themes/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="themes/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="themes/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="themes/images/ico/apple-touch-icon-57-precomposed.png">
	<style type="text/css" id="enject"></style>
  </head>
<body>
<div id="header">
<div class="container">
<div id="welcomeLine" class="row">
	<div class="span6">Welcome!<strong> User</strong></div>
	<div class="span6">
	 
	</div>
</div>
<!-- Navbar ================================================== -->
<div id="logoArea" class="navbar">
<a id="smallScreen" data-target="#topMenu" data-toggle="collapse" class="btn btn-navbar">
	<span class="icon-bar"></span>
	<span class="icon-bar"></span>
	<span class="icon-bar"></span>
</a>
  <div class="navbar-inner">
    <a class="brand" href="index2.jsp"><img src="themes/images/logo.png" alt="Bootsshop"/></a>
		 
    <ul id="topMenu" class="nav pull-right">
	 <li class=""><a href="special_offer2.jsp">Products</a></li>
     <li class=""><a href="register2.jsp">Sign Up</a></li>
	 <li class=""><a href="contact2.jsp">Details</a></li>
         <%
             if(request.getSession(false)!=null)
             {
         %>
         <li class=""><a href="logout.jsp">Log out</a></li>
         <%
             }
             else
            {}
         %>
         <li class=""><a href="login2.jsp"><%= userOnline %></a></li>
	 <!--<a href="login2.jsp" role="button" data-toggle="modal" style="padding-right:0"><span class="btn btn-large btn-success">Log in</span></a>
         <!--<div id="login" class="modal hide fade in" tabindex="-1" role="dialog" aria-labelledby="login" aria-hidden="false" >
		  <div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-hidden="true">x</button>
			<h3>Login Block</h3>
		  </div>
		  <div class="modal-body">
			<form class="form-horizontal loginFrm">
			  <div class="control-group">								
				<input type="text" id="inputEmail" placeholder="Email">
			  </div>
			  <div class="control-group">
				<input type="password" id="inputPassword" placeholder="Password">
			  </div>
			  <div class="control-group">
				<label class="checkbox">
				<input type="checkbox"> Remember me
				</label>
			  </div>
			</form>		
			<button type="submit" class="btn btn-success">Sign in</button>
			<button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
		  </div>
	</div>
	</li>-->
    </ul>
  </div>
</div>
</div>
</div>
<!-- Header End====================================================================== -->
<div id="mainBody">
	<div class="container">
	<div class="row">
<!-- Sidebar ================================================== -->
	<div id="sidebar" class="span3">
		 
		<ul id="sideManu" class="nav nav-tabs nav-stacked">
			<li class="subMenu open"><a>Electronics</a>
				<ul>
				<li><a class="active" href="products_camera2.jsp"><i class="icon-chevron-right"></i>Cameras</a></li>
				<li><a href="products_laptops2.jsp"><i class="icon-chevron-right"></i>Computers, Tablets & laptop</a></li>
				</ul>
			</li>
			<li class="subMenu"><a>Cars</a>
			<ul style="display:none">
				<li><a href="products_maruti2.jsp"><i class="icon-chevron-right"></i>Maruti</a></li>
				<li><a href="products_honda2.jsp"><i class="icon-chevron-right"></i>Honda</a></li>																		
			</ul>
			</li>
			<li class="subMenu"><a>Furnitures</a>
				<ul style="display:none">
				<li><a href="products_sofa2.jsp"><i class="icon-chevron-right"></i>Sofa</a></li>
				<li><a href="products_chair2.jsp"><i class="icon-chevron-right"></i>Chair</a></li>												
			</ul>
			</li>
            <li class="subMenu"><a>Sports and Gym</a>
				<ul style="display:none">
				<li><a href="products_bat2.jsp"><i class="icon-chevron-right"></i>Bat</a></li>
				<li><a href="products_dumbels2.jsp"><i class="icon-chevron-right"></i>Dumbells</a></li>											
			</ul>
			</li>
		</ul>
<br/>
		   
	</div>
<!-- Sidebar end=============================================== -->
	<div class="span9">
    <ul class="breadcrumb">
		<li><a href="index.html">Home</a> <span class="divider">/</span></li>
		<li class="active">Products Name: Maruti</li>
    </ul>
	<h3> Maruti Cars </h3>	
	<hr class="soft"/>
	
	 <div class="tab-pane  active" id="blockView">
		<ul class="thumbnails">
			<li class="span3">
			  <div class="thumbnail">
				<img src="pimages/Maruti/1.jpg" alt=""/>
				<div class="caption">
				  <h5>Maruti1</h5>
				  <p> 
					  
				  </p>
				   <h4 style="text-align:center"></h4>
                   <form method="post" action="product_clicked_maruti.jsp">
                   <button type="submit" id="maruti1" name="maruti1" value="maruti1">View</button>
                   </form> 
				</div>
			  </div>
			</li>
			<li class="span3">
			  <div class="thumbnail">
				<img src="pimages/Maruti/2.jpg" alt=""/>
				<div class="caption">
				  <h5>Maruti2</h5>
				  <p> 
					  
				  </p>
				   <h4 style="text-align:center"></h4>
                   <form method="post" action="product_clicked_maruti.jsp">
                   <button type="submit" id="maruti2" name="maruti1" value="maruti2">View</button>
                   </form> 
				</div>
			  </div>
			</li>
			<li class="span3">
			  <div class="thumbnail">
				<img src="pimages/Maruti/3.jpg" alt=""/>
				<div class="caption">
				  <h5>Maruti3</h5>
				  <p> 
					  
				  </p>
				    <h4 style="text-align:center"></h4>
                   <form method="post" action="product_clicked_maruti.jsp">
                   <button type="submit" id="maruti3" name="maruti1" value="maruti3">View</button>
                   </form>  
				</div>
			  </div>
			</li>
			<li class="span3">
			  <div class="thumbnail">
				<img src="pimages/Maruti/4.jpg" alt=""/>
				<div class="caption">
				  <h5>Maruti4</h5>
				  <p> 
					  
				  </p>
				    <h4 style="text-align:center"></h4>
                   <form method="post" action="product_clicked_maruti.jsp">
                   <button type="submit" id="maruti4" name="maruti1" value="maruti4">View</button>
                   </form> 
				</div>
			  </div>
			</li>
			<li class="span3">
			  <div class="thumbnail">
				<img src="pimages/Maruti/5.jpg" alt=""/>
				<div class="caption">
				  <h5>Maruti5</h5>
				  <p> 
					  
				  </p>
				    <h4 style="text-align:center"></h4>
                   <form method="post" action="product_clicked_maruti.jsp">
                   <button type="submit" id="maruti5" name="maruti1" value="maruti5">View</button>
                   </form> 
				</div>
			  </div>
			</li>
			<li class="span3">
			  <div class="thumbnail">
				<img src="pimages/Maruti/6.jpg" alt=""/>
				<div class="caption">
				  <h5>Maruti6</h5>
				  <p> 
					  
				  </p>
				    <h4 style="text-align:center"></h4>
                   <form method="post" action="product_clicked_maruti.jsp">
                   <button type="submit" id="maruti6" name="maruti1" value="maruti6">View</button>
                   </form> 
				</div>
			  </div>
			</li>
		  </ul>
	<hr class="soft"/>
	</div>

</div>
</div>
</div>
<!-- MainBody End ============================= -->
<!-- Footer ================================================================== -->
	 
<!-- Placed at the end of the document so the pages load faster ============================================= -->
	<script src="themes/js/jquery.js" type="text/javascript"></script>
	<script src="themes/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="themes/js/google-code-prettify/prettify.js"></script>
	
	<script src="themes/js/bootshop.js"></script>
    <script src="themes/js/jquery.lightbox-0.5.js"></script>
	
	<!-- Themes switcher section ============================================================================================= -->
<div id="secectionBox">
<link rel="stylesheet" href="themes/switch/themeswitch.css" type="text/css" media="screen" />
<script src="themes/switch/theamswitcher.js" type="text/javascript" charset="utf-8"></script>
	<div id="themeContainer">
	<div id="hideme" class="themeTitle">Style Selector</div>
	<div class="themeName">Oregional Skin</div>
	<div class="images style">
	<a href="themes/css/#" name="bootshop"><img src="themes/switch/images/clr/bootshop.png" alt="bootstrap business templates" class="active"></a>
	<a href="themes/css/#" name="businessltd"><img src="themes/switch/images/clr/businessltd.png" alt="bootstrap business templates" class="active"></a>
	</div>
	<div class="themeName">Bootswatch Skins (11)</div>
	<div class="images style">
		<a href="themes/css/#" name="amelia" title="Amelia"><img src="themes/switch/images/clr/amelia.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="spruce" title="Spruce"><img src="themes/switch/images/clr/spruce.png" alt="bootstrap business templates" ></a>
		<a href="themes/css/#" name="superhero" title="Superhero"><img src="themes/switch/images/clr/superhero.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="cyborg"><img src="themes/switch/images/clr/cyborg.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="cerulean"><img src="themes/switch/images/clr/cerulean.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="journal"><img src="themes/switch/images/clr/journal.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="readable"><img src="themes/switch/images/clr/readable.png" alt="bootstrap business templates"></a>	
		<a href="themes/css/#" name="simplex"><img src="themes/switch/images/clr/simplex.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="slate"><img src="themes/switch/images/clr/slate.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="spacelab"><img src="themes/switch/images/clr/spacelab.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="united"><img src="themes/switch/images/clr/united.png" alt="bootstrap business templates"></a>
		<p style="margin:0;line-height:normal;margin-left:-10px;display:none;"><small>These are just examples and you can build your own color scheme in the backend.</small></p>
	</div>
	<div class="themeName">Background Patterns </div>
	<div class="images patterns">
		<a href="themes/css/#" name="pattern1"><img src="themes/switch/images/pattern/pattern1.png" alt="bootstrap business templates" class="active"></a>
		<a href="themes/css/#" name="pattern2"><img src="themes/switch/images/pattern/pattern2.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="pattern3"><img src="themes/switch/images/pattern/pattern3.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="pattern4"><img src="themes/switch/images/pattern/pattern4.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="pattern5"><img src="themes/switch/images/pattern/pattern5.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="pattern6"><img src="themes/switch/images/pattern/pattern6.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="pattern7"><img src="themes/switch/images/pattern/pattern7.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="pattern8"><img src="themes/switch/images/pattern/pattern8.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="pattern9"><img src="themes/switch/images/pattern/pattern9.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="pattern10"><img src="themes/switch/images/pattern/pattern10.png" alt="bootstrap business templates"></a>
		
		<a href="themes/css/#" name="pattern11"><img src="themes/switch/images/pattern/pattern11.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="pattern12"><img src="themes/switch/images/pattern/pattern12.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="pattern13"><img src="themes/switch/images/pattern/pattern13.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="pattern14"><img src="themes/switch/images/pattern/pattern14.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="pattern15"><img src="themes/switch/images/pattern/pattern15.png" alt="bootstrap business templates"></a>
		
		<a href="themes/css/#" name="pattern16"><img src="themes/switch/images/pattern/pattern16.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="pattern17"><img src="themes/switch/images/pattern/pattern17.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="pattern18"><img src="themes/switch/images/pattern/pattern18.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="pattern19"><img src="themes/switch/images/pattern/pattern19.png" alt="bootstrap business templates"></a>
		<a href="themes/css/#" name="pattern20"><img src="themes/switch/images/pattern/pattern20.png" alt="bootstrap business templates"></a>
		 
	</div>
	</div>
</div>
<span id="themesBtn"></span>
</body>
</html>