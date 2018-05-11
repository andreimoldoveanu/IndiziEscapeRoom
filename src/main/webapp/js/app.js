var app = angular.module("myApp",['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {
	$routeProvider.
	when('/home', {
		templateUrl: 'topics/home.jsp',
		controller: 'homeController'
	}).
	when('/escape/salaPc',{
		templateUrl: 'topics/salaPc.jsp',
		controller: 'salaPcController'
	}).
	when('/escape/salaEscape',{
		templateUrl: 'topics/salaEscape.jsp',
		controller: 'salaEscapeController'
	}).
	otherwise({
		redirectTo: '/home'
	});
}]);	