<?php
$servername = "localhost:3306";
$username = "root";
$password = "allow";

// Create connection
$conn = mysqli_connect($servername, $username, $password,"springboot");

// Check connection
if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}

?>