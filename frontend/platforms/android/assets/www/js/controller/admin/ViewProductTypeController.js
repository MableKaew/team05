sys.app.controller('adminViewProductTypeController',function($scope, $http, Shared){
	var baseUrl = Shared.getBaseUrl();
	$scope.showProductTypeAll = function(){
		var subUrl = '/productType/showall';
		$http.get(baseUrl + subUrl).success(function(data){
			$scope.productTypes=data;
		});
	}
	$scope.showProductTypeAll();
	
	///////////////////////model (ไม่ได้ใช้)
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
	/////////////////////////////pageของ admin (ใช้จริง)
	
	$scope.showProduct_admin = function(id){
		Shared.setProductypes(id);
		MainNavigator.pushPage( 'Shop-Kamthorn/page8.html', { animation : 'slide' } );

	}
	

	
});