<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<style>
        .register{
            /* padding-left: 38%;
            padding-top: 5%;
            padding-right: 48%;
            padding-bottom: 2%; */
            text-align:center;
            color:black;

        }
        
    body {
        background-image: url("path/to/image.jpg");
        background-repeat: no-repeat;
        background-size: cover;
    }
    form{
        border:3px solid black;
        width:450px;
        border-radius: 1%;
        background-color:grey;
        opacity: 0.8;
        padding:10%;
        
    }
    .A{
        padding-left: 36%;
        width: 100%;
        padding-bottom: 2%;
        
    }
    .input{
       padding-top: 2%;
        
    }
    .Button{
         padding-left: 2%;
         padding-bottom: 2%;
         opacity: 100%;
         height: 40px;
    }
    body {
        background-image: url("./images/clothes.jpg");
        background-repeat: no-repeat;
        background-size: cover;
        justify-content: center;
    }

        </style>
</head>
<body>
 <nav><h2><a href="index.jsp">HOME</a></h2></nav>
    <div class="register">
    <h1>Register here</h1>
    <div class="A">
    <form action="addUser" method="post">
        <div class="input">
        <label><h2>FIRST NAME:</h2></label>
        <input class="form-control" type="text" placeholder="First name" name="Firstname" required><br><br>
        <!-- <label><h2>MIDDLE NAME:</h2></label>
        <input class="form-control" type="text" placeholder="Middle name" name="Middle_name"><br><br> -->
        <label ><h2>LAST NAME:</h2></label>
        <input class="form-control" type="text" placeholder="Last name" name="Lastname" required><br><br>
        <label><h2>EMAIL:</h2></label>
        <input class="form-control" type="text" placeholder="Email" name="email"><br><br>
        <label><h2>PHONE:</h2></label>
        <input class="form-control" type="text" placeholder="Phone-number" name="mobile"  required>
        <br><br>
        <label><h2>ADDRESS:</h2></label><br>
        <!-- <input type="text" placeholder="City" name="city" required><br> -->
        <input class="form-control" type="text"  value="Hyderabad" readonly><br>
        <input class="form-control" type="text" placeholder="Area" name="area"required><br>
        <input class="form-control" type="text" placeholder="Landmark" name="landmark" required><br>
        <input class="form-control" type="number" placeholder="Pincode" name="pincode"required><br><br><br><br>
        <input class="form-control" type="password" placeholder="set password" name="password1" required><br>
        <input class="form-control" type="password" placeholder="re-enter password" name="password" required><br><br>
        <div class="Button">
        <button type="submit" class="bg bg-primary" onclick="sub()"><h2>SUBMIT</h2></button>
        </div>
        </div>
        </form>
        </div>
        </div>
        <%
      String msg=(String)session.getAttribute("msg");
   if(msg!=null){
	   out.print(msg);
	   session.setAttribute("msg",null);
   }
   %>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
         <script src="./reg.js"></script>
</body>
</html>