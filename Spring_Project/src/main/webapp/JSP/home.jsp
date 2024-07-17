<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
 function myfun(){
	 
	 alert("Task Added..")
 }

</script>
</head>
<body>
<form action="homeData">
<p>welcome to home</p>
 Title:<input type="text" name="tilte"><br>
 Disciption:<input type="text" name="disciption"><br>
 Completed:<input type="text" name="completed"><br><br>
 <input type="submit" value="AddTask"> <br><br>
 <a href="viewTask"><input type="button" value="ViewTask"></a>
</form>
</body>
</html>