//<%@ page  isELIgnored="false"%>
//<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
//
//<html>
//<head>
//<title>Index</title>
//<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
//</head>
//
//<body>
//<nav class="navbar navbar-light bg-info">
//  <div class="container-fluid">
//
//    <a href="index.jsp" <span  class="navbar-brand mb-0 h1">Home</span></a>
//    <a href="collegeUniform.jsp" <span  class="navbar-brand mb-0 h1">CollegeUniformForm</span></a>
//
//
//  </div>
//</nav>
//<div class="d-flex justify-content-center mt-3 mb-2 align-items-center vh-80">
//<div class="card" style="width: 25rem;">
//  <div class="card-body">
//    <form action="search" method="post">
//
//              <div class="form-group">
//                <label for="exampleInputEmail1"> Student Name</label>
//                <input type="text"  class="form-control" id="name" name="name"  aria-describedby="emailHelp" placeholder="Enter Student Name">
//                <span id="nameError"></span>
//
//              </div>
//
//         <div class="form-group">
//                      <label for="collegeName">Select College</label>
//                      <select class="form-control" name="collegeName" id="collegeName" onblur="collegeNameValidation()">
//<option ${dto.collegeName==null ? 'selected' : ''}  selected value=" ">Select College</option>
//                          <option value="JSS" ${dto.collegeName eq 'JSS' ? 'selected' : ''}>JSS</option>
//                          <option value="SMI"  ${dto.collegeName eq 'SMI' ? 'selected' : ''}>SMI</option>
//                          <option value="GIT"  ${dto.collegeName eq 'GIT' ? 'selected' : ''}>GIT</option>
//                          <option value="BIT"  ${dto.collegeName eq 'BIT' ? 'selected' : ''}>BIT</option>
//                          <option value="GMIT"  ${dto.collegeName eq 'GMIT' ? 'selected' : ''}>GMIT</option>
//                      </select>
//                      <span id="collegeNameError"></span>
//                  </div>
//
//                  <div>
//                       <button type="submit" id="submitBtn" class="btn btn-primary" >Submit</button>
//                       </div>
//                  </form>
//
//    </div>
//  </div>
//</div>
//<div class="d-flex justify-content-center mt-3 mb-2 align-items-center vh-80">
//<div class="card" style="width: 25rem;">
//  <div class="card-body">
//    <strong style="color:green;">Search result for , ${collegeName}</strong>
//<table class="table">
//  <thead>
//    <tr>
//      <th scope="col">ID</th>
//      <th scope="col">College Name </th>
//      <th scope="col">Student Name </th>
//      <th scope="col">Roll No</th>
//      <th scope="col">Gender</th>
//    </tr>
//  </thead>
//  <tbody>
//       <c:forEach items="${listOfCollegeUniform}" var="uniform">
//              <tr>
//<td>${uniform.id}</td>
//<td>${uniform.collegeName}</td>
//<td>${uniform.name}</td>
//<td>${uniform.rollNo}</td>
//<td>${uniform.gender}</td>
//              </tr>
//
//
//       </c:forEach>
//
//  </tbody>
//</table>
//
//
//
//
//
//    </div>
//  </div>
//</div>
//</body>
//</html>
