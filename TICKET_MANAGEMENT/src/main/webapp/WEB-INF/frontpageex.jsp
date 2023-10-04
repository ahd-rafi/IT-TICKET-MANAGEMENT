<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
@import url(https://fonts.googleapis.com/css?family=Lato);
html {
  height: 100%;
}
body {
  height: 100%;
  font-family: "Lato", sans-serif;
  color: #444;
  margin: 0;
}
.header {
  background: url("http://weare2ndfloor.com/wp-content/themes/weare2ndfloor2013/assets/img/tile.png")
    #2a333b;
  background-repeat: repeat;
  background-size: 437px auto; /*credits to weare2ndfloor for the cool background image*/
  text-align: center;
  width: 100%;
  height: 100%;
  display: table; /*display: table is kinda hacky, but it's a good way to vertically align elements that has good browser support*/
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}
.header-container {
  display: table-cell;
  vertical-align: middle;
  margin: auto 0;
}
.hero-unit h1 {
  font-size: 46px;
  color: #fff;
  font-weight: 500;
  border: 6px solid #fff;
  display: inline-block;
  padding: 30px 40px;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}

.wrapper {
  width: 50%;
  margin: 0 auto;
}
.module {
  margin: 40px;
}
p {
  line-height: 1.4;
}
.module h1 {
  margin: 16px auto;
  text-align: center;
  text-transform: uppercase;
}
a {
  text-decoration: none;
  color: #3498db;
}

</style>
</head>
<body>
<section class="header">
  			<div class="header-container">
    <div class="hero-unit">
      <h1>Lorem Ipsum</h1>
    </div>
  			</div>
</section>

<section class="grid wrapper">
  <div class="module">
    <h1>A Header</h1>
  </div>
    <div class="module">
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
            quis nostrud exercitation ullamco <a href="#">laboris nisi</a> ut aliquip ex ea commodo
            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
            cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
            quis nostrud exercitation ullamco <a href="#">laboris nisi</a> ut aliquip ex ea commodo
            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
            cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
        </div>
</section>
</body>
</html>