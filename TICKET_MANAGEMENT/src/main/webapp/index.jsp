<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TMS</title>
<style>
@import url("https://fonts.googleapis.com/css?family=Raleway:200,400,900&display=swap");
* {
  margin: 0;
  padding: 0;
}

body {
  background-color: #e5ddfc;
  background-image: url(data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI1NiIgaGVpZ2h0PSIxMDAiPgo8cGF0aCBkPSJNMjggNjZMMCA1MEwwIDE2TDI4IDBMNTYgMTZMNTYgNTBMMjggNjZMMjggMTAwIiBmaWxsPSJub25lIiBzdHJva2U9IiNmZmYiIHN0cm9rZS13aWR0aD0iMSI+PC9wYXRoPgo8L3N2Zz4=);
  font-family: "Oswald", "Helvetica Newe", Helvetica, sans-serif;
  color: #8c674c;
  font-family: "Raleway", sans-serif;
}

i {
  transform: rotate(210deg);
  margin-right: 10px;
  font-weight: 900;
  font-size: 1.25em;
}

span {
  font-size: 1.25em;
}

h1 {
  color: #D0CA91;
  text-shadow: 2px 2px 2px #8c674c;
  font-size: 4em;
  margin-bottom: 20px;
}

h2 {
  font-weight: 200;
  margin-bottom: 40px;
}

header {
  display: grid;
  grid-template-areas: "logo nav";
  max-width: 75vw;
  margin: 0 auto;
  padding: 40px 0;
}

.logo {
  grid: "logo";
}

nav {
  grid: "nav";
  text-align: right;
}

.card-1 {
  display: grid;
  grid-template-areas: "info image";
  max-width: 75vw;
  margin: 50px auto;
}

.info {
  grid: "info";
}

.hero {
  grid: "image";
}

img {
  width: 400px;
}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 20px 0 0;
}
li:last-of-type {
  margin: 0;
}

button {
  padding: 10px 20px;
  color: #8c674c;
  background: transparent;
  border: 2px solid #8c674c;
  border-radius: 10px 10px;
  font-weight: 900;
}
</style>
</head>
<body>
<header>
  <div class="logo">
    <i class="fab fa-periscope"></i><span>TICKET PORTAL</span>
  </div>
  <nav>
    <ul>
      <li>
        <a href=about.jsp><button>About</button></a>
      </li>
      <li>
        <a href=contact.jsp><button>Contact Us</button></a>
      </li>
    </ul>
  </nav>
</header>

<content>
  <section class="card-1">
    <div class="info">
      <h1>
        IT TICKET MANAGEMENT SYSTEM
      </h1>
      <h2>
      
        Tired of searching a right person for resolving your IT related issues? Isn't it a hectic work to search? IT Online Ticketing is here to put the pep in your step, 10x your life, and put in the hard work for you to get that raise.
        
      </h2>
      <a href=login.jsp><button>LOGIN</button></a>
    </div>
     <div class="hero">
      <img src="tt.png.png" />
    </div>
  </section>
</content>
</body>
</html>

