<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<!--[if IE]><meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"><![endif]-->
<title>FMS</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="viewport" content="width=device-width">
<link rel="stylesheet" href="resources/css/templatemo_main.css">

</head>
<body>
	<div class="navbar navbar-inverse" role="navigation">
		<div class="navbar-header">
			<div class="logo">
				<h1>
					<b>Legacy FMS</b>
				</h1>
			</div>
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>
	</div>
	<div class="template-page-wrapper">
		<div class="navbar-collapse collapse templatemo-sidebar">
			<ul class="templatemo-sidebar-menu">
				<li>
					<form class="navbar-form">
						<input type="text" class="form-control" id="templatemo_search_box"
							placeholder="Search..."> <span class="btn btn-default">Go</span>
					</form>
				</li>
				<li class="active"><a href="#"><i class="fa fa-home"></i>Dashboard</a></li>
				<li class="sub open"><a href="javascript:;"> <i
						class="fa fa-database"></i> Manage Users
						<div class="pull-right">
							<span class="caret"></span>
						</div>
				</a>
					<ul class="templatemo-submenu">
						<li><a href="javascript:;" data-toggle="modal"
							data-target="#userModal"><i class="fa fa-plus"></i> Add User</a></li>

						<li><a href="adminViewUser" class="fa fa-edit"> Edit
								Users</a></li>

					</ul></li>


				<li class="sub open"><a href="javascript:;"> <i
						class="fa fa-eye"></i> View Records
					
				</li>


				<li><a href="javascript:;" data-toggle="modal"
					data-target="#passModal"><i class="fa fa-cog"></i>Settings</a></li>
				<li><a href="javascript:;" data-toggle="modal"
					data-target="#confirmModal"><i class="fa fa-sign-out"></i>Sign
						Out</a></li>
			</ul>
		</div>
		<!--/.navbar-collapse -->

		<div class="templatemo-content-wrapper">
			<div class="templatemo-content">
				<ol class="breadcrumb">
					<li><a href="admin">Admin Panel</a></li>
					<li><a href="admin">Dashboard</a></li>
					<li class="active">Overview</li>

				</ol>
				

				<div class="table-responsive">
										<h3 class="margin-bottom-15">
											<b> Manage Users</b>
										</h3>
										<table class="table table-striped table-hover table-bordered">
											<thead>
												<tr>

													<th>First Name</th>
													<th>Last Name</th>
													<th>Username</th>
													<th>status</th>

													<th>Edit</th>
													<th>Action</th>

												</tr>
											</thead>
											<tbody>
												<c:forEach var="user" items="${list}">
													<tr>

														<td>${user.firstName}</td>
														<td>${user.secondName}</td>
														<td>${user.username}</td>
														<td></td>




														<td><a href="#" class="btn btn-default">Edit</a></td>
														<td>
															<!-- Split button -->
															<div class="btn-group">
																<button type="button" class="btn btn-info">Action</button>
																<button type="button"
																	class="btn btn-info dropdown-toggle"
																	data-toggle="dropdown">
																	<span class="caret"></span> <span class="sr-only">Toggle
																		Dropdown</span>
																</button>
																<ul class="dropdown-menu" role="menu">
																	<li><a href="#">Enable</a></li>
																	<li><a href="#">Disable</a></li>

																</ul>
															</div>
														</td>
													</tr>
												</c:forEach>



											</tbody>
										</table>
									</div>







			</div>
		</div>
		<!-- Modals -->
		<!--Model one-->

		<div class="modal fade" id="confirmModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
						<div class="panel panel-primary">
							<div class="panel-heading">
								<h5>
									<b>Logging out</b>
									</h4>
							</div>
							<div class="panel-body">
								<h5 class="modal-title" id="myModalLabel">
									<b>Are you sure you want to log out?</b>
								</h5>
								<div class="modal-footer">
									<a href="Login" class="btn btn-primary">Yes</a>
									<button type="button" class="btn btn-default"
										data-dismiss="modal">No</button>
								</div>

							</div>
						</div>
					</div>

				</div>
			</div>
		</div>

		<!--Model two-->

		<div class="modal fade" id="userModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>

						<div class="panel panel-primary">
							<div class="panel-heading">
								<h4>
									<b>ADD USER</b>
								</h4>
							</div>
							<div class="panel-body">
								<form id="" action="adminSaveUser" method="POST"
									class="form-horizontal" commandName="adduser" name="myform"
									onsubmit="return formValidation()">
									<fieldset>
										<div class="form-group">
											<label class="col-lg-1 control-label" for="firstName">
											</label>
											<div class="col-lg-10">
												<input name="firstName" class="form-control"
													placeholder="First Name" id="one" type="text" />
											</div>

										</div>

										<div class="form-group">
											<label class="col-lg-1 control-label" for="firstName">
											</label>
											<div class="col-lg-10">
												<input name="secondName" class="form-control"
													placeholder="Other Name" id="one" type="text" />
											</div>

										</div>

										<div class="form-group">
											<label class="col-lg-1 control-label" for="firstName">
											</label>
											<div class="col-lg-10">
												<input name="username" class="form-control"
													placeholder="User Name" id="one" type="email" />
											</div>

										</div>
									
										<div class="form-group">
											<label class="col-lg-1 control-label" for="otherName"></label>
											<div class="col-lg-10">

												<select name="role" class="form-control">
													<option value="" disabled selected>ROLE</option>


													<option value="ROLE_farmManger">FARM MANAGER</option>
													

												</select>
											</div>

										</div>



										<div class="form-group">
											<label class="col-lg-1 control-label" for="otherName"></label>
											<div class="col-lg-10">
												<input name="password" class="form-control"
													placeholder="Password" type="password" />
											</div>

										</div>
										<div class="form-group">
											<label class="col-lg-1 control-label" for="otherName">
											</label>
											<div class="col-lg-10">
												<input name="confirmPassword" class="form-control"
													placeholder="Confirm password" type="password" />
											</div>

										</div>





										<div class="form-group">
											<div class="col-lg-10">
												<input name="enable" class="form-control"
													placeholder="true/false" type="hidden" value="1" />
											</div>

										</div>


										<div class="modal-footer">
											<button class="btn btn-warning" type="submit" onClick="">Submit</button>
											<button class="btn btn-default" data-dismiss="modal"
												type="button">Cancel</button>
										</div>
										<!-- end modal-footer -->
									</fieldset>
								</form>

							</div>
						</div>
					</div>
					<!--  
            <div class="modal-footer">
              <a href="sign-in.html" class="btn btn-primary">Yes</a>
              <button type="button" class="btn btn-default" data-dismiss="modal">No</button>
            </div>
            -->
				</div>
			</div>
		</div>


		<div class="modal fade" id="passModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>

						<div class="panel panel-primary">
							<div class="panel-heading">
								<h4>
									<b>Change Password</b>
								</h4>
							</div>
							<div class="panel-body">
								<form id="" action="adminSaveUser" method="POST"
									class="form-horizontal" commandName="adduser" name="myform"
									onsubmit="return formValidation()">
									<fieldset>
										<div class="form-group">
											<label class="col-lg-1 control-label" for="firstName">
											</label>
											<div class="col-lg-10">
												<input name="firstName" class="form-control"
													placeholder="Current password" id="one" type="text" />
											</div>

										</div>
										<div class="form-group">
											<label class="col-lg-1 control-label" for="firstName">
											</label>
											<div class="col-lg-10">
												<input name="firstName" class="form-control"
													placeholder="New password" id="one" type="text" />
											</div>

										</div>
										<div class="form-group">
											<label class="col-lg-1 control-label" for="firstName">
											</label>
											<div class="col-lg-10">
												<input name="firstName" class="form-control"
													placeholder="Confirm passowrd" id="one" type="text" />
											</div>

										</div>










										<div class="form-group">
											<div class="col-lg-10">
												<input name="enable" class="form-control"
													placeholder="true/false" type="hidden" value="1" />
											</div>

										</div>


										<div class="modal-footer">
											<button class="btn btn-warning" type="submit" onClick="">Submit</button>
											<button class="btn btn-default" data-dismiss="modal"
												type="button">Cancel</button>
										</div>
										<!-- end modal-footer -->
									</fieldset>
								</form>

							</div>
						</div>
					</div>
					<!--  
            <div class="modal-footer">
              <a href="sign-in.html" class="btn btn-primary">Yes</a>
              <button type="button" class="btn btn-default" data-dismiss="modal">No</button>
            </div>
            -->
				</div>
			</div>
		</div>



	</div>

	<script src="resources/js/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/Chart.min.js"></script>
	<script src="resources/js/templatemo_script.js"></script>
	<script type="text/javascript">
		// Line chart
		var randomScalingFactor = function() {
			return Math.round(Math.random() * 100)
		};
		var lineChartData = {
			labels : [ "Musokw", "Mukiza", "Mulindwa", "Joice", "Jef", "Nasa",
					"July" ],
			datasets : [
					{
						label : "My First dataset",
						fillColor : "rgba(220,220,220,0.2)",
						strokeColor : "rgba(220,220,220,1)",
						pointColor : "rgba(220,220,220,1)",
						pointStrokeColor : "#fff",
						pointHighlightFill : "#fff",
						pointHighlightStroke : "rgba(220,220,220,1)",
						data : [ randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor() ]
					},
					{
						label : "My Second dataset",
						fillColor : "rgba(151,187,205,0.2)",
						strokeColor : "rgba(151,187,205,1)",
						pointColor : "rgba(151,187,205,1)",
						pointStrokeColor : "#fff",
						pointHighlightFill : "#fff",
						pointHighlightStroke : "rgba(151,187,205,1)",
						data : [ randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor() ]
					} ]

		}

		window.onload = function() {
			var ctx_line = document.getElementById("templatemo-line-chart")
					.getContext("2d");
			window.myLine = new Chart(ctx_line).Line(lineChartData, {
				responsive : true
			});
		};

		$('#myTab a').click(function(e) {
			e.preventDefault();
			$(this).tab('show');
		});

		$('#loading-example-btn').click(function() {
			var btn = $(this);
			btn.button('loading');
			// $.ajax(...).always(function () {
			//   btn.button('reset');
			// });
		});
	</script>
</body>
</html>