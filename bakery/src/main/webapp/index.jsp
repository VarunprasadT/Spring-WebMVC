<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link rel="stylesheet" href="BootStrap.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand"> <img alt="X-Workz" src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" Width="100" height="70"></a>
    <form class="d-flex" role="search">
    </form>
  </div>
</nav>
 <h1 align="center">Welcome to Bakery</h1>
 
 <form action="call" method="post">
 <table>
<tr><td> Name Of The Bakery</td><td><input type="text" name="name"></td></tr>
 <tr><td>Name of the owner</td><td><input type="text" name="ownerName"></td></tr>
 <tr><td>Name of OwnerWife</td><td><input type="text" name="ownerWifeName"></td></tr>
 <tr><td>Is Owner Married</td></tr>
 <tr><td><input type="radio" value="true" name="isMarried">yes</td>
 <td><input type="radio" value="false" name="isMarried">No</td></tr>
 <tr><td>Bakery Special for</td><td><textarea rows="3" cols="3" name="specialFor"></textarea></td></tr>
 <tr><td>Since</td><td><input type="text" name="since">
 </td>
 </tr>
 <tr><td><input type="submit" value="save">
 </table>
 </form>
</body>
</html>