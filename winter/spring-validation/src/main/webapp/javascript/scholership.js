<script>
        let fieldsChecks = {
            "studentName": false,
            "fatherName": false,
            "college": false,
            "mobile": false,
            "dates": false,
            "gender": false,
            "address": false
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

//studentName
        function studentNameValidation() {
            let element = document.getElementById("studentName");
            let error = document.getElementById("errorname");
            let nameRegex = /^[A-Za-z]+$/;

            if (element.value.length > 3 && element.value.length < 30 && nameRegex.test(element.value)) {
                error.innerHTML = "";
                fieldsChecks["studentName"] = true;
            } else {
                error.innerHTML = "Invalid name. Name should be alphabetic characters only and length should be greater than 3 and less than 30.";
                error.style.color = "red";
                fieldsChecks["studentName"] = false;
            }
            validateAndEnableSubmit();
        }

//father
        function fatherValidation() {
            let element = document.getElementById("fatherName");
            let error = document.getElementById("fathererror");
            let nameRegex = /^[A-Za-z\s]+$/;

            if (element.value.length > 3 && element.value.length < 30 && nameRegex.test(element.value)) {
                error.innerHTML = "";
                fieldsChecks["fatherName"] = true;
            } else {
                error.innerHTML = "Invalid name. Name should be alphabetic characters only and length should be greater than 3 and less than 30.";
                error.style.color = "red";
                fieldsChecks["fatherName"] = false;
            }
            validateAndEnableSubmit();
        }

        function collegeValidation() {
            let element = document.getElementById("college");
            let error = document.getElementById("collegeerror");

            if (element.value.length != "0") {
                error.innerHTML = "";
                fieldsChecks["college"] = true;
            } else {
                error.innerHTML = "Please select College";
                error.style.color = "red";
                fieldsChecks["college"] = false;
            }
            validateAndEnableSubmit();
        }

//mobile
        function mobileValidation() {
            let element = document.getElementById("mobile");
            let error = document.getElementById("errormobile");

            if (/^\d{10}$/.test(element.value)) {
                error.innerHTML = "";
                fieldsChecks["mobile"] = true;
            } else {
                error.innerHTML = "Invalid mobile number. Number should be exactly 10 digits.";
                error.style.color = "red";
                fieldsChecks["mobile"] = false;
            }
            validateAndEnableSubmit();
        }


//dateofbirth
        function dateofbirthValidation() {
            let element = document.getElementById("dates");
            let error = document.getElementById("errordate");

            if (element.value.length != "0") {
                error.innerHTML = "";
                fieldsChecks["dates"] = true;
            } else {
                error.innerHTML = "Please enter date of birth";
                error.style.color = "red";
                fieldsChecks["dates"] = false;
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

            if (element.value.length > 3 && element.value.length < 30) {
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
    </script>