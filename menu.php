<?php
	error_reporting("E-NOTICE");
?>
<?php
//	session_start();
	//if(!$_SESSION['uname'] && (!$_SESSION['pass'])){
	//	header("location: ../login.php");
	//}
?>
<div id="top">
			<h1><a href="#">Content Management system</a></h1>
			<div id="top-navigation">
				Welcome <a href="#"><strong>Administrator</strong></a>
				<span>|</span>
				<a href="logout.php">Log out</a>
			</div>
		</div>
<div id="navigation">
			<ul>
			    <li><a href="index.php"><span>Announcements</span></a></li>
			    <li><a href="Image.php"><span>Image Gallery</span></a></li>
				<li><a href="message.php"><span>Students Message</span></a></li>
	
			</ul>
		</div>