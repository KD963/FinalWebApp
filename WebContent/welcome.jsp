


Session Id : <%out.print(session.getId());%><br>

<% 



if(request.getAttribute("username") != null) {
    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
    rd.forward(request, response);
    
    
 }
%>
welcome.....Successfully Login!!


