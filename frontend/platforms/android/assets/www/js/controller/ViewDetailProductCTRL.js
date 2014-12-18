sys.app.controller('ViewDetailProductCTRL',function($scope, $http, Shared){
	var baseUrl = Shared.getBaseUrl();


	
	
	
$scope.showProductDetailAll = function(){
	var Product = Shared.getProducts();
		var subUrl='/product/show/'+Product;
		
		$http.get(baseUrl + subUrl).success(function(data){
			$scope.datas=data;
		});
	}
	$scope.showProductDetailAll();
	
	
	
});
