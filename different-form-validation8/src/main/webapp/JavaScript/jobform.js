 let fieldsChecks = {
                "firstName": false,
                "lastName": false,
                "email": false,
                "mobile": false,
                "interview": false,
                "gender": false,
                "address": false,
                "confirmed":false,
                "cmf":false

            };


            function validateAndEnableSubmit() {
                let flag = false;

                for (let [key, value] of Object.entries(fieldsChecks)) {
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

    //FirstName
            function firstNameValidation() {
                let element = document.getElementById("firstName");
                let error = document.getElementById("firstnameerror");
                let nameRegex = /^[A-Za-z]+$/;

                if (element.value.length > 3 && element.value.length < 30 && nameRegex.test(element.value)) {
                    error.innerHTML = "";
                    fieldsChecks["firstName"] = true;
                } else {
                    error.innerHTML = "Invalid name. Name should be alphabetic characters only and length should be greater than 3 and less than 30.";
                    error.style.color = "red";
                    fieldsChecks["firstName"] = false;
                }
                validateAndEnableSubmit();
            }


            //LastName
                        function lastNameValidation() {
                            let element = document.getElementById("lastName");
                            let error = document.getElementById("lastnameerror");
                            let nameRegex = /^[A-Za-z]+$/;

    if (element.value.length > 1 && element.value.length <= 3 && nameRegex.test(element.value)) {
                                error.innerHTML = "";
                                fieldsChecks["lastName"] = true;
                            } else {
                                error.innerHTML = "Invalid name. Name should be alphabetic characters only and length should be greater than 2 and less than 3.";
                                error.style.color = "red";
                                fieldsChecks["lastName"] = false;
                            }
                            validateAndEnableSubmit();
                        }

//Email

  function emailValidation() {
             let element = document.getElementById("email");
            let error = document.getElementById("erroremail");

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


//Mobile

  function mobileValidation() {
      let element = document.getElementById("mobile");
      let error = document.getElementById("errormobile");

      // Regular expression pattern for validating a 10-digit mobile number
      let mobileRegex = /^\d{10}$/;

      // Check if the mobile number is valid
      if (mobileRegex.test(element.value)) {

          // Mobile number is valid
          error.innerHTML = "";
          fieldsChecks["mobile"] = true;
      } else {
          // Mobile number is invalid

          error.innerHTML = "Invalid mobile number. It should be exactly 10 digits.";
          error.style.color = "red";
          fieldsChecks["mobile"] = false;
      }
      validateAndEnableSubmit();
  }


//Date

function dateValidation() {
      let element = document.getElementById("interview");
      let error = document.getElementById("errordate");

     if (element.value.length != "0") {
//if filled
          error.innerHTML = "";
          fieldsChecks["interview"] = true;
      } else {

          // id empty
          error.innerHTML = "Please Enter Date.";
          error.style.color = "red";
          fieldsChecks["interview"] = false;
      }
      validateAndEnableSubmit();
  }




//gender
        function genderValidation() {
            let genders = document.getElementsByName("gender");
            let error = document.getElementById("errorregender");
            let selected = false;

            for (let gender of genders) {
                if (gender.checked) {
                    selected = true;
                    break;
                }
            }

            if (selected) {
                error.innerHTML = "";
                fieldsChecks["gender"] = true;
            } else {
                error.innerHTML = "Please select a gender";
                error.style.color = "red";
                fieldsChecks["gender"] = false;
            }
            validateAndEnableSubmit();
        }



//address
        function addressValidation() {
            let element = document.getElementById("address");
            let error = document.getElementById("erroraddress");

            if (element.value.length > 3 && element.value.length < 300) {
                error.innerHTML = "";
                fieldsChecks["address"] = true;
            } else {
                error.innerHTML = "Characters should be greater than 3 and less than 30.";
                error.style.color = "red";
                fieldsChecks["address"] = false;
            }
            genderValidation()
            validateAndEnableSubmit();
        }


    //Technical Skills

            function confirmedValidation() {
                        let elements = document.getElementsByName("confirmed");
                        let error = document.getElementById("cmferror");
                        let selected = false;

                        for (let element of elements) {
                            if (element.checked) {
                                selected = true;
                                break;
                            }
                        }

                        if (selected) {
                            error.innerHTML = "";
                            fieldsChecks["confirmed"] = true;
                        } else {
                            error.innerHTML = "Please select at least one skill.";
                            error.style.color = "red";
                            fieldsChecks["confirmed"] = false;
                        }
                        validateAndEnableSubmit();
                    }


          <!----------------------------------------!>
              //Confirm

                         function confirmValidation() {
                                     let element = document.getElementById("cmf");
                                     let error = document.getElementById("errorconfirm");

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
