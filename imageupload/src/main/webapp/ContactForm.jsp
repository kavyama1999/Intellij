<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">

<script src="/winter_database/js/contact.js"></script>

<!---<script src="/winter_database/js/event.js"></script>--!>


<style>
        .custom-card-header {
            height: 100px;
            width: 300px;
            display: flex;
            justify-content: center;
            align-items: center;
        }
    </style>
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
        	         	 <a class="navbar-brand  text-white" href="ContactSearch.jsp"><b>Contact Search</b></a>

        </div>
       </nav>


       <div class="card border-dark container  mt-5 mb-5 justify-content-center" >
         <div class="card-header"> <h3><b><center>Contact Form</center></b></h3>
       </div>

                <!---<h1><center>Contact Form</center></h1>--->

         <div class="card-body text-dark">

${contactDTO}

                    <!-- <form action="contact" method="post"  enctype="multipart/form-data">--!>

                       <form action="contact" method="post"  >


      <input type="hidden" name="id" value="${contactDTO.id !=null ? contactDTO.id:''}"/>



<!----//within page we need response we can use this line..
//if we need another page to response the create another result page--!>

                <div class="text-primary">${msg}</div>

<span style="color:red;">
                    <c:forEach items="${errors}" var="objectError">
                        ${objectError.defaultMessage}<br>
                    </c:forEach>
                </span>

<div class="row mb-3">
                    <span id="nameError"></span><br>
                    <label for="name" class="form-label"><b>Name:</b></label>
                    <input type="text" class="form-control" id="name" onblur="nameValidation()" name="name" value="${contactDTO.name}">
               </div>


               

<div class="mb-3">
                        <span id="commentError"></span><br>
                        <b>Comments</b>
                        <label for="comments" class="form-floating"></label>
                        <textarea class="form-control" placeholder="Leave a comment here" id="comments" style="height: 100px" name="comments" onblur="commentsValidation()">${contactDTO.comments} </textarea>
                    </div>





<!----<div class="mb-3">
                    <label for="file" class="form-label text-dark">Choose File</label>
                    <input type="file" class="form-control" name="file" id="file">
                </div>
                <div class="mb-3">
                    <input type="submit" class="form-control btn btn-primary" style="width:100px" value="Upload" name="upload" id="upload">
                </div>---!>





              <div>
                  <input type="submit"  id="submit" value="Apply"  >
              </div>
            </form>
         </div>
       </div>

       </body>
       </html>
