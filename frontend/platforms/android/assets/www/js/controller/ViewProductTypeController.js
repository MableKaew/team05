sys.app.controller('ViewProductTypeController',function($scope, $http, Shared){
	var baseUrl = Shared.getBaseUrl();
	$scope.showProductTypeAll = function(){
		var subUrl = '/productType/showall';
		$http.get(baseUrl + subUrl).success(function(data){
			$scope.productTypes=data;
		});
	}
	$scope.showProductTypeAll();
	$scope.showProduct = function(id){
		var subUrl='/productype/show/'+id;
		$http.get(baseUrl + subUrl).success(function(data){
			$scope.products=data;
		});
		ModalProduct.show();
	}
	$scope.showProductDetail = function(id){
		var subUrl='/product/show/'+id;
		$http.get(baseUrl + subUrl).success(function(data){
			$scope.datas=data;
		});
		//ModalDetail.show();
	}
});