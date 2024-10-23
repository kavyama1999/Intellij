
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
        </div>
    </div>
</nav>

<div class="container   mt-5   mb-5 d-flex justify-content-center">

    <div class="card p-4 ">
        <div class="card-body">

            <form action="search" method="post">

                <h3><b>Event Registration Form</b></h3>

                <div class="text-primary">${msg}</div>
                <span style="color:red;">
                    <c:forEach items="${errors}" var="objectError">
                        ${objectError.defaultMessage}<br>
                    </c:forEach>
                </span>





                <div class="row mb-3">
                    <span id="nameError"></span><br>
                    <label for="name" class="form-label"><b>Name:</b></label>
                    <input type="text" class="form-control" id="name" onblur="nameValidation()" name="name" value="${eventDTO.name}">
                </div>



                <div class="row mb-3">
                    <span id="emailError"></span><br>
                    <label for="email" class="form-label"><b>Email:</b></label>
                    <input type="text" class="form-control" id="email" onblur="mailValidation()" name="email" value="${eventDTO.email}">
                </div>



                <div class="row mb-3">
                    <span id="phoneError"></span><br>
                    <label for="phone" class="form-label"><b>Phone_No:</b></label>
                    <input type="text" class="form-control" id="phone" onblur="phoneValidation()" name="phone" value="${eventDTO.phone}">
                </div>


                <div class="row mb-3">
                    <span id="eventError"></span>
                    <label for="event" class="form-label"><b>Event:</b></label>
                    <select class="form-select custom-select-width" id="event" onblur="eventValidation()" name="event">
                        <option value="" ${computerPartsDTO.color == null ? 'selected' : ''}>Select</option>
                        <option value="Conference" ${eventDTO.event == 'Conference' ? 'selected' : ''}>Conference</option>
                        <option value="Workshop" ${eventDTO.event == 'Workshop' ? 'selected' : ''}>Workshop</option>
                        <option value="Seminar" ${eventDTO.event == 'Seminar' ? 'selected' : ''}>Seminar</option>
                        <option value="Birthday" ${eventDTO.event == 'Birthday' ? 'selected' : ''}>Birthday</option>
                       <option value="Bachelor Party" ${eventDTO.event == 'Bachelor Party' ? 'selected' : ''}>Bachelor Party</option>
                       <option value="Reception Party" ${eventDTO.event == 'Reception Party' ? 'selected' : ''}>Reception Party</option>



                    </select><br>
                </div>


                <div class="row mb-3">
                                    <span id="dateError"></span><br>
                                    <label for="date" class="form-label"><b>Date:</b></label>
                                    <input type="date" class="form-control" id="date" onblur="dateValidation()" name="date"  min="2024-01-01" max="2025-12-31" value="${eventDTO.date}">
                                </div>





<span  id="confirmError"></span>
                                      <label  for="cmf" class="list-group-item">
                                              <input name="confirm"  id="cmf"  onchange="confirmValidation()"  class="form-check-input me-1" type="checkbox"  value="confirm"   ${eventDTO.confirm eq 'confirm' ? 'checked' : ''}>
                                                    Confirm
                                                   </label>
                                             </div>

              <div>
                  <input type="submit" id="submit" value="Apply" >
</div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
