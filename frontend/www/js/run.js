sys.app.run(function ($rootScope, $location, Auth, $route) {
    $rootScope.$on('$routeChangeStart', function (event) {

        if (!Auth.isLoggedIn()) {
            console.log('DENY');
            event.preventDefault();
            $location.path('/login');
            menu.setSwipable(false);
           
        } else {
            console.log('ALLOW');
            var path = $location.path();
            var user = Auth.getUser();
            $location.path(path);
        

            if(user.level == 'USER'){
            	
            	menu.setSwipable(true);
            	
            } else {
            	//menu.setSwipable(true);
            }

            if(path == '/logout'){
            	Auth.setUser({});
            	alert('Logout Success');
            	$location.path('/login');
            }
            	
        }
      
    });
});