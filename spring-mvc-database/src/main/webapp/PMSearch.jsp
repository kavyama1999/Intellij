

<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">

<!---<script src="/winter_database/js/event.js"></script>--!>

 </head>
<body>
<nav class="navbar navbar-dark bg-dark">
    <div class="container-fluid">
        <div class="navbar-header">
            <!-- Add your logo here -->
            <a class="navbar-brand" href="#">
                <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="xworkz" width="140" height="70">
            </a>
            <!-- End of logo -->

            <a class="navbar-brand text-white" href="index.jsp"><b>Home</b></a>
           <!--<a href="collegeUniform.jsp" <span  class="navbar-brand mb-0 h1">CollegeUniformForm</span></a>--!>

        </div>
    </div>
</nav>

<div class="container   mt-5 w-100  mb-5 d-flex justify-content-center" ">

    <div class="card p-4 ">
        <div class="card-body">


            <form action="pmdatasearch" method="post">

            <div class="row mb-3">
                                <span id="nameError"></span><br>
                                <label for="name" class="form-label"><b>Name:</b></label>
                                <input type="text" class="form-control" id="name" onblur="nameValidation()" name="name" value="${pmdto.name}">
                           </div>



  <input type="submit" id="submit" value="Submit" >
               </div>

            </form>

        </div>
    </div>
</div>


<!--for table to display--!>


<div class="container   mt-5   mb-5 d-flex justify-content-center">

    <div class="card p-4 ">
        <div class="card-body">

     <!-- <strong style="color:green;">Search result for,${PMName}</strong>--!>


                <div class="text-primary">${PMName}</div>



               <!-- <div class="text-primary">${listOfPmDetails}</div>--!>







        <table class="table">
          <thead>

            <tr>

              <th scope="col">ID</th>
              <th scope="col">PM_Name </th>
              <th scope="col">country </th>
              <th scope="col">DOB</th>
              <th scope="col">Alive</th>
               <th scope="col">Edit</th>
               <th scope="col">Delete</th>




            </tr>


          </thead>

          <tbody>
               <c:forEach items="${listOfPmDetails}" var="pmData">

                <!--var can be anything---!>


                      <tr>

           <td>${pmData.id}</td>

        <td>${pmData.name}</td>
        <td>${pmData.country}</td>
        <td>${pmData.dob}</td>
        <td>${pmData.alive}</td>
        <td> <a href="pm-edit?id=${pmData.id}">Edit</td>
                <td> <a href="pm-delete?id=${pmData.id}">Delete</td>

                      </tr>


<!--jstl tag to print all details--!>

               </c:forEach>

          </tbody>
        </table>


 </div>
    </div>
</div>


