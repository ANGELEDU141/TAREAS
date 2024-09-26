<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div style="text-align: center;">
    <h3>Detalle producto</h3>

    <p>Producto ID: ${producto.producto_id}</p>
    <p>Nombre: ${producto.nombre}</p>
    <p>Marca: ${producto.marca}</p>
    <p>Precio: ${producto.precio}</p>
    <p>Fecha fabricación: ${producto.ffabricacion}</p>
    <p>Fecha vencimiento: ${producto.fvencimiento}</p>
    <p>Stock: ${producto.stock}</p>

    <a href="/senati/producto/listar">Index</a>
</div>

</body>
</html>