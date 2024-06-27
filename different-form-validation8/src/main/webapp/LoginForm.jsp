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
    "userName": false,
    "email": false,
    "phone": false,
    "password": false,
    "cmfPassword": false,
    "remember": false
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

// UserName
function userNameValidation() {
    let element = document.getElementById("userName");
    let error = document.getElementById("userNameError");
    let nameRegex = /^[A-Za-z]+$/;

    if (element.value.length > 3 && element.value.length < 30 && nameRegex.test(element.value)) {
        error.innerHTML = "";
        fieldsChecks["userName"] = true;
    } else {
        error.innerHTML = "Invalid name. Name should be alphabetic characters only and length should be greater than 3 and less than 30.";
        error.style.color = "red";
        fieldsChecks["userName"] = false;
    }
    validateAndEnableSubmit();
}

// Email
function mailValidation() {
    let element = document.getElementById("email");
    let error = document.getElementById("emailError");

    // Regular expression pattern for validating email address
    let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    // Check if the email is valid
    if (emailRegex.test(element.value)) {
        // Email is valid
        error.innerHTML = "";
        fieldsChecks["email"] = true;
    } else {
        // Email is invalid
        error.innerHTML = "Invalid email address.";
        error.style.color = "red";
        fieldsChecks["email"] = false;
    }
    validateAndEnableSubmit();
}

// Phone
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

// Password
function passwordValidation() {
    let element = document.getElementById("password");
    let error = document.getElementById("passwordError");

    // Check if the password is exactly 6 digits long
    if (element.value.length === 6 && /^\d{6}$/.test(element.value)) {
        error.innerHTML = "";
        fieldsChecks["password"] = true;
    } else {
        error.innerHTML = "Password must be exactly 6 digits.";
        error.style.color = "red";
        fieldsChecks["password"] = false;
    }
    validateAndEnableSubmit();
}

// Confirm Password
function cmfPasswordValidation() {
    let passwordElement = document.getElementById("password");
    let cmfPasswordElement = document.getElementById("cmfPassword");
    let error = document.getElementById("cmfPasswordError");

    // Check if the confirm password matches the password
    if (cmfPasswordElement.value === passwordElement.value && cmfPasswordElement.value.length === 6) {
        error.innerHTML = "";
        fieldsChecks["cmfPassword"] = true;
    } else {
        error.innerHTML = "Passwords do not match or are not exactly 6 digits.";
        error.style.color = "red";
        fieldsChecks["cmfPassword"] = false;
    }
    validateAndEnableSubmit();
}

// Remember Me
function rememberValidation() {
    let element = document.getElementById("remember");
    let error = document.getElementById("rememberError");

    if (element.checked) {
        error.innerHTML = "";
        fieldsChecks["remember"] = true;
    } else {
        error.innerHTML = "Please confirm.";
        error.style.color = "red";
        fieldsChecks["remember"] = false;
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

            <form action="log" method="post">

                <h3><b>Login Form</b></h3>

                <div class="text-primary">${msg}</div>
                <span style="color:red;">
                    <c:forEach items="${errors}" var="objectError">
                        ${objectError.defaultMessage}<br>
                    </c:forEach>
                </span>

                <div class="row mb-3">
                    <span id="userNameError"></span><br>
                    <label for="userName" class="form-label"><b>UserName:</b></label>
                    <input type="text" class="form-control" id="userName" onblur="userNameValidation()" name="userName" value="${loginDTO.userName}">
                </div>

                <div class="row mb-3">
                    <span id="emailError"></span><br>
                    <label for="email" class="form-label"><b>Email:</b></label>
                    <input type="text" class="form-control" id="email" onblur="mailValidation()" name="email" value="${loginDTO.email}">
                </div>

                <div class="row mb-3">
                    <span id="phoneError"></span><br>
                    <label for="phone" class="form-label"><b>Phone_No:</b></label>
                    <input type="text" class="form-control" id="phone" onblur="phoneValidation()" name="phone" value="${loginDTO.phone}">
                </div>

                <div class="row mb-3">
                    <span id="passwordError"></span><br>
                    <label for="password" class="form-label"><b>Password:</b></label>
                    <input type="text" class="form-control" id="password" onblur="passwordValidation()" name="password" value="${loginDTO.password}">
                </div>

                <div class="row mb-3">
                    <span id="cmfPasswordError"></span><br>
                    <label for="cmfPassword" class="form-label"><b>Confirm Password:</b></label>
                    <input type="text" class="form-control" id="cmfPassword" onblur="cmfPasswordValidation()" name="cmfPassword" value="${loginDTO.cmfPassword}">
                </div>

                 <span id="rememberError"></span>
                                <label for="remember" class="list-group-item">
                                    <input name="remember" id="remember" onchange="rememberValidation()" class="form-check-input me-1" type="checkbox" value="remember" ${loginDTO.remember eq 'remember' ? 'checked' : ''}>
                                    Remember Me:
                                </label><br>

                <div>
                    <input type="submit" id="submit" value="Apply" >
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
