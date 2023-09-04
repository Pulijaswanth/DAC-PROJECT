<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shopping page</title>
    <style>
         .card-img-top{
            height: 150px;
        }
        .card-title,
        .card-text{
            height: 50px;
            overflow: hidden;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
<nav><div class="btn-group" role="group" aria-label="Basic example"><button type="button" class="btn btn-danger"><a href="login">Logout</a></button></div></nav>
 <div class="container">
     <div class="row">
    <div class="col-sm-3 p-1">
       <div class="card" style="width: 18rem;">
  <img src="./images/Shirt.jpeg" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title" name="name">Red checks shirt</h5>
    <p class="card-text" name="price">Price:Rs.999/-</p><br>
    Qunty:<input type="number" value="1" name="Quantity" required><br><br>
    Size:
    <select name="size">
          <option>S</option>
        <option>M</option>
        <option>L</option>
        <option>XL</option>
        <option>XL</option>
    </select><br><br>
    <a href="#" class="btn btn-primary" type="submit" method="post" action="cart">Add to cart</a>
    <a href="#" class="btn btn-primary">buy now</a>
  </div>
    </div>
    <div class="col-sm-3 p-1">
       <div class="card" style="width: 18rem;">
  <img src="./images/white.jpg" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">White formal shirt</h5>
    <p class="card-text">Price:Rs.999/-</p><br>
    Qunty:<input type="number" value="1" required><br><br>
    Size:
    <select>
          <option>S</option>
        <option>M</option>
        <option>L</option>
        <option>XL</option>
        <option>XL</option>
    </select><br><br>
    <a href="#" class="btn btn-primary">Add to cart</a>
    <a href="#" class="btn btn-primary">buy now</a>
  </div>
    </div>
    <div class="col-sm-3 p-1">
      <div class="card" style="width: 18rem;">
  <img src="./images/Blue.jpeg" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Blue shirt</h5>
    <p class="card-text">Price:Rs.999/-</p><br>
    Qunty:<input type="number" value="1" required><br><br>
    Size:
    <select>
          <option>S</option>
        <option>M</option>
        <option>L</option>
        <option>XL</option>
        <option>XL</option>
    </select><br><br>
    <a href="#" class="btn btn-primary">Add to cart</a>
    <a href="#" class="btn btn-primary">buy now</a>
  </div>
    </div>
  </div>
 </div>
 </div>
 </div>
 </div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>