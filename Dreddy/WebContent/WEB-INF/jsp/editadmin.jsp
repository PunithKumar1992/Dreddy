<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Dayananda reddy:: Settings</title>
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
<link rel="stylesheet" href="admincss/lightbox.css">
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
<style type="text/css">

.error
{
color:red;
font-size:15px;
}
</style>
</head>
<body>
<section id="container">
<!--header start-->
<header class="header fixed-top clearfix">
<!--logo start-->
<div class="brand">
    <a href="index.html" class="logo">
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
                <img alt="" src="images/2.png">
                <span class="username">reddy</span>
                <b class="caret"></b>
            </a>
            <ul class="dropdown-menu extended logout">
                <li><a href="profile.html"><i class=" fa fa-suitcase"></i>Profile</a></li>
                <li><a href="settings.html"><i class="fa fa-cog"></i> Settings</a></li>
                <li><a href="login.html"><i class="fa fa-key"></i> Log Out</a></li>
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
                    <a class="active" href="index.html">
                        <i class="fa fa-dashboard"></i>
                        <span>Dashboard</span>
                    </a>
                </li>
                
                <li class="sub-menu">
                    <a href="banner.html">
                        <i class="fa fa-book"></i>
                        <span>Banner</span>
                    </a>
                            </li>
                <li>
                    <a href="gallery.html">
                         <i class="fa fa-glass"></i>
                        <span>Gallery</span>
                    </a>
                </li>
		<li>
                    <a href="video.html">
                        <i class="fa fa-adn" aria-hidden="true"></i>
                        <span> Video</span>
                    </a>
                </li>		
		<li>
                    <a href="login.html">
                       <i class="fa fa-comments-o" aria-hidden="true"></i>
                        <span>Login</span>
                    </a>
                </li>
		<li>
                    <a href="adminregistration.html">
                       <i class="fa fa-comments-o" aria-hidden="true"></i>
                       <span>Registration</span>
                    </a>
                </li>
		<li>
                    <a href="">
                       <i class="fa fa-comments-o" aria-hidden="true"></i>
                       <span>Blog</span>
                    </a>
                </li>
                <li>
                    <a href="contact.html">
                       <i class="fa fa-comments-o" aria-hidden="true"></i>
                       <span>Contact Us</span>
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
            </ul>       </div>
        <!-- sidebar menu end-->
    </div>
</aside>
<!--main content start-->
<section id="main-content">
	<section class="wrapper">
            <div class="row">
            <div class="col-md-12">
                    <section class="panel">
                        <header class="panel-heading">
                          Edit Admin Profile
                        </header>
                        <div class="panel-body">
                            <div>
                                <form:form method="post" action="saveeditadmin.html" modelAttribute="editadmin" onsubmit="return FormValidation();" onchange="return FormValidation();">
                                <form:hidden path="admin_id"/>
                                <div class="col-md-2">
                                  <form:input path="admin_name" placeholder="Admin Name" class="form-control" id="firstname" style="border: 2px solid; border-color:gray"/>
									<label  class="error" id="errtxt">${editadminexist}</label>
								</div>
                                <div class="col-md-2">
                                  <form:password path="admin_password" placeholder="Admin Password" value="${editadmin.admin_password}" class="form-control" id="pass" style="border: 2px solid; border-color:gray"/>
                                	<input type="checkbox" id="chk" value="Show password" onchange="tick(this)" >Show password
		
	                                </div>
                                <div class="col-md-2">
                                  <form:input path="admin_email" placeholder="Admin Email Address" class="form-control" id="email" style="border: 2px solid; border-color:gray"/> 
                                </div>
                                <div class="col-md-2">
                                  <form:input path="admin_phone" placeholder="Admin Phone Number" class="form-control" id="ppp" style="border: 2px solid; border-color:gray"/> 
                                </div>
                                <div class="col-md-2">
                                    <button type="submit" class="btn btn-info" style="margin-top:-2%">Submit</button>
                                </div>
                               </form:form>
                            </div>
                        </div>
                    </section>
            </div>
</section>
		
 <!-- footer -->
		  <div class="footer">
			<div class="wthree-copyright">
			  <p>© 2018 dayananada reddy All rights reserved | Designed by <a href="http://appfonehub.com">Appfone Hub Private Limited.</a></p>
			</div>
		  </div>
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

<script type="text/javascript">
function FormValidation()
{
  var fn=document.getElementById('firstname').value;
    if(fn == ""){
        //alert('Please Enter First Name');
        document.getElementById('firstname').style.borderColor = "red";
        return false;
    }else{
        document.getElementById('firstname').style.borderColor = "green";
    }
    if (/^[0-9]+$/.test(document.getElementById("firstname").value)) {
       //alert("First Name Contains Numbers!");
        document.getElementById('firstname').style.borderColor = "red";
        return false;
    }else{
        document.getElementById('firstname').style.borderColor = "green";
    }
    if(fn.length <=2){
        //alert('Your Name is To Short');
        document.getElementById('firstname').style.borderColor = "red";
        return false;
    }else{
        document.getElementById('firstname').style.borderColor = "green";
    }
    
    var pass=document.getElementById('pass').value;
    if(pass=="")
 	   {
 	   document.getElementById('pass').style.borderColor = "red";
        return false;
    }else{
        document.getElementById('pass').style.borderColor = "green";
    }
    if(/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{8,}/.test(document.getElementById("pass").value))
 	   {
 	   document.getElementById('pass').style.borderColor = "green";
 	   }
    else
    {
 	   alert("password must contain Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character:")
    document.getElementById('pass').style.borderColor = "red";
    return false;
    }
    
    var em=document.getElementById('email').value;
    if(em=="")
 	   {
 	   document.getElementById('email').style.borderColor = "red";
        return false;
    }else{
        document.getElementById('email').style.borderColor = "green";
    }
    if(/^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$/.test(document.getElementById("email").value))
    	{
    	document.getElementById('email').style.borderColor = "green";
       
    	
    	}
    else
 	   {
 	   document.getElementById('email').style.borderColor = "red";
 	   return false;
 	   }
   
    var ph=document.getElementById('ppp').value;
    if(ph=="")
 	   {
 	   document.getElementById('ppp').style.borderColor = "red";
        return false;
    }else{
        document.getElementById('ppp').style.borderColor = "green";
    }
   if(/^[789]\d{9}$/.test(document.getElementById("ppp").value))
	   {
	   
	   document.getElementById('ppp').style.borderColor = "green";
	   }
   else
   {
   document.getElementById('ppp').style.borderColor = "red";
   return false;
   }
   
  
  
   
  
	   
}


    </script>

 <script type="text/javascript">
    function tick(el) {
    	 $('#pass').attr('type',chk.checked ? 'text' : 'password');
    	}
    
    </script>

<script type="text/javascript">
$("#firstname").click(function(){
	$("#errtxt").text("");
	
});


</script>




</body>
</html>
