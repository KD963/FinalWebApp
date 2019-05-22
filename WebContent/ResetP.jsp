
<center>
	<%="Reset your password"%>

	<form action="ResetServlet">
	
	
	 EmailId: <input type = "text" name = "emailid"> <br> <br> 
	 
		Password: <input type="password" name="Password" pattern="((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})" title="must be 8 alphabet with special symbol" > <br> <br>
		Re-Password: <input type="password" name="Password1" pattern="((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})" title="must be 8 alphabet with special symbol">  <br>
		<br>
		
		 <input type="Submit" value = "Reset">  <br> <br>

<!-- <a href = "https://mail.google.com/mail/u/0/#inbox">Click here </a> <br> <br> -->


	</form>

</center>