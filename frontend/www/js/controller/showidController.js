sys.app.controller('showidController', function($scope, $http, Shared, Auth) {
		var user=Auth.getUser();
		var baseUrl 	= Shared.getBaseUrl();
		
		$scope.my 		= {iSef : ' '};
	

	/* -------- query ข้อมูล bill ทั้งหมด ตาม id user-------- */ 
		$scope.Showbill= function() {
			var subUrl = '/bill/show/userid/'+user.id;

			$http.get(baseUrl + subUrl).success(function(data) {
				$scope.bill = data;
			});
		}
		$scope.Showbill();
		
		//หน้าเลือก idbill
		
		$scope.setSelectbill = function(id) {
			Shared.settranid(id);
			var a = Shared.gettranid();
			alert("เลือกสำเร็จแล้ว");
			console.log("แสดงค่่า" +a);
		}
		
		
		/* -------- query ข้อมูล tranfer ทั้งหมด ตาม id user-------- */ 	
		$scope.Showalltranfer= function() {
			var subUrl = '/show/tranfer/'+user.id;

			$http.get(baseUrl + subUrl).success(function(data) {
				$scope.tranfer = data;
			});
		}
		$scope.Showalltranfer();
		
		
		
		
		
});