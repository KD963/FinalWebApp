<%=  "Password changed..." %>



<form action = "ResetServlet" method = "GET">





email---- <input type = "hidden" name = "emailid" value="<%=request.getAttribute("pwdNext")%> "/> <br> <br>
	 
password----		 <input type="hidden" name="Password" value="<%=request.getAttribute("pwd1Next")%> "/> <br> <br>
password1----		 <input type="hidden" name="Password1" value="<%=request.getAttribute("eidNext")%> "/> <br>
		<br>

</form>