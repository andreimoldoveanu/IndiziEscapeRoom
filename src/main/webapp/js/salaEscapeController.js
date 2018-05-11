app.controller('salaEscapeController',function($scope,salaEscapeService){

	$scope.risultato = "";
	$scope.risultato = salaEscapeService.getText();
	
	
	
})

app.service('salaEscapeService',function(){
	this.getText = function(){
		$http({
			method: 'GET',
			url: ''
		}).then(function(response){
			return response;
		},function(response){
			return response;
		})
	}
});