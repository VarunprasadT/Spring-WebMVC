<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
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

<h2>Welcome to Restorant</h2>
<form action="egg" method="post">  
 <div class="form-group">
  <label for="usr">Restorant Name</label>
  <input type="text" class="form-control" id="usr" name="restorantName">
</div>     
  <div class="form-group">
  <label for="sell">Type of Egg</label>
  <select class="form-control" name="eggType"><option selected="selected">Please Select the Type of Egg</option>
  <option value="Nati">1.Nati</option>
  <option value="Farm">2.Farm</option>
  <option value="Snake">3.Snake</option>
  <option value="Humming Bird">4.Humming bird</option>
  <option value="Squarel">5.Squarel</option>
  <option value="WoodPicker">6.WoodPicker</option>
  </select>
</div>

  <div class="form-group">
  <label for="sell">Egg Item</label>
  <select class="form-control" name="eggItem"><option selected="selected">Please Select the Food Item</option>
  <option value="eggRice">1.EggRice</option>
  <option value="eggMasala">2.EggMasala</option>
  <option value="eggFried">3.FriedEgg</option>
  <option value="eggBoiled">4.BoiledEgg</option>
  <option value="eggMilkShake">5.Egg Milk Shake</option>
  <option value="eggBurge">6.Egg Burge</option>
  <option value="eggBonda">7.Egg Bonda</option>
  </select>
</div>
 <div class="form-group">
  <label for="usr">Quantity</label>
  <input type="number" class="form-control" id="usr" name="quantity">
</div>
<div class="form-group">
  <label for="usr">Price</label>
  <input type="number" class="form-control" id="usr" name="price">
</div>

<input type="submit" class="btn btn-success" value="save">
</form>
</body>
</html>
