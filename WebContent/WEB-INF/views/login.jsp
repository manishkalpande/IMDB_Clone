<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<<<<<<< HEAD
<link rel="stylesheet" type="text/css" href="css/stylesheet.css" />
=======


<link rel="stylesheet" type="text/css" href="css/stylesheet.css"/>

<link href="<c:url value="/resources/css/stylesheet.css"/>">



<link rel="stylesheet" type="text/css" href="css/stylesheet.css"/>
>>>>>>> 26fc8af186abe67fa5a1a4800ad3e30ca08f8863

<link href="<c:url value="/resources/css/stylesheet.css"/>">

</head>
<body>

	<div class="imgcontainer">
		<img src="image/e_wallet.png" width="120" height="230" alt="Avatar"
			class="avatar">
	</div>

<<<<<<< HEAD
	<div class="container">
		<h1>E_wallet</h1>

		<form method="post" action="Check">
			<table>
				<tr>
					<td><label for="">Enter UserID</label></td>
					<td><input type="text" placeholder="Enter UserId" name="uid"
						id="uid" required>
				<tr>
					<td><label for="">Enter Password</label></td>
					<td><input type="password" placeholder="Enter Password"
						name="pswd" id="pswd" required>
				</tr>
				<tr>
					<td>
						<button type="submit">Login</button>
					</td>
				</tr>

			</table>

		</form>
		<a href="Adminlogin.jsp">Admin Login here</a> <br> <a
			href="NewRegister.html">New User? Register here</a>
	</div>
=======
                <div class="container">
                <h1>IMDB</h1>

        	<form  method="post" action="check">
        		<table>
        		 <tr>
	 		<td><label for=""><b>Enter UserID</label></td>
		     <td><input type="text" placeholder="Enter UserId" name="userid"
						id="userid" required>
	 	 <tr>
 			<td><label for=""><b>Enter Password</label></td>
   	     <td><input type="password" placeholder="Enter Password" name="password"
						id="password" required>
	 		</tr>
	 			<tr>	
      			<td>
             <button type="submit">Login</button>
               </td>
        		</tr>
        	
        	</table>
        	
        	</form>
        	        <a href="adminlogin">Admin Login here</a>
  				<br>
        		<a href="newRegister">New User? Register here</a>
        </div>
>>>>>>> 26fc8af186abe67fa5a1a4800ad3e30ca08f8863

</body>
</html>