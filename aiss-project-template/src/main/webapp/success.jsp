<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link
	href="https://fonts.googleapis.com/css?family=Carter+One|Chewy|Wendy+One"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="styleSucces.css">


<title>Resultados de la busqueda</title>
</head>
<body>








	<div class="caja">
		<div class="infoJuego">
			<h4>${games.name}</h4>
			<img src="${games.image.mediumUrl}" width="350" height="400" /><br>
			
			<p></p>
			<h1>DESCRIPCION</h1>
			<p>${games.deck}</p>
			<h1>VIDEOS POPULARES</h1>
			<br> <br> <br> <br> <br> <br>



			<div class="videoYT1">
				<iframe height="200" width="400"
					src="https://www.youtube.com/embed/${ytVideo1}" frameborder="0"
					allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
					allowfullscreen="true"> </iframe>

				<div class="botonVideo1">



					<form action="YouTubeAddVideoController" method="post" id="addVideo">
						<div class="bottom_video1">
							<input type="hidden" name="cadenaIdVideo" value="${ytVideo1}" />
							
							
							<select name="cadenaIdLista" form="addVideo" class="placeholder" required>
							
							
								
								
								<c:forEach items="${requestScope.listaVideos}" var="item">
								
								<option value="${item.id}">${item.snippet.title}</option>
									
								
								</c:forEach>
							
</select>
							<input type="image" name="imageField"
								src="/images/botonAddYT.png" height="100 " />
						</div>
					</form>
				</div>
			</div>

<div class="videoYT2">
				<iframe height="200" width="400"
					src="https://www.youtube.com/embed/${ytVideo2}" frameborder="0"
					allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
					allowfullscreen="true"> </iframe>

				<div class="botonVideo2">



					<form action="YouTubeAddVideoController" method="post" id="addVideo2">
						<div class="bottom_video2">
							<input type="hidden" name="cadenaIdVideo" value="${ytVideo2}" />
							
							
							<select name="cadenaIdLista" form="addVideo2" class="placeholder" required>
							
							
								
								
								<c:forEach items="${requestScope.listaVideos}" var="item">
								
								<option value="${item.id}">${item.snippet.title}</option>
									
								
								</c:forEach>
							
</select>
							<input type="image" name="imageField"
								src="/images/botonAddYT.png" height="100 " />
						</div>
					</form>
				</div>
			</div>




		</div>



		<div class="videoTwitch">
			<div style="margin-bottom: 0px;">
				<legend>
					<img src="/images/twitch.png" />
				</legend>
				<iframe src="https://player.twitch.tv/?channel=${videos}"
					frameborder="0" allowfullscreen="true" scrolling="no" height="210"
					width="390"></iframe>
			</div>
			<p4> Streamer en directo: ${videos} </p4>


		
		
		<div class=" tablaJuego">

		<h2>Nombre</h2>
		<p>${games.name}</p>
		<h2>Plataformas</h2>
		<p>${plataformaJuego}</p>
		<h2>Fecha de lanzamiento</h2>
		<p>${fechaJuego}</p>
		<br>

	</div>
	</div>
</div>

	

	<div class=" tablaMenu">
		<p></p>
		<br>


		<button class="button ">
			<a href="/index.html">Inicio</a>
		</button>
		<br> <br> <br>
		<button class="button ">
			<a href="/inicio.jsp">Top 6 juegos</a>
		</button>
		<br> <br> <br>

		<button class="button ">
			<a href="${producto}"><img src="/images/walmart.png" width="210"
				height="50" /> <p1>Compra el juego o productos relacionados
				con el<p1></a>
		</button>
		<br> <br> <br>

	</div>




	<div class="imagenLook4">

		<img src="/images/logo1.png" width="200" height="200" alt="" />



	</div>



</body>
</html>


