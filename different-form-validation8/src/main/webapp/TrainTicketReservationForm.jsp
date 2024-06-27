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
    "fName": false,
    "lName": false,
    "phone": false,
    "train": false,
    "sleeper": false,
    "stationName": false,
    "datOfJourney": false,
    "confirm": false
};

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

// FirstName
function fNameValidation() {
    let element = document.getElementById("fName");
    let error = document.getElementById("fNameError");
    let nameRegex = /^[A-Za-z]+$/;

    if (element.value.length > 3 && element.value.length < 30 && nameRegex.test(element.value)) {
        error.innerHTML = "";
        fieldsChecks["fName"] = true;
    } else {
        error.innerHTML = "Invalid name. Name should be alphabetic characters only and length should be greater than 3 and less than 30.";
        error.style.color = "red";
        fieldsChecks["fName"] = false;
    }
    validateAndEnableSubmit();
}

// LastName
function lNameValidation() {
    let element = document.getElementById("lName");
    let error = document.getElementById("lNameError");
    let nameRegex = /^[A-Za-z]+$/;

    if (element.value.length > 1 && element.value.length < 3 && nameRegex.test(element.value)) {
        error.innerHTML = "";
        fieldsChecks["lName"] = true;
    } else {
        error.innerHTML = "Invalid Last name. Last Name should be alphabetic characters only and length should be greater than 1 and less than 3.";
        error.style.color = "red";
        fieldsChecks["lName"] = false;
    }
    validateAndEnableSubmit();
}

//Phone_No
function phoneValidation() {
    let element = document.getElementById("phone");
    let error = document.getElementById("phoneError");
    let mobileRegex = /^\d{10}$/;

    if (mobileRegex.test(element.value)) {
        error.innerHTML = "";
        fieldsChecks["phone"] = true;
    } else {
        error.innerHTML = "Invalid mobile number. It should be exactly 10 digits.";
        error.style.color = "red";
        fieldsChecks["phone"] = false;
    }
    validateAndEnableSubmit();
}

//Train No
function trainValidation() {
    let element = document.getElementById("train");
    let error = document.getElementById("trainError");

    if (element.value.trim().length == 8) {
        error.innerHTML = "";
        fieldsChecks["train"] = true;
    } else {
        error.innerHTML = "Please enter Train No. ID should be 8 numbers.";
        error.style.color = "red";
        fieldsChecks["train"] = false;
    }
    validateAndEnableSubmit();
}

//Sleeper
function sleeperValidation() {
    let element = document.getElementById("sleeper");
    let error = document.getElementById("sleeperError");

    if (element.value.length != 0) {
        error.innerHTML = "";
        fieldsChecks["sleeper"] = true;
    } else {
        error.innerHTML = "Please select Sleeper.";
        error.style.color = "red";
        fieldsChecks["sleeper"] = false;
    }
    validateAndEnableSubmit();
}

// Station Name
function stationNameValidation() {
    let element = document.getElementById("StationName");
    let error = document.getElementById("stNameError");
    let nameRegex = /^[A-Za-z]+$/;

    if (element.value.length > 3 && element.value.length < 30 && nameRegex.test(element.value)) {
        error.innerHTML = "";
        fieldsChecks["stationName"] = true;
    } else {
        error.innerHTML = "Invalid Station Name. Name should be alphabetic characters only and length should be greater than 3 and less than 30.";
        error.style.color = "red";
        fieldsChecks["stationName"] = false;
    }
    validateAndEnableSubmit();
}

//Date of Journey
function datOfJourneyValidation() {
    let element = document.getElementById("datOfJourney");
    let error = document.getElementById("journeyError");

    if (element.value.length != 0) {
        error.innerHTML = "";
        fieldsChecks["datOfJourney"] = true;
    } else {
        error.innerHTML = "Please enter Date of Journey.";
        error.style.color = "red";
        fieldsChecks["datOfJourney"] = false;
    }
    validateAndEnableSubmit();
}

// Confirm
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

            <form action="train" method="post">

                <h3><b>Train Ticket Reservation Form</b></h3>

                <div class="text-primary">${msg}</div>
                <span style="color:red;">
                    <c:forEach items="${errors}" var="objectError">
                        ${objectError.defaultMessage}<br>
                    </c:forEach>
                </span>

                <div class="row mb-3">
                    <label for="fName" class="form-label"><b>First Name:</b></label>
                    <input type="text" class="form-control" id="fName" onblur="fNameValidation()" name="fName" value="${trainDTO.fName}">
                    <span id="fNameError"></span>
                </div>

                <div class="row mb-3">
                    <label for="lName" class="form-label"><b>Last Name:</b></label>
                    <input type="text" class="form-control" id="lName" onblur="lNameValidation()" name="lName" value="${trainDTO.lName}">
                    <span id="lNameError"></span>
                </div>

                <div class="row mb-3">
                    <label for="phone" class="form-label"><b>Phone No:</b></label>
                    <input type="text" class="form-control" id="phone" onblur="phoneValidation()" name="phone" value="${trainDTO.phone}">
                    <span id="phoneError"></span>
                </div>

                <div class="row mb-3">
                    <label for="train" class="form-label"><b>Train No:</b></label>
                    <input type="text" class="form-control" id="train" onblur="trainValidation()" name="train" value="${trainDTO.train}">
                    <span id="trainError"></span>
                </div>

                <div class="row mb-3">
                    <label for="sleeper" class="form-label"><b>Sleeper:</b></label>
                    <select class="form-select custom-select-width" id="sleeper" onblur="sleeperValidation()" name="sleeper">
                        <option value="" ${trainDTO.sleeper == null ? 'selected' : ''}>Select</option>
                        <option value="Ac 3 Tier" ${trainDTO.sleeper == 'Ac 3 Tier' ? 'selected' : ''}>Ac 3 Tier</option>
                        <option value="Ac 2 Tier" ${trainDTO.sleeper == 'Ac 2 Tier' ? 'selected' : ''}>Ac 2 Tier</option>
                        <option value="First Class" ${trainDTO.sleeper == 'First Class' ? 'selected' : ''}>First Class</option>
                        <option value="General" ${trainDTO.sleeper == 'General' ? 'selected' : ''}>General</option>
                    </select>
                    <span id="sleeperError"></span>
                </div>

                <div class="row mb-3">
                    <label for="StationName" class="form-label"><b>Station Name:</b></label>
                    <input type="text" class="form-control" id="StationName" onblur="stationNameValidation()" name="stationName" value="${trainDTO.StationName}">
                    <span id="stNameError"></span>
                </div>

                <div class="row mb-3">
                    <label for="datOfJourney" class="form-label"><b>Date Of Journey:</b></label>
                    <input type="date" class="form-control" id="datOfJourney" onblur="datOfJourneyValidation()" name="datOfJourney" value="${trainDTO.datOfJourney}">
                    <span id="journeyError"></span>
                </div>

                <div class="row mb-3">
                    <label for="confirm" class="list-group-item">
                        <input name="confirm" id="confirm" onchange="confirmValidation()" class="form-check-input me-1" type="checkbox" value="confirm" ${trainDTO.confirm == 'confirm' ? 'checked' : ''}>
                        Confirm:
                    </label>
                    <span id="confirmError"></span>
                </div>

                <div>
                    <input type="submit" id="submit" value="Apply">
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
