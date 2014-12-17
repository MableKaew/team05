sys.app.controller('ManageBasketController', function($scope, $http, Shared, Auth, sharedProperties) {

$scope.setproductId = function(memberId,productId){
		sharedProperties.setMemberId(memberId);
		sharedProperties.setarr(productId);
		//$scope.GotoPage('reg-registration/index');
	}
	
	$scope.deletearr = function(arrid){
		sharedProperties.deletearr(arrid);
		//$scope.GotoPage('reg-registration/index');
	}
$scope.ShowProductBasket = function(){
		var arr = sharedProperties.getarr();
		var memberId = sharedProperties.getMemberId();


		$http.post('http://localhost:8080/saveBasket/'+arr+'/add',data).success(function(data){
			alert(data);
		});
		
	}


});