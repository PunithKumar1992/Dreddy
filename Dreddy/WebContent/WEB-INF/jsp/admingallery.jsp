<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Dayananda reddy::gallery</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Visitors Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link rel="stylesheet" href="admincss/bootstrap.min.css" >
<link rel="shortcut icon" href="images/favicon.png" type="image/x-icon" />

<!-- //bootstrap-css -->
<!-- Custom CSS -->
<link href="admincss/style.css" rel='stylesheet' type='text/css' />
<link href="admincss/style-responsive.css" rel="stylesheet"/>
<!-- font CSS -->
<link href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!-- font-awesome icons -->
<link rel="stylesheet" href="admincss/font.css" type="text/css"/>
<link href="admincss/font-awesome.css" rel="stylesheet"> 
<link rel="stylesheet" href="admincss/morris.css" type="text/css"/>
<!-- calendar -->
<link rel="stylesheet" href="admincss/monthly.css">
<!-- //calendar -->
<!-- //font-awesome icons -->
<script src="adminjs/jquery2.0.3.min.js"></script>
<script src="adminjs/raphael-min.js"></script>
<script src="adminjs/morris.js"></script>
</head>
<body>
<section id="container">
<!--header start-->
<header class="header fixed-top clearfix">
<!--logo start-->
<div class="brand">
   <a href="dashboard.html" class="logo">
         <img src="adminimages/logo.png" alt="" style="width: 90px;margin-top: -26%;margin-left: 31%;">
    </a>
    <div class="sidebar-toggle-box">
        <div class="fa fa-bars"></div>
    </div>
</div>
<!--logo end-->

<div class="top-nav clearfix">
    <!--search & user info start-->
     <ul class="nav pull-right top-menu">
       
        <!-- user login dropdown start-->
        <li class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                <img alt="" src="adminimages/adminimg.jpg">
                <span class="username">${sessionScope.activeuser }</span>
                <b class="caret"></b>
            </a>
            <ul class="dropdown-menu extended logout">
                <li><a href="adminprofile.html"><i class=" fa fa-suitcase"></i>Profile</a></li>
                <li><a href="adminsetting.html"><i class="fa fa-cog"></i> Settings</a></li>
                <li><a href="adminlogout.html"><i class="fa fa-key"></i> Log Out</a></li>
            </ul>
        </li>
        <!-- user login dropdown end -->
       
    </ul>
    <!--search & user info end-->
</div>
</header>
<!--header end-->
<!--sidebar start-->
<aside>
    <div id="sidebar" class="nav-collapse">
        <!-- sidebar menu start-->
        <div class="leftside-navigation">
            <ul class="sidebar-menu" id="nav-accordion">
                <li>
                    <a class="active" href="dashboard.html">
                        <i class="fa fa-dashboard"></i>
                        <span>Dashboard</span>
                    </a>
                </li>
                
                <li class="sub-menu">
                    <a href="adminbanner.html">
                        <i class="fa fa-book"></i>
                        <span>Banner</span>
                    </a>
                            </li>
                <li>
                    <a href="admingallery.html">
                         <i class="fa fa-glass"></i>
                        <span>Gallery</span>
                    </a>
                </li>
		<li>
                    <a href="adminvideo.html">
                        <i class="fa fa-adn" aria-hidden="true"></i>
                        <span> Video</span>
                    </a>
                </li>		
		<li>
                    <a href="adminarticle.html">
                        <i class="fa fa-book" aria-hidden="true"></i>
                        <span>Blog article</span>
                    </a>
                </li>
		<li>
                    <a href="adminquotes.html">
                      <i class="fa fa-quote-left" aria-hidden="true"></i>
                       <span>Quotes</span>
                    </a>
                </li>
		
                <li>
                    <a href="adminpionners.html">
                       <i class="fa fa-comments-o" aria-hidden="true"></i>
                       <span>Pionners</span>
                    </a>
                </li>
                <li>
                    <a href="adminarticlecomments.html">
                      <i class="fa fa-comment" aria-hidden="true"></i>
                       <span>Article Comments</span>
                    </a>
                </li>
                 <li>
                    <a href="adminarticlereplys.html">
                      <i class="fa fa-reply" aria-hidden="true"></i>
                       <span>Article Replys</span>
                    </a>
                </li>
                <!--<li>
                    <a href="audition.html">
                       <i class="fa fa-comments-o" aria-hidden="true"></i>
                        <span></span>
                    </a>
                </li>
				
		<li>
                    <a href="feedback.html">
                       <i class="fa fa-registered" aria-hidden="true"></i>
                        <span></span>
                    </a>
                </li>-->
            </ul>            </div>
        <!-- sidebar menu end-->
    </div>
</aside>
<!--main content start-->
<section id="main-content">
	<section class="wrapper">
            <div class="col-md-12">
                <div class="row">
                    <div class="col-md-4">
                        <a href="admintimelineimages.html"><img src="adminimages/FLODER.png" style="width: 250px;"></a>
                    </div>
                    <div class="col-md-4">
                        <a href="adminpoliticaleventimg.html"><img src="adminimages/political_event.png" style="width: 250px;"></a>
                    </div>
                    <div class="col-md-4">
                        <a href="adminspiritualeventimg.html"><img src="adminimages/spiritual_side.png" style="width: 250px;"></a>
                    </div>
                    <div class="col-md-4">
                        <a href="adminwithleaderimg.html"><img src="adminimages/with_leaders.png" style="width: 250px;"></a>
                    </div>
                    <div class="col-md-4">
                        <a href="adminothereventimg.html"><img src="adminimages/other_event.png" style="width: 250px;"></a>
                    </div>
                </div>
            </div>
</section>
 <!-- footer -->
		  <div class="footer">
			<div class="wthree-copyright">
			  <p>© 2018 Dayananda reddy . All rights reserved | Designed by <a href="http://appfonehub.com">Appfone Hub Private Limited.</a></p>
			</div>
		  </div>
  <!-- / footer -->
</section>
<!--main content end-->
</section>
<script src="adminjs/bootstrap.js"></script>
<script src="adminjs/jquery.dcjqaccordion.2.7.js"></script>
<script src="adminjs/scripts.js"></script>
<script src="adminjs/jquery.slimscroll.js"></script>
<script src="adminjs/jquery.nicescroll.js"></script>
<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/flot-chart/excanvas.min.js"></script><![endif]-->
<script src="adminjs/jquery.scrollTo.js"></script>
<!-- morris JavaScript -->	

</body>
</html>
