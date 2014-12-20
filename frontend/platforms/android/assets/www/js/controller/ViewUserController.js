sys.app.controller('ViewUserController', function($scope, $http, Auth, $route, $routeParams, $location, sharedProperties) {

	$scope.User 	= Auth.getUser();
	
});