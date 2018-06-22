<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Register Admin</h4>
<form method="post" action="RegisterAdmin">
Employee Id:<input type="number" name="employeeId"/>
Employee Name:<input type="text" name="employeeName"/>
Department Code:<input type="text" name="deptCode"/>
Password:<input type="password" name="password"/>
Date Of Joining (Enter date in dd/mm/yyyy):<input type="date" name="dateOfJoining"/>

<input type="submit" value="Register Admin"/>
<input type="reset" value="clear"/>
</form>
</body>
</html>