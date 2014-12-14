sys.app.controller('LoginController', function($scope, $http, Auth, $route, $routeParams, $location) {
	
	var baseUrl = 'http://localhost:8080';
	
	$scope.checkLogin 	= Auth.isLoggedIn();
	$scope.$route 		= $route;
    $scope.$location 	= $location;
    $scope.$routeParams = $routeParams;

	$scope.login = function() {
		var us = $scope.userName;
		var pw = $scope.passWord;
		
		var url = baseUrl + '/user/login/' + us + '/' + pw;
		$http.get(url).success(function(data) {
			if(data != 'null') {
				data 		= data.split(":");
				var id 		= data[0];
				var level 	= data[1];
				
				if(level == 'ADMIN') {
					url = baseUrl + '/admin/show/' + id;
					var path = '/Admin';
				} else {
					url = baseUrl + '/member/show/' + id;
					var path = '/index';
				}
				
				$http.get(url).success(function(data) {
					Auth.setUser(data);
					$location.path(path);
				});
				
			}else{
				alert(data);
			}
		});
	}
	
});