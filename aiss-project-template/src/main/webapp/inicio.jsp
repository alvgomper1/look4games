<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Top 6 Juegos</title>


<c:if test='${empty sessionScope["YouTube-token"]}'>
    <c:redirect url = "/AuthController/YouTube"/>
</c:if>
	




<link rel="stylesheet" type="text/css" href="styleInicio.css"><link href="https://fonts.googleapis.com/css?family=Carter+One|Chewy|Wendy+One" rel="stylesheet">
</head>
<body>
	<div>
		<h1><FONT FACE="impact" SIZE=6 COLOR = "white">Busca un juego</FONT></h1>
		
	</div>

	<div id="searchDiv">
		<form id="searchForm" action="SearchController" method="post">
			<input type="text" name="searchQuery" required class="buscador" required/> <input
				type="submit" name="searchBtn" title="search" value="Buscar" class="buttonBuscar">
		</form>
	</div>





	<dl class="izq">

		<dd>

			<div class=" imgboxart">
				<img
					src="https://static.giantbomb.com/uploads/scale_small/8/87790/2115067-box_lol.png"
					width="350" height="400" alt="">
			</div>
			<div id = "infoJuegoIzq">
			<h3 class="title">LEAGUE OF LEGENDS</h3>
			<p class="date">OCT 27/2009</p>
			<form id="searchForm0" action="SearchController" method="post">
				<input type="hidden" value="league of legends" name="searchQuery" /> <input
					type="submit" name="searchBtn" title="search" value="Mas info" class="button">
			</form>
			</div>


		</dd> 
		<dd><br>
		<div class=" imgboxart">
				<img
					src="https://static.giantbomb.com/uploads/scale_small/0/3699/3012241-god%20of%20war%20%28ps4%29.jpg" 
					width="350" height="400" alt="">
			</div>
			<div id = "infoJuegoIzq1">
			<h3 class="title">GOD OF WAR</h3>
			<p class="date">APR 20/2018</p>
			<form id="searchForm0" action="SearchController" method="post">
				<input type="hidden" value="god of war" name="searchQuery" /> <input
					type="submit" name="searchBtn" title="search" value="Mas info" class="button">
			</form></div>

		</dd>
		<dd><br><div class=" imgboxart">
				<img
					src="https://static.giantbomb.com/uploads/scale_small/0/3699/2920671-horizon%20-%20zero%20dawn%20v2.jpg"
					width="350" height="400" alt="">
			</div>
	
			<div id = "infoJuegoIzq">
			<h3 class="title">HORIZON ZERO DOWN</h3>
			<p class="date">FEB 28/2017</p>
			<form id="searchForm0" action="SearchController" method="post">
				<input type="hidden" value="horizon zero dawn" name="searchQuery" /> <input
					type="submit" name="searchBtn" title="search" value="Mas info" class="button">
			</form></div>

		</dd>
	</dl>

	<dl class="der">

		<dd>

			<div class=" imgboxart">
				<img
					src="https://static.giantbomb.com/uploads/original/8/87790/2952214-box_fn.png"
					width="350" height="400"  alt="">
			</div>
			<div id = "infoJuegoDer">
			<h3 class="title">FORTNITE</h3>
			<p class="date">JUL 25/2017</p>

			<form id="searchForm0" action="SearchController" method="post">
				<input type="hidden" value="fortnite" name="searchQuery" /> <input
					type="submit" name="searchBtn" title="Mas info" value="Mas info" class="button">
			</form></div>

		</dd>
		<dd><br><div class=" imgboxart">
				<img
					src="https://static.giantbomb.com/uploads/scale_small/1/13692/2302957-i2cs9uzmq4yua.jpg"
					width="350" height="400"  alt="">
			</div>
			<div id = "infoJuegoDer1">
			<h3 class="title">COUNTER STRIKE:GO</h3>
			<p class="date">AUG 21/2012</p>

			<form id="searchForm0" action="SearchController" method="post">
				<input type="hidden" value="counter strike global offensive" name="searchQuery" /> <input
					type="submit" name="searchBtn" title="search" value="Mas info" class="button">
			</form></div></dd>
		<dd><br><div class=" imgboxart">
				<img
					src="https://static.giantbomb.com/uploads/scale_small/8/82063/3036186-9413812974-0fa98.jpg"
					width="350" height="400"  alt="">
			</div>
			<div id = "infoJuegoDer2">
			<h3 class="title">SUPER SMASH BROS ULTIMATE</h3>
			<p class="date">DEC 07/2018</p>

			<form id="searchForm0" action="SearchController" method="post">
				<input type="hidden" value="super smash bross ultimate" name="searchQuery" /> <input
					type="submit" name="searchBtn" title="search" value="Mas info" class="button">
			</form></div></dd>
	</dl>








 

</body>
</html>