<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>
</head>
<body>
<form  action="catch" method="post" >
<h1>Send Details Of Favorite Person  ---></h1>

<pre>
First Name: <input type="text" name="fname"/>

Last Name: <input type="text" name="lname"/>
Gender: <input type="radio" name="gen" value="male"/>MALE
        <input type="radio" name="gen" value="female"/>FEMALE 
        <input type="radio" name="gen" value="others"/>OTHERS


Reason:<textarea rows="4" cols="4" name="reason"></textarea>
</pre>
<input type="submit" value="send">




</form>

</body>
</html>