<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">


<!---<script src="/spirng-3-databaseforms/js/event.js"></script>--!>


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

                	 <a class="navbar-brand  text-white" href="CountrySearch.jsp"><b>Country Search</b></a>

        </div>
       </nav>


       <div class="card border-dark container   mt-5 mb-5 justify-content-center" >
         <div class="card-header"> <h3><b><center>Country Form</center></b></h3>
       </div>

                <!---<h1><center>Contact Form</center></h1>--->

         <div class="card-body text-dark">

${countryDTO}
                     <form action="country" method="post">
     <!--<input type="hidden" name="id" value="${countryDTO.id != null ? countryDTO.id : ''}">--!>

      <input type="hidden" name="id" value="${countryDTO.id != null? countryDTO.id:''}">

<!----//within page we need response we can use this line..
//if we need another page to response the create another result page--!>

<!--msg getting another page and to see error in same page--!>

                <div class="text-primary">${msg}</div>

<span style="color:red;">
                    <c:forEach items="${errors}" var="objectError">
                        ${objectError.defaultMessage}<br>
                    </c:forEach>
                </span>


<div class="row mb-3">
                              <span id="countryNameError"></span>
                              <label for="countryName" class="form-label"><b>CountryName:</b></label>
                              <select class="form-select custom-select-width" id="countryName" onblur="countryNameValidation()" name="countryName">
                                  <option value="" ${countryDTO.countryName == null ? 'selected' : ''}>Select</option>

                  <option value="India" ${countryDTO.countryName == 'India' ? 'selected' : ''}> India</option>
                  <option value="Germany" ${countryDTO.countryName == 'Germany' ? 'selected' : ''}>Germany</option>
                  <option value="Italy" ${countryDTO.countryName == 'Italy' ? 'selected' : ''}> Italy</option>
                  <option value="Japan" ${countryDTO.countryName == 'Japan' ? 'selected' : ''}>Japan</option>
                  <option value="Mexico" ${countryDTO.countryName == 'Mexico' ? 'selected' : ''}> Mexico</option>
                  <option value="Russia" ${countryDTO.countryName == 'Russia' ? 'selected' : ''}>Russia</option>
                  <option value="Saudi Arabia" ${countryDTO.countryName == 'Saudi Arabia' ? 'selected' : ''}> Saudi Arabia</option>
                  <option value="China" ${countryDTO.countryName == 'China' ? 'selected' : ''}> China</option>
                  <option value="South Korea" ${countryDTO.countryName == 'Phone' ? 'selected' : ''}>South Korea</option>
                  <option value="Turkey" ${countryDTO.countryName == 'Turkey' ? 'selected' : ''}> Turkey</option>
                  <option value="United Kingdom" ${countryDTO.countryName == 'United Kingdom' ? 'selected' : ''}>United Kingdom</option>
                  <option value="France" ${countryDTO.countryName == 'France' ? 'selected' : ''}>France</option>


                              </select><br>
                          </div>




               <div class="row mb-3">
                                  <span id="populationError"></span><br>
                               <label for="population" class="form-label"><b>Population:</b></label>
                                   <input type="text" class="form-control" id="population" onblur="populationValidation()" name="population" value="${countryDTO.population}">
                            </div>

                            <div class="row mb-3">
                                                <span id="capitalCityError"></span><br>
                                                <label for="capitalCity" class="form-label"><b>CapitalCity:</b></label>
                                                <input type="text" class="form-control" id="capitalCity" onblur="capitalCityValidation()" name="capitalCity" value="${countryDTO.capitalCity}">
                                           </div>


<div class="row mb-3">
                    <span id="noOfStatesError"></span><br>
                    <label for="noOfStates" class="form-label"><b>NoOfStates:</b></label>
                    <input type="text" class="form-control" id="noOfStates" onblur="noOfStatesValidation()" name="noOfStates" value="${countryDTO.noOfStates}">
               </div>






<div>
<span  id="confirmError"></span>
  <label  for="confirm" class="list-group-item">
<input name="confirm"  id="confirm"  onchange="confirmValidation()"  class="form-check-input me-1" type="checkbox"  value="confirm"   ${countryDTO.confirm eq 'confirm' ? 'checked' : ''}>
<b>Confirm</b>
   </label>
     </div><br>

              <div>
                  <input type="submit" id="submit" value="Apply"  >
              </div>
            </form>
         </div>
       </div>

       </body>
       </html>
