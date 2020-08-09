<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<!--[if IE]><meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"><![endif]-->
<title>E-voting</title>
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
					<b>ONLINE VOTING</b>
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
				<li class="active"><a href="user"><i class="fa fa-home"></i>Dashboard</a></li>
				<li class="sub open"><a href="javascript:;"> <i
						class="fa fa-database"></i> Manage Register
						<div class="pull-right">
							<span class="caret"></span>
						</div>
				</a>
					<ul class="templatemo-submenu">
						<li><a href="javascript:;" data-toggle="modal"
							data-target="#registerModal"><i class="fa fa-plus"></i>
								Register students</a></li>

						<li><a href="javascript:;" data-toggle="modal"
							data-target="#uploadRegisterModal"><i class="fa fa-plus"></i>
								Upload Register</a></li>

						<li><a href="javascript:;" data-toggle="modal"
							data-target="#uploadRegisterImageModal"><i class="fa fa-plus"></i>
								Upload Images to register</a></li>


					</ul></li>
				<li class="sub open"><a href="javascript:;"> <i
						class="fa fa-database"></i> Manage Candidates
						<div class="pull-right">
							<span class="caret"></span>
						</div>
				</a>
					<ul class="templatemo-submenu">
						<li><a href="javascript:;" data-toggle="modal"
							data-target="#registerCandidateModel"><i class="fa fa-plus"></i>
								Register candidate</a></li>

						<li><a href="javascript:;" data-toggle="modal"
							data-target="#uploadCandidatesModel"><i class="fa fa-plus"></i>
								Upload Candidates </a></li>

						<li><a href="javascript:;" data-toggle="modal"
							data-target="#uploadCandidatesImageModel"><i
								class="fa fa-plus"></i> Upload images for candidates </a></li>



						<li><a href="userViewRegisteredCandidate" class="fa fa-upload"> View
								Registered Candidates</a></li>


					</ul></li>





				<li><a href="javascript:;" data-toggle="modal"
					data-target="#confirmModal"><i class="fa fa-sign-out"></i>Sign
						Out</a></li>
			</ul>
		</div>
		<!--/.navbar-collapse -->

		<div class="templatemo-content-wrapper">
			<div class="templatemo-content">
				<ol class="breadcrumb">
					<li><a href="index.html">User Panel</a></li>
					<li><a href="#">Registered Candidates</a></li>
					<li class="active">View</li>

				</ol>



				<div class="row">
					<div class="col-md-12">
						<div class="templatemo-alerts">
							<div class="row">
								<div class="col-md-12">

									<!-- list oxf users  -->
									<div class="table-responsive">
										<h1 class="margin-bottom-15">Registered Candidates</h1>
										<table class="table table-striped table-hover table-bordered">
											<thead>
												<tr>
														<th>S/N</th>
								<th>F.NAME</th>
								<th>O.NAMES</th>
								<th>FACULTY</th>
								<th>SEX</th>
								
								<th>HALL</th>
								
								<th>SPONSORSHIP</th>
								<th>CITIZENSHIP</th>
								
								
								<th>P.TYPE</th>
								<th>PWD</th>

								<th>RESIDENCE</th>
								<th>POSITION</th>
								<th>IMAGE</th>
								<th style="color:orange">EDIT</th>
								<th style="color:red">REMOVE</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach var="details" items="${list}">
													<tr>
														
														
														
														
														
									<td>${details.studentNo}</td>
									<td>${details.candidateFirstName}</td>
									<td>${details.candidateSecondName}</td>
									<td>${details.faculty}</td>
									
									<td>${details.sex}</td>

									<td>${details.hall}</td>

									<td>${details.sponsorship}</td>
									<td>${details.citizenship}</td>
									
									<td>${details.programType}</td>
									<td>${details.pwd}</td>
									
									<td>${details.residenceType}</td>
									<td>${details.position}</td>
									
										<td>  <img class="img-responsive" alt="a" height="50px" width="60px"
				src="<c:url value='/resources/image/${details.imageLink}'/>">
										</td>
                                  	<td></td>
                                  		<td></td>
															</tr>
												</c:forEach>



											</tbody>
										</table>
									</div>












								</div>
							</div>
						</div>
					</div>

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
	</div>

	<!--Model tqo-->

	<div class="modal fade" id="registerModal" tabindex="-1" role="dialog"
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
								<b>Add Student</b>
							</h4>
						</div>
						<div class="panel-body">
							<form id="" action="registerstudent" method="POST"
								class="form-horizontal" enctype="multipart/form-data">
								<fieldset>
									<div class="form-group">
										<label class="col-lg-1 control-label" for="firstName">
										</label>
										<div class="col-lg-10">
											<input name="names" class="form-control" placeholder="NAMES"
												id="one" type="text" />
										</div>

									</div>

									<br>
									<div class="form-group">
										<label class="col-lg-1 control-label" for="firstName">
										</label>
										<div class="col-lg-10">
											<input name="course" class="form-control"
												placeholder="PROGRAM CODE" id="one" type="text" />
										</div>

									</div>




									<br>

									<div class="form-group">
										<label class="col-lg-1 control-label" for="firstName">
										</label>
										<div class="col-lg-10">
											<select name="hall" class="form-control">
												<option value="" disabled selected>HALL</option>
												<option value="KULUBYA">KULUBYA</option>
												<option value="NANZIRI">NANZIRI</option>
												<option value="NORTH">NORTH HALL</option>
												<option value="PEARL">PEARL</option>
												<option value="MANDELA">MANDELA</option>
											</select>
										</div>

									</div>




									<br>

									<div class="form-group">
										<label class="col-lg-1 control-label" for="otherName">
										</label>
										<div class="col-lg-10">
											<select name="sex" class="form-control">
												<option value="" disabled selected>SEX</option>
												<option value="MALE">MALE</option>
												<option value="FEMALE">FEMALE</option>


											</select>

										</div>

									</div>






									<div class="form-group">
										<label class="col-lg-1 control-label" for="otherName"></label>
										<div class="col-lg-10">

											<select name="programType" class="form-control">
												<option value="" disabled selected>PROGRAMME TYPE</option>
												<option value="DAY">DAY</option>
												<option value="EVENING">EVENING</option>
												<option value="WEEKEND">WEEKEND</option>


											</select>
										</div>

									</div>
									<div class="form-group">
										<label class="col-lg-1 control-label" for="otherName">
										</label>
										<div class="col-lg-10">

											<select name="residenceType" class="form-control">
												<option value="" disabled selected>RESIDENCE TYPE</option>
												<option value="RESIDENT">RESIDENT</option>
												<option value="NON-RESIDENT">NON-RESIDENT</option>



											</select>





										</div>

									</div>

									<div class="form-group">
										<label class="col-lg-1 control-label" for="otherName">
										</label>
										<div class="col-lg-10">
											<select name="sponsorship" class="form-control">
												<option value="" disabled selected>SPONSORSHIP</option>
												<option value="GOVERNMENT">GOVERNMENT</option>
												<option value="PRIVATE">PRIVATE</option>



											</select>
										</div>

									</div>

									<div class="form-group">
										<label class="col-lg-1 control-label" for="otherName">
										</label>
										<div class="col-lg-10">

											<select name="pwd" class="form-control">
												<option value="" disabled selected>PWD</option>
												<option value="YES">YES</option>
												<option value="NO">NO</option>




											</select>

										</div>

									</div>

									<div class="form-group">
										<label class="col-lg-1 control-label" for="otherName">
										</label>
										<div class="col-lg-10">
											<select name="citizenship" class="form-control">
												<option value="" disabled selected>CITIZENSHIP</option>
												<option value="UGANDAN">UGANDAN</option>
												<option value="INTERNATIONAL">INTERNATIONAL</option>
											</select>
										</div>

									</div>






									<div class="form-group">
										<label class="col-lg-1 control-label" for="otherName">
										</label>
										<div class="col-lg-10">
											<select name="coordinator" class="form-control">
												<option value="" disabled selected>COORDINATOR</option>
												<option value="YES">YES</option>
												<option value="NO">NO</option>
											</select>
										</div>

									</div>

									<div class="form-group">
										<label class="col-lg-1 control-label" for="otherName">
										</label>
										<div class="col-lg-10">
											<select name="faculty" class="form-control">
												<option value="" disabled selected>FACULTY</option>
												<option value="FACULTY OF VOCATIONAL STUDIES">FACULTY
													OF VOCATIONAL STUDIES</option>

												<option value="FACULTY OF SPECIAL NEEDS AND REHABILITATION">FACULTY
													OF SPECIAL NEEDS AND REHABILITATION</option>
												<option value="FACULTY OF EDUCATION">FACULTY OF
													EDUCATION</option>
												<option value="FACULTY OF ENGINEERING">FACULTY OF
													ENGINEERING</option>
												<option value="GRADUATE SCHOOL">GRADUATE SCHOOL</option>
												<option value="SCHOOL OF MANAGEMENT AND ENTREPRENEURSHIP">SCHOOL
													OF MANAGEMENT AND ENTREPRENEURSHIP</option>
												<option value="FACULTY OF SCIENCE">FACULTY OF
													SCIENCE</option>
												<option value="FACULTY OF ARTS AND SOCIAL SCIENCES">FACULTY
													OF ARTS AND SOCIAL SCIENCES</option>





											</select>
										</div>

									</div>
									<div class="form-group">
										<label class="col-lg-1 control-label" for="otherName">
										</label>
										<div class="col-lg-10">
											<input name="studentNo" class="form-control"
												placeholder="STUDENT NO" type="text" />
										</div>

									</div>
									<div class="form-group">
										<label class="col-lg-1 control-label" for="otherName">
										</label>
										<div class="col-lg-10">
											<div>
												<img id="user_img" height="130" width="130"
													style="border: solid" /><br> <br>
											</div>

											<input name="image" class="" type="file" id="file"
												onchange="show(this)" />


										</div>

									</div>



									<br> <br> <br>








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

	<!-- model three -->




	<div class="modal fade" id="uploadRegisterModal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>

					<div class="panel panel-primary">
						<div class="panel-heading">
							<h4>
								<b>Upload Register</b>
							</h4>
						</div>
						<div class="panel-body">

							<form id="" action="adminSaveUser" method="POST"
								class="form-horizontal" commandName="adduser">
								<fieldset>



									<div class="form-group">
										<label class="col-lg-1 control-label" for="otherName">
										</label>
										<div class="col-lg-7">

											<label for="fileToUpload">Select a File to Upload</label><br />
											<input type="file" name="fileToUpload" id="fileToUpload"
												onchange="fileSelected();" />
										</div>

									</div>



									<br>








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

	<!-- model 4 -->
	<div class="modal fade" id="uploadRegisterImageModal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>

					<div class="panel panel-primary">
						<div class="panel-heading">
							<h4>
								<b>Upload images to the Register</b>
							</h4>
						</div>
						<div class="panel-body">

							<form id="" action="adminSaveUser" method="POST"
								class="form-horizontal" commandName="adduser">
								<fieldset>



									<div class="form-group">
										<label class="col-lg-1 control-label" for="otherName">
										</label>
										<div class="col-lg-7">

											<label for="fileToUpload">Select a File to Upload</label><br />
											<input type="file" name="fileToUpload" id="fileToUpload"
												onchange="fileSelected();" />
										</div>

									</div>



									<br>








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


	<!-- five  -->


	<!-- model 4 -->
	<div class="modal fade" id="registerCandidateModel" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-registerCandidateDialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>

					<div class="panel panel-primary">
						<div class="panel-heading">
							<h4>
								<b>Register Candidate</b>
							</h4>
						</div>
						<div class="panel-body">

							<form id="" action="registercandidate" method="POST"
								enctype="multipart/form-data" class="form-horizontal">
								<fieldset>
									<div class="form-group">

										<div class="col-lg-4">
											<input name="candidateFirstName" class="form-control"
												placeholder="CANDIDATE'S FIRST NAME" id="one" type="text" />
										</div>



										<div class="col-lg-4">
											<input name="candidateSecondName" class="form-control"
												placeholder="CANDIDATE'S OTHER NAMES " id="one" type="text" />
										</div>

										<div class="col-lg-4">
											<select name="hall" class="form-control">
												<option value="" disabled selected>HALL</option>
												<option value="KULUBYA">KULUBYA</option>
												<option value="NANZIRI">NANZIRI</option>
												<option value="NORTH">NORTH HALL</option>
												<option value="PEARL">PEARL</option>
												<option value="MANDELA">MANDELA</option>
											</select>
										</div>

									</div>
									<br> <br>
									<div class="form-group">
										<div class="col-lg-4">
											<input name="course" class="form-control"
												placeholder="Program Code" id="one" type="text" />
										</div>
										<div class="col-lg-4">
											<select name="sex" class="form-control">
												<option value="" disabled selected>SEX</option>
												<option value="MALE">MALE</option>
												<option value="FEMALE">FEMALE</option>


											</select>
										</div>
										<div class="col-lg-4">
											<select name="programType" class="form-control">
												<option value="" disabled selected>PROGRAMME TYPE</option>
												<option value="DAY">DAY</option>
												<option value="EVENING">EVENING</option>
												<option value="WEEKEND">WEEKEND</option>


											</select>



										</div>




									</div>
									<br>
									<div class="form-group">
										<div class="col-lg-4">
											<select name="residenceType" class="form-control">
												<option value="" disabled selected>RESIDENCE TYPE</option>
												<option value="RESIDENT">RESIDENT</option>
												<option value="NON-RESIDENT">NON-RESIDENT</option>



											</select>
										</div>
										<div class="col-lg-4">
											<select name="sponsorship" class="form-control">
												<option value="" disabled selected>SPONSORSHIP</option>
												<option value="GOVERNMENT">GOVERNMENT</option>
												<option value="PRIVATE">PRIVATE</option>



											</select>
										</div>

										<div class="col-lg-4">
											<select name="pwd" class="form-control">
												<option value="" disabled selected>PWD</option>
												<option value="YES">YES</option>
												<option value="NO">NO</option>




											</select>
										</div>




									</div>


									<br>


									<div class="form-group">
										<div class="col-lg-4">
											<select name="citizenship" class="form-control">
												<option value="" disabled selected>CITIZENSHIP</option>
												<option value="UGANDAN">UGANDAN</option>
												<option value="INTERNATIONAL">INTERNATIONAL</option>
											</select>
										</div>
										<div class="col-lg-4">
											<select name="coordinator" class="form-control">
												<option value="" disabled selected>COORDINATOR</option>
												<option value="YES">YES</option>
												<option value="NO">NO</option>
											</select>
										</div>
										<div class="col-lg-4">
											<select name="faculty" class="form-control">
												<option value="" disabled selected>FACULTY</option>
												<option value="FACULTY OF VOCATIONAL STUDIES">FACULTY
													OF VOCATIONAL STUDIES</option>

												<option value="FACULTY OF SPECIAL NEEDS AND REHABILITATION">FACULTY
													OF SPECIAL NEEDS AND REHABILITATION</option>
												<option value="FACULTY OF EDUCATION">FACULTY OF
													EDUCATION</option>
												<option value="FACULTY OF ENGINEERING">FACULTY OF
													ENGINEERING</option>
												<option value="GRADUATE SCHOOL">GRADUATE SCHOOL</option>
												<option value="SCHOOL OF MANAGEMENT AND ENTREPRENEURSHIP">SCHOOL
													OF MANAGEMENT AND ENTREPRENEURSHIP</option>
												<option value="FACULTY OF SCIENCE">FACULTY OF
													SCIENCE</option>
												<option value="FACULTY OF ARTS AND SOCIAL SCIENCES">FACULTY
													OF ARTS AND SOCIAL SCIENCES</option>







											</select>
										</div>



									</div>


									<br>


									<div class="form-group">
										<div class="col-lg-4">
											<input name="studentNo" class="form-control"
												placeholder="CANDIDATE'S STUDENT NUMBER" id="one"
												type="text" />
										</div>
										<div class="col-lg-4">
											<select name="position" class="form-control">
												<option value="" disabled selected>POSITION</option>

												<option value="GUILD PRESIDENT">GUILD PRESIDENT</option>

												<option value="FACULTY GRC">FACULTY GRC</option>

												<option value="HALL CHAIRPERSON">HALL CHAIRPERSON</option>

												<option value="HALL GRC">HALL GRC</option>
												<option value="GRC PRIVATE STUDENTS">GRC PRIVATE
													STUDENTS</option>
												<option value="GRC GOVERNMENT STUDENTS">GRC
													GOVERNMENT STUDENTS</option>
												<option value="GRC EVENING STUDENTS">GRC EVENING
													STUDENTS</option>
												<option value="GRC NONRESIDENTS">GRC NONRESIDENTS</option>
												<option value="GRC COORDINDATORS">GRC COORDINDATORS</option>
												<option value="GRC PWD">GRC PWD</option>
												<option value="GRC INTERNATIONAL STUDENTS">GRC
													INTERNATIONAL STUDENTS</option>







											</select>
										</div>


										<div class="col-lg-4">



											<div>
												<img id="user_img" height="130" width="130"
													style="border: solid" /><br> <br>
											</div>
											<div>
												<input name="candidateImage" class="" type="file" id="file"
													name="file" onchange="show(this)" placeholder="" />

											</div>
										</div>
										<br> <br> <br> <br>









									</div>











									<div class="modal-footer">

										<button class="btn btn-success" type="submit"
											onClick="return Checkfiles()" style="color: white;">Submit</button>
										<button class="btn btn-primary" data-dismiss="modal"
											type="reset">Reset</button>
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
	<!-- Upload candidates form -->
	<div class="modal fade" id="uploadCandidatesModel" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>

					<div class="panel panel-primary">
						<div class="panel-heading">
							<h4>
								<b>Upload candidates</b>
							</h4>
						</div>
						<div class="panel-body">

							<form id="" action="adminSaveUser" method="POST"
								class="form-horizontal" commandName="adduser">
								<fieldset>



									<div class="form-group">
										<label class="col-lg-1 control-label" for="otherName">
										</label>
										<div class="col-lg-7">

											<label for="fileToUpload">Select a File to Upload</label><br />
											<input type="file" name="fileToUpload" id="fileToUpload"
												onchange="fileSelected();" />
										</div>

									</div>



									<br>








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
	<div class="modal fade" id="uploadCandidatesImageModel" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>

					<div class="panel panel-primary">
						<div class="panel-heading">
							<h4>
								<b>Upload images for the Candidates</b>
							</h4>
						</div>
						<div class="panel-body">

							<form id="" action="adminSaveUser" method="POST"
								class="form-horizontal" commandName="adduser">
								<fieldset>



									<div class="form-group">
										<label class="col-lg-1 control-label" for="otherName">
										</label>
										<div class="col-lg-7">

											<label for="fileToUpload">Select a File to Upload</label><br />
											<input type="file" name="fileToUpload" id="fileToUpload"
												onchange="fileSelected();" />
										</div>

									</div>



									<br>








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
			labels : [ "January", "February", "March", "April", "May", "June",
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