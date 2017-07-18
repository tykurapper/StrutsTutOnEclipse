<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>File Upload</title>
</head>
<body>
<h1><s:text name="global.heading"/></h1>

<s:url var="indexEN" namespace="/" action="locale" >
    <s:param name="request_locale" >en</s:param>
    
</s:url>
<s:url var="indexES" namespace="/" action="locale" >
    <s:param name="request_locale" >es</s:param>
</s:url>
<s:url var="indexFR" namespace="/" action="locale" >
    <s:param name="request_locale" >fr</s:param>
</s:url>

<s:a href="%{indexEN}" >English</s:a>
<s:a href="%{indexES}" >Spanish</s:a>
<s:a href="%{indexFR}" >France</s:a>

<s:form action="empinfo" method="post" namespace="/">
    <s:textfield name="name" key="global.name" size="20" />
    <s:textfield name="age" key="global.age" size="20" />
    <s:submit name="submit" key="global.submit" />
</s:form>

</body>
</html>