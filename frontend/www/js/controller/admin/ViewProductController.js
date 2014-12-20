//<!-- ใช้กับผู้ใช้ทั่วไป -->
sys.app.controller('adminViewProductController',function($scope, $http, Shared){
	var baseUrl = Shared.getBaseUrl();


//////////page ได้ใช้จริง
$scope.showProductAlluser = function(id){
	var Productype = Shared.getProductypes();	
		var subUrl='/productype/show/'+Productype;
		
		$http.get(baseUrl + subUrl).success(function(data){
			$scope.products=data;
		});
	}
	$scope.showProductAlluser();

//////////page ได้ใช้จริง กับ ผู้ใช้ทั่วไป
	$scope.showProductDetail_user = function(id){
		Shared.setProducts(id);
		loginNavigator.pushPage( 'Shop-mallika/page3.html', { animation : 'slide' } );
	}
	
});
