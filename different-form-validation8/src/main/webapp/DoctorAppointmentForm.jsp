<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Appointment Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">

<script>
let fieldsChecks = {
    "name": false,
    "email": false,
    "phone": false,
    "preferredDoctor": false,
    "date": false,
    "time": false,
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

// Name
function nameValidation() {
    let element = document.getElementById("name");
    let error = document.getElementById("nameError");
    let nameRegex = /^[A-Za-z]+$/;

    if (element.value.trim().length > 3 && element.value.trim().length < 30 && nameRegex.test(element.value)) {
        error.innerHTML = "";
        fieldsChecks["name"] = true;
    } else {
        error.innerHTML = "Invalid name. Name should be alphabetic characters only and length should be greater than 3 and less than 30.";
        error.style.color = "red";
        fieldsChecks["name"] = false;
    }
    validateAndEnableSubmit();
}

// Email
function mailValidation() {
    let element = document.getElementById("email");
    let error = document.getElementById("emailError");

    let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (emailRegex.test(element.value)) {
        error.innerHTML = "";
        fieldsChecks["email"] = true;
    } else {
        error.innerHTML = "Invalid email address.";
        error.style.color = "red";
        fieldsChecks["email"] = false;
    }
    validateAndEnableSubmit();
}

// Phone_No
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

// Preferred Doctor
function doctorValidation() {
    let element = document.getElementById("preferredDoctor");
    let error = document.getElementById("preferredDoctorError");

    if (element.value.length != 0) {
        error.innerHTML = "";
        fieldsChecks["preferredDoctor"] = true;
    } else {
        error.innerHTML = "Please select a preferred doctor.";
        error.style.color = "red";
        fieldsChecks["preferredDoctor"] = false;
    }
    validateAndEnableSubmit();
}

// Date
function dateValidation() {
    let element = document.getElementById("date");
    let error = document.getElementById("dateError");

    if (element.value.length != 0) {
        error.innerHTML = "";
        fieldsChecks["date"] = true;
    } else {
        error.innerHTML = "Please enter a date.";
        error.style.color = "red";
        fieldsChecks["date"] = false;
    }
    validateAndEnableSubmit();
}

//time
function timeValidation() {
    let element = document.getElementById("time");
    let error = document.getElementById("timeError");

    if (element.value.length != 0) {
        error.innerHTML = "";
        fieldsChecks["time"] = true;
    } else {
        error.innerHTML = "Please enter a Time.";
        error.style.color = "red";
        fieldsChecks["time"] = false;
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
    <div class="card p-4">
        <div class="card-body">
            <form action="doctor" method="post">
                <h3><b>Doctor Appointment Form</b></h3>

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
                    <input type="text" class="form-control" id="email" onblur="mailValidation()" name="email" value="${eventDTO.email}">
                </div>

                <div class="row mb-3">
                    <span id="phoneError"></span><br>
                    <label for="phone" class="form-label"><b>Phone No:</b></label>
                    <input type="text" class="form-control" id="phone" onblur="phoneValidation()" name="phone" value="${eventDTO.phone}">
                </div>

                <div class="row mb-3">
                    <span id="preferredDoctorError"></span>
                    <label for="preferredDoctor" class="form-label"><b>Preferred Doctor:</b></label>
                    <select class="form-select custom-select-width" id="preferredDoctor" onblur="doctorValidation()" name="preferredDoctor">
                        <option value="" ${eventDTO.preferredDoctor == null ? 'selected' : ''}>Select</option>
                        <option value="Dr. Smith" ${eventDTO.preferredDoctor == 'Dr. Smith' ? 'selected' : ''}>Dr. Smith</option>
                        <option value="Dr. Manjunath" ${eventDTO.preferredDoctor == 'Dr. Manjunath' ? 'selected' : ''}>Dr. Manjunath</option>
                        <option value="Dr. Ramesh" ${eventDTO.preferredDoctor == 'Dr. Ramesh' ? 'selected' : ''}>Dr. Ramesh</option>
                        <option value="Dr. Soumya" ${eventDTO.preferredDoctor == 'Dr. Soumya' ? 'selected' : ''}>Dr. Soumya</option>
                    </select><br>
                </div>

                <div class="row mb-3">
                    <span id="dateError"></span><br>
                    <label for="date" class="form-label"><b>Date:</b></label>
                    <input type="date" class="form-control" id="date" onblur="dateValidation()" name="date" value="${eventDTO.date}">
                </div>

                <div class="row mb-3">
                    <span id="timeError"></span><br>
                    <label for="time" class="form-label"><b>Time:</b></label>
                    <input type="time" class="form-control" id="time" onblur="timeValidation()" name="time" value="${eventDTO.time}" >
                </div>


                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="confirm" onchange="confirmValidation()" name="confirm" value="confirm" ${eventDTO.confirm == 'confirm' ? 'checked' : ''}>
                    <label class="form-check-label" for="confirm">Confirm</label>
                    <span id="confirmError"></span>
                </div>

                <div>
                    <input type="submit" id="submit" value="Apply" disabled>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
