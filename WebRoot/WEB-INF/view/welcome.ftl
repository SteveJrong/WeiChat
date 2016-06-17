<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>FreeMarker published page</title>
</head>
<body>
	<#if name == "My First Spring MVC Enterprise Application.">
		Hello,${name}!
		<br/>
		if case was been executed!
		<br/>
		<br/>
		<br/>
	</#if>
	
	<#if 1 == 1>
		Combined Successful!
		<br/>
		Welcome to here!
	</#if>
	
	<h3>This page is a using Freemarker component that published page based on Freemarker template.</h3>
</body>
</html>