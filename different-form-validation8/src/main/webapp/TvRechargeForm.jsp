<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">

<!-------------<script>
let fieldsChecks = {
    "name": false,
    "id": false,
    "select": false,
    "amount": false,
    "rechargetype": false,
    "accept": false
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

// Customer Name
function customerNameValidation() {
    let element = document.getElementById("name");
    let error = document.getElementById("errorName");
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

// Customer ID
function customerIdValidation() {
    let element = document.getElementById("id");
    let error = document.getElementById("errorId");

    if (element.value.trim().length == 8) {
        error.innerHTML = "";
        fieldsChecks["id"] = true;
    } else {
        error.innerHTML = "Invalid Customer ID. ID should be 8 characters long.";
        error.style.color = "red";
        fieldsChecks["id"] = false;
    }
    validateAndEnableSubmit();
}

// Vendor
function vendorValidation() {
    let element = document.getElementById("select");
    let error = document.getElementById("vendorerror");

    if (element.value.length != 0) {
        error.innerHTML = "";
        fieldsChecks["select"] = true;
    } else {
        error.innerHTML = "Please select a vendor.";
        error.style.color = "red";
        fieldsChecks["select"] = false;
    }
    validateAndEnableSubmit();
}


// Amount
function amountValidation() {
    let element = document.getElementById("amount");
    let error = document.getElementById("erroramount");
    let amount = element.value == "" ? 0 : parseInt(element.value);

    if (amount >= 10 && amount <= 10000) {
        error.innerHTML = "";
        fieldsChecks["amount"] = true;
    } else {
        error.innerHTML = "Recharge amount should be between 10 and 10,000.";
        error.style.color = "red";
        fieldsChecks["amount"] = false;
    }
    validateAndEnableSubmit();
}



// Recharge Type
function buy() {
    let error = document.getElementById("errorrechargetype");

    let radioButtons = document.getElementsByName("rechargetype");
    let selected = false;
    for (let radioButton of radioButtons) {
        if (radioButton.checked) {
            selected = true;
            break;
        }
    }

    if (!selected) {
        error.innerHTML = "Please select any payment method.";
        error.style.color = "red";
        fieldsChecks["rechargetype"] = false;
    } else {
        error.innerHTML = "";
        fieldsChecks["rechargetype"] = true;
    }
    validateAndEnableSubmit();
}



// Accept
function acceptValidation() {
    let element = document.getElementById("accept");
    let error = document.getElementById("erroraccept");

    if (element.checked) {
        error.innerHTML = "";
        fieldsChecks["accept"] = true;
    } else {
        error.innerHTML = "Please confirm.";
        error.style.color = "red";
        fieldsChecks["accept"] = false;
    }

    buy();
    validateAndEnableSubmit();
}
</script>--!>

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
            <form action="tv" method="post">
                <h3><b>TvRecharge Form</b></h3>
                <div class="text-primary">${msg}</div>
                <span style="color:red;">
                    <c:forEach items="${errors}" var="objectError">
                        ${objectError.defaultMessage}<br>
                    </c:forEach>
                </span>

                <div class="row mb-3">
                    <span id="errorName"></span><br>
                    <label for="name" class="form-label"><b>Customer Name:</b></label>
                    <input type="text" class="form-control" id="name" onblur="customerNameValidation()" name="customerName"  value="${tvRechargeDTO.customerName}">
                </div>

                <div class="row mb-3">
                    <span id="errorId"></span><br>
                    <label for="id" class="form-label"><b>Customer Id:</b></label>
                    <input type="text" class="form-control" id="id" onblur="customerIdValidation()" name="customer"  value="${tvRechargeDTO.customer}">
                </div>

                <div class="row mb-3">
                                    <span id="vendorerror"></span>
                                    <label for="select" class="form-label"><b>Select Vendor:</b></label>
                                    <select class="form-select custom-select-width" id="select" onblur="vendorValidation()" name="vendor" >
                                        <option value="" ${tvRechargeDTO.vendor == null ? 'selected' : ''}>Select</option>
                                        <option value="Recharge Tv" ${tvRechargeDTO.vendor == 'Recharge Tv' ? 'selected' : ''}>Recharge Tv</option>
                                        <option value="Tv Reload" ${tvRechargeDTO.vendor == 'Tv Reload' ? 'selected' : ''}>Tv Reload</option>
                                    </select><br>
                                </div>

                <div class="row mb-3">
                    <span id="erroramount"></span>
                    <label for="amount" class="form-label"><b>Recharge Amount:</b></label>
                    <input type="text" class="form-control" id="amount" onblur="amountValidation()" name="recharge" value="${tvRechargeDTO.recharge}">
                </div>

                <div>
                    <span id="errorrechargetype"></span>
                </div>
                <b>Recharge Type:</b>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="rechargetype" value="Monthly" id="flexRadioDefault1" onclick="buy()" ${tvRechargeDTO.rechargetype eq 'Monthly' ? 'checked' : ''}>
                    <label class="form-check-label" for="flexRadioDefault1"> Monthly </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="rechargetype" value="Topup" id="flexRadioDefault2" onclick="buy()" ${tvRechargeDTO.rechargetype eq 'Topup' ? 'checked' : ''}>
                    <label class="form-check-label" for="flexRadioDefault2"> Topup </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="rechargetype" value="Ott" id="flexRadioDefault3" onclick="buy()" ${tvRechargeDTO.rechargetype eq 'Ott' ? 'checked' : ''}>
                    <label class="form-check-label" for="flexRadioDefault3"> Ott </label>
                </div>

                <br>
                <div class="list-group">
                    <span id="erroraccept"></span>
                    <label for="accept" class="list-group-item">
                        <input name="accept" id="accept" class="form-check-input me-1" type="checkbox" onblur="acceptValidation()" value="Accept"  ${tvRechargeDTO.accept eq 'Accept' ? 'checked' : ''}>
                        Accept
                    </label>
                </div><br>

            <!----    <div>
                    <input type="submit" id="submit" value="Apply" disabled>
              </div>--!>

<div>
                  <input type="submit" id="submit" value="Apply" >
</div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
