sys.app.controller('MainController', function($scope, $http, $location, Auth, $route, $routeParams) {
	
	$scope.$route = $route;
    $scope.$location = $location;
    $scope.$routeParams = $routeParams;
    
	$scope.$watch(Auth.isLoggedIn, function(value, oldValue) {
		if (!value && oldValue) {
			console.log("Disconnect");
			$location.path('/login');
		}

		if (value) {
			console.log("Connect");
			alert('Login Success');
		}
	}, true);
	
});