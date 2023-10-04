<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
<style>
* {
  box-sizing: border-box;
}
nav {
  background-color:  #121C03;
  color: #fff;
  padding: 10px;
}

nav ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  display: flex; /* Add flex display */
}

nav ul li {
  display: inline;
  margin-right: 10px; /* Add spacing between menu items */
}

nav ul li a {
  display: block;
  color: #fff;
  text-decoration: none;
  padding: 10px 20px;
}

nav ul li a:hover {
  background-color: #555;
}

nav ul li a.active {
  background-color: #02B3E7;
  font-weight: bold;
}
body {
margin:0;
  padding:0;
  font-family: "HelveticaNeue-Light","Helvetica Neue Light","Helvetica Neue",Helvetica,Arial,"Lucida Grande",sans-serif;
  color: white;
  font-size: 12px;
  background-color: #e5ddfc;
  background-image: url(data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI1NiIgaGVpZ2h0PSIxMDAiPgo8cGF0aCBkPSJNMjggNjZMMCA1MEwwIDE2TDI4IDBMNTYgMTZMNTYgNTBMMjggNjZMMjggMTAwIiBmaWxsPSJub25lIiBzdHJva2U9IiNmZmYiIHN0cm9rZS13aWR0aD0iMSI+PC9wYXRoPgo8L3N2Zz4=);
  font-family: "Oswald", "Helvetica Newe", Helvetica, sans-serif;
}

form {
background-color:#8b8f8d;
  width: 30%;
  margin: 30px auto;
  border-radius: 0.4em;
  border: 1px solid #508f56;
  overflow: hidden;
  position: relative;
  box-shadow: 0 5px 10px 5px rgba(0, 0, 0, 0.2);
}


.inset {
  padding: 20px;
  border-top: 1px solid #508f56;
}

form h1 {
  font-size: 18px;
  text-shadow: 0 1px 0 black;
  text-align: center;
  padding: 15px 0;
  border-bottom: 1px #508f56;
  position: relative;
}

form h1:after {
  content: "";
  display: block;
  width: 250px;
  height: 100px;
  position: absolute;
  top: 0;
  left: 50px;
  pointer-events: none;
  transform: rotate(70deg);
  background: linear-gradient(50deg, rgba(255, 255, 255, 0.15), rgba(0, 0, 0, 0));
}

label {
  color: #666;
  display: block;
  padding-bottom: 9px;
}

input[type=text],
input[type=password] {
  width: 100%;
  padding: 8px 5px;
  background: #d4e4e4;
  border: 1px solid #222;
  box-shadow: 0 1px 0 rgba(255, 255, 255, 0.1);
  border-radius: 0.3em;
  margin-bottom: 20px;
}

label[for=remember] {
  color: white;
  display: inline-block;
  padding-bottom: 0;
  padding-top: 5px;
}

input[type=checkbox] {
  display: inline-block;
  vertical-align: top;
}

.p-container {
  padding: 0 20px 20px 20px;
}

.p-container:after {
  clear: both;
  display: table;
  content: "";
}

.p-container span {
  display: block;
  float: left;
  color:   #d4e4e4;
  padding-top: 8px;
}

input[type=submit] {
  padding: 5px 20px;
  border: 1px solid rgba(0, 0, 0, 0.4);
  text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.4);
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.3), inset 0 10px 10px rgba(255, 255, 255, 0.1);
  border-radius: 0.3em;
  background:  #508f56;
  color: white;
  float: right;
  font-weight: bold;
  cursor: pointer;
  font-size: 13px;
}

input[type=submit]:hover {
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.3), inset 0 -10px 10px rgba(255, 255, 255, 0.1);
}

input[type=text]:hover,
input[type=password]:hover,
label:hover ~ input[type=text],
label:hover ~ input[type=password] {
  background: #849986;
}
.button {
  font: bold 15px Arial;
  text-decoration: none;
  background-color: #EEEEEE;
  color: #333333;
  padding: 2px 6px 2px 6px;
  border-top: 1px solid #CCCCCC;
  border-right: 1px solid #333333;
  border-bottom: 1px solid #333333;
  border-left: 1px solid #CCCCCC;
}
</style>
</head>
<body>
<nav>
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="about.jsp">About Us</a></li>
            <li><a href="contact.jsp">Contact</a></li>
        </ul>
    </nav>
<form method = post action =ForgotPasswordController >
  <h1><b style="color:black">Forgot Password</b></h1>
   <div class="inset">
  <p>
    <label for="userid" style="color:black"><b>EMAIL</b></label>
    <input type="text" name="email" id="email">
  </p>
  
  <p>
    <label for="sq" style="color:black"><b>SECRET QUESTION</b></label>
    <select name = "sq">
   <option value="q1" style="color:black">What is your best friends name?</option>
  <option value="q2" style="color:black">What is the name of your favorite pet?</option>
  <option value="q3" style="color:black">What was your favorite food as a child?</option>
  <option value="q4" style="color:black">What is your favorite color?</option>
    </select>
  </p>
     <p>
    <label for="sa" style="color:black"><b>SECRET ANSWER</b></label>
    <input type="text" name="sa" id="sa">
  </p>
  <p>
  
  </p>
  </div>
  
  
    <p class="p-container">
    <input type="submit" name="submit" id="submit" value="Submit"><br>
    
    
    <br><a href="login.jsp" class = "button">BACK</a>
    </p>
  
</form>
</body>
</html>