function validate() {
	//declare variable of searching by id of phone number in form
	var mobile_number = document.getElementById("mobilenumber").value;
	//declare variable of searching by id of aadhar number in form
	var aadhar_number = document.getElementById("aadharNumber").value;
    //declare variable of searching by id of age in form
    var age_value = document.getElementById("age").value;

//validating if entered phone number is numeric or not
	if (isNaN(mobile_number)) {
		//displaying error message
		document.getElementById("mobilemessages").innerHTML = "* please enter only numeric values";
		return false;
	}
	//validating if entered phone number is not less than 10 digits
	 else if (mobile_number.length < 10) {
		//displaying error message
		document.getElementById("mobilemessages").innerHTML = "* please enter 10 digits";
		return false;
	}
	//validating if entered phone number is not greater than 10 digits
	else if (mobile_number.length > 10) {
		//displaying error message
		document.getElementById("mobilemessages").innerHTML = "* please enter 10 digits";
		return false;
	}
	//validating if entered phone number is start with 10 9 8 7 6
	else if ((mobile_number.charAt(0) != 9) && (mobile_number.charAt(0) != 8) && (mobile_number.charAt(0) != 7) && (mobile_number.charAt(0) != 6)) {
		//displaying error message
		document.getElementById("mobilemessages").innerHTML = "* Phone number must start with 9 8 7 6";
		return false;
	}
	//validating if entered phone number is numeric or not
	 if (isNaN(aadhar_number)) {
		//displaying error message
		document.getElementById("aadharmessages").innerHTML = "* please enter only numeric values";
		return false;
	}
	//validating if entered aadhar number is not less than 12 digits
	else if (aadhar_number.length < 12) {
		//displaying error message
		document.getElementById("aadharmessages").innerHTML = "* please enter 12 digits";
		return false;
	}
	//validating if entered aadhar number is not greater than 12 digits
	else if (aadhar_number.length > 12) {
		//displaying error message
		document.getElementById("aadharmessages").innerHTML = "* please enter 12 digits";
		return false;
	}
	

	

	 if (isNaN(age_value)) {
		document.getElementById("agemessages").innerHTML = "* please enter only numeric values";
		return false;
	}
	else if (age_value< 18) {
		document.getElementById("agemessages").innerHTML = "* Below 18 years age are not eligible for vaccination";
		return false;
	}
	

	return true;	


}

