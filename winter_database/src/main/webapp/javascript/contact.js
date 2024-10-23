let fieldChecks=
{
"name":false,
"email":false,
"phone":false,
"subject":false,
"message":false,
"contactMethod":false,
"confirm":false
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

// Name Validation
function nameValidation() {
    let element = document.getElementById("name");
    let error = document.getElementById("nameError");
    let nameRegex = /^[A-Za-z\s]+$/;

    let name = element.value.trim();
    if (name.length > 3 && name.length < 30 && nameRegex.test(name)) {
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

  function emailValidation() {
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



// Subject
function subjectValidation() {
    let element = document.getElementById("subject");
    let error = document.getElementById("subjectError");
    let nameRegex = /^[A-Za-z]+$/;

    if (element.value.length > 3 && element.value.length < 500 && nameRegex.test(element.value)) {
        error.innerHTML = "";
        fieldsChecks["subject"] = true;
    } else {
        error.innerHTML = "subject should be alphabetic characters only and length should be greater than 3 and less than 30.";
        error.style.color = "red";
        fieldsChecks["subject"] = false;
    }
    validateAndEnableSubmit();
}


// Message
function messageValidation() {
    let element = document.getElementById("message");
    let error = document.getElementById("messageError");
    let nameRegex = /^[A-Za-z]+$/;

    if (element.value.length > 3 && element.value.length < 500 && nameRegex.test(element.value)) {
        error.innerHTML = "";
        fieldsChecks["message"] = true;
    } else {
        error.innerHTML = "message should be alphabetic characters only and length should be greater than 3 and less than 30.";
        error.style.color = "red";
        fieldsChecks["message"] = false;
    }
    validateAndEnableSubmit();
}


//Preferred contact method

function contactMethodValidation() {
    let element = document.getElementById("contactMethod");
    let error = document.getElementById("contactMethodError");

    if (element.value.length != 0) {
        error.innerHTML = "";
        fieldsChecks["contactMethod"] = true;
    } else {
        error.innerHTML = "Please select Preferred contact method.";
        error.style.color = "red";
        fieldsChecks["contactMethod"] = false;
    }
    validateAndEnableSubmit();
}


//Confirm

                         function confirmValidation() {
                                     let element = document.getElementById("confirm");
                                     let error = document.getElementById("confirmError");

                                     if (element.checked) {
                                         error.innerHTML = "";
                                         fieldsChecks["confirm"] = true;
                                     } else {
                                         error.innerHTML = "Please confirm.";
                                         error.style.color = "red";
                                         fieldsChecks["confirm"] = false;
                                     }
                                     validateAndEnableSubmit();
                                 }