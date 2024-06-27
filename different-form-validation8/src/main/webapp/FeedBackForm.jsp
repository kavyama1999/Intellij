<%@ page isELIgnored="false" %>
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
    "rating": false,
    "feedback": false,
    "subscribe": false
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

function ratingValidation() {
    let element = document.getElementById("rating");
    let error = document.getElementById("ratingError");
    if (element.value.length != 0) {
        error.innerHTML = "";
        fieldsChecks["rating"] = true;
    } else {
        error.innerHTML = "Please select Ratings.";
        error.style.color = "red";
        fieldsChecks["rating"] = false;
    }
    validateAndEnableSubmit();
}

function feedbackValidation() {
    let element = document.getElementById("feedback");
    let error = document.getElementById("feedBackError");
    if (element.value.length > 3 && element.value.length < 300) {
        error.innerHTML = "";
        fieldsChecks["feedback"] = true;
    } else {
        error.innerHTML = "Characters should be greater than 3 and less than 30.";
        error.style.color = "red";
        fieldsChecks["feedback"] = false;
    }
    validateAndEnableSubmit();
}

//sbuscribe
function subscribeValidation() {
    let element = document.getElementById("subscribe");
    let error = document.getElementById("subscribeError");
    if (element.checked) {
        error.innerHTML = "";
        fieldsChecks["subscribe"] = true;
    } else {
        error.innerHTML = "Please confirm.";
        error.style.color = "red";
        fieldsChecks["subscribe"] = false;
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
            <a class="navbar-brand" href="#">
                <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="xworkz" width="140" height="70">
            </a>
            <a class="navbar-brand text-white" href="index.jsp"><b>Home</b></a>
        </div>
    </div>
</nav>
<div class="container mt-5 mb-5 d-flex justify-content-center">
    <div class="card p-4">
        <div class="card-body">
            <form action="feedback" method="post">
                <h3><b>FeedBack Registration Form</b></h3>
                <div class="text-primary">${msg}</div>
                <span style="color:red;">
                    <c:forEach items="${errors}" var="objectError">
                        ${objectError.defaultMessage}<br>
                    </c:forEach>
                </span>
                <div class="row mb-3">
                    <span id="nameError"></span><br>
                    <label for="name" class="form-label"><b>Name:</b></label>
                    <input type="text" class="form-control" id="name" onblur="nameValidation()" name="name" value="${feedBackDTO.name}">
                </div>
                <div class="row mb-3">
                    <span id="emailError"></span><br>
                    <label for="email" class="form-label"><b>Email:</b></label>
                    <input type="text" class="form-control" id="email" onblur="mailValidation()" name="email" value="${feedBackDTO.email}">
                </div>
                <div class="row mb-3">
                    <span id="phoneError"></span><br>
                    <label for="phone" class="form-label"><b>Phone_No:</b></label>
                    <input type="text" class="form-control" id="phone" onblur="phoneValidation()" name="phone" value="${feedBackDTO.phone}">
                </div>
                <div class="row mb-3">
                    <span id="ratingError"></span>
                    <label for="rating" class="form-label"><b>Rating:</b></label>
                    <select class="form-select custom-select-width" id="rating" onblur="ratingValidation()" name="rating">
                        <option value="" ${feedBackDTO.rating == null ? 'selected' : ''}>Select</option>
                        <option value="Poor" ${feedBackDTO.rating == 'Poor' ? 'selected' : ''}>Poor</option>
                        <option value="Fair" ${feedBackDTO.rating == 'Fair' ? 'selected' : ''}>Fair</option>
                        <option value="Good" ${feedBackDTO.rating == 'Good' ? 'selected' : ''}>Good</option>
                        <option value="Very Good" ${feedBackDTO.rating == 'Very Good' ? 'selected' : ''}>Very Good</option>
                        <option value="Excellent" ${feedBackDTO.rating == 'Excellent' ? 'selected' : ''}>Excellent</option>
                    </select><br>
                </div>
                <div class="mb-3">
                    <span id="feedBackError"></span><br>
                    <b>FeedBack</b>
                    <label for="feedback" class="form-floating"></label>
                    <textarea class="form-control" placeholder="Leave a comment here" id="feedback" style="height: 100px" name="feedback" onblur="feedbackValidation()">${feedBackDTO.feedback}</textarea>
                </div>
                <span id="subscribeError"></span>
                <label for="subscribe" class="list-group-item">
                    <input name="subscribe" id="subscribe" onchange="subscribeValidation()" class="form-check-input me-1" type="checkbox" value="subscribe" ${feedBackDTO.subscribe eq 'subscribe' ? 'checked' : ''}>
                    Subscribe to Newsletter:
                </label>
                <div>
                    <input type="submit" id="submit" value="Apply">
