<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejemplo de Banner HTML</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<header id="banner" >
    <h1> ¡Bienvenido a nuestro sitio Web!</h1>
    <p>Proyecto de Compiladores</p>
    <img src="resources/owo.jpg" alt="Banner de promoción" width="1240" height="1080">
</header>

<div class="boton-container">
    <button class="boton" onclick="toggleBanner()">Cerrar banner</button>
</div>

<button onclick="llamarServlet()">Llamar Servlet</button>
<div id="resultado"></div>

<script src="./index.js"></script>

</body>
</html>
