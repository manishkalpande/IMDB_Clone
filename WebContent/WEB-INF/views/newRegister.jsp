<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="css/addmoneybank.css">
<script type="text/javascript">

	function passwordCheck()
	{
		let pass=document.getElementById("password").value;
		let pass1=document.getElementById("psw_repeat").value;
		
		if(pass != pass1)
			{
			alret("Password Does Not Match");
			}	
	}

</script>

    </head>
    <body>
    
    <form name="frm" method="post" action="RegisterUser" enctype="multipart/form-data" onsubmit="passwordCheck()">
      <div class="container">
        <h1>New Register</h1>
        <p>Please fill in this form to create an account.</p>
        <hr>
        
        <table>      
        <tr>
        <td><label for="userid"><b>User Id :</label></td>
        <td><input type="text" placeholder="Enter UserId" name="userid" id="userid" required>
        </tr>
        
        <tr>
        <td><label for="username"><b>User Name :</label></td>
        <td><input type="text" placeholder="Enter Username" name="usernm" id="usernm" required>
        </tr>
        
        <tr>
        <td><label for="Date of Birth"><b>Date of Birth :</label></td>
        <td><input type="date"  name="dob" id="dob" required>
        </tr>
        
         <tr>
        <td><label for="Gender"><b>Gender :</label></td>
        <td><input type="radio"  name="gen" id="gen" value="male" required>Male</td>
        <td><input type="radio" name="gen" id="gen" value="female">Female</td>
        </tr>
        
         <tr>
        <td><label for="Mobile"><b>Mobile No :</label></td>
        <td><input type="number" placeholder="Enter Number" name="mob" id="mob"  required>
        </tr>
        
         <tr>
        <td><label for="email"><b>Email :</b></label>
        <td><input type="email" placeholder="Enter Email" name="email" id="email" required>
        </tr>
        
         <tr>
        <td><label for="country"><b>Country :</b></label>
        <td><input type="text" placeholder="Enter Country" name="country" id="country" required>
        </tr>
        
        <tr>
        <td><label for="psw"><b>Password :</b></label>
        <td><input type="password" placeholder="Enter Password" name="password" id="password" required>
        </tr>
        
        <tr>
        <td><label for="psw-repeat"><b>Repeat Password :</b></label>
        <td><input type="password" placeholder="Repeat Password" name="psw_repeat" id="psw_repeat" required>
        </tr>
        
         <tr>
        <td><label for="image"><b>Upload Profile Photo:</b></label>
        <td><input type="file" name="file" multiple="true">
        </tr>
               
        <tr>
        <hr/>
        <td><p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p></td></tr>
        <tr>
        <td> <button type="submit" class="registerbtn">Register</button>
        </tr>
        </table>
      </div>
      
      <div class="container signin">
        <p>Already have an account? <a href="login">Sign in</a>.</p>
      </div>
    </form>
    
</body>
</html>