<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
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
 <h1 align="center">Welcome Click to get details </h1>
 
 <form action="email" method="post">
 <h3 style='color:Green'>${email}</h3>
 <input type="submit" value="E-mail">
 </form>
  <form action="mNumber" method="post">
 <h3 style='color:Red'>${mobileNumber}</h3>
 <input type="submit" value="MobileNumber">
 </form>
  <form action="addhar" method="post">
 <h3 style='color:Green'>${addharNumber}</h3>
 <input type="submit" value="Addhar-Number">
 </form>
   <form action="age" method="post">
 <h3 style='color:Red'>${age}</h3>
 <input type="submit" value="Age">
 </form>
 <form action="dateOfBirth" method="post">
 <h3 style='color:red'>${dateOfBirth}</h3>
 <input type="submit" value="dateOfBirth">
 </form>
 
 <form action="desiredSalary" method="post">
 <h3 style='color:green'>${desiredSalary}</h3>
 <input type="submit" value="Desired Salary">
 </form>
 
 <form action="bestFriend" method="post">
 
   <c:forEach var="friend" items="${friends}">
<ul><li>
            <c:out value="${friend}"/> <br>
</li></ul>
        </c:forEach>
 
 <input type="submit" value="Friends List">

 </form>
 
 <form action="vistedPlaces" method="post">
    <c:forEach var="place" items="${place}">
<ul><li>
            <c:out value="${place}"/> <br>
</li></ul>
        </c:forEach>
 <input type="submit" value="Visted Place">
 </form>
 
 <form action="skillSet" method="post">
  <c:forEach var="skills" items="${skill}">
<ul><li>
            <c:out value="${skills}"/> <br>
</li></ul>
        </c:forEach>
        <input type="submit" value="Skill's">
 </form>
 
  <form action="education" method="post">
 <h3> 
${collegeName}<br>${collegeAddress}<br>${degree}<br>${course}<br>${cgpa}<br>${duration}<br>${joinedYear}<br>${completedYear}<br>${backLogs}<br>${cleared}<br>
	</h3>
<input type="submit" value="Education Details">
 </form>
 
 <form action="mobile" method="post">
 <h3>
 ${ mobileName}<br>
	${numberOfApplications}<br>
	${mostUsedApp}<br>
	${internalStorage}<br>
	${mobileBroughtDate}
 </h3>
 <input type="submit" value="Mobile Details">
 </form>
 
 <form action="beverage" method="post">
 <h3>
 ${mostLikedBreverage}<br>
 ${nameOfMostDrinkedBreverage}<br>
 ${numberofTimesBreverageHadinDay}<br>
 ${expireDate}<br>
${breveragePrice}<br>
 </h3>
 <input type="submit" value="Beverages">
 </form>
 

</body>
</html>