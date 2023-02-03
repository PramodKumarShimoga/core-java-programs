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
    <h3>Enter Casino details</h3>
        <div class="mb-3">
            <label class="form-label" for="casinoName">Casino Name</label>
            <input class="form-control" id="casinoName" type="text" placeholder="Casino Name" data-sb-validations="required" name="cname" />
            <div class="invalid-feedback" data-sb-feedback="casinoName:required">Casino Name is required.</div>
        </div>
        <div class="mb-3">
            <label class="form-label" for="cruiseName">Cruise Name</label>
            <input class="form-control" id="cruiseName" type="text" placeholder="Cruise Name" data-sb-validations="required"  name="crname"/>
            <div class="invalid-feedback" data-sb-feedback="cruiseName:required">Cruise Name is required.</div>
        </div>
        <div class="mb-3">
            <label class="form-label" for="entryFee">Entry Fee</label>
            <input class="form-control" id="entryFee" type="text" placeholder="Entry Fee" data-sb-validations="required" name="fee"/>
            <div class="invalid-feedback" data-sb-feedback="entryFee:required">Entry Fee is required.</div>
        </div>
        <div class="mb-3">
            <label class="form-label d-block">Free Food</label>
            <div class="form-check form-check-inline">
                <input class="form-check-input" id="yes" type="radio" name="freeFood" data-sb-validations="required" name="freefood" value="yes"/>
                <label class="form-check-label" for="yes">Yes</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" id="no" type="radio" name="freeFood" data-sb-validations="required" name="freefood" value="no"/>
                <label class="form-check-label" for="no">No</label>
            </div>
            <div class="invalid-feedback" data-sb-feedback="freeFood:required">One option is required.</div>
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