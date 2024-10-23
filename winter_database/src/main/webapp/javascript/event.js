
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
    //let nameRegex = /^[A-Za-z]+$/;
     let nameRegex = /^[A-Za-z ]+$/;  // Updated regex to include spaces


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
        error.innerHTML = "Please select Event.";
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
                error.innerHTML = "Characters should be greater than 3 and less than 500.";
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


