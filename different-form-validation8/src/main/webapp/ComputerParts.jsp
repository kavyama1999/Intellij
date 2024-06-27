<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">

<!---<script>
let fieldsChecks = {
    "name": false,
    "model": false,
    "color": false,
    "type": false,
    "ram": false,
    "harddisk": false,
    "processor":false,
    "cacheSize": false,
      "cost": false

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

// BrandName
function brandNameValidation() {
    let element = document.getElementById("name");
    let error = document.getElementById("brandNameError");

    if (element.value.length != 0) {
        error.innerHTML = "";
        fieldsChecks["name"] = true;
    } else {
        error.innerHTML = "Please select a Brand.";
        error.style.color = "red";
        fieldsChecks["name"] = false;
    }
    validateAndEnableSubmit();
}

// Model
function modelValidation() {
    let element = document.getElementById("model");
    let error = document.getElementById("modelerror");
    let nameRegex = /^[A-Za-z]+$/;

    if (element.value.length > 3 && element.value.length < 30 && nameRegex.test(element.value)) {
        error.innerHTML = "";
        fieldsChecks["model"] = true;
    } else {
        error.innerHTML = "Invalid name. Name should be alphabetic characters only and length should be greater than 3 and less than 30.";
        error.style.color = "red";
        fieldsChecks["model"] = false;
    }
    validateAndEnableSubmit();
}

//color

function colorValidation() {
    let element = document.getElementById("color");
    let error = document.getElementById("colorError");

    if (element.value.length != 0) {
        error.innerHTML = "";
        fieldsChecks["color"] = true;
    } else {
        error.innerHTML = "Please select  Color.";
        error.style.color = "red";
        fieldsChecks["color"] = false;
    }
    validateAndEnableSubmit();
}

//type

function typeValidation() {
    let element = document.getElementById("type");
    let error = document.getElementById("typeError");

    if (element.value.length != 0) {
        error.innerHTML = "";
        fieldsChecks["type"] = true;
    } else {
        error.innerHTML = "Please select  Type.";
        error.style.color = "red";
        fieldsChecks["type"] = false;
    }
    validateAndEnableSubmit();
}


//RAM

function ramValidation() {
    let element = document.getElementById("ram");
    let error = document.getElementById("ramError");

    if (element.value.length != 0) {
        error.innerHTML = "";
        fieldsChecks["ram"] = true;
    } else {
        error.innerHTML = "Please select  RAM.";
        error.style.color = "red";
        fieldsChecks["ram"] = false;
    }
    validateAndEnableSubmit();
}


//HardDisk

function hardDiskValidation() {
    let element = document.getElementById("harddisk");
    let error = document.getElementById("harddiskError");

    if (element.value.length != 0) {
        error.innerHTML = "";
        fieldsChecks["harddisk"] = true;
    } else {
        error.innerHTML = "Please select  Hard Disk.";
        error.style.color = "red";
        fieldsChecks["harddisk"] = false;
    }
    validateAndEnableSubmit();
}


//Processor

function processorValidation() {
    let element = document.getElementById("processor");
    let error = document.getElementById("processorError");

    if (element.value.length != 0) {
        error.innerHTML = "";
        fieldsChecks["processor"] = true;
    } else {
        error.innerHTML = "Please select CacheSize.";
        error.style.color = "red";
        fieldsChecks["processor"] = false;
    }
    validateAndEnableSubmit();
}



//CacheSize

function cacheSizeValidation() {
    let element = document.getElementById("cacheSize");
    let error = document.getElementById("cacheSizeError");

    if (element.value.length != 0) {
        error.innerHTML = "";
        fieldsChecks["cacheSize"] = true;
    } else {
        error.innerHTML = "Please select CacheSize.";
        error.style.color = "red";
        fieldsChecks["cacheSize"] = false;
    }
    validateAndEnableSubmit();
}


// cost
function costValidation() {
    let element = document.getElementById("cost");
    let error = document.getElementById("costError");
    let amount = element.value == "" ? 0 : parseInt(element.value);

    if (amount >= 10 && amount <= 10000) {
        error.innerHTML = "";
        fieldsChecks["cost"] = true;
    } else {
        error.innerHTML = "Recharge amount should be between 10 and 10,000.";
        error.style.color = "red";
        fieldsChecks["cost"] = false;
    }
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

            <form action="computerparts" method="post">

                <h3><b>Computer Parts Form</b></h3>

                <div class="text-primary">${msg}</div>
                <span style="color:red;">
                    <c:forEach items="${errors}" var="objectError">
                        ${objectError.defaultMessage}<br>
                    </c:forEach>
                </span>



                <div class="row mb-3">
                    <span id="brandNameError"></span>
                    <label for="name" class="form-label"><b>Brand Name:</b></label>
                    <select class="form-select custom-select-width" id="name" onblur="brandNameValidation()" name="brandName">
                        <option value="" ${computerPartsDTO.brandName == null ? 'selected' : ''}>Select</option>
                        <option value="Dell" ${computerPartsDTO.brandName == 'Dell' ? 'selected' : ''}>Dell</option>
                        <option value="HP" ${computerPartsDTO.brandName == 'HP' ? 'selected' : ''}>HP</option>
                        <option value="Lenovo" ${computerPartsDTO.brandName == 'Lenovo' ? 'selected' : ''}>Lenovo</option>
                    </select><br>
                </div>

                <div class="row mb-3">
                    <span id="modelerror"></span><br>
                    <label for="model" class="form-label"><b>Model:</b></label>
                    <input type="text" class="form-control" id="model" onblur="modelValidation()" name="model" value="${computerPartsDTO.model}">
                </div>

                <div class="row mb-3">
                    <span id="colorError"></span>
                    <label for="color" class="form-label"><b>Color:</b></label>
                    <select class="form-select custom-select-width" id="color" onblur="colorValidation()" name="color">
                        <option value="" ${computerPartsDTO.color == null ? 'selected' : ''}>Select</option>
                        <option value="Black" ${computerPartsDTO.color == 'Black' ? 'selected' : ''}>Black</option>
                        <option value="Silver" ${computerPartsDTO.color == 'Silver' ? 'selected' : ''}>Silver</option>
                    </select><br>
                </div>

                <div class="row mb-3">
                    <span id="typeError"></span>
                    <label for="type" class="form-label"><b>Type:</b></label>
                    <select class="form-select custom-select-width" id="type" onblur="typeValidation()" name="type">
                        <option value="" ${computerPartsDTO.type == null ? 'selected' : ''}>Select</option>
                        <option value="Digital" ${computerPartsDTO.type == 'Digital' ? 'selected' : ''}>Digital</option>
                        <option value="SuperComputer" ${computerPartsDTO.type == 'SuperComputer' ? 'selected' : ''}>SuperComputer</option>
                    </select><br>
                </div>

                <div class="row mb-3">
                    <span id="ramError"></span>
                    <label for="ram" class="form-label"><b>RAM:</b></label>
                    <select class="form-select custom-select-width" id="ram" onblur="ramValidation()" name="ram">
                        <option value="" ${computerPartsDTO.ram == null ? 'selected' : ''}>Select</option>
                        <option value="8Gb" ${computerPartsDTO.ram == '8Gb' ? 'selected' : ''}>8Gb</option>
                        <option value="16Gb" ${computerPartsDTO.ram == '16Gb' ? 'selected' : ''}>16Gb</option>
                        <option value="32Gb" ${computerPartsDTO.ram == '32Gb' ? 'selected' : ''}>32Gb</option>
                        <option value="64Gb" ${computerPartsDTO.ram == '64Gb' ? 'selected' : ''}>64Gb</option>
                    </select><br>
                </div>

                <div class="row mb-3">
                    <span id="harddiskError"></span>
                    <label for="harddisk" class="form-label"><b>Hard Disk:</b></label>
                    <select class="form-select custom-select-width" id="harddisk" onblur="hardDiskValidation()" name="hardDisk">
                        <option value="" ${computerPartsDTO.hardDisk == null ? 'selected' : ''}>Select</option>
                        <option value="HDD" ${computerPartsDTO.hardDisk == 'HDD' ? 'selected' : ''}>HDD</option>
                        <option value="SSD" ${computerPartsDTO.hardDisk == 'SSD' ? 'selected' : ''}>SSD</option>
                    </select><br>
                </div>

                <div class="row mb-3">
                    <span id="processorError"></span>
                    <label for="processor" class="form-label"><b>Processor:</b></label>
                    <select class="form-select custom-select-width" id="processor" onblur="processorValidation()" name="processor">
                        <option value="" ${computerPartsDTO.processor == null ? 'selected' : ''}>Select</option>
                        <option value="i3" ${computerPartsDTO.processor == 'i3' ? 'selected' : ''}>i3</option>
                        <option value="i5" ${computerPartsDTO.processor == 'i5' ? 'selected' : ''}>i5</option>
                    </select><br>
                </div>

                <div class="row mb-3">
                    <span id="cacheSizeError"></span>
                    <label for="cacheSize" class="form-label"><b>Cache Size:</b></label>
                    <select class="form-select custom-select-width" id="cacheSize" onblur="cacheSizeValidation()" name="cacheSize">
                        <option value="" ${computerPartsDTO.cacheSize == null ? 'selected' : ''}>Select</option>
                        <option value="32 bytes" ${computerPartsDTO.cacheSize == '32 bytes' ? 'selected' : ''}>32 bytes</option>
                        <option value="64 bytes" ${computerPartsDTO.cacheSize == '64 bytes' ? 'selected' : ''}>64 bytes</option>
                        <option value="128 bytes" ${computerPartsDTO.cacheSize == '128 bytes' ? 'selected' : ''}>128 bytes</option>
                    </select><br>
                </div>

                <div class="row mb-3">
                    <span id="costError"></span><br>
                    <label for="cost" class="form-label"><b>Cost:</b></label>
                    <input type="text" class="form-control" id="cost" onblur="costValidation()" name="cost" value="${computerPartsDTO.cost}">
                </div>

              <div>
                  <input type="submit" id="submit" value="Apply" >
</div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
