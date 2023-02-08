<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<%@ include file="Nav_bar.jsp" %>




<style>
body{
background-color:#dee2e6;
}
</style>


</head>
<body>



<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" style="width:90%;font-size:20px;margin-left:60px;"><marquee>Click here to enter the details of bakery...</marquee></button>
   <form action="bake" method="post" name="ind">
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
 
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Enter Bakery details here..</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">BakeryName:</label>
            <input type="text" class="form-control" name="bakeryName" required>
          </div>
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">OwnerName:</label>
            <input type="text" class="form-control" name="ownerName" required>
          </div>
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">WifeName:</label>
            <input type="text" class="form-control" name="wifeName" required>
          </div>
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Married:</label>
            <input type="radio"  name="married" value="yes">Yes
            <input type="radio" name="married" value="no">NO
          </div>
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">FamousFor:</label>
            <textarea class="form-control" name="famouseFor" style="resize:none" ></textarea>
          </div>
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Since:</label>
            <input type="number" class="form-control" name="since" min="1700" max="2023" required>
          </div>
          
          
          
       
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Send</button>
      </div>
    </div>
  </div>
</div>
</form>

</body>
</html>