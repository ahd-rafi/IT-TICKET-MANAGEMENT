<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>REPORT</title>
<style>
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
  background: linear-gradient(#ccc, #fff);
  font: 14px sans-serif;
  
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
.letter {
  background: #fff;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
  margin: 26px auto 0;
  max-width: 550px;
  min-height: 800px;
  padding: 24px;
  position: relative;
  width: 80%;
}
.letter:before,
.letter:after {
  content: "";
  height: 98%;
  position: absolute;
  width: 100%;
  z-index: -1;
}
.letter:before {
  background: #fafafa;
  box-shadow: 0 0 8px rgba(0, 0, 0, 0.2);
  left: -5px;
  top: 4px;
  transform: rotate(-2.5deg);
}
.letter:after {
  background: #f6f6f6;
  box-shadow: 0 0 3px rgba(0, 0, 0, 0.2);
  right: -3px;
  top: 1px;
  transform: rotate(1.4deg);
}

@import url(//fonts.googleapis.com/css?family=Oswald:400);
* {
  margin: 0;
  padding: 0;
}
body {
  background-color: #e5ddfc;
  background-image: url(data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI1NiIgaGVpZ2h0PSIxMDAiPgo8cGF0aCBkPSJNMjggNjZMMCA1MEwwIDE2TDI4IDBMNTYgMTZMNTYgNTBMMjggNjZMMjggMTAwIiBmaWxsPSJub25lIiBzdHJva2U9IiNmZmYiIHN0cm9rZS13aWR0aD0iMSI+PC9wYXRoPgo8L3N2Zz4=);
  font-family: "Oswald", "Helvetica Newe", Helvetica, sans-serif;
}
.chart {
  position: absolute;
  width: 450px;
  height: 450px;
  top: 50%;
  left: 50%;
  margin: -75px 0 0 -225px;
}
.pieTip {
  position: absolute;
  float: left;
  min-width: 30px;
  max-width: 300px;
  padding: 5px 18px 6px;
  border-radius: 2px;
  background: rgba(255, 255, 255, 0.97);
  color: #444;
  font-size: 19px;
  text-shadow: 0 1px 0 #fff;
  text-transform: uppercase;
  text-align: center;
  line-height: 1.3;
  letter-spacing: 0.06em;
  box-shadow: 0 0 3px rgba(0, 0, 0, 0.2), 0 1px 2px rgba(0, 0, 0, 0.5);
  -webkit-transform: all 0.3s;
  -moz-transform: all 0.3s;
  -ms-transform: all 0.3s;
  -o-transform: all 0.3s;
  transform: all 0.3s;
  pointer-events: none;
}
.pieTip:after {
  position: absolute;
  left: 50%;
  bottom: -6px;
  content: "";
  height: 0;
  margin: 0 0 0 -6px;
  border-right: 5px solid transparent;
  border-left: 5px solid transparent;
  border-top: 6px solid rgba(255, 255, 255, 0.95);
  line-height: 0;
}
.chart path {
  cursor: pointer;
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
<div class="letter">
<h1 style="text-align:center"><u>Monthly Report</u></h1><br>
<%! 
    int tt;
    int nt;
    int pt;
    int ct;
    int st;
    int attended;
    int ptt;
%>
<%
tt =(int)request.getAttribute("data1");

nt =(int)request.getAttribute("data2");

pt =(int)request.getAttribute("data3");
 ct =(int)request.getAttribute("data4");
 st =(int)request.getAttribute("data5");
attended = pt+ct+st;
ptt = tt - ct;





 %> 
 <br>
 
 <p>
        In the current ticketing system, there have been a total of <%= tt %> tickets raised.
        Out of these, <%= ptt %> tickets are currently pending, <%= attended %> ticket has been attended but not resolved,
        and none of the tickets have been fully solved at this stage.
    </p>

    <p>
        The pending tickets represent unresolved matters that require further investigation, analysis, or action
        in order to reach a satisfactory resolution. It is crucial for the team to focus on these pending tickets,
        aiming to provide effective and timely resolutions to meet the expectations of the users or customers.
    </p>

    <p>
        Efforts should be made to analyze the reasons behind the increasing number of pending tickets and develop
        strategies to expedite the resolution process. Regular communication with customers, updates on progress,
        and proactive measures can help in reducing the backlog of pending tickets and ensure a smoother ticket
        management process.
    </p>

    <p>
        It is essential for the team to monitor and manage the ticketing system efficiently, ensuring that all raised
        tickets receive the necessary attention and are resolved within an acceptable timeframe. This will help maintain
        customer satisfaction, enhance productivity, and uphold service level agreements.
    </p>

<div id="pieChart" class="chart"></div>
</div>
<script>
$(function () {
	  $("#pieChart").drawPieChart([
	    { title: "Total Tickets", value: <%= tt%>, color: "#02B3E7" },
	    { title: "Tickets Attended", value: <%= attended%>, color: "#CFD3D6" },
	    { title: "UnAttended Tickets", value: <%= nt%>, color: "#736D79" },
	    { title: "Solved", value: <%= ct%>, color: "#776068" },
	    { title: "Unsolved", value: <%= ptt%>, color: "#EB0D42" },
	    
	  ]);
	});

	/*!
	 * jquery.drawPieChart.js
	 * Version: 0.3(Beta)
	 * Inspired by Chart.js(http://www.chartjs.org/)
	 *
	 * Copyright 2013 hiro
	 * https://github.com/githiro/drawPieChart
	 * Released under the MIT license.
	 */
	(function ($, undefined) {
	  $.fn.drawPieChart = function (data, options) {
	    var $this = this,
	      W = $this.width(),
	      H = $this.height(),
	      centerX = W / 2,
	      centerY = H / 2,
	      cos = Math.cos,
	      sin = Math.sin,
	      PI = Math.PI,
	      settings = $.extend(
	        {
	          segmentShowStroke: true,
	          segmentStrokeColor: "#fff",
	          segmentStrokeWidth: 1,
	          baseColor: "#fff",
	          baseOffset: 15,
	          edgeOffset: 30, //offset from edge of $this
	          pieSegmentGroupClass: "pieSegmentGroup",
	          pieSegmentClass: "pieSegment",
	          lightPiesOffset: 12, //lighten pie's width
	          lightPiesOpacity: 0.3, //lighten pie's default opacity
	          lightPieClass: "lightPie",
	          animation: true,
	          animationSteps: 90,
	          animationEasing: "easeInOutExpo",
	          tipOffsetX: -15,
	          tipOffsetY: -45,
	          tipClass: "pieTip",
	          beforeDraw: function () {},
	          afterDrawed: function () {},
	          onPieMouseenter: function (e, data) {},
	          onPieMouseleave: function (e, data) {},
	          onPieClick: function (e, data) {}
	        },
	        options
	      ),
	      animationOptions = {
	        linear: function (t) {
	          return t;
	        },
	        easeInOutExpo: function (t) {
	          var v = t < 0.5 ? 8 * t * t * t * t : 1 - 8 * --t * t * t * t;
	          return v > 1 ? 1 : v;
	        }
	      },
	      requestAnimFrame = (function () {
	        return (
	          window.requestAnimationFrame ||
	          window.webkitRequestAnimationFrame ||
	          window.mozRequestAnimationFrame ||
	          window.oRequestAnimationFrame ||
	          window.msRequestAnimationFrame ||
	          function (callback) {
	            window.setTimeout(callback, 1000 / 60);
	          }
	        );
	      })();

	    var $wrapper = $(
	      '<svg width="' +
	        W +
	        '" height="' +
	        H +
	        '" viewBox="0 0 ' +
	        W +
	        " " +
	        H +
	        '" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"></svg>'
	    ).appendTo($this);
	    var $groups = [],
	      $pies = [],
	      $lightPies = [],
	      easingFunction = animationOptions[settings.animationEasing],
	      pieRadius = Min([H / 2, W / 2]) - settings.edgeOffset,
	      segmentTotal = 0;

	    //Draw base circle
	    var drawBasePie = (function () {
	      var base = document.createElementNS(
	        "http://www.w3.org/2000/svg",
	        "circle"
	      );
	      var $base = $(base).appendTo($wrapper);
	      base.setAttribute("cx", centerX);
	      base.setAttribute("cy", centerY);
	      base.setAttribute("r", pieRadius + settings.baseOffset);
	      base.setAttribute("fill", settings.baseColor);
	    })();

	    //Set up pie segments wrapper
	    var pathGroup = document.createElementNS("http://www.w3.org/2000/svg", "g");
	    var $pathGroup = $(pathGroup).appendTo($wrapper);
	    $pathGroup[0].setAttribute("opacity", 0);

	    //Set up tooltip
	    var $tip = $('<div class="' + settings.tipClass + '" />')
	        .appendTo("body")
	        .hide(),
	      tipW = $tip.width(),
	      tipH = $tip.height();

	    for (var i = 0, len = data.length; i < len; i++) {
	      segmentTotal += data[i].value;
	      var g = document.createElementNS("http://www.w3.org/2000/svg", "g");
	      g.setAttribute("data-order", i);
	      g.setAttribute("class", settings.pieSegmentGroupClass);
	      $groups[i] = $(g).appendTo($pathGroup);
	      $groups[i]
	        .on("mouseenter", pathMouseEnter)
	        .on("mouseleave", pathMouseLeave)
	        .on("mousemove", pathMouseMove)
	        .on("click", pathClick);

	      var p = document.createElementNS("http://www.w3.org/2000/svg", "path");
	      p.setAttribute("stroke-width", settings.segmentStrokeWidth);
	      p.setAttribute("stroke", settings.segmentStrokeColor);
	      p.setAttribute("stroke-miterlimit", 2);
	      p.setAttribute("fill", data[i].color);
	      p.setAttribute("class", settings.pieSegmentClass);
	      $pies[i] = $(p).appendTo($groups[i]);

	      var lp = document.createElementNS("http://www.w3.org/2000/svg", "path");
	      lp.setAttribute("stroke-width", settings.segmentStrokeWidth);
	      lp.setAttribute("stroke", settings.segmentStrokeColor);
	      lp.setAttribute("stroke-miterlimit", 2);
	      lp.setAttribute("fill", data[i].color);
	      lp.setAttribute("opacity", settings.lightPiesOpacity);
	      lp.setAttribute("class", settings.lightPieClass);
	      $lightPies[i] = $(lp).appendTo($groups[i]);
	    }

	    settings.beforeDraw.call($this);
	    //Animation start
	    triggerAnimation();

	    function pathMouseEnter(e) {
	      var index = $(this).data().order;
	      $tip.text(data[index].title + ": " + data[index].value).fadeIn(200);
	      if ($groups[index][0].getAttribute("data-active") !== "active") {
	        $lightPies[index].animate({ opacity: 0.8 }, 180);
	      }
	      settings.onPieMouseenter.apply($(this), [e, data]);
	    }
	    function pathMouseLeave(e) {
	      var index = $(this).data().order;
	      $tip.hide();
	      if ($groups[index][0].getAttribute("data-active") !== "active") {
	        $lightPies[index].animate({ opacity: settings.lightPiesOpacity }, 100);
	      }
	      settings.onPieMouseleave.apply($(this), [e, data]);
	    }
	    function pathMouseMove(e) {
	      $tip.css({
	        top: e.pageY + settings.tipOffsetY,
	        left: e.pageX - $tip.width() / 2 + settings.tipOffsetX
	      });
	    }
	    function pathClick(e) {
	      var index = $(this).data().order;
	      var targetGroup = $groups[index][0];
	      for (var i = 0, len = data.length; i < len; i++) {
	        if (i === index) continue;
	        $groups[i][0].setAttribute("data-active", "");
	        $lightPies[i].css({ opacity: settings.lightPiesOpacity });
	      }
	      if (targetGroup.getAttribute("data-active") === "active") {
	        targetGroup.setAttribute("data-active", "");
	        $lightPies[index].css({ opacity: 0.8 });
	      } else {
	        targetGroup.setAttribute("data-active", "active");
	        $lightPies[index].css({ opacity: 1 });
	      }
	      settings.onPieClick.apply($(this), [e, data]);
	    }
	    function drawPieSegments(animationDecimal) {
	      var startRadius = -PI / 2, //-90 degree
	        rotateAnimation = 1;
	      if (settings.animation) {
	        rotateAnimation = animationDecimal; //count up between0~1
	      }

	      $pathGroup[0].setAttribute("opacity", animationDecimal);

	      //draw each path
	      for (var i = 0, len = data.length; i < len; i++) {
	        var segmentAngle =
	            rotateAnimation * ((data[i].value / segmentTotal) * (PI * 2)), //start radian
	          endRadius = startRadius + segmentAngle,
	          largeArc = (endRadius - startRadius) % (PI * 2) > PI ? 1 : 0,
	          startX = centerX + cos(startRadius) * pieRadius,
	          startY = centerY + sin(startRadius) * pieRadius,
	          endX = centerX + cos(endRadius) * pieRadius,
	          endY = centerY + sin(endRadius) * pieRadius,
	          startX2 =
	            centerX + cos(startRadius) * (pieRadius + settings.lightPiesOffset),
	          startY2 =
	            centerY + sin(startRadius) * (pieRadius + settings.lightPiesOffset),
	          endX2 =
	            centerX + cos(endRadius) * (pieRadius + settings.lightPiesOffset),
	          endY2 =
	            centerY + sin(endRadius) * (pieRadius + settings.lightPiesOffset);
	        var cmd = [
	          "M",
	          startX,
	          startY, //Move pointer
	          "A",
	          pieRadius,
	          pieRadius,
	          0,
	          largeArc,
	          1,
	          endX,
	          endY, //Draw outer arc path
	          "L",
	          centerX,
	          centerY, //Draw line to the center.
	          "Z" //Cloth path
	        ];
	        var cmd2 = [
	          "M",
	          startX2,
	          startY2,
	          "A",
	          pieRadius + settings.lightPiesOffset,
	          pieRadius + settings.lightPiesOffset,
	          0,
	          largeArc,
	          1,
	          endX2,
	          endY2, //Draw outer arc path
	          "L",
	          centerX,
	          centerY,
	          "Z"
	        ];
	        $pies[i][0].setAttribute("d", cmd.join(" "));
	        $lightPies[i][0].setAttribute("d", cmd2.join(" "));
	        startRadius += segmentAngle;
	      }
	    }

	    var animFrameAmount = settings.animation ? 1 / settings.animationSteps : 1, //if settings.animationSteps is 10, animFrameAmount is 0.1
	      animCount = settings.animation ? 0 : 1;
	    function triggerAnimation() {
	      if (settings.animation) {
	        requestAnimFrame(animationLoop);
	      } else {
	        drawPieSegments(1);
	      }
	    }
	    function animationLoop() {
	      animCount += animFrameAmount; //animCount start from 0, after "settings.animationSteps"-times executed, animCount reaches 1.
	      drawPieSegments(easingFunction(animCount));
	      if (animCount < 1) {
	        requestAnimFrame(arguments.callee);
	      } else {
	        settings.afterDrawed.call($this);
	      }
	    }
	    function Max(arr) {
	      return Math.max.apply(null, arr);
	    }
	    function Min(arr) {
	      return Math.min.apply(null, arr);
	    }
	    return $this;
	  };
	})(jQuery);

</script>
<p class="p-container">
 <a href = "admin.jsp" class = "button">BACK</a>
</body>
</html>