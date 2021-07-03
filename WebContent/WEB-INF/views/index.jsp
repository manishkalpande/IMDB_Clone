<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>IMDB</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Karma">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">

<script type="text/javascript" src="js/viewprofile.js"></script>
<script type="text/javascript" src="js/balance.js"></script>

<%
    String uid=(String) session.getAttribute("userid");

%>
<script type="text/javascript">

window.onload = function()
{
  let head=document.getElementById("header");
  let uid=document.getElementById("uid");
  console.log(uid.value);
  if(uid.value != null)
    {
	  
	  console.log(uid); 
	  let userid=document.createElement("a");
      userid.className="w3-bar-item w3-button";
      userid.textContent="Manish";
      userid.href="login";
      head.append(userid);
	  
    }
    else{
  	  let userid=document.createElement("a");
      userid.className="w3-bar-item w3-button";
      userid.textContent="Sign In";
      userid.href="login";
      head.append(userid);
     	
    }

}
  </script>
</head>
<body>

<input type="hidden" value=<%=uid %> id="uid">
	<!-- Navbar (sit on top) -->

 <nav class="w3-sidebar w3-bar-block w3-card w3-top w3-xlarge w3-animate-left" style="display:none;z-index:2;width:40%;min-width:300px" id="mySidebar">
  <a href="javascript:void(0)" onclick="w3_close()"
  class="w3-bar-item w3-button">Close Menu</a>
 
  <a href="#food" onclick="w3_close()" class="w3-bar-item w3-button">Food</a>
  <a href="#about" onclick="w3_close()" class="w3-bar-item w3-button">About</a>
</nav>

<div class="w3-top">
  <div class="w3-bar w3-white w3-wide w3-padding w3-card">
    <a href="#home" class="w3-bar-item w3-button"><b>IMDB</b></a>
  		<input type="text" placeholder="search">
  <!-- Float links to the right. Hide them on small screens -->

    <div id="header" class="w3-right w3-hide-small">
      <a href="#projects" class="w3-bar-item w3-button">IMDBpro</a>
      <a href="#about" class="w3-bar-item w3-button">Watchist</a>
     
    </div>
  </div>
</div>
<!-- Blog entries -->
<div class="w3-col l8 s12">
  <!-- Blog entry -->
  <div class="w3-card-4 w3-margin w3-white">
    <img src="<%=request.getContextPath()%>/views/css/mission-imposible-fallout.jsp" alt="Nature" style="width:100%">
    <div class="w3-container">
      <h3><b>Avenger EndGame</b></h3>
      <h5>Title description,  <span class="w3-opacity">April 7, 2014</span></h5>
      	        <div class="w3-col m8 s12">
          <p><button class="w3-button w3-padding-large w3-white w3-border"><b>READ MORE �</b></button></p>
        </div>
              <div class="w3-col m4 w3-hide-small">
          <p><span class="w3-padding-large w3-right"><b>Comments �</b> <span class="w3-tag">0</span></span></p>
        </div>
    </div>

    <div class="w3-container">
      <p>Mauris neque quam, fermentum ut nisl vitae, convallis maximus nisl. Sed mattis nunc id lorem euismod placerat. Vivamus porttitor magna enim, ac accumsan tortor cursus at. Phasellus sed ultricies mi non congue ullam corper. Praesent tincidunt sed
        tellus ut rutrum. Sed vitae justo condimentum, porta lectus vitae, ultricies congue gravida diam non fringilla.</p>
      <div class="w3-row">
        <div class="w3-col m8 s12">
          <p><button class="w3-button w3-padding-large w3-white w3-border"><b>Trailer �</b></button></p>
        </div>
        <div class="w3-col m4 w3-hide-small">
          <p><span class="w3-padding-large w3-right"><b>Comments �</b> <span class="w3-tag">0</span></span></p>
        </div>
      </div>
    </div>
  </div>
  <hr>

<br/>
<a href="login">login here</a>

</body>
</html>