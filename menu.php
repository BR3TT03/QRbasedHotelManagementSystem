<?php
	error_reporting(E_ERROR | E_WARNING | E_PARSE | E_NOTICE);
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
				<a href="index.php">Log out</a>
			</div>
		</div>
<div id="navigation">
			<ul>
			    <li><a href="index.php"><span>Menu LIst</span></a></li>
				<li><a href="orders.php"><span>orders</span></a></li>
				<li><a href="orders.php"><span>payment</span></a></li>
	
			</ul>
		</div>