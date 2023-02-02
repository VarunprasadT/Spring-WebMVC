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
     <a href="index.jsp">Home</a><br>
    </form>
  </div>
</nav>
<h1>Add Interview Details here...</h1>
<form action="Offered" method="get">
<div class="form-group">
  <label for="usr">Enter The Name</label>
  <input type="text" name="name" class="form-control" id="usr" placeholder="Enter the Name" >
</div>
<div class="form-group">
  <label for="sel1">Select list:</label>
  <select name="company" class="form-control" id="sel1" >
    <option selected>Select Company</option>
    <option value="X-Workz Rajajinagar">X-Workz Raj</option>
    <option value="X-Workz BTM">X-Workz BTM</option>
    <option value="X-Workz">Both</option>
  </select>
</div>
<div class="form-group">
  <label for="usr">Enter The Offered Role</label>
  <input type="text" name="role" class="form-control" id="usr" placeholder="Job Role" >
</div>
<button type="submit" class="btn btn-success">Offered</button>
</form>
</body>
</html>