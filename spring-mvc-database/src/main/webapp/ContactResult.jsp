

		<%@ page  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
    <body>
    <nav class="navbar navbar-dark bg-dark">
    	<div class="container-fluid">
    		<div class="navbar-header">

    		<!-- Add your logo here -->
                                    <a class="navbar-brand" href="#">
                                        <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="xworkz" width="140" height="70" >
                                    </a>
                                    <!-- End of logo -->
    		              <a class="navbar-brand  text-white" href="index.jsp"><b>Home</b></a>
    		              <a class="navbar-brand  text-white" href="ContactSearch.jsp"><b>ContactSearch</b></a>


    		</div>
    	</div>
    </nav>

    <div class="container mt-5 mb-5 d-flex justify-content-center">
    	<div class="card p-4 border-dark">
    		<div class="card-body">

    				  <form action="job"   method="post">
                                            <div class="text-primary"><b><h2>${msg}</h2><b></div>

                    </form>

                     <form action="job"   method="post">
                                                                <div class="text-primary"><b><h2>${message}</h2><b></div>

                                        </form>

    </div>
        </div>
             </div>
  </body>
</html>























