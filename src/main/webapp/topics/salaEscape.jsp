<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div ng-app="myApp">
		<div ng-controller="salaEscapeController">
			<label ng-bind="risultato"></label>
		</div>
	</div>
	
	<script type="text/javascript" src="/resources/js/lib/angularjs-1.6.9.min.js"></script>
	<script>
	var app = angular.module("myApp",[]);
	
	app.controller('salaEscapeController',function($scope,salaEscapeService,$interval){

		$interval( function(){
			salaEscapeService.getText().then(function(response){
				$scope.risultato = response.data.text;
			},function(response){
				$scope.risultato = response.data.text;
			});
		},5000);
		
		
	});

	app.service('salaEscapeService',function($http){
		this.getText = function(){
			return $http({
				method: 'GET',
				url: '/escape/getText'
			});
		}
	});

	
	</script>
</body>
</html>