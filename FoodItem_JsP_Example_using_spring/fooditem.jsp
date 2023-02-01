<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

<style type="text/css">
.form-horizontal {
	margin: auto;
	width: 75%;
	margin-top:4%;
	border: thin black solid;
	padding: 20px 20px;
	border-radius: 15px;
}
</style>

</head>
<body>
	<nav class="navbar navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="105" height="55" class="d-inline-block align-text-top">

			</a>
			<form class="d-flex">


				<a href="index.jsp" class="btn btn-outline-warning">HOME</a>
			</form>

		</div>
	</nav>
	
	<form class="form-horizontal" method="post" action="taste">
	<div class="mb-3"><h2><em>Add items..</em></h2></div>
		<div class="mb-3">
			<label for="exampleInputname" class="form-label">Food Item
				Name:</label> <input class="form-control" type="text" placeholder="FoodName"
				aria-label="default input example" name="fname">
		</div>
		<div class="mb-3">
			<label for="exampleInputype" class="form-label">Food Type:</label> <select
				class="form-select" aria-label="Default select example" name="ftype">
				<option selected>Select...</option>
				<option value="Veg">Veg</option>
				<option value="Non-Veg">Non-Veg</option>
				<option value="Both">Both</option>
			</select>
		</div>
		<div class="mb-3">
			<label for="customRange3" class="form-label">Quantity:</label> <input
				type="range" class="form-range" min="1" max="10" step="1"
				id="customRange3" name="fquantity">
		</div>
		<div class="mb-3">
			<label for="exampleInputPrice" class="form-label">Price:</label> <input
				class="form-control" type="text" placeholder="Price"
				aria-label="default input example" name="fprice">

		</div>





		<button type="submit" class="btn btn-primary">Submit</button>
	</form>

</body>
</html>