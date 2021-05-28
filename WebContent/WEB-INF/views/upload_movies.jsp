<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">

<title>upload Movies</title>
</head>
<body>

	<div class="container mt-5">

		<h3 class="text-center">Upload Movie Form</h3>
		<form action="processform1" method="post">
		
			<div class="form-group">
				<label for="filmName" class="form-label">
				Film Name
				</label>
				<input
					type="text"
					class="form-control"
					id="filmName"
					aria-describedby="filmName"
					name="name">
			</div>
			
			<div class="form-group">
				<label for="filmType" class="form-label">
				Film Type
				</label>
				<input
					type="text"
					class="form-control"
					id="filmType"
					aria-describedby="filmType"
					name="type">
			</div>
			
			<div class="form-group">
				<label for="relDate" class="form-label">
				Release Date
				</label>
				<input
					type="date"
					class="form-control"
					id="relDate"
					aria-describedby="relDate"
					name="reldate">
			</div>
			
			<div class="form-group">
				<label for="leadActor" class="form-label">
				Lead Actor
				</label>
				<input
					type="text"
					class="form-control"
					id="leadActor"
					aria-describedby="leadActor"
					name="lead">
			</div>

			<div class="form-group">
				<label for="director" class="form-label">
				Director
				</label>
				<input
					type="text"
					class="form-control"
					id="director"
					aria-describedby="director"
					name="director">
			</div>

			<div class="from-group">
				<label for="genre" class="form-label">
				Genre
				</label> 
				<input
					type="text"
					class="form-control" 
					id="genre"
					aria-describedby="genre"
					name="genre">
			</div>
			
			<div class="form-group">
				<label for="length" class="form-label">
				Play Time
				</label>
				<input
					type="time"
					class="form-control"
					id="length"
					aria-describedby="length"
					name="length">
			</div>
			
			<div>Certificate
					<div class="form-check">
		  <input class="form-check-input" type="radio" name="certificate" id="flexRadioDefault1" value="U">
		  <label class="form-check-label" for="flexRadioDefault1">
		    U
		  </label>
		</div>
		<div class="form-check">
		  <input class="form-check-input" type="radio" name="certificate" id="flexRadioDefault2" value="UA" checked>
		  <label class="form-check-label" for="flexRadioDefault2">
		    U/A
		  </label>
		</div>
		<div class="form-check">
		  <input class="form-check-input" type="radio" name="certificate" id="flexRadioDefault2" value="A" checked>
		  <label class="form-check-label" for="flexRadioDefault2">
		    A
		  </label>
		</div>
		<div class="form-check">
		  <input class="form-check-input" type="radio" name="certificate" id="flexRadioDefault2" value="S" checked>
		  <label class="form-check-label" for="flexRadioDefault2">
		    S
		  </label>
		</div>
		</div>			
			
			<div class="form-group">
				<label for="description" class="form-label">
				Description
				</label>
				<input
					type="text"
					class="form-control"
					id="description"
					aria-describedby="description"
					name="description">
			</div>
			
			<div class="form-group">
				<label for="writer" class="form-label">
				Writer
				</label>
				<input
					type="text"
					class="form-control"
					id="writer"
					aria-describedby="writer"
					name="writer">
			</div>
			
			<div class="form-group">
				<label for="category" class="form-label">
				Category
				</label>
				<input
					type="text"
					class="form-control"
					id="category"
					aria-describedby="category"
					name="category">
			</div>
			
			<div class="form-group">
				<label for="relCountry" class="form-label">
				Release Countries
				</label>
				<input
					type="text"
					class="form-control"
					id="relCountry"
					aria-describedby="relCountry"
					name="relcountry">
			</div>
					
			<br>
			<div class="container text-center">
				<button type="submit" class="btn btn-success">
				Register
				</button>

			</div>
		</form>
	</div>




	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
    -->
</body>
</html>
