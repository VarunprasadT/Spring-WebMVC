<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
 <link rel="stylesheet" href="BootStrap.css">
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand"> <img alt="X-Workz" src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" Width="100" height="70"></a>
    <form class="d-flex" role="search">
  <pre><a href="index.jsp"><b>Home</b></a>      <a href="resort.jsp"><b>Click To Book Resort</b></a>
    </form>
  </div>
</nav>
<h1>Add Beach Details</h1>
<form action="swim" method="post">
<div class="form-group">
  <label for="usr">Beach Name</label>
  <input type="text" name="name" class="form-control" id="usr" placeholder="Enter the Name Of Beach" >
</div>
<div class="form-group">
  <label for="usr">Enter Location</label>
  <input type="text" name="location" class="form-control" id="usr" placeholder="Location" >
</div>
<div class="form-group">
  <label for="usr">Game Selected</label>
  <input type="text" name="game" class="form-control" id="usr" placeholder="Game" >
</div>
<button type="submit" class="btn btn-success">Book</button>
</form>

</body>
</html>