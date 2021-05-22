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

</head>
<body>
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
      <input type="search" id="form1" class="form-control-dropdown" />
        <label class="form-label" for="form1">Search</label>
  <!-- Float links to the right. Hide them on small screens -->

    <div class="w3-right w3-hide-small">
      <a href="#projects" class="w3-bar-item w3-button">IMDBpro</a>
      <a href="#about" class="w3-bar-item w3-button">Watchist</a>
      <a href="#contact" class="w3-bar-item w3-button">Sign In</a>
    </div>
  </div>
</div>

<br/>
<a href="login.jsp">login here</a>

</body>
</html>