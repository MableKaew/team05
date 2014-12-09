sys.app.config(function($sceDelegateProvider, $routeProvider, $locationProvider) {
   $sceDelegateProvider.resourceUrlWhitelist([
     // Allow same origin resource loads.
     'self',
     // Allow loading from our assets domain.  Notice the difference between * and **.
     'http://www.youtube.com/**'
   ]);
   
   $routeProvider
   .when('/login', {
	   templateUrl: '_login.html',
   })
   .when('/index', {
	   templateUrl: '_home.html',	
   })
   
   .when('/user', {
	   templateUrl: 'shop-user/index.html'
   })
  
   .otherwise({
       redirectTo: '/notfound'
   });
   
   // configure html5 to get links working on jsfiddle
   $locationProvider.html5Mode(true);
});