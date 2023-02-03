<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<%@ include file="Nav_bar.jsp" %>
</head>
<body>
<div class="container px-5 my-5">
    <form id="contactForm" data-sb-form-api-token="API_TOKEN">
    <h3>Enter Beach details</h3>
        <div class="mb-3">
            <label class="form-label" for="beachName">Beach Name</label>
            <input class="form-control" id="beachName" type="text" placeholder="Beach Name" data-sb-validations="required" name="bname"/>
            <div class="invalid-feedback" data-sb-feedback="beachName:required">Beach Name is required.</div>
        </div>
        <div class="mb-3">
            <label class="form-label" for="location">location</label>
            <input class="form-control" id="location" type="text" placeholder="location" data-sb-validations="required" name="blocation" />
            <div class="invalid-feedback" data-sb-feedback="location:required">location is required.</div>
        </div>
        <div class="mb-3">
            <label class="form-label d-block">Clean</label>
            <div class="form-check form-check-inline">
                <input class="form-check-input" id="yes" type="radio" name="clean" data-sb-validations="required" name="clean" value="yes"/>
                <label class="form-check-label" for="yes">Yes</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" id="no" type="radio" name="clean" data-sb-validations="required" name="clean" value="no"/>
                <label class="form-check-label" for="no">No</label>
            </div>
            <div class="invalid-feedback" data-sb-feedback="clean:required">One option is required.</div>
        </div>
        <div class="mb-3">
            <label class="form-label" for="games">Games</label>
            <select class="form-select" id="games" aria-label="Default select example" name="games[]" multiple>
                <option value="Fly a kite">Fly a kite</option>
                <option value="Seashell hunt">Seashell hunt</option>
                <option value="Volleyball">Volleyball</option>
                <option value="Dig a hole">Dig a hole</option>
                <option value="Frisbee">Frisbee</option>
            </select>
           
        </div>
        <div class="d-none" id="submitSuccessMessage">
            <div class="text-center mb-3">
                <div class="fw-bolder">Form submission successful!</div>
                <p>To activate this form, sign up at</p>
                <a href="https://startbootstrap.com/solution/contact-forms">https://startbootstrap.com/solution/contact-forms</a>
            </div>
        </div>
        <div class="d-none" id="submitErrorMessage">
            <div class="text-center text-danger mb-3">Error sending message!</div>
        </div>
        <div class="d-grid">
            <button class="btn btn-primary btn-lg disabled" id="submitButton" type="submit">Submit</button>
        </div>
    </form>
</div>
<script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>

</body>
</html>