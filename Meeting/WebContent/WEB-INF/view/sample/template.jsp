<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
	<head>
	    <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="description" content="A portfolio template that uses Material Design Lite.">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
	    <title>Template</title>
	   
	    <jsp:include page="/inc/asset.jsp"></jsp:include>
	    
	    <style>
		    #content {
		   		min-height: 1000px;
		  	}
	    </style>
	    
	    <script>
		   $(document).ready(function(){
		      $(".dropdown-trigger").dropdown();
		      
		      var clock;
		
		      $(document).ready(function() {
		
		         // Grab the current date
		         var currentDate = new Date();
		
		         // Set some date in the past. In this case, it's always been since Jan 1
		         var pastDate  = new Date(currentDate.getFullYear(), 0, 1);
		
		         // Calculate the difference in seconds between the future and current date
		         var diff = currentDate.getTime() / 1000 - pastDate.getTime() / 1000;
		
		         // Instantiate a coutdown FlipClock
		         clock = $('.clock').FlipClock({
		            clockFace: 'TwelveHourClock'
		         });
		      });
		   });
	   </script>
	</head>
	
	<body>
	    <div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
	       <jsp:include page="/inc/header.jsp"></jsp:include>
	        
	        <main class="mdl-layout__content">
	                
	            <div id="sub" style="position:fixed; left: 1450px;"> 
	                <div class="clock" style="margin:2em;"></div>   
	                <div id="info" style="padding: 20px;">
	                <p>name</p>
	                <p>grade</p>
	                <p>sss</p>
	                </div>
	            </div>  
	            <div id="content" class="mdl-grid portfolio-max-width">
	               
	             
	                
	                
	            </div>
	            <jsp:include page="/inc/footer.jsp"></jsp:include>
	        </main>
	        
	    </div>
	    <script src="https://code.getmdl.io/1.3.0/material.min.js"></script>
	</body>
</html>