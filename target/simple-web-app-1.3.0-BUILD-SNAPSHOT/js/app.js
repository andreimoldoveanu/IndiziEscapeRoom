var app = angular.module("myApp",['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {
	$routeProvider.
	when('/home', {
		templateUrl: 'topics/home.html',
		controller: 'homeController'
	}).
	when('/escape/salaPc',{
		templateUrl: 'topics/salaPc.html',
		controller: 'salaPcController'
	}).
	when('/escape/salaEscape',{
		templateUrl: 'topics/salaEscape.html',
		controller: 'salaEscapeController'
	}).
	otherwise({
		redirectTo: '/home'
	});
}]);	