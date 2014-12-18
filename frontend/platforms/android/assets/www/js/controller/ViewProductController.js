sys.app.controller('ViewProductController',function($scope, $http, Shared){
	var baseUrl = Shared.getBaseUrl();

//////////model ไม่ได้ใช้
	$scope.showProductDetail1 = function(id){
		var subUrl='/product/show/'+id;
		$http.get(baseUrl + subUrl).success(function(data){
			$scope.data=data;
		});
		//ModalDetail.show();
	}
	
//////////page ได้ใช้จริง
$scope.showProductAll = function(){
	var Productype = Shared.getProductypes();	
		var subUrl='/productype/show/'+Productype;
		
		$http.get(baseUrl + subUrl).success(function(data){
			$scope.products=data;
		});
	}
	$scope.showProductAll();
//////////page ได้ใช้จริง กับ member
	$scope.showProductDetail = function(id){
		Shared.setProducts(id);
		MainNavigator.pushPage( 'Shop-mallika/product-page3.html', { animation : 'slide' } );
	}

	
});
