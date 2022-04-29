<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success page</title>
</head>
<body>
<%
String firstName = (String) request.getSession().getAttribute("ofname");
String middleName = (String) request.getSession().getAttribute("omname");
String lastName = (String) request.getSession().getAttribute("olname");
String gender = (String) request.getSession().getAttribute("gender");
String address = (String) request.getSession().getAttribute("address");
String city = (String) request.getSession().getAttribute("city");
String state = (String) request.getSession().getAttribute("state");
String country = (String) request.getSession().getAttribute("country");
String phone = (String) request.getSession().getAttribute("phone");
String bankName = (String) request.getSession().getAttribute("bankName");
String accountNumber = (String) request.getSession().getAttribute("accountNumber");
String ssn = (String) request.getSession().getAttribute("ssn");
%>
<font>****************************************************************</font>
<p>Congratulations. You have successfully registered.</p>
<p>The details you entered are:</p>
<p>First name : <%=firstName %></p>
<p>Middle name: <%=middleName %></p>
<p>Last name : <%=lastName %></p>
<p>Gender: <%=gender %></p>
<p>Address: <%=address %></p>
<p>City: <%=city %></p>
<p>State: <%=state %></p>
<p>Country: <%=country %></p>
<p>Phone: <%=phone %></p>
<p>Bank name: <%=bankName %></p>
<p>Account number: <%=accountNumber %></p>
<p>SSN: <%=ssn %></p>
<font>**************************************************************</font>
</body>
</html>