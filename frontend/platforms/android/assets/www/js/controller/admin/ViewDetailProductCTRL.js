//<!-- ใช้กับผู้ใช้ทั่วไป -->
sys.app.controller('adminViewDetailProductCTRL',function($scope, $http, Shared){
	var baseUrl = Shared.getBaseUrl();


	
	
	
$scope.showProductDetailAlluser = function(id){
	var Product = Shared.getProducts();
		var subUrl='/product/show/'+Product;
		
		$http.get(baseUrl + subUrl).success(function(data){
			$scope.datas=data;
		});
	}
	$scope.showProductDetailAlluser();
	
	
	
});
