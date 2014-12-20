sys.app.controller('ManageTranferMoneyController', function($scope, $http, Shared, Auth) {

		var baseUrl 	= Shared.getBaseUrl();
		var user		=Auth.getUser();
		
		// เพิ่มข้อมูลtranfer  /TranferMoney/billid/{id}/{idmem}/add
		
		$scope.addtranfer = function() {	
			var idbill = Shared.gettranid();
			var subUrl = '/TranferMoney/billid/'+idbill+'/'+user.id+'/add';
			var data = {	
					name: 		$scope.name,
					lastname: 	$scope.lastname,
					date:		$scope.date,
					balance:	$scope.balance,
					picture:	$scope.picture,
					
			};
			
			$http.post(baseUrl + subUrl, data).success(function(data){
				alert(data);
			MainNavigator.pushPage("Shop-Atikom/showTranferMoney.html");
			});
		}

		
		

		
});