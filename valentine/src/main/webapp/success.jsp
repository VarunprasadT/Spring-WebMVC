<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark sticky-top">
<a class="navbar-brand" href="index.jsp"><img alt="Valentine Day" class="rounded" src="https://img.freepik.com/free-vector/simple-happy-valentines-day-celebration-design_1017-29881.jpg" width="100px">
</a>
</nav>

<h1>Registration Succesfull</h1>
<span>Your Name : ${love.name}<br>
Your Valentine name : ${love.valentineName}<br>
Place : ${love.place}<br>
Gift : ${love.gift}</span>
</body>
</html>