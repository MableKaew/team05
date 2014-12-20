//<!-- ใช้กับผู้ใช้ทั่วไป -->
sys.app.controller('adminViewProductTypeController',function($scope, $http, Shared){
	var baseUrl = Shared.getBaseUrl();
	$scope.userShowProductTypeAll = function(){
		var subUrl = '/productType/showall';
		$http.get(baseUrl + subUrl).success(function(data){
			$scope.productTypes=data;
		});
	}
	$scope.userShowProductTypeAll();
	
	
	
/////////////////////////////pageของผู้ใช้ทั่วไป  (ใช้จริง)
	
	$scope.showProduct_user = function(id){
		Shared.setProductypes(id);
		loginNavigator.pushPage( 'Shop-mallika/page2.html', { animation : 'slide' } );

	}
	
});