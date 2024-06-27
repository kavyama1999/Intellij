 let fieldsChecks = {



                "firstName": false,
                "lastName": false,
                "email": false,
                "contactNumber": false,
                "alternateContactNumber": false,
                "address": false,
                "agree": false


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
                let error = document.getElementById("firstNameError");
                let nameRegex = /^[A-Za-z ]+$/;

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
                            let error = document.getElementById("lastNameError");
                            let nameRegex = /^[A-Za-z ]+$/;

                         //let nameRegex = /^[A-Za-z ]+$/;


    if (element.value.length > 1 && element.value.length <= 20 && nameRegex.test(element.value)) {
                                error.innerHTML = "";
                                fieldsChecks["lastName"] = true;
                            } else {
                                error.innerHTML = "Invalid name. Name should be alphabetic characters only and length should be greater than 1 and less than 3.";
                                error.style.color = "red";
                                fieldsChecks["lastName"] = false;
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


//Contact Number

  function contactNumberValidation() {
      let element = document.getElementById("contactNumber");
      let error = document.getElementById("contactNumberError");

      // Regular expression pattern for validating a 10-digit mobile number
      let mobileRegex = /^\d{10}$/;

      // Check if the mobile number is valid
      if (mobileRegex.test(element.value)) {

          // Mobile number is valid
          error.innerHTML = "";
          fieldsChecks["contactNumber"] = true;
      } else {
          // Mobile number is invalid

          error.innerHTML = "Invalid contactNumber number. It should be exactly 10 digits.";
          error.style.color = "red";
          fieldsChecks["contactNumber"] = false;
      }
      validateAndEnableSubmit();
  }



//AlternateContactNumber

  function alternateContactNumberValidation() {
      let element = document.getElementById("alternateContactNumber");
      let error = document.getElementById("altContactNbrError");

      // Regular expression pattern for validating a 10-digit mobile number
      let mobileRegex = /^\d{10}$/;

      // Check if the mobile number is valid
      if (mobileRegex.test(element.value)) {

          // Mobile number is valid
          error.innerHTML = "";
          fieldsChecks["alternateContactNumber"] = true;
      } else {
          // Mobile number is invalid

          error.innerHTML = "Invalid contactNumber number. It should be exactly 10 digits.";
          error.style.color = "red";
          fieldsChecks["alternateContactNumber"] = false;
      }
      validateAndEnableSubmit();
  }


//address
        function addressValidation() {
            let element = document.getElementById("address");
            let error = document.getElementById("addressError");

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






//gender
//        function genderValidation() {
//            let genders = document.getElementsByName("gender");
//            let error = document.getElementById("errorregender");
//            let selected = false;
//
//            for (let gender of genders) {
//                if (gender.checked) {
//                    selected = true;
//                    break;
//                }
//            }
//
//            if (selected) {
//                error.innerHTML = "";
//                fieldsChecks["gender"] = true;
//            } else {
//                error.innerHTML = "Please select a gender";
//                error.style.color = "red";
//                fieldsChecks["gender"] = false;
//            }
//            validateAndEnableSubmit();
//        }




 //Confirm

              function agreeValidation() {
            let element = document.getElementById("agree");
         let error = document.getElementById("agreeError");

         if (element.checked) {
         error.innerHTML = "";
        fieldsChecks["agree"] = true;
        }
        else
        {
       error.innerHTML = "Please Agree.";
       error.style.color = "red";
       fieldsChecks["agree"] = false;
       }

       validateAndEnableSubmit();

   }
