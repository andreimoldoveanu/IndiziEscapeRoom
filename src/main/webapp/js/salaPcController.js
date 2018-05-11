app.controller('salaPcController',function($scope,salaPcService){

	$scope.sendText = function(){
		if($scope.text != undefined && $scope.text != ""){
			console.log(text);
			$scope.risultato = salaPcService.setText(text);
		}
	}
	
});

app.service('salaPcService',function(){
	this.setText = function(text){
		$http({
			method: 'POST',
			url: '',
			params: {
				text: text
			}
		}).then(function(response){
			return response;
		},function(response){
			return response;
		})
	}
});
