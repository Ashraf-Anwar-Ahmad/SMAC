<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>SMAC</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1" />

<!-- Font Awesome -->
<link rel="stylesheet"
	href="resources/plugins/fontawesome-free/css/all.min.css" />

<!-- icheck bootstrap -->
<link rel="stylesheet"
	href="resources/plugins/icheck-bootstrap/icheck-bootstrap.min.css" />
<!-- Theme style -->
<link rel="stylesheet" href="resources/css/style.css" />
<!-- Ionicons -->
<link rel="stylesheet" href="resources/css/ionicons.min.css" />
<!-- Google Font: Source Sans Pro -->
<link href="resources/css/googleapis.css" rel="stylesheet">
</head>
<body class="hold-transition register-page">
	<div class="register-box">
		<!-- <div class="register-logo"> -->
		<!-- <a href="views/index2.jsp">SMAC</a> -->
		<!-- </div> -->

		<div class="card">
			<div class="card-body">

				<div class="row">
					<div class="col-md-3"></div>
					<div class="col-md-6  text-center">
						<img class="img-responsive"
							src="resources/img/logo-small without bg.png">

					</div>
					<div class="col-md-3"></div>
					<div class="col-md-12 hr-line"></div>

				</div>

				<p class="login-box-msg">SMAC Register</p>

				<form action="index.html" method="post" id="quickForm-register">
					<div class="input-group mb-3">

						<div class="input-group-append">
							<div class="input-group-text">
								<span class="fas fa-user"></span>
							</div>
						</div>
						<input type="text" class="form-control" placeholder="Full name">
					</div>
					<div class="input-group mb-3">

						<div class="input-group-append">
							<div class="input-group-text">
								<span class="fas fa-envelope"></span>
							</div>
						</div>
						<input type="email" class="form-control" placeholder="Email">
					</div>
					<div class="input-group mb-3">

						<div class="input-group-append">
							<div class="input-group-text">
								<span class="fas fa-lock"></span>
							</div>
						</div>
						<input type="password" class="form-control" placeholder="Password">
					</div>
					<div class="input-group mb-3">

						<div class="input-group-append">
							<div class="input-group-text">
								<span class="fas fa-lock"></span>
							</div>
						</div>
						<input type="password" class="form-control"
							placeholder="Retype password">
					</div>
					<div class="row">
						<div class="col-8">
							<div class="icheck-primary">
								<input type="checkbox" id="agreeTerms" name="terms"
									value="agree"> <label for="agreeTerms"> I agree
									to the <a href="#">terms</a>
								</label>
							</div>
						</div>
						<!-- /.col -->
						<div class="col-4">
							<button type="submit" class="btn btn-primary btn-block">Register</button>
						</div>
						<!-- /.col -->
					</div>
				</form>

			</div>
			<!-- /.form-box -->
		</div>
		<!-- /.card -->
	</div>
	<!-- /.register-box -->


	<!-- jQuery -->
	<script src="resources/plugins/jquery/jquery.min.js"></script>
	<!-- Bootstrap 4 -->
	<script src="resources/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- SMAC App -->
	<script src="resources/js/main.min.js"></script>

	<!-- jquery-validation -->
	<script
		src="resources/plugins/jquery-validation/jquery.validate.min.js"></script>
	<script
		src="resources/plugins/jquery-validation/additional-methods.min.js"></script>


	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							$.validator.setDefaults({
								submitHandler : function() {
									alert("Form successful submitted!");
								}
							});
							$('#quickForm-register')
									.validate(
											{
												rules : {
													email : {
														required : true,
														email : true,
													},
													password : {
														required : true,
														minlength : 5
													},
													terms : {
														required : true
													},
												},
												messages : {
													email : {
														required : "Please enter a email address",
														email : "Please enter a vaild email address"
													},
													password : {
														required : "Please provide a password",
														minlength : "Your password must be at least 5 characters long"
													},
													terms : "Please accept our terms"
												},
												errorElement : 'span',
												errorPlacement : function(
														error, element) {
													error
															.addClass('invalid-feedback');
													element.closest(
															'.form-group')
															.append(error);
												},
												highlight : function(element,
														errorClass, validClass) {
													$(element).addClass(
															'is-invalid');
												},
												unhighlight : function(element,
														errorClass, validClass) {
													$(element).removeClass(
															'is-invalid');
												}
											});
						});
	</script>

</body>





</html>
