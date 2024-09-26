<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Spring Form -->
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: center;">
        <h2>Borrar producto!</h2>
        <form:form method="post" action="" modelAttribute="producto">
            Producto ID: <form:input type="text" path="producto_id" readonly="true" /><br/>
            Nombre: <form:input type="text" path="nombre" readonly="true" /><br/>
            <p style="color: red;">¿Está seguro de borrar?</p>
            <button type="submit">Si, borrar</button>
            <button type="button" onclick="location.href='/senati/producto/listar'">Cancelar</button>
        </form:form>
    </div>



</body>
</html>