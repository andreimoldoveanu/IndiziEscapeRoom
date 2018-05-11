<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div ng-app="myApp">
		<div ng-controller="salaPcController">
			<input style="width:50%" ng-model="text">
			<button ng-click="sendText()">Invia</button> <br>
			<label ng-bind="risultato"></label>
		</div>
	</div>
	
	<script type="text/javascript" src="/resources/js/lib/angularjs-1.6.9.min.js"></script>
	<script>
	var app = angular.module("myApp",[]);
	
	app.controller('salaPcController',function($scope,salaPcService){

		$scope.sendText = function(){
			if($scope.text != undefined && $scope.text != ""){
				
				salaPcService.setText($scope.text).then(function(response){
					$scope.risultato = response.data.text;
				},function(response){
					$scope.risultato = response.data.text;
				})
			}
		}
		
	});

	app.service('salaPcService',function($http){
		this.setText = function(text){
			return $http({
				method: 'POST',
				url: '/escape/writeText',
				data: {
					text: text
				}
			});
		}
	});

	
	</script>
</body>
</html>