sys.app.controller('ManageProductTypeController', function($scope, $http, Shared) {

		var baseUrl 	= Shared.getBaseUrl();
		
		
		// เพิ่มข้อมูล ประเภทสินค้า
		$scope.addProductType = function() {	
			var subUrl = '/productType/add';
			var data = {	
					name: 	$scope.name,
					idType: 	$scope.idType
				
			};
			
			$http.post(baseUrl + subUrl, data).success(function(data){
				alert(data);
			MainNavigator.pushPage("Shop-Kamthorn/page2.html");
			});
		}
		
		// เพิ่มข้อมูล สินค้า
		$scope.addProduct = function() {	
			var subUrl = '/product/add';
			var data = {	
					name: 		$scope.name,
					price: 		$scope.price,
					idProduct:	$scope.idProduct,
					amount: 	$scope.amount,
					detail: 	$scope.detail,
					picture: 	$scope.picture,
					discount: 	$scope.discount,
					normalprice: $scope.normalprice
				
			};
			
			
			$http.post(baseUrl + subUrl, data).success(function(data){
				alert(data);
			MainNavigator.pushPage("Shop-Kamthorn/page8.html");
			});
		}
		
		
		
		
});