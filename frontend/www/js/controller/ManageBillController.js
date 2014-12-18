sys.app.controller('ManageBillController', function($scope, $http, Shared) {

	var baseUrl 	= Shared.getBaseUrl();
	var editbill 	= Shared.getEditBill();
	
		$scope.addBill = function() {	
			var subUrl = '/bill/add';
			var data = {	
				idBill: 			$scope.idBill,
				nameReceive: 		$scope.nameReceive,
				address:			$scope.address,
				district:			$scope.district,
				province:			$scope.province,
				postCode:			$scope.postCode,
				tel:				$scope.tel,
				deliveryType:		$scope.deliveryType
			};
			
			$http.post(baseUrl + subUrl, data).success(function(data){
			alert(data);
			Shared.setEditBill({});
			MainNavigator.pushPage("Shop-Jaris/page2.html");
			});
		}
		
		$scope.editBill = function() {
			var subUrl = '/bill/add';
			var data = {	
				id:					editbill.id,
				idBill: 			$scope.idBill,
				nameReceive: 		$scope.nameReceive,
				address:			$scope.address,
				district:			$scope.district,
				province:			$scope.province,
				postCode:			$scope.postCode,
				tel:				$scope.tel,
				deliveryType:		$scope.deliveryType
			};
			
			$http.post(baseUrl + subUrl, data).success(function(data){
				alert(data);
				Shared.setEditBill({});
				MainNavigator.pushPage("Shop-Jaris/page2.html");
			});
		}

});