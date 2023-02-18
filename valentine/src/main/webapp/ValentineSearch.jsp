<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X workz</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark sticky-top">
<a class="navbar-brand" href="index.jsp"><img alt="Valentine Day" class="rounded" src="https://img.freepik.com/free-vector/simple-happy-valentines-day-celebration-design_1017-29881.jpg" width="100px">
</a>
           <pre>     <div>        <form class="d-flex"  action="love" method="get" >
 						          <input type="submit" class="btn btn-link" value="Valentine"></form>  
    </div></pre>

</nav>

<form action="search" method="get">

Search By id <input type="text" name="id">
<input type="submit" value="search">
</form>
<div>
<h3>Search Result</h3>
Name : ${dto.name}<br>
Place : ${dto.place}<br>
Gift : ${dto.place}<br>
Valentine Name : ${dto.valentineName}
</div>

</body>
</html>