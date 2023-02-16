<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
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
 <form class="d-flex" role="search">
 <pre>                                                                <a class="navbar-brand" href="index.jsp" ><h2> HOME </h2></a> </pre>   
    </form>
</nav>


<div class="container mt-3">
  <form action="love" method="post">
  <div class="mb-3 mt-3">
      <label for="name">Name :</label>
      <input type="text" class="form-control"  placeholder="Enter Your name" name="name">
    </div>
    <div class="mb-3 mt-3">
      <label for="valentaine name">Valintine Name :</label>
      <input type="text" class="form-control" placeholder="Enter Your Valentine name" name="valentineName">
    </div>
    <div class="form-group">
  <label for="sel1">Select Place :</label>
  <select class="form-control" name="place">
    <option Selected="selected">Select</option>
        <c:forEach items="${place}" var="place">
        <option value="${place}">${place}</option>
      </c:forEach>
  </select>
</div>
       <div class="form-group">
  <label for="sel1">Select Gifts :</label>
  <select class="form-control" name="gift">
    <option Selected="selected">Select</option>
    <c:forEach items="${gift}" var="gift">
        <option value="${gift}">${gift}</option>
      </c:forEach>
  </select>
</div>
    <button type="submit" class="btn btn-primary">Save</button>
  </form>
</div>


</body>
</html>