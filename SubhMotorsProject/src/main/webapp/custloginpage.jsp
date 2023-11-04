<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="customer.CustomerBean"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
	
	
</head>
<body class="container-fluid">

<header class="d-flex justify-content-center bg-danger text-white p-2">

		<div>
			<span class="me-3">CONNECT FOR TRACTOR EXCHANGE</span> <span
				class="me-3">CONNECT WITH OUR CUSTOMERS</span> <span class="me-3">TESTIMONIALS</span>
			<span class="me-3">COMPARE TRACTOR</span> <span class="me-3">TAKE
				A TOUR</span> <span class="me-3">|</span> <span
				class="bi bi-translate me-3"></span> <span class="me-3">English</span>
		</div>

	</header>
	<header
		class="d-flex justify-content-between bg-white text-black p-2 mt-2">
		<div style="widht: 8px">
			<h3 class="fw-bold text-danger">POWERTRAC</h3>
		</div>
		<div class="d-flex justify-content-between">
				<a title="Home" class="nav-link" href=clog><span class="me-3">HOME</span></a> 
				<a class="nav-link" href="aboutUs.html"><span class="me-3">ABOUT US</span></a>
				<a title="OUR TRACTORS" class="nav-link" href=AllProdut.html><span class="me-3">OUR TRACTORS</span></a>
				<span class="me-3">OFFERS</span> 
				<span class="me-3">FIND A DEALER</span> 
				<span class="me-3">GETPRICE</span>
				
		</div>
		<div>
			<span class="bi bi-search me-3"></span> <span
				class="bi bi-whatsapp me-3"></span>
				
		</div>
	</header>
	<div style="width:1400px;height:100px;background-color:#f4f4f4" class="mt-2 p-2 ms-2 border rounded d-flex justify-content-center ">

	
	<dd><button class="btn btn-outline-primary  mt-4"><a class="nav-link" href=cview>View Profile</a></button></dd>
	<dd><button class="btn btn-outline-warning ms-4  mt-4"><a class="nav-link" href=product>Your Product Deatils</a></button></dd>
	<dd><button class="btn btn-outline-success ms-4 mt-4"><a class="nav-link" href=cedit>Edit Profile</a></button></dd> 	
	<dd><button class="btn btn-outline-primary ms-4 mt-4"><a class="nav-link" href=CustomerPayment.jsp>Payment</a></button></dd>
	<dd><button class="btn btn-outline-danger ms-4 mt-4"><a class="nav-link" href=clog>Logout</a></button></dd>
	
		
	</div>
	<% 
	CustomerBean cb = (CustomerBean)session.getAttribute("cbean");
	if(cb==null)
		out.println("Session Expired ..");
	%>
	<div class="d-flex justify content-between mt-4" style=height:300px>
	
					<div class="mt-4" style=height:300px;width:300px>
						<a href=434.html><img src="images/434.png" style=height:200px class="d-block"></a>
					<h3 class="fw-bold">434-Plus-Powerhouse-RHS</h3>
					</div>
					<div class="mt-4" style=height:300px;width:300px>
						<a href=Euro55.html><img src="images/Euro55.png" style=height:200px class="d-block"></a>
						<center><h3 class="fw-bold">EURO 55 NEXT 4WD</h3></center>
					</div>
					<div class="mt-4" style=height:300px;width:300px>
						<a href=Euro50.html><img src="images/Euro50.png" style=height:200px class="d-block"></a>
						<center><h3 class="fw-bold">EURO 50 PLUS NEXT 4WD</h3></center>
					</div>
					<div class="mt-4" style=height:300px;width:300px>
						<a href=439.html><img src="images/439-Plus.png" style=height:200px class="d-block"></a>
						<center><h3 class="fw-bold">POWERTRAC 439 PLUS POWERHOUSE</h3></center>
					</div>
					<div class="mt-4 " style=height:300px;width:300px>
						<a href=439rdx.html><img src="images/439-RDX.png" style=height:200px class="d-block"></a>
						<center><h3 class="fw-bold">POWERTRAC 439 RDX</h3></center>
					</div>
	
	
	
	
	
	
	</div>
	
	
	
	
	
<header
		class="d-flex justify-content-center bg-danger text-white p-4 mt-4">

		<div class="d-flex justify-content-center">

			<span class="me-3">By Power : </span> <span class="me-3">Select
				dropdown</span> <span class="me-3">By Series : </span> <span class="me-3">Select
				dropdown</span> <span class="me-3">By Sorting : </span> <span class="me-3">Default</span>
	</header>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
		crossorigin="anonymous"></script>




</body>
</html>