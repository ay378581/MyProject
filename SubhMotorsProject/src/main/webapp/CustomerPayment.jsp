<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="customer.CustomerBean"
    errorPage="Error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment</title>
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
HttpSession hs = request.getSession(false);
if(hs==null){
%>
<jsp:forward page="custlogin.jsp"/>
<h1>
<%
}else{
	CustomerBean cb = (CustomerBean)session.getAttribute("cbean");
	out.println("Welcome :"+cb.getName());
%>
</h1>
<div class="d-flex justify-content-between" >
<div style=" width:500px;height:400px" class="ms-4 p-4">
 
			Name :  <%= cb.getName()%><br>
			Age : <%=cb.getAge()%><br>
			Address : <%=cb.getAdd()%><br>
			Pincode : <%=cb.getPin()%><br>
			State : <%=cb.getState()%><br>
			Item : <%=cb.getItem()%><br>
			Finance for Years : <%=cb.getYear()%><br>
			Price : <%=cb.getPrice()%><br>
			<a class="nav-link" href=cview><button class="btn btn-outline-primary mt-4">Check Status</button></a>
			
			
</div>
	<div style="width:500px;height:400px" class="me-4">
	<h3><font color=blue>
	<%
	String s = (String)request.getAttribute("msg");
	if(s!=null)
	out.println(s);
	%>
	</font>
	</h3>
	<h1 class="text-blue">Make Your Payment</h1><br><br>
	<dt>Per Month Premium :</dt> <h3><%= (cb.getPrice()- cb.getbAmount())/(cb.getYear()*12) %></h3>
	<form action=cpay method=post>
	<dt>Enter No. of Premium :</dt> <input type=number name=kist>
	<input onclick="alert(String s = prompt("Enter Password"))" type=submit class="btn btn-primary" ></button>
	</form>	
	</div>
</div>
<% } %>

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

