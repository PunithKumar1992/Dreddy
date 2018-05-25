<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<title>Navarasa Natana Academy::quotes</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Visitors Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="a"WebContent/WEB-INF/jsp/adminarticle.jsp"pplication/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
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
<link rel="stylesheet" href="admincss/lightbox.css">
<!-- calendar -->
<link rel="stylesheet" href="admincss/monthly.css">
<link rel="stylesheet" href="admincss/pikaday.css">

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
<section id="main-content">
	<section class="wrapper">
            <div class="row">
            <div class="col-md-12">
                    <section class="panel">
                        <header class="panel-heading">
                          Quotes
                        </header>
                        <div class="panel-body">
                            <div >
                                <form:form action="saveadminquotes.html" enctype="multipart/form-data"  method="post" modelAttribute="adminquotes">
                               <div class="row">
                               <div class="col-md-12">
                               			<div class="col-md-9">
									<label style=" width: 50%; MARGIN-LEFT: 30%;padding: 0.25em;">Upload quotes Img</label>
                                   <input type="file" name="quotesfile" accept=".jpg,.png,jpeg" onchange="Upload();" id="fileUpload"  value="" style=" width: 50%; MARGIN-LEFT: 30%;padding: 0.25em;margin-bottom:1%;">
                                </div>
                                <div class="col-md-9">
                                 <i class="fa fa-plus" aria-hidden="true" value='Add Textinput' id='addButton' title="Add Text Input" style="margin-left: 30%;"></i>
                                <i class="fa fa-times" aria-hidden="true"  value='Remove Textinput' id='removeButton' title="Remove Text Input"></i>
                                <div id='TextBoxesGroup' style=" resize: none;width: 50%; MARGIN-LEFT: 30%;">
									<div id="TextBoxDiv1" >
									<input type="text" placeholder="quotes Message" name="article1" id="article1" style="width: 500.5px;"margin-top:1%;margin-bottom:2%;">
									</div>
										</div>
                               
                                </div>
                                 <input type="hidden" id="artcount" name="artcount" value="1">
                                 
                                <div class="col-md-9">
                                    <input type="submit" class="btn btn-info" value="ADD" style="margin-top:4%;margin-left: 40%;" id="sub"  disabled/>
                                </div> 
                                </div>
                                </div> 
                               </form:form>
                           
                               
                            </div>
                        </div>
                    </section>
            </div>
</section>
<div class="table-agile-info">
  <div class="panel panel-default">
    <div class="panel-heading">
     Quotes Information
    </div>
     <div class="table-responsive">
      <table class="table table-striped b-t b-light">
        <thead style="background-color: #e6e6ea;">
          <tr>
            <th style="border-right: 1px solid gainsboro;">Quotes Image</th>
            <th style="border-right: 1px solid gainsboro;">Quotes Message</th>
            <th> Action</th>
			
          </tr>
        </thead>
        <tbody>
    
    <c:forEach var="adminquoteslist" items="${adminquoteslist}">
    <c:url var="deletequotes" value="deleteadminquotes.html">
    <c:param name="quotes_id" value="${adminquoteslist.quotes_id}"></c:param>
    <c:param name="quotes_image" value="${adminquoteslist.quotes_image}"></c:param>
    
    </c:url>
   
        <tr>
            <td>
	      <a class="example-image-link" href="images/quotesimages/${adminquoteslist.quotes_image}" data-lightbox="example-set" >		
	      <img src="images/quotesimages/${adminquoteslist.quotes_image}" alt="" width="70%"/>
	      </a>
	
			<!-- //gallery -->
			</td>
			<td> ${adminquoteslist.quotes_msg}</td>
			
	 <td><a href="${deletequotes}" onclick="return confirmActiondelete();"><i class="fa fa-trash" aria-hidden="true"></i></a></td>
	
		 
	</tr>
	 </c:forEach>
        </tbody>
      </table>
      
    </div>
    
  </div>
</div>
 <!-- footer -->
		  <div class="footer">
			<div class="wthree-copyright">
			  <p>© 2018 Bharatiya Yodha. All rights reserved | Design by <a href="http://appfonehub.com">Appfone Hub Private Limited.</a></p>
			</div>
		  </div>
  <!-- / footer -->

<!--main content end-->
</section>

		
</section>
<!--main content end-->

        


<script src="adminjs/bootstrap.js"></script>
<script src="adminjs/jquery.dcjqaccordion.2.7.js"></script>
<script src="adminjs/scripts.js"></script>
<script src="adminjs/jquery.slimscroll.js"></script>
<script src="adminjs/jquery.nicescroll.js"></script>
<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/flot-chart/excanvas.min.js"></script><![endif]-->
<script src="adminjs/jquery.scrollTo.js"></script>
<!-- morris JavaScript -->	
<script>
	$(document).ready(function() {
		//BOX BUTTON SHOW AND CLOSE
	   jQuery('.small-graph-box').hover(function() {
		  jQuery(this).find('.box-button').fadeIn('fast');
	   }, function() {
		  jQuery(this).find('.box-button').fadeOut('fast');
	   });
	   jQuery('.small-graph-box .box-close').click(function() {
		  jQuery(this).closest('.small-graph-box').fadeOut(200);
		  return false;
	   });
</script>

<script type="text/javascript">

$(document).ready(function(){
	var counter = 2;
    
		
    $("#addButton").click(function () {
				
	if(counter>8){
            alert("Only 8 textboxes allow");
            return false;
	}   
		
	var newTextBoxDiv = $(document.createElement('div'))
	     .attr("id", 'ArticleDiv' + counter);
                
	newTextBoxDiv.after().html('<input type="text"  style="margin-top:1%;margin-bottom:2%;width: 500.5px;" name="article' + counter + '" id="article' + counter + '" value=""  placeholder="Quotes Message" ></input>');
            
	newTextBoxDiv.appendTo("#TextBoxesGroup");
					
	counter++;
	assign(counter);
     });

     $("#removeButton").click(function () {
    	console.log(counter);
	if(counter==1){
          alert("No more textbox to remove");
          return false;
       }   
        
	counter=counter-1;
			
        $("#ArticleDiv" + counter).remove();
        assign(counter);
       
			
     });
    
  });
  
function assign(count)
{
	  
	/* $("#artcount").val(count-1); */
	document.getElementById("artcount").value=count-1;
	  
}


function confirmActiondelete() {
		if (!confirm("Are You Sure You want to Delete?")) {
			return false;
		}
	}
</script>
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
                    if (height ==324 && width == 782) {
                    	alert("Uploaded image has valid Height and Width.");
                        document.getElementById('sub').disabled = false;
                        
                    }
                    else
                    	{
                    	 alert("Height and Width must not exceed 782px & 324px.");
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

 <script src="adminjs/pikaday.js"></script>
    

</body>
</html>
