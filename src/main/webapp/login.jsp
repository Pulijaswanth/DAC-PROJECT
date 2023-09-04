<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
  <style>
     .login{
      text-align: center;
      padding-left:38%;
      padding-right:40%;
      padding-top: 10%;
      opacity:0.7;
      color:black;
     }
      body {
        background-image: url("./images/clothes.jpg");
        background-repeat: no-repeat;
        background-size: cover;
        justify-content: center;
    }
    form{
        border:3px solid black;
        width:450px;
        border-radius: 5%;
        background-color:grey;
        opacity: 0.8;
        height: 10%;
        width: 110%;
        padding: 10%;
        
    }
    nav{
      align-items: center;
    }

  </style>
</head>
<body>
  <nav><a href="index.jsp">HOME</a></nav>
  <div class="login">
  <form method="post" action="login">
      <label><h1>LOGIN</h1></label><br><br>
      <label for="exampleInputEmail1" class="form-label"><h2>EMAIL ADDRESS:</h2></label>
      <input type="email" class="form-control" name="email" aria-describedby="emailHelp" placeholder="Email or user-id" required>
      <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
      <label for="exampleInputPassword1" class="form-label" placeholder="password"><h2>PASSWORD:</h2></label>
      <input type="password" class="form-control" name="password" required>
      <input type="checkbox" class="form-check-input" id="exampleCheck1" required>
      <label class="form-check-label" for="exampleCheck1">Check me out</label><br><br>
    <button type="submit" class="btn btn-primary" onclick=" ">SUBMIT</button>
  </form>
  </div>
    <%
      String auth=(String)session.getAttribute("auth");
   if(auth!=null){
	   out.print(auth);
	   session.setAttribute("auth","user");
   }
   %>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
</body>
</html>