<%@ page  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Scholarship Application Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
    <nav class="navbar navbar-dark bg-dark">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">
                    <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="xworkz" width="140" height="70">
                </a>
                <a class="navbar-brand me-3 text-white" href="index.jsp"><b>Home</b></a>


            </div>
        </div>
    </nav>

    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card p-4">
            <div class="card-body">


                <form action="apply" method="post">

                    <h3><b>Scholarship Application Form</b></h3>

                    <div class="text-primary">${studentName}</div>
                    <span style="color:red;">
                                            <c:forEach items="${errors}" var="objectError">
                                                ${objectError.defaultMessage}
                                            </c:forEach>
                                        </span>

                    <div class="row mb-3">
                        <span id="errorname"></span><br>
                        <label for="studentName" class="form-label"><b>Student Name:</b></label>
                        <input type="text" class="form-control" id="studentName" name="studentName"   onblur="studentNameValidation()">
                    </div>

                    <div class="row mb-3">
                        <span id="fathererror"></span><br>
                        <label for="fatherName" class="form-label"><b>Father Name:</b></label>
                        <input type="text" class="form-control"  id="fatherName" name="fatherName"  onblur="fatherValidation()">
                    </div>

                    <div class="row mb-3">
                        <span id="collegeerror"></span>
                        <label for="college" class="form-label"><b>College Name:</b></label>
                        <select class="form-select custom-select-width" id="college" onblur="collegeValidation()" name="college" aria-label="Select College">
                            <option selected value="">select</option>
                            <option value="Bengaluru City University">Bengaluru City University</option>
                            <option value="Presidency College">Presidency College</option>
                            <option value="Dayananda Sagar College of Engineering">Dayananda Sagar College of Engineering</option>
                        </select>
                    </div>

                    <div class="row mb-3">
                        <span id="errormobile"></span><br>
                        <label for="mobile" class="form-label"><b>Mobile:</b></label>
                        <input type="text" class="form-control"  id="mobile" name="mobile" onblur="mobileValidation()">
                    </div>

                    <div class="row mb-3">
                        <span id="errordate"></span><br>
                        <label for="dates" class="form-label"><b>Date of birth:</b></label>
                        <input type="date" class="form-control"  id="dates" onblur="dateofbirthValidation()" name="dateOfBirth">
                    </div>

                    <div>
                        <span id="errorregender"></span>
                    </div>
                    <b>Gender:</b>
                    <div class="container">
                        <div class="row mb-3">
                            <div class="col-auto">
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="gender" value="Male" id="flexRadioDefault1" onclick="genderValidation()">
                                    <label class="form-check-label" for="flexRadioDefault1">Male</label>
                                </div>
                            </div>
                            <div class="col-auto">
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="gender" value="Female" id="flexRadioDefault2" onclick="genderValidation()">
                                    <label class="form-check-label" for="flexRadioDefault2">Female</label>
                                </div>
                            </div>
                            <div class="col-auto">
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="gender" value="Others" id="flexRadioDefault3" onclick="genderValidation()">
                                    <label class="form-check-label" for="flexRadioDefault3">Others</label>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="mb-3">
                        <span id="erroraddress"></span><br>
                        <b>Address</b>
                        <label for="address" class="form-floating"></label>
                        <textarea class="form-control" placeholder="Leave a comment here"  id="address" style="height: 100px" name="address" onblur="addressValidation()"></textarea>
                    </div>

                    <input type="submit" id="submit" value="Apply" >

                </form>
            </div>
        </div>
    </div>
</body>
</html>
