<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Dayananda reddy:: gallery</title>
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
            <div class="row">
            <div class="col-md-12">
                    <section class="panel">
                        <header class="panel-heading">
                            Spiritual
                        </header>
                        <div class="panel-body">
                            <div >
                                <form:form  action="saveadminspiritualimg.html"   modelAttribute="spiritualimggal" enctype="multipart/form-data"  method="post" onsubmit="return Validation();" onchange="return FormValidation();">
                                <div class="col-md-3">
                                    <input type="file" id="fileUpload" onchange="Upload();" name="galleryfile" placeholder="File input">
				</div>
                                <div class="col-md-3">
                                    <label>Image Type</label>
                                    <form:select path="galleryimg_type" required="required" id="imgtype">
                                    <form:option value="select" selected="selected" >Select Image Type</form:option>
                					<form:option value="TimeLine" class="timeline">TimeLine</form:option>
                					<form:option value="political Events" class="political events">political Events</form:option>
  									<form:option value="Spiritual Events" class="Spiritual events">Spiritual Events</form:option>
  									<form:option value="With Leader" class="with leader">With Leader</form:option>
             						<form:option value="Other Events" class="other events">Other Events</form:option>
                                    </form:select>
                                </div>
                                <div class="col-md-3">
                                    <input type="submit" class="btn btn-info" value="ADD" style="margin-top:-2%" id="sub"  disabled/>
                                </div>
                                </form:form>
                            </div>
                        </div>
                    </section>
            </div>
</section>
	<section class="wrapper">
		<!-- gallery -->
		<!-- gallery -->
	<div class="gallery">
		<h2 class="w3ls_head">Spiritual Images</h2>
		<div class="gallery-grids">
				
				<div class="gallery-top-grids">
					
					<c:forEach var="spriimglist" items="${adminspiritualimg}">
					<c:url var="deleteadminspiritualimg" value="deleteadminspiritualimg.html">
					<c:param name="gallery_id" value="${spriimglist.gallery_id}"></c:param>
					<c:param name="gallery_img" value="${spriimglist.gallery_img}"></c:param>
					</c:url>
					<c:if test="${spriimglist.galleryimg_type=='Spiritual Events'}">
					<div class="col-sm-4 gallery-grids-left">
					<a href="${deleteadminspiritualimg}"><i class="fa fa-trash" aria-hidden="true"></i></a>
				
						<div class="gallery-grid">
							<a class="example-image-link" href="images/galleryimages/${spriimglist.gallery_img}" data-lightbox="example-set" data-title="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus vitae cursus ligula">
								<img src="images/galleryimages/${spriimglist.gallery_img}" alt="" />
								
							</a>
						</div>
					</div>
					</c:if>
					</c:forEach>
					
					<div class="clearfix"> </div>
				</div>
				
				
				<script src="adminjs/lightbox-plus-jquery.min.js"> </script>
		
	</div>
	</div>
	<!-- //gallery -->

</section>
<!-- footer -->
		  <div class="footer">
			<div class="wthree-copyright">
			  <p>© 2018 dayananda reddy. All rights reserved | Designed by <a href="http://appfonehub.com">Appfone Hub Private Limited.</a></p>
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
<!-- gallery -->


<script type="text/javascript">
function Upload() {
    //Get reference of FileUpload.
    var fileUpload = document.getElementById("fileUpload");
 
    //Check whether the file is valid Image.
    var regex = new RegExp("([a-zA-Z0-9\s_\\.\-:])+(.jpg|.png|.gif)$");
    if (regex.test(fileUpload.value.toLowerCase())) {
 
        //Check whether HTML5 is supported.
        if (typeof (fileUpload.files) != "undefined") {
            //Initiate the FileReader object.
            var reader = new FileReader();
            //Read the contents of Image File.
            reader.readAsDataURL(fileUpload.files[0]);
            reader.onload = function (e) {
                //Initiate the JavaScript Image object.
                var image = new Image();
 
                //Set the Base64 string return from FileReader as source.
                image.src = e.target.result;
                       
                //Validate the File Height and Width.
                image.onload = function () {
                    var height = this.height;
                    var width = this.width;
                    if (height == 340 && width == 320) {
                    	alert("Uploaded image has valid Height and Width.");
                        document.getElementById('sub').disabled = false;
                        
                    }
                    else
                    	{
                    	 alert("Height and Width must be 320px & 340px.");
                    	document.getElementById('sub').disabled = true;
          
                    	}
                };
 
            }
        } else {
            alert("This browser does not support HTML5.");
            return false;
        }
    } else {
        alert("Please select a valid Image file.");
        return false;
    }
}
	


</script>

<script type="text/javascript">

$(document).ready(function(){
	
	$("select option:contains('select')").attr("disabled","disabled");

});




</script>

<script type="text/javascript">
function Validation()
{
	
	var imgtype=document.getElementById("imgtype").value;
	if(imgtype=='select' || imgtype==null)
		{
		alert("Please select the Image type");
		return false;
		}
	
	
	}


</script>

</body>
</html>
