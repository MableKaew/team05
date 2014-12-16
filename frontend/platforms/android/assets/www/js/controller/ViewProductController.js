sys.app.controller('ViewProductController',function($scope, $http, Shared){
	var baseUrl = Shared.getBaseUrl();


	$scope.showProductDetail1 = function(id){
		var subUrl='/product/show/'+id;
		$http.get(baseUrl + subUrl).success(function(data){
			$scope.data=data;
		});
		//ModalDetail.show();
	}
	
	
$scope.showProductAll = function(id){
	var Productype = Shared.getProductypes();	
		var subUrl='/productype/show/'+Productype;
		
		$http.get(baseUrl + subUrl).success(function(data){
			$scope.products=data;
		});
	}
	$scope.showProductAll();
	
	$scope.showProductDetail = function(id){
		Shared.setProducts(id);
		MainNavigator.pushPage( 'Shop-mallika/product-page3.html', { animation : 'slide' } );
	}
	
});
