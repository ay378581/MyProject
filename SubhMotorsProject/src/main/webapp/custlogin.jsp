<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="customer.CustomerBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Login</title>
<link rel="icon" href="https://www.google.com/url?sa=i&url=https%3A%2F%2Flogosandtypes.com%2Falphabet%2Fletter-e%2Fescorts%2F&psig=AOvVaw0_A7rOnyQbUla9o0AO4_N5&ust=1678688474162000&source=images&cd=vfe&ved=0CA8QjRxqFwoTCPCBjfrf1f0CFQAAAAAdAAAAABAE" style="height:10px">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>

<header class="d-flex justify-content-center bg-danger text-white p-2">

		<div >
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
		<div class="d-flex justify-content-center">
				<a class="nav-link" href="homepage.html"> <span class="me-3">HOME</span><a class="nav-link" href="aboutUs.html"><span class="me-3">ABOUT US</span></a> <span
				class="me-3">OUR TRACTORS</span> <span class="me-3">OFFERS</span> <span
				class="me-3">FIND A DEALER</span> <span class="me-3">GET
				PRICE</span>
		</div>
		<div>
			<span class="bi bi-search me-3"></span> <span
				class="bi bi-whatsapp me-3"></span>
		</div>
	</header>
	<% 
String s = (String)request.getAttribute("msg");
if(s!=null) 
	out.println(s);

	CustomerBean cb = (CustomerBean)session.getAttribute("cbean");
	if(cb==null)
	%>
<h3>
</h3>
<div class="mt-4 p-2"><center>
<form action="clogin" method=post>
<label>User Name <span class="text-danger me-2">* </span></label><input type=text name=uname>
<label class="ms-4">Password <span class="text-danger me-2">* </span></label><input type=password name=pword>
<button class="btn btn-primary ms-4"><input type=submit value=login></button>
</form>
</center></div>
<div style="height:300px" class="mt-4">
		<img src="images/powertrac-values.jpg" class="rounded">
	</div>
	
	<header>
		<div style="height:200px;" class="d-flex justify-content-between bg-danger text-white p-2 mt-4">
			<div>
				<h3 class="fw-bold ms-4 mt-4">POWERTRAC</h3><br>
				<div class="d-flex justify-content-left">
				<h2><span class="bi bi-youtube ms-4 "></span></h2>
				<h2><span class="bi bi-facebook  ms-4"></span></h2>
				<h2><span class="bi bi-instagram ms-4"></span></h2>
				</div>
			</div>
			<div></div>
			<div></div>
		<div><br>
			<h6 class="mt-4">PRODUCTS & SERVICES</h6><br>
			Tractors<br>
			Compare Tractors
		</div>
			<div><br>
			<h6 class="mt-4">QUICK LINKS</h6><br>
			Request a demo<br>
			Find a dealer
		</div>
		<div><br>
			<h6 class="mt-4">COMPANY</h6><br>
			About Us<br>
			Terms of Use<br>
			Privacy Policy
		</div>
			<div></div>
		</div>
	</header>
	<footer>
		<div style="background-color:#cc0033;height:70px;"class="text-white">
		<br><h6 class=" ms-4">© 2022 Escorts Limited. All rights reserved.</h6>
		</div>
		
	</footer>
</body>
</html>