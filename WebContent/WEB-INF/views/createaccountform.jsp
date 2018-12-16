<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-primary">
  
<div class="container">
 <a class="navbar-brand" href="#">
          <img src="logo.png" width="30" height="30" alt="">
        </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  
  <div class="collapse navbar-collapse" id="navbarNav">
   
 
  
    <ul class="navbar-nav">
  
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Login</a>
      </li>
    
     
    </ul>
  </div>
</div>
</nav>
<br>
<div class='container'>
<form:form action="saveaccountandcustomer" cssClass="form" >
	<div class="form-group">
	<form:label path="accType" >account type
	</form:label>
	<form:select path="accType" cssClass="form-control"> 
		<form:option value="checking"/>
				<form:option value="saving"/>
	</form:select><br>
	</div>
		<div class="form-group">
	<form:label path="accPin">Account pin
	</form:label>
	<form:input path="accPin" cssClass="form-control"/><br>
	</div>
			<div class="form-group">
	<form:label path="accBalance">Account Balance
	</form:label>
	<form:input path="accBalance" cssClass="form-control"/><br>
	</div>
			
			<div class="form-group">
	
	<input type="submit" class="from-control btn btn-primary" />
	</div>
</form:form>
</div>
</body>
</html>