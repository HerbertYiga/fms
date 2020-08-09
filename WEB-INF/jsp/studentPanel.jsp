<!DOCTYPE html>
<head>
<meta charset="utf-8">
<!--[if IE]><meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"><![endif]-->
<title>Online Voting</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="viewport" content="width=device-width">
<link rel="stylesheet" href="resources/css/templatemo_main.css">
<!-- 
Dashboard Template 
http://www.templatemo.com/preview/templatemo_415_dashboard
-->
</head>
<body>
	<div id="main-wrapper">
		<div class="navbar navbar-inverse" role="navigation">
			<div class="navbar-header">
				<div class="logo">
					<h1>
						<b>ONLINE VOTING</b>
					</h1>
				</div>
			</div>
		</div>
		<div class="template-page-wrapper">
			<form class="form-horizontal templatemo-signin-form" role="form"
				action="checkvoter" method="get">
				<div class="form-group">
					<div class="col-md-12">
					
						<div class="col-sm-14">
							<input type="text" class="form-control" id="username"
								placeholder="ENTER YOUR VOTING ID">
								<h5 style="color: red; text-align: center;">
									<b>${error}</b>
								</h5>
						</div>
					</div>
				</div>


				<div class="modal-footer">
					<button class="btn btn-warning" type="submit" onClick="">Submit</button>
					<button class="btn btn-default" data-dismiss="modal" type="button">Cancel</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>