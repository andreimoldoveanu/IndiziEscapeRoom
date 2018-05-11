var app = angular.module("myApp",['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {
	$routeProvider.
	when('/home', {
		templateUrl: 'topics/home.jsp',
		controller: 'homeController'
	}).
	when('/escape/text',{
		templateUrl: 'topics/text.jsp',
		controller: 'textController'
	});
	otherwise({
		redirectTo: '/home'
	});
}]);	