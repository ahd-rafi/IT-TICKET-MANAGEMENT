<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABOUT</title>
<style>

body {
  margin:0;
  padding:0;
  font-family: sans-serif;
 background-color: #e5ddfc;
  background-image: url(data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI1NiIgaGVpZ2h0PSIxMDAiPgo8cGF0aCBkPSJNMjggNjZMMCA1MEwwIDE2TDI4IDBMNTYgMTZMNTYgNTBMMjggNjZMMjggMTAwIiBmaWxsPSJub25lIiBzdHJva2U9IiNmZmYiIHN0cm9rZS13aWR0aD0iMSI+PC9wYXRoPgo8L3N2Zz4=);
  font-family: "Oswald", "Helvetica Newe", Helvetica, sans-serif;
}
p{
 margin:10px;
  padding:10px;
  font-family: sans-serif;
}
h2{
 margin:10px;
  padding:10px;
  font-family: sans-serif;
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

    <main>
        <section>
            <h2>Our IT Ticketing System</h2>
            <p>
                Welcome to our IT ticketing system! We are dedicated to providing efficient and reliable ticketing solutions
                to manage IT-related issues, incidents, and requests. Our system is designed to streamline the ticketing process,
                enabling effective communication between users and our IT support team.
            </p>

            <p>
                Our ticketing system allows users to easily raise tickets for various IT-related matters such as software
                glitches, hardware malfunctions, access requests, and more. Once a ticket is submitted, our support team
                diligently works to address the issue and provide timely resolutions. The system also ensures proper tracking
                and monitoring of tickets throughout their lifecycle.
            </p>

            <p>
                With our IT ticketing system, you can expect the following key features:
            </p>

            <ul>
                <li>Efficient ticket submission process</li>
                <li>Automated ticket assignment and routing</li>
                <li>Real-time ticket status updates</li>
            </ul>

            <p>
                We are committed to providing excellent IT support services and ensuring a seamless user experience. Our dedicated
                team of IT professionals is here to assist you with any IT-related concerns. Feel free to contact us if you have
                any questions, feedback, or suggestions.
            </p>
        </section>
    </main>

</body>
</html>