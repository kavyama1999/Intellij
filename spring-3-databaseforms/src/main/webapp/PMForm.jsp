<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">

<script src="/winter_database/js/contact.js"></script>

<!---<script src="/winter_database/js/event.js"></script>--!>


<style>
        .custom-card-header {
            height: 100px;
            width: 300px;
            display: flex;
            justify-content: center;
            align-items: center;
        }
    </style>
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

                	         	 <a class="navbar-brand  text-white" href="PMSearch.jsp"><b>PM Search</b></a>

        </div>
       </nav>


       <div class="card border-dark container   mt-5 mb-5 justify-content-center" >
         <div class="card-header"> <h3><b><center>PM Form</center></b></h3>
       </div>

                <!---<h1><center>PM Form</center></h1>--->

         <div class="card-body text-dark">
${pmdto}
                     <form action="pm" method="post">
      <input type="hidden" name="id" value="${pmdto.id !=null ? pmdto.id:''}"

<!----//within page we need response we can use this line..
//if we need another page to response the create another result page--!>

                <div class="text-primary">${msg}</div>

<span style="color:red;">
                    <c:forEach items="${errors}" var="objectError">
                        ${objectError.defaultMessage}<br>
                    </c:forEach>
                </span>



<div class="row mb-3">
                    <span id="nameError"></span><br>
                    <label for="name" class="form-label"><b>Name:</b></label>
                    <input type="text" class="form-control" id="name" onblur="nameValidation()" name="name" value="${pmdto.name}">
               </div>


               <div class="row mb-3">
                                  <span id="countryError"></span><br>
                               <label for="country" class="form-label"><b>Country:</b></label>
                                   <input type="text" class="form-control" id="country" onblur="countryValidation()" name="country" value="${pmdto.country}">
                            </div>

                      <div class="row mb-3">
                                          <span id="errordate"></span><br>
                                          <label for="dob" class="form-label"><b>DOB:</b></label>
                                          <input type="date" class="form-control" id="dob" value="${pmdto.dob}" onblur="dobValidation()" name="dob">
                                      </div>



                    <div>
                    <span id="aliveError"></span><br>
                    </div>


               <b>Alive:</b>
                <div class="container">
                    <div class="row mb-3">


                        <div class="col-auto">
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="alive" ${pmdto.alive eq 'Yes' ? 'checked' : ''} value="Yes" id="alive" onclick="aliveValidation()">
                                <label class="form-check-label" for="alive">Yes</label>
                            </div>
                        </div>



                       <div class="col-auto">
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="alive" id="alive" ${pmdto.alive eq 'No' ? 'checked' : ''} value="No" onclick="aliveValidation()">
                                <label class="form-check-label" for="alive">No</label>
                            </div>
                        </div>



                    </div>
                </div>


<div>
<span  id="confirmError"></span>
  <label  for="confirm" class="list-group-item">
<input name="confirm"  id="confirm"  onchange="confirmValidation()"  class="form-check-input me-1" type="checkbox"  value="confirm"   ${pmdto.confirm eq 'confirm' ? 'checked' : ''}>
<b>Confirm</b>
     </label>
    </div><br>

              <div>
                  <input type="submit" id="submit" value="Apply"  >
              </div>


            </form>
         </div>
       </div><br>

       </body>
       </html>
