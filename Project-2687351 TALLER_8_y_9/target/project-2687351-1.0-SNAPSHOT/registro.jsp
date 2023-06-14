<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <!--author-->
    <meta name="author" content="Daniel R">
    <!--description-->
    <meta name="description" content="login & register">
    <!--meta specials characters-->
    <meta charset="utf-8">
    <!--minimum responsive viewport-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--Title-->
    <title>Registro</title>
    <!--Boostrap css/icons-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/booostrap-icons@1.10.3/font/boostrap-icons.css">
    <!--styles css-->
    <link rel="stylesheet" href="css/styles.css">
    <!--FAVICON-->
    <link rel="icon" type="image/x-icon" href="img/house-add.svg">
</head>
<body class="text-center">
<br>
<h1 class="display-1">DR</h1>©
<div class="container">
    <br>
    <header><h1>Registro</h1></header>
    <nav></nav>
    <section>
        <br>
        <main class="">
            <form  action="registerUser" method="post">
                <div class="form-floating">
                    <input type="text" id="floatingInput" name="user_firstname"  class="form-control" placeholder="ingrese un nombre de usuario" required autofocus pattern="[A-Za-z ]{2,40}">
                    <label for="floatingInput">Nombre:</label>
                </div>
                <br>
                <div class="form-floating">
                    <input type="text" id="floatingLastname" name="user_lastname" class="form-control" placeholder="ingrese sus apellidos" required pattern="[A-Za-z ]{2,50}">
                    <label for="floatingLastname">Apellido:</label>
                </div>
                <br>
                <div class="form-floating">
                    <input type="email" id="floatingEmail" class="form-control" placeholder="name@example.com" name="user_email" required pattern="{60}">
                    <label for="floatingEmail">Correo:</label>
                </div>
                <br>
                <div class="form-floating">

                    <input type="password" id="floatingPassword" class="form-control" name="user_password" placeholder="ingrese su contraseña" required pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,20}$">
                    <label for="floatingPassword">Contraseña:</label>
                </div>
                <br>
                <button type="submit" class="btn btn-lg btn-primary" value="Submit">Enviar</button>

            </form>
        </main>
    </section>
    <footer>
        <p class="mt-3 mb-3 text-muted">Todos los Derechos Reservados DR© <%=displayDate()%>
    </footer>
</div>

<!--scripts-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<%!
    public String displayDate(){
        SimpleDateFormat dateFormat= new SimpleDateFormat("YYYY");
        Date date = Calendar.getInstance().getTime();
        return dateFormat.format(date);
    }
%>
</body>
</html>