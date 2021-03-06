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
        <link rel="stylesheet" href="resources/plugins/fontawesome-free/css/all.min.css" />
        
        <!-- icheck bootstrap -->
        <link rel="stylesheet" href="resources/plugins/icheck-bootstrap/icheck-bootstrap.min.css" />
        <!-- Theme style -->
        <link rel="stylesheet" href="resources/css/style.css" />
		<!-- Ionicons -->
        <link rel="stylesheet" href="resources/css/ionicons.min.css" />
        <!-- Google Font: Source Sans Pro -->
         <link href="resources/css/googleapis.css" rel="stylesheet">
        <script type="text/javascript">
function validateform(){
	document.getElementById("loading").style.display='inline';
	return true;
}
</script>
    </head>
    <body class="hold-transition login-page">
        <div class="login-box">
            <div class="login-logo">
			<div></div>
			

            </div>
            <!-- /.login-logo -->
            <div class="card">
                <div class="card-body">
                    <div>					
					     <div class="row">					
								<div class="col-md-3"></div>
								<div class="col-md-6  text-center">
								<img class="img-responsive" src="resources/img/logo-small without bg.png">
								<!-- <div class="logo-text">SMAC</div>								 -->
								</div>
								<div class="col-md-3"></div>								
								<div class="col-md-12 hr-line"></div>								
								<div class="col-md-1"></div>
								<div class="col-md-10 text-center login-tab">								
								    <ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
										<li class="nav-item">
											<a class="nav-link active" id="pills-home-tab" data-toggle="pill" href="#pills-home"  path="USERTYPE" role="tab" aria-controls="pills-home" aria-selected="true">ICG USER</a>
										</li>
										<li class="nav-item">
											<a class="nav-link" id="pills-profile-tab" data-toggle="pill" href="#pills-profile"  path="USERTYPE" role="tab" aria-controls="pills-profile" aria-selected="false">NON ICG USER</a>
										</li>
									</ul>								
								</div>
								<div class="col-md-1"></div> 
					    </div>
					
						
						
                        <div class="tab-content" id="pills-tabContent">
                            <div class="tab-pane fade show active" id="pills-home" role="tabpanel" aria-labelledby="pills-home-tab">
                                <form d="form" method="POST" action="login" onsubmit="return validateform()" modelAttribute="init">								  <div class="form-group input-group mb-3">                                 
                                        <div class="input-group-append">
                                            <div class="input-group-text">
                                                <span class="fas fa-envelope"></span>
                                            </div>
                                        </div>									 
										<input type="email" name="email" class="form-control" id="exampleInputEmail" placeholder="Enter email">
                                    </div>
                                     
                                    <div class="form-group input-group mb-3">								    	
                                       
                                        <div class="input-group-append login-input-left-border">
                                            <div class="input-group-text">
                                                <span class="fas fa-lock"></span>
                                            </div>
                                        </div>
										<input type="password" name="password" class="form-control" id="psw-login" placeholder="Password">
                                    </div>
									
									
									
									
                                    
                                </form>
                            </div>
							
							
                            <div class="tab-pane fade" id="pills-profile" role="tabpanel" aria-labelledby="pills-profile-tab">
                                <form action="#" method="post" id="quickForm-1">
								  <div class="form-group input-group mb-3">                                 
                                        <div class="input-group-append">
                                            <div class="input-group-text">
                                                <span class="fas fa-envelope"></span>
                                            </div>
                                        </div>									 
										<input type="email" name="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
                                    </div>
                                     
                                    <div class="form-group input-group mb-3">								    	
                                       
                                        <div class="input-group-append login-input-left-border">
                                            <div class="input-group-text">
                                                <span class="fas fa-lock"></span>
                                            </div>
                                        </div>
										<input type="password" name="password" class="form-control" id="psw-login-1" placeholder="Password">
                                    </div>
									 
                                    
                                </form>
                            </div>
							
							
							
                        </div>
						
						     <div class="row">
                                        <div class="col-8">
                                            <div class="icheck-primary">
                                                <input type="checkbox" id="remember" onclick="myFunction()" />
                                                <label for="remember"> Show Password </label>
                                            </div>
                                        </div>                                       
                                        <div class="col-4">
                                            <button type="submit" class="btn btn-primary btn-block">Sign In</button>
                                        </div>                                       
                                    </div>
						        
						
						
						
                    </div>
              
                    <p class="mb-0">
                        <a href="views/register.jsp" class="text-center">Register New Account</a>
                    </p>
                </div>
                <!-- /.login-card-body -->
            </div>
        </div>
        <!-- /.login-box -->

        <!-- jQuery -->
        <script src="resources/plugins/jquery/jquery.min.js"></script>
        <!-- Bootstrap 4 -->
        <script src="resources/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- SMAC App -->
        <script src="resources/js/main.min.js"></script>
		
		<!-- jquery-validation -->
<script src="resources/plugins/jquery-validation/jquery.validate.min.js"></script>
<script src="resources/plugins/jquery-validation/additional-methods.min.js"></script>
		
	<script type="text/javascript">
		$(document).ready(function () {
		  $.validator.setDefaults({
			submitHandler: function () {
			  alert( "Form successful submitted!" );
			}
		  });
		  $('#quickForm').validate({
			rules: {
			  email: {
				required: true,
				email: true,
			  },
			  password: {
				required: true,
				minlength: 5
			  },
			  terms: {
				required: true
			  },
			},
			messages: {
			  email: {
				required: "Please enter a email address",
				email: "Please enter a vaild email address"
			  },
			  password: {
				required: "Please provide a password",
				minlength: "Your password must be at least 5 characters long"
			  },
			  terms: "Please accept our terms"
			},
			errorElement: 'span',
			errorPlacement: function (error, element) {
			  error.addClass('invalid-feedback');
			  element.closest('.form-group').append(error);
			},
			highlight: function (element, errorClass, validClass) {
			  $(element).addClass('is-invalid');
			},
			unhighlight: function (element, errorClass, validClass) {
			  $(element).removeClass('is-invalid');
			}
		  });
		});
	</script>
	
	<script>
            function myFunction() {
                var x = document.getElementById("psw-login");
                if (x.type === "password") {
                    x.type = "text";
                } else {
                    x.type = "password";
                }
            }
        </script>
		
		
		
		
		
		<script type="text/javascript">
		$(document).ready(function () {
		  $.validator.setDefaults({
			submitHandler: function () {
			  alert( "Form successful submitted!" );
			}
		  });
		  $('#quickForm-1').validate({
			rules: {
			  email: {
				required: true,
				email: true,
			  },
			  password: {
				required: true,
				minlength: 5
			  },
			  terms: {
				required: true
			  },
			},
			messages: {
			  email: {
				required: "Please enter a email address",
				email: "Please enter a vaild email address"
			  },
			  password: {
				required: "Please provide a password",
				minlength: "Your password must be at least 5 characters long"
			  },
			  terms: "Please accept our terms"
			},
			errorElement: 'span',
			errorPlacement: function (error, element) {
			  error.addClass('invalid-feedback');
			  element.closest('.form-group').append(error);
			},
			highlight: function (element, errorClass, validClass) {
			  $(element).addClass('is-invalid');
			},
			unhighlight: function (element, errorClass, validClass) {
			  $(element).removeClass('is-invalid');
			}
		  });
		});
	</script>
	
	 
 
    </body>
</html>
