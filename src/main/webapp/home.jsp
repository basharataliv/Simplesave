<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br><br>
<center><h1>Welcome</h1></center>
<form method="post" action="add">
 <table align="center">
   <tr>
   <th align="right">User Name:</th>
 <td><input type="text" name="aname" placeholder="Your Name" /><br/></td>
 </tr>
 <tr>
 <th align="right">User Password:</th>
 <td><input type="text" name="apass" placeholder="Your password"/><br/></td>
 </tr>
     <tr>
     <td colspan="2" align="right">
        <input type="submit" value="Register" />
        </td>
        </tr>
         </table>
        </form>
</body>
</html>