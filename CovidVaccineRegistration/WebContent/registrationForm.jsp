<html>
<head>
<title>Vaccine Registeration</title>
<script type="text/javascript" src="JS/registrationValidation.js"></script>

</head>
<body
	style="background-image: url(Images/registrationbackground.jpg); background-size: cover; background-attachment: fixed; text-align: center;">

	<form method="post" action="RegistrationDetailsController"
		onsubmit="return validate()">


		<table align="center" cellpadding="5">
			<h1>
				<b><font color="OrangeRed">Registration of Covid Vaccine</font></b>
			</h1>
			<tr>
				<td>Enter Phone Number:</td>
				<td><input type="text" name="phonenumber" id="mobilenumber"
					value="" required> <span id="mobilemessages"
					style="color: red"></span> <br> <br></td>
			</tr>
			<tr>
				<td>Set Password:</td>
				<td><input type="password" name="password" required><br>
					<br></td>
			</tr>
			<h4>Later check your vaccine registration details using phone
				number and password</h4>
		</table>
		<table align="center" cellpadding="5">
			<h2>Please enter your personal details</h2>
			<h4>
				<font color="Brown">*please carry your aadhar card to
					vaccination centre 			</font>
					
			</h4>
			<tr>
				<td>Enter Name:</td>
				<td><input type="text" name="name" required><br> <br></td>
			</tr>
			<tr>
				<td>Enter AadharNumber:</td>
				<td><input type="text" name="aadharnumber" id="aadharNumber"
					value="" required> <span id="aadharmessages"
					style="color: red"></span> <br> <br></td>
				</td>
			</tr>
			<tr>
				<td>Enter Age:</td>
				<td><input type="text" name="age" id="age" required><br>
					<span id="agemessages" style="color: red"></span> <br></td>
			</tr>
			<tr>
				<td>Select Vaccine-type:</td>

				<td><select name="vaccine">
						<option>CovidShield</option>
						<option>Covaxin</option>
						<option>Sputnik V</option>

				</select><br> <br></td>
			</tr>
			<tr>
				<td>Select Date of vaccination:</td>
				<td><input type="date" name="date" required></td>
				<br>
			</tr>
			<tr>
				<td>Select Timeslot:</td>
				<td><select name="timeslot">
						<option>8AM-10AM</option>
						<option>10AM-12AM</option>
						<option>1PM-3PM</option>
						<option>3PM-5PM</option>
				</select> <br> <br></td>
			</tr>
			<tr>
				<td align="center" colspan="5"><button>Register</button>
		</table>
	</form>
</body>
</html>