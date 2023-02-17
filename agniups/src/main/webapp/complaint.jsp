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
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp"><img alt="AgniUps" class="rounded" width="100px" src="data:image/jpeg;base64,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"></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="mynavbar">
      <ul class="navbar-nav me-auto">
        <li class="nav-item">
          <h1 style="color:Green">Welcome to AgniUps Service</h1>
        </li>
        
      <li>
      <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp"><img alt="AgniUps" class="rounded" width="100px" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNDAGD218wawq4S6SrwBcnEI2xXSLIaN2xraMUEBOVMCo101eHGr5XnIO5lHxKnO3yP8s&usqp=CAU"></a>
   </div>
   </li>
   </ul>
    </div>
  </div>
</nav>
<form action="complaints" method="post">
<div class="form-group">
      <label for="usr">Enter Your name : </label>
      <input type="text" class="form-control" id="usr" name="customerName">
    </div>
    
    <div class="form-group">
      <label for="usr">Enter Model Name : </label>
      <input type="text" class="form-control" id="usr" name="modelName">
    </div>
    
    <div class="form-group">
  <label for="sel1">Quantity :</label>
  <select class="form-control" id="sel1" name="quantity">
  <option selected="selected">Select</option>
    <option>1</option>
    <option>2</option>
    <option>3</option>
    <option>4</option>
  </select>
</div>
   
    
    <div class="form-group">
      <label for="usr">Cost : </label>
      <input type="number" class="form-control" id="usr" name="modelName">
    </div>
    
    <div class="form-group">
    <label for="usr">Date of purchase : </label>
    <input type="datetime-local" class="form-control" id="usr" name="dateOfPurchase">
    </div>
    
    <div class="form-group">
  <label for="comment">Complaint : </label>
  <textarea class="form-control" rows="5" id="comment" name="complaints"></textarea>
</div>
    
    <div class="form-group">
    <input type="submit" class="btn btn-success" value="Register">
    </div>
    
</form>
</body>
</html>