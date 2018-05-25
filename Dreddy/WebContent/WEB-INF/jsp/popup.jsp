<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Dayananda reddy:: popup</title>
  <link rel="shortcut icon" href="images/favicon.png" type="image/x-icon" />
  
  
  <link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'>

  
  
</head>

<body>

  <div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">
    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Message....</h4>
      </div>
      <div class="modal-body">
        <p>  Login Credential is Successfully Sent To  Your Registered Mail Id Please check it !!! ...</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
		 <button type="button" class="btn btn-default" data-dismiss="modal" onclick=window.location.href="admin">Sign In</button>
      </div>
    </div>

  </div>
</div>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js'></script>

  <script>
   $(window).load(function(){        
   $('#myModal').modal('show');
    });
  </script>





</body>

</html>
