sys.app.controller('ManageBasketController', function($scope, $http, Shared, Auth, sharedProperties) {
	var baseUrl = Shared.getBaseUrl();
	//ต้องใช้เป็นลูป เพื่อใส่ค่า
	$scope.ar= sharedProperties.getarr();
	var arrProduct = new Array();
	arrProduct = [];
	
	$scope.setArrProductId = function(productId){
		//sharedProperties.setMemberId(memberId);
		sharedProperties.setarr(productId);
		var a= sharedProperties.getarr();
		console.log(a);
		console.log(a[0]);
		console.log(a[1]);
		alert("ลงตะกร้าแล้ว");
		//MainNavigator.pushPage( 'Shop-Santipab/basket.html', { animation : 'slide' } );
		
	}
	//ต้องใช้เป็นลูป เพื่อใส่ค่า
	//var ar= sharedProperties.getarr();
	//var arrProduct = new Array();
	//arrProduct = [];
	//==================================
	$scope.getArrProductId = function(){
		console.log(a);
		
		
		//var arr = new Array();
		//arr = [0];
		
		//var index;
	//	for(index = 0 ;index < arr.length; index++){
		//	if(value == arr[index]){
		//		arr.splice(index,1);
		//	}
		//}
		//MainNavigator.pushPage( 'Shop-Santipab/basket.html', { animation : 'slide' } );
		
	}
	//$scope.getArrProductId();
	
	$scope.showProductDetail_All = function(){
		//var Product = Shared.getProducts();
		//$scope.arrProduct = [];
//for(index = 0 ;index < ar.length; index++){
			
			var subUrl='/product/show/'+ ar[index];
			
			$http.get(baseUrl + subUrl).success(function(data){
				$scope.datas=data;
			});
		//	$scope.arrProduct=arrProduct.push($scope.datas);
		
		//}
		
	}
		//$scope.showProductDetail_All();
//========================================================	
	$scope.setproductId = function(memberId,productId){
		sharedProperties.setMemberId(memberId);
		sharedProperties.setarr(productId);
		//$scope.GotoPage('reg-registration/index');
	}
	
$scope.deletearr = function(arrid){
		sharedProperties.deletearr(arrid);
		//$scope.GotoPage('reg-registration/index');
	}


$scope.ShowProductBasket = function(){
		var arr = sharedProperties.getarr();
		var memberId = sharedProperties.getMemberId();
		$http.post('http://localhost:8080/saveBasket/'+arr+'/add',data).success(function(data){
			alert(data);
		});
	}
//================================
$scope.showProduct = function(){
	var subUrl = '/product/showall';
	$http.get(baseUrl + subUrl).success(function(data){
		$scope.product=data;
	});
}
$scope.showProduct();

});