sys.app.controller('ManageUserController', function($scope, $http, Shared) {

		var baseUrl 	= Shared.getBaseUrl();
		
		
		// เพิ่มข้อมูล member
		$scope.addMember = function() {	
			var subUrl = '/member/add';
			var data = {	
				userName: 	$scope.userName,
				passWord: 	$scope.passWord,
				sex:		$scope.sex,
				name:		$scope.name,
				lastname:	$scope.lastname,
				email:		$scope.email,
				tel:		$scope.tel,
				level:		'USER'
			};
			
			$http.post(baseUrl + subUrl, data).success(function(data){
				//alert(data);
			//	MainNavigator.pushPage("_login.html");
			});
		}
		
		// เพิ่มข้อมูล Admin
		$scope.addAdmin = function() {	
			var subUrl = '/admin/add';
			var data = {	
				userName: 	$scope.userName,
				passWord: 	$scope.passWord,
				sex:		$scope.sex,
				name:		$scope.name,
				lastname:	$scope.lastname,
				email:		$scope.email,
				tel:		$scope.tel,
				level:		'ADMIN'
			};
			
			$http.post(baseUrl + subUrl, data).success(function(data){
				alert(data);
				MainNavigator.pushPage("index.html");
			});
		}
		
});