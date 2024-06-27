<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">

<script>
/*
let fieldsChecks = {

    "name": false,
    "email": false,
    "phone": false,
    "event": false,
    "date": false,
    "comment": false,
    "cmf":false

}

function validateAndEnableSubmit() {
    let flag = false;

    for (let value of Object.values(fieldsChecks)) {
        if (value === false) {
            flag = true;
            break;
        }
    }

    if (!flag) {
        document.getElementById("submit").removeAttribute("disabled");
    } else {
        document.getElementById("submit").setAttribute("disabled", "");
    }
}

// Name
function nameValidation() {
    let element = document.getElementById("name");
    let error = document.getElementById("nameError");
    let nameRegex = /^[A-Za-z]+$/;

    if (element.value.length > 3 && element.value.length < 30 && nameRegex.test(element.value)) {
        error.innerHTML = "";
        fieldsChecks["name"] = true;
    } else {
        error.innerHTML = "Invalid name. Name should be alphabetic characters only and length should be greater than 3 and less than 30.";
        error.style.color = "red";
        fieldsChecks["name"] = false;
    }
    validateAndEnableSubmit();
}

//Email

  function mailValidation() {
             let element = document.getElementById("email");
            let error = document.getElementById("emailError");

     <!----Regular expression pattern for validating email address--!>
    let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

      <!---Check if the email is valid--!>
    if (emailRegex.test(element.value)) {
           //Email is valid
       error.innerHTML = "";
      fieldsChecks["email"] = true;
       } else {
           //email is Invalid
          error.innerHTML = "Invalid email address.";
          error.style.color = "red";
          fieldsChecks["email"] = false;
         }
      validateAndEnableSubmit();
         }


//Phone_No

   function phoneValidation() {
       let element = document.getElementById("phone");
       let error = document.getElementById("phoneError");

       // Regular expression pattern for validating a 10-digit mobile number
       let mobileRegex = /^\d{10}$/;

       // Check if the mobile number is valid
       if (mobileRegex.test(element.value)) {

           // Mobile number is valid
           error.innerHTML = "";
           fieldsChecks["phone"] = true;
       } else {
           // Mobile number is invalid

           error.innerHTML = "Invalid mobile number. It should be exactly 10 digits.";
           error.style.color = "red";
           fieldsChecks["phone"] = false;
       }
       validateAndEnableSubmit();
   }

//Event

function eventValidation() {
    let element = document.getElementById("event");
    let error = document.getElementById("eventError");

    if (element.value.length != 0) {
        error.innerHTML = "";
        fieldsChecks["event"] = true;
    } else {
        error.innerHTML = "Please select CacheSize.";
        error.style.color = "red";
        fieldsChecks["event"] = false;
    }
    validateAndEnableSubmit();
}



//Date

function dateValidation() {
      let element = document.getElementById("date");
      let error = document.getElementById("dateError");

     if (element.value.length != "0") {
//if filled
          error.innerHTML = "";
          fieldsChecks["date"] = true;
      } else {

          // id empty
          error.innerHTML = "Please Enter Date.";
          error.style.color = "red";
          fieldsChecks["date"] = false;
      }
      validateAndEnableSubmit();
  }




//comment
        function commentValidation() {
            let element = document.getElementById("comment");
            let error = document.getElementById("commentError");

            if (element.value.length > 3 && element.value.length < 300) {
                error.innerHTML = "";
                fieldsChecks["comment"] = true;
            } else {
                error.innerHTML = "Characters should be greater than 3 and less than 30.";
                error.style.color = "red";
                fieldsChecks["comment"] = false;
            }
            genderValidation()
            validateAndEnableSubmit();
        }


               //Confirm

                         function confirmValidation() {
                                     let element = document.getElementById("cmf");
                                     let error = document.getElementById("confirmError");

                                     if (element.checked) {
                                         error.innerHTML = "";
                                         fieldsChecks["cmf"] = true;
                                     } else {
                                         error.innerHTML = "Please confirm.";
                                         error.style.color = "red";
                                         fieldsChecks["cmf"] = false;
                                     }
                                     validateAndEnableSubmit();
                                 }

*/
</script>
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

<div class="container mt-5 mb-5 d-flex justify-content-center">
    <div class="card p-4 ">
        <div class="card-body">

            <form action="contact" method="post">

                <h3><b>Contact Form</b></h3>

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
                    <input type="email" class="form-control" id="email" onblur="emailValidation()" name="email" value="${eventDTO.email}">
                </div>


<div class="row mb-3">
                    <span id="phoneError"></span><br>
                    <label for="phone" class="form-label"><b>Phone_No:</b></label>
                    <input type="text" class="form-control" id="phone" onblur="phoneValidation()" name="phone" value="${loginDTO.phone}">
                </div>

                <div class="row mb-3">
                    <span id="subjectError"></span><br>
                    <label for="subject" class="form-label"><b>Subject:</b></label>
                    <input type="text" class="form-control" id="subject" onblur="subjectValidation()" name="subject" value="${eventDTO.subject}">
                </div>


                <div class="mb-3">
                                    <span id="messageError"></span><br>
                                    <b>Message</b>
                                    <label for="message" class="form-floating"></label>
                                    <textarea class="form-control" placeholder="Leave a comment here" id="message" style="height: 100px" name="message" onblur="messageValidation()">${jobFormDTO.message} </textarea>
                                </div>


<div class="row mb-3">
                    <span id="contactMethodError"></span>
                    <label for="contactMethod" class="form-label"><b>Preferred Contact Method:</b></label>
                    <select class="form-select custom-select-width" id="contactMethod" onblur="contactMethodValidation()" name="contactMethod">
                        <option value="" ${computerPartsDTO.contactMethod == null ? 'selected' : ''}>Select</option>
                        <option value="Email" ${eventDTO.contactMethod == 'Email' ? 'selected' : ''}> Email</option>
                        <option value="Phone" ${eventDTO.contactMethod == 'Phone' ? 'selected' : ''}>Phone</option>
                    </select><br>
                </div>

<span  id="subscribeError"></span>
                                      <label  for="confirm" class="list-group-item">
                                              <input name="confirm"  id="confirm"  onchange="confirmValidation()"  class="form-check-input me-1" type="checkbox"  value="confirm"   ${eventDTO.confirm eq 'confirm' ? 'checked' : ''}>
                                                    Confirm:
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
