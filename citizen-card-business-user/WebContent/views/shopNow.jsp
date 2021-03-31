<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%-- <jsp:include page="/views/include/Meta.jsp"></jsp:include>
<jsp:include page="/views/include/Imports.jsp"></jsp:include> --%>
<script>



</script>

</head>




<body>
<br>

  <h3><b>Search details with Adhar Number</b></h3>
<h4>
<tr>
 
   <td> <b>Adhar Number</b></td>
     <td>   <input type="text"  name="adhr" id="adhr" /></td>
     <td>   <button type="submit" ng-click="adharSearch()">Search User</button></td>
  </tr>
  <br>
  <tr>
 
   <td> <b>Verify User OTP</b></td>
     <td>   <input type="text"  name="otp" id="otp" /></td>
     <td>   <button type="submit" ng-click="verifyOTP()">Verify OTP</button></td>
  </tr>
  

</h4>
 <br>
<form  name="loginform">





<table align="left">
  
  <tr>
    <th> <label><b>User Name</b></label></th>
   <td> {{searchUser.login}}</td>
 <!--  <th><label><b>Password </b></label></th>
     <td>   {{searchUser.password}}</td> -->
     <th><label><b>Email </b></label></th>
     <td> {{searchUser.email}}</td>
  </tr>
  
  
  
    <tr>
    <th> <label><b>First Name</b></label></th>
   <td>  {{searchUser.firstName}}</td>
  <th><label><b>Middle Name </b></label></th>
     <td>    {{searchUser.middleName}}</td>
     <th><label><b>Last Name </b></label></th>
     <td>    {{searchUser.lastName}}</td>
  </tr>
  
  
  <tr>
    <th> <label><b>Blood Group</b></label></th>
   <td>  {{searchUser.bloodGroup}}</td>
  <th><label><b>Phone Number </b></label></th>
     <td>   {{searchUser.contactNumber}}</td>
     <th><label><b>Date Of Birth</b></label></th>
     <td>   {{searchUser.dateOfBirth}}</td>
  </tr>
  
  
  
  <tr>
    <th> <label><b>Adhar Number</b></label></th>
   <td>{{searchUser.adharNumber}}</td>
 <th> <label><b>PAN Number</b></label></th>
   <td>{{searchUser.panNumber}}</td>
     <th> <label><b>Driving Licence Number</b></label></th>
   <td>{{searchUser.drivingLicence}}</td>
  </tr>
  
 
   


   
   
    <tr>
    <th> <label><b>Passport Number</b></label></th>
   <td>{{searchUser.passportNumber}}</td>
    <th><label><b>Ration Card </b></label></th>
     <td> {{searchUser.rationCard}}</td>
      <th><label><b>Passport Expire Date </b></label></th>
     <td>  {{searchUser.passportExpireDate}}</td>
  </tr>
 
 
      <tr>
    <th> <label><b>Street</b></label></th>
   <td>{{searchUser.street}}</td>
    <th><label><b>City </b></label></th>
     <td> {{searchUser.city}}</td>
      <th><label><b>State </b></label></th>
     <td>  {{searchUser.state}}</td>
  </tr>
   
  
   
  
  
  
 
 </table>



</html>