
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Scholarship Application Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">



</head>
<body>
    <nav class="navbar navbar-dark bg-dark">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">
                    <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="xworkz" width="140" height="70">
                </a>
                <a class="navbar-brand me-3 text-white" href="index.jsp"><b>Home</b></a>
            </div>
        </div>
    </nav>

    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card p-4">
            <div class="card-body">

                <form action="apply" method="post">

                    <h3><b>Job Application Form</b></h3>

                    <div class="text-primary">${msg}</div>
                                        <span style="color:red;">
                                            <c:forEach items="${errors}" var="objectError">
                                                ${objectError.defaultMessage}<br>
                                            </c:forEach>
                                        </span>



                    <div class="row mb-3">
                        <span id="firstnameerror"></span><br>
                        <label for="firstName" class="form-label"><b>First Name:</b></label>
                        <input type="text" class="form-control" value="${jobFormDTO.firstName}" id="firstName" name="firstName" onblur="firstNameValidation()">
                    </div>

<div class="row mb-3">
                        <span id="lastnameerror"></span><br>
                        <label for="lastName" class="form-label"><b>Last Name:</b></label>
                        <input type="text" class="form-control" value="${jobFormDTO.lastName}" id="lastName" name="lastName" onblur="lastNameValidation()">
                    </div>



 <div class="row mb-3">
                        <span id="erroremail"></span><br>
                        <label for="email" class="form-label"><b>Email:</b></label>
                        <input type="email" class="form-control" id="email" value="${jobFormDTO.email}" name="email" onblur="emailValidation()">
                    </div>



 <div class="row mb-3">
                    <span id="errormobile"></span><br>
                    <label for="mobile" class="form-label"><b>Mobile:</b></label>
                    <input type="text" class="form-control" id="mobile" value="${jobFormDTO.mobile}" name="mobile" onblur="mobileValidation()">
                </div>


<div class="row mb-3">
                    <span id="errordate"></span><br>
                    <label for="interview" class="form-label"><b>Preferred Interview Date:</b></label>
                    <input type="date" class="form-control" id="interview" value="${jobFormDTO.interviewDate}" onblur="dateValidation()" name="interviewDate">
                </div>



 <div>
                    <span id="errorregender"></span><br>
                </div>
                <b>Gender:</b>
                <div class="container">
                    <div class="row mb-3">
                        <div class="col-auto">
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="gender" ${jobFormDTO.gender eq 'Male' ? 'checked' : ''} value="Male" id="genderMale" onclick="genderValidation()">
                                <label class="form-check-label" for="genderMale">Male</label>
                            </div>
                        </div>
                        <div class="col-auto">
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="gender" id="genderFemale" ${jobFormDTO.gender eq 'Female' ? 'checked' : ''} value="Female" onclick="genderValidation()">
                                <label class="form-check-label" for="genderFemale">Female</label>
                            </div>
                        </div>
                        <div class="col-auto">
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="gender" id="genderOthers" ${jobFormDTO.gender eq 'Others' ? 'checked' : ''} value="Others" onclick="genderValidation()">
                                <label class="form-check-label" for="genderOthers">Others</label>
                            </div>
                        </div>
                    </div>
                </div>


<div class="mb-3">
                    <span id="erroraddress"></span><br>
                    <b>Address</b>
                    <label for="address" class="form-floating"></label>
                    <textarea class="form-control" placeholder="Leave a comment here" id="address" style="height: 100px" name="address" onblur="addressValidation()">${jobFormDTO.address} </textarea>
                </div>

<!------------------------------------------------!------------>
<div class="mb-3">
    <span id="cmferror"></span><br>
    <b>Technical Skills:</b>

    <label class="list-group-item">
        <input id="cmf1" name="confirmed" onchange="confirmedValidation()" class="form-check-input me-1" type="checkbox" value="Java"  ${jobFormDTO.confirmed eq 'confirmed' ? 'checked' : ''}>
        Java<br>
        <input id="cmf2" name="confirmed" onchange="confirmedValidation()" class="form-check-input me-1" type="checkbox" value="Web Development" ${jobFormDTO.confirm eq 'confirmed' ? 'checked' : ''}>
        Web Development<br>
        <input id="cmf3" name="confirmed" onchange="confirmedValidation()" class="form-check-input me-1" type="checkbox" value="SpringBoot" ${jobFormDTO.confirm eq 'confirmed' ? 'checked' : ''}>
        SpringBoot<br>
        <input id="cmf4" name="confirmed" onchange="confirmedValidation()" class="form-check-input me-1" type="checkbox" value="MySql" ${jobFormDTO.confirm eq 'confirmed' ? 'checked' : ''}>
        MySql<br>
    </label>
</div>




<div class="mb-3">



             <span  id="errorconfirm"></span>
                                      <label  for="cmf" class="list-group-item">
                                              <input name="confirm"  id="cmf"    onchange="confirmValidation()"  class="form-check-input me-1" type="checkbox"  value="confirm"   ${jobFormDTO.confirm eq 'confirm' ? 'checked' : ''}>
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
