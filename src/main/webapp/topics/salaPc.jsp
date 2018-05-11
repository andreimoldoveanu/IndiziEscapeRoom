<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div ng-app="myApp">
		<div ng-coontroller="salaPcController">
			<input style="width:50%" ng-model="text">
			<button ng-click="sendText()"></button>
			<label ng-bind="risultato"></label>
		</div>
	</div>
</body>
</html>