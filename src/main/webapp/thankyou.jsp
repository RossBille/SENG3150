<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
        <title>Registration Successful</title>
        <s:head />
    </head>
    <body>
        <h3>Thank you for registering for a prize.</h3>

        <p>Your registration information: <s:property value="personBean" /> </p>
        <p><a href="<s:url action='buy'/>">Click here to buy</a></p>
        <p><a href="<s:url action='index' />" >Logout</a>.</p>
        
    </body>
</html>
