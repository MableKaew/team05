sys.app.controller('MenuController', function($scope, $http, $location, Auth, sharedProperties) {
		
	
	$scope.basket = function(page) {
	var amountbasket= sharedProperties.arrSize();
	if(amountbasket == 0){
		$scope.checknotice= false;
		$scope.amount=0;
	}else{
		$scope.checknotice= true;
		$scope.amount=amountbasket;
	}
	}
	$scope.basket();
	// เปลี่ยนหน้าใหม่
	$scope.GotoPage = function(page) {
		selType.hide();
		MainNavigator.pushPage( page + '.html', { animation : 'slide' } );
	}
	
	// ลิ้งจากเมนูหลัก
	$scope.menuGotoPage = function(url) {
		$location.path('/' + url);
		menu.closeMenu();
	} 
	
	$scope.menuAdminGotoPage = function(url) {
		$location.path('/' + url);
		
	} 
	
});