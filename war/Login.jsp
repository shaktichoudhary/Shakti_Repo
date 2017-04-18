<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="Header.jsp" %>
<form action="/sona" method="get">
<center> <iframe align="center" src="Slider/index.html" frameborder="0" marginheight="0" marginwidth="0" width="700" height="350" style="margin: 0px; padding: 0px;"></iframe>   
          

<table border="2" align="center">
                            <tbody>
                       <tr>
     <td>
         <b>UserName:</b></td><td><input type="text" name="uname"  value="" required></td></tr>
        <tr><td> <b>Password: </b></td><td><input type="Password" name="pass"  value="" style="margin:6" required>
         </td>
     </tr>
 <tr>
     <td>
     <input type="submit" value="Log In" name="submit"></td>
    <td> <input type="reset" value="Reset" name="reset">
     </td>
     </tr>
       <tr>
          <td><a href="signup.html">Click Here for Sign Up</a></td>
        </tr>
    </tbody>
</table>
</form>
<%@include file="Footer.jsp"%>
</body>
</html>