<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.WeatherBean"%>
<!DOCTYPE html>
<html>
<head>
<link href="NewFile.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>the weather</title>
</head>
<body>
	<div class="weather">
	<%
	
	WeatherBean wBean = (WeatherBean) request.getAttribute("wBean");
	
	int temperature =  (int) (Math.round(Double.parseDouble(wBean.getTemperatureStr()) - 273.15));
	
	int feelsLike =  (int) (Math.round(Double.parseDouble(wBean.getFeelsLikeStr()) - 273.15));
	
	String city = wBean.getCityStr();
	city = city.substring(0, 1).toUpperCase() + city.substring(1);
	
	String clouds = wBean.getCloudsStr();
	
	out.print("In " + city + " there are " + clouds);
	%></br></br><%
	out.print("The temperature is: " + temperature + " degrees Celsius but it feels like: " + feelsLike + " degrees Celsuis");
	%>
	</div>
	<div class="searchForm">
	<jsp:include page="../index.jsp"></jsp:include>
	</div>
	<div class="preSearch">
	<a href="OWservlet?city=${cookie['preCity'].getValue()}&country=${cookie['preCountry'].getValue()}">${cookie["preCity"].getValue()} ${cookie["preCountry"].getValue()}</a>
	</div>
	
</body>
</html>