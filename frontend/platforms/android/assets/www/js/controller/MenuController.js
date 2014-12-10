sys.app.controller('MenuController', function($scope, $http, $location, Auth) {
		
	// เปลี่ยนหน้าใหม่
	$scope.GotoPage = function(page) {
		selType.hide();
		MainNavigator.pushPage( page + '.html', { animation : 'slide' } );
	}
	
	// ลิ้งจากเมนูหลัก
	$scope.menuGotoPage = function(url) {
		$location.path('/' + url);
		MainMenu.closeMenu();
	} 
	
});