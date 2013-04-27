<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
        <title>Register</title>
        <s:head />
    </head>
    <body>
        <h3>Register for a prize by completing this form.</h3>
        <s:form action="register">

            <s:textfield name="personBean.firstName" label="First name" />
            <s:textfield  name="personBean.lastName" label="Last name" />
            <s:textfield name="personBean.email"  label ="Email"/>  
            <s:textfield name="personBean.age"  label="Age"  />

            <s:submit/>
            <p><a href="<s:url action='buy'/>">Click here to buy</a></p>
        </s:form>	

    </body>
</html>