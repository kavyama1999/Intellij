

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

            <form action="searched" method="post">

                <!--<h3><b>Event Registration Form</b></h3>--!>

                <!--<div class="text-primary">${EventName}</div>---!>

                <span style="color:red;">
                    <c:forEach items="${errors}" var="objectError">
                        ${objectError.defaultMessage}<br>
                    </c:forEach>
                </span>


<!--style="width:1000px;--!>


               <!-- <div class="row mb-3">
                    <span id="nameError"></span><br>
                    <label for="name"  class="form-label"><b>Name:</b></label>
                    <input type="text" class="form-control" id="name" onblur="nameValidation()" name="name" value="${eventDTO.name}">
                </div>--!>






 <div class="row mb-3">
                    <span id="eventError"></span>
                    <label for="event" class="form-label"><b>Event:</b></label>
                    <select class="form-select custom-select-width" id="event" onblur="eventValidation()" name="event">
                        <option value="" ${eventDTO.color == null ? 'selected' : ''}>Select</option>
                        <option value="Conference" ${eventDTO.event == 'Conference' ? 'selected' : ''}>Conference</option>
                        <option value="Workshop" ${eventDTO.event == 'Workshop' ? 'selected' : ''}>Workshop</option>
                        <option value="Seminar" ${eventDTO.event == 'Seminar' ? 'selected' : ''}>Seminar</option>
                        <option value="Birthday" ${eventDTO.event == 'Birthday' ? 'selected' : ''}>Birthday</option>
                       <option value="Bachelor Party" ${eventDTO.event == 'Bachelor Party' ? 'selected' : ''}>Bachelor Party</option>
                       <option value="Reception Party" ${eventDTO.event == 'Reception Party' ? 'selected' : ''}>Reception Party</option>



                    </select><br>
                </div>

               <div>
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

     <!-- <strong style="color:green;">Search result for,${EventName}</strong>--!>



           <!--- <form action="searched" method="post">--!>

                <!--<h3><b>Event Registration Form</b></h3>--!>

                <div class="text-primary">${EventName}</div>

               <!--- <span style="color:red;">
                    <c:forEach items="${errors}" var="objectError">
                        ${objectError.defaultMessage}<br>
                    </c:forEach>
                </span>---!>





        <table class="table">
          <thead>

            <tr>

              <th scope="col">ID</th>
              <th scope="col">Candidate Name </th>
              <th scope="col">Candidate Email </th>
              <th scope="col">Phone_No</th>
              <th scope="col">EventName</th>
              <th scope="col">Event Date</th>
            </tr>


          </thead>

          <tbody>
               <c:forEach items="${listOfEvents}" var="events">

                <!--var can be anything---!>


                      <tr>

           <td>${events.id}</td>

        <td>${events.name}</td>
        <td>${events.email}</td>
        <td>${events.phone}</td>
        <td>${events.event}</td>
        <td>${events.date}</td>

                      </tr>


<!--jstl tag to print all details--!>

               </c:forEach>

          </tbody>
        </table>


 </div>
    </div>
</div>

</body>
</html>
