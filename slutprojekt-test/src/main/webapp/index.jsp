<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/NewFile.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>OpenWeather</title>
</head>
<body>

	<form action="OWservlet" method="get">
		City:<input type="text" name="city" required/><br /> 
		Country:<input type="text" name="country" required/><br /> <input type="submit" value="go" />
	</form>

</body>
</html>
