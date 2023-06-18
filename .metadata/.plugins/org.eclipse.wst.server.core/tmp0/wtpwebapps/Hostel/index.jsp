<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>HostelHome</title>
<%@ include file="component/allcss.jsp" %>
</head>
<body>
<%@ include file="component/navbar.jsp" %>

<div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="img/hos1.jpg" class="d-block w-100" alt="..." height="500px">
    </div>
    <div class="carousel-item">
      <img src="img/hos2.jpg" class="d-block w-100" alt="..." height="500px">
    </div>
    <div class="carousel-item">
      <img src="img/hos3.jpg" class="d-block w-100" alt="..." height="500px">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>

<div class="container p-3">
<h1 class="text-center fs-2">Key Feature Of Hostel</h1>
<div class="card-columns">
  <div class="card bg-primary p-2 m-2 border-dark shadow rounded">
    <div class="card-body text-center">
      <p class="card-text font-weight-bold">100% Safety</p>
    </div>
  </div>
  <div class="card bg-secondary p-2 m-2 border-dark shadow rounded">
    <div class="card-body text-center">
      <p class="card-text font-weight-bold">Access to Campus Facilities:</p>
    </div>
  </div>
  <div class="card bg-success p-2 m-2 border-dark shadow rounded">
    <div class="card-body text-center">
      <p class="card-text">Clean Environment</p>
    </div>
  </div>
  <div class="card bg-danger p-2 m-2 border-dark shadow rounded">
    <div class="card-body text-center">
      <p class="card-text font-weight-bold">Resident Assistants</p>
    </div>
  </div>
  <div class="card bg-warning p-2 m-2 border-dark shadow rounded">
    <div class="card-body text-center">
      <p class="card-text font-weight-bold">Mess or Cafeteria</p>
    </div>
  </div>
  <div class="card bg-primary p-2 m-2 border-dark shadow rounded">
    <div class="card-body text-center">
      <p class="card-text font-weight-bold">Internet Connectivity</p>
    </div>
    
  </div>
  <div class="card bg-secondary p-2 m-2 border-dark shadow rounded">
    <div class="card-body text-center">
      <p class="card-text font-weight-bold">Laundry Facilities</p>
    </div>
  </div>
  <div class="card bg-info p-2 m-2 border-dark shadow rounded">
    <div class="card-body text-center">
      <p class="card-text font-weight-bold">Accommodation</p>
    </div>
  </div>
</div>
</div>
<hr>


<div class="container p-3">
<h1 class="text-center fs-2">Our Teams</p>
<div class="py-5 text-center text-info background-info" style="">
<div class="container">
<div class="row">
<div class="col-lg-4 col-md-6 p-4"> <img class="img-fluid d-block mb-3 mx-auto rounded-circle" alt="Card image cap" width="200" src="img/doc-1.jpg">
<h4 class="text-dark">Pankaj Goyal</h4>
<h4 class="mb-0 text-secondary">Hostel Manager</h4>
</div>
<div class="col-lg-4 col-md-6 p-4"> <img class="img-fluid d-block mb-3 mx-auto rounded-circle" src="img/doc-2.jpg" alt="Card image cap" width="200">
<h4 class="text-dark"></h4>
<h4 class="mb-0 text-secondary">Assistant Hostel Manager</h4>
</div>
<div class="col-lg-4 p-4"> <img class="img-fluid d-block mb-3 mx-auto rounded-circle" src="img/doc-3.jpg" width="200">
<h4 class="text-dark">Dr. Maria Samantha</h4>
<h4 class="mb-0 text-secondary">Hostel Representative</h4>
</div>
</div>
</div>
</div> 
</div>


<!-- Footer -->
<footer class="bg-dark text-center text-white">
  <!-- Grid container -->
  <div class="container p-4">
    <!-- Section: Social media -->
    <section class="mb-4">
      <!-- Facebook -->
      <a class="btn btn-outline-light btn-floating m-1" href="#!" role="button"
        ><i class="fab fa-facebook-f"></i
      ></a>

      <!-- Twitter -->
      <a class="btn btn-outline-light btn-floating m-1" href="#!" role="button"
        ><i class="fab fa-twitter"></i
      ></a>

      <!-- Google -->
      <a class="btn btn-outline-light btn-floating m-1" href="#!" role="button"
        ><i class="fab fa-google"></i
      ></a>

      <!-- Instagram -->
      <a class="btn btn-outline-light btn-floating m-1" href="#!" role="button"
        ><i class="fab fa-instagram"></i
      ></a>

      <!-- Linkedin -->
      <a class="btn btn-outline-light btn-floating m-1" href="#!" role="button"
        ><i class="fab fa-linkedin-in"></i
      ></a>

      <!-- Github -->
      <a class="btn btn-outline-light btn-floating m-1" href="#!" role="button"
        ><i class="fab fa-github"></i
      ></a>
    </section>
    <!-- Section: Social media -->

    <!-- Section: Form -->
    <section class="">
      <form action="">
        <!--Grid row-->
        <div class="row d-flex justify-content-center">
          <!--Grid column-->
          <div class="col-auto">
            <p class="pt-2">
              <strong>Sign up for our newsletter</strong>
            </p>
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-md-5 col-12">
            <!-- Email input -->
            <div class="form-outline form-white mb-4">
              <input type="email" id="form5Example21" class="form-control" />
              <label class="form-label" for="form5Example21">Email address</label>
            </div>
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-auto">
            <!-- Submit button -->
            <button type="submit" class="btn btn-outline-light mb-4">
              Subscribe
            </button>
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->
      </form>
    </section>
    <!-- Section: Form -->

    <!-- Section: Text -->
    <section class="mb-4">
      <p>
       At HostelHome, we believe that managing a hostel should be hassle-free and enjoyable. Our user-friendly interface and 
       intuitive features are designed to empower hostel administrators, allowing them to focus on providing exceptional
        hospitality and creating a welcoming environment for guests.

       
      </p>
    </section>
 
    <!-- Section: Links -->
  </div>
  <!-- Grid container -->

  <!-- Copyright -->
  <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
    � 2023 Copyright:
    <a class="text-white" href="index.jsp">HostelHome</a>
  </div>
  <!-- Copyright -->
</footer>
<!-- Footer -->


</body>
</html>