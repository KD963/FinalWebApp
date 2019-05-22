<center>
<%="SignUp"%>

<form action="SignInServlet">

	FirstName* : <input type="text" name="firstname" required> <br> <br>
    LastName* : <input type="text" name="lastname"  required>  <br> <br>
    EmailId* : <input type="text" name="emailId"  required> <br> <br> 
    PhoneNo* : <input type="text" name="phoneNo"   required> <br> <br> 
    Address* : <input type="text" name="address" required> <br> <br> 
    Password* : <input type="password" name="password" pattern="((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})" title="must be 8 alphabet with special symbol"  required> <br> <br>
	Re-typePassword* : <input type="password" name="repassword" pattern="((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})" title="must be 8 alphabet with special symbol"  required> <br>
	<br> <input type="submit"> <br> <br> 
	<input type="button" value="back">


</form>
</center>