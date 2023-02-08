<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="index.jsp" %>
</head>
<body>

<div class="" id="exampleModal"  aria-labelledby="exampleModalLabel" >
<div class="modal-dialog">
 <div class="modal-content">
<div  class="modal-header"> 
<h5 class="modal-title" id="exampleModalLabel">Bakery details here</h5>
      
</div>
 <div class="modal-body">
        
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">BakeryName:</label>
           ${bname}
          </div>
           <div class="mb-3">
            <label for="recipient-name" class="col-form-label">BakeryOwnerNAme:</label>
           ${boname}
          </div>
           <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Married:</label>
           ${married}
          </div>
           <div class="mb-3">
            <label for="recipient-name" class="col-form-label">WifeName:</label>
           ${bwname}
          </div>
           <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Famouse For:</label>
           ${famouse}
          </div>
           <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Since:</label>
           ${since}
          </div>
          
          
          
          
          
          
          
          
          
          
          
           <div class="modal-footer">
        <a class="btn btn-secondary" href="index.jsp">Close</a>
      </div>
      </div></div>
      </div>

</form>


</body>
</html>