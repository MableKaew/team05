sys.app.controller('ViewProductTypeController',function($scope, $http, Shared){
	var baseUrl = Shared.getBaseUrl();
	$scope.showProductTypeAll = function(){
		var subUrl = '/productType/showall';
		$http.get(baseUrl + subUrl).success(function(data){
			$scope.productTypes=data;
		});
	}
	$scope.showProductTypeAll();
	//กรณีใช้กับModel
	$scope.showProduct = function(id,have){
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
		ModalDetail.show();
	}
	//กรณีใช้กับpage
	$scope.show-Product = function(id){
		var subUrl='/productype/show/'+id;
		$http.get(baseUrl + subUrl).success(function(data){
			Shared.setProductypes(data);
			
		});
		MainNavigator.pushPage( 'Shop-mallika/product-page2.html', { animation : 'slide' } );
	}
	
	
	
});