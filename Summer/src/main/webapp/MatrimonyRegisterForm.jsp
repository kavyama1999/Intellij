<%@ page  isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Martirmony Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-dark bg-info">
    <div class="container-fluid">
        <div class="navbar-header">

                <a class="navbar-brand  text-dark" href="index.jsp"><b>Home</b></a>


        </div>
    </div>
</nav>
<div class="container mt-5 mb-5 d-flex justify-content-center">
    <div class="card p-4 ">
        <div class="card-body">


            <h3> Matrimony Registration Form</h3>
            <form action="go"   method="post">


                            <div class="text-primary">${message}</div>




                <div>
                    <span id="error"></span><br> <b> Name</b> <label
                        for="stud" class="form-label"></label>
                    <input type="text" class="form-control" id="stud" name="name">
                </div>
                <br>
                <div>
                     <b>Age</b> <label
                        for="num" class="form-label"></label> <input type="text" class="form-control" id="num"
                                                                     name="age">
                </div>
                <br>
                <div>
                     <b>Gender</b>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="gender" autocomplete="off"

                               value="Male" id="gender"> <label
                            class="form-check-label" for="gender">Male</label>
                    </div>


                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="gender" autocomplete="off"

                               value="Female" id="gender1"> <label
                            class="form-check-label" for="gender1">Female</label>
                    </div>
                </div>



                <div>
                     <b>Martial Status</b><label
                        for="clg" class="form-label"></label> <select
                        class="form-select custom-select-width" id="clg"
                        name="martialStatus"  aria-label="Select College">
                    <option selected value="">please select</option>
                    <option value="married">Married</option>
                    <option value="single">Single</option>
                    <option value="divorce">Divorce</option>

                </select>
                </div>
                <br>

                <div>
                    <br> <b>Religion</b><label
                        for="degree" class="form-label"></label> <select
                        class="form-select custom-select-width" id="degree"
                        name="religion"  aria-label="Select Degree">
                    <option selected value="">please select</option>
                    <option value="hindu">Hindu</option>
                    <option value="Muslim">Muslim</option>
                    <option value="Christian">Christian</option>

                </select>
                </div>
                <br>

                <div>
                    <b>Job</b> <label
                        for="stud" class="form-label"></label>
                    <input type="text" class="form-control"  name="job" >
                </div>

                <div>
                     <b>Qualification</b><label
                        for="year" class="form-label"></label> <select
                        class="form-select custom-select-width" id="year"
                        name="qualification"  aria-label="Select Year">
                    <option selected value="">please select</option>
                    <option value="BCA">BCA</option>
                    <option value="MCA">MCA</option>
                    <option value="MSC">MSC</option>
                    <option value="BE">BE</option>

                </select>
                </div>
                <br>


                <div>
                    <span id="errorlook"></span><br> <b>Looking for</b> <label
                        for="for" class="form-label"></label>
                    <input type="text" class="form-control" id="for" name="lookingFor" >
                </div>


                <div>
                    <button type="submit" class="text-primary" id="submit"  name="apply" >Apply</button>

                </div>



            </form>

 </div>
    </div>
</div>
</body>
</html>