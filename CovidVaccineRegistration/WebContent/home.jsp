<html>
<head>
<title>Covid Vaccine</title>
<script type="text/javascript" src="JS/homeValidation.js"></script>
</head>
<body
	style="background-image: url(Images/homebackground.jpg); background-size: cover; background-attachment: fixed; text-align: center;">
	
	<form onsubmit="return mobileNumber()" method="post" action="DetailsDisplayController" >
		<h1>
			<font color="DarkMagenta">COVID-19 VACCINATION DRIVE</font>
		</h1>
		<h2><font style ="cursive" color="Yellow">#Let's fight against corona</font></h2>

		<table align="center" cellpadding="5">
			<h3><font color="DarkViolet">Login here to check your vaccination details</font></h3>
			<tr>
				<td>Enter PhoneNumber:</td>
				<td><input type="text" name="phonenumber" id="mobilenumber" value="" required>
				<span id="mobilemessages" style="color:red"></span>			
				<br>
					<br></td>
			</tr>
			<tr>
				<td>Enter Password:</td>
				<td><input type="password" name="password" required><br>
					<br></td>
			</tr>
			<tr>
				<td align="center" colspan="5"><button>Login</button>
		</table>
	</form>
	<h3><font color="DarkViolet">New user register from below</font></h3>
	<a href="registrationForm.jsp"><button>Register</button></a>
	<br>
	<br>
</body>
</html>