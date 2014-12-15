sys.app.controller('ViewProductController',function($scope, $http, Shared){
	var baseUrl = Shared.getBaseUrl();


	$scope.showProductDetail = function(id){
		var subUrl='/product/show/'+id;
		$http.get(baseUrl + subUrl).success(function(data){
			$scope.data=data;
		});
		//ModalDetail.show();
	}
	
	$scope.showProductAll = function(id){
		
		var Productype = Shared.getProductypes();
		var subUrl='/productype/show/'+Productype.id;
		
		$http.get(baseUrl + subUrl).success(function(data){
			$scope.products=data;
			
			
		});
	}
	$scope.showProductAll();
	
});
