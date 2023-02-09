<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz Zoo</title>
<link rel="stylesheet" href="BootStrap.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <a class="navbar-brand" href="#">
  <img alt="X-Workz Zoo" src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" Width="100" height="70">
  </a>
</nav>

<h2>Register Snake Here</h2>

<form action="Buss" method="post">  
 <div class="form-group">
  <label for="usr">Snake Number:</label>
  <input type="number" class="form-control" id="usr" name="siNo">
</div>     
  <div class="form-group">
  <label for="usr">Snake Name:</label>
  <input type="text" class="form-control" id="usr" name="snakeName">
</div>
<div class="form-group">
  <label for="usr">Snake Gender:</label><br>
 <input type="radio" name="snakeGender" value="Male">Male
 <input type="radio" name="snakeGender" value="Female">Female
</div>
 <div class="form-group">
  <label for="usr">Snake Married:</label><br>
Yes <input type="radio" name="isSnakeMarried" value="true">
No<input type="radio" name="isSnakeMarried" value="false">
</div>   
<div class="form-group">
  <label for="usr">Number of Kids:</label>
  <input type="number" class="form-control" id="usr" name="numberOfKids">
</div> 
 <div class="form-group">
  <label for="usr">Snake Location:</label>
  <input type="text" class="form-control" id="usr" name="location">
</div>

<input type="submit" class="btn btn-success" value="save">
</form>


</body>
</html>



