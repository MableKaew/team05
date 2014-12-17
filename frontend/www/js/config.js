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
   
    .when('/notfound', {
	   templateUrl: 'notpage.html',
   })
   
   .when('/user', {
	   templateUrl: 'shop-user/index.html',
   })
   
   
  .when('/member', {
	   templateUrl: 'page2.html',
   })
   .when('/Admin', {
	   templateUrl: 'Shop-Admin/_menu.html',
   })
   
   .when('/MemberTransferMoney', {
	   templateUrl: 'Shop-Atikom/index.html',
   })
   
    .when('/MemberBill', {
	   templateUrl: 'Shop-Jaris/index.html',
   })
   
    .when('/AdminManageProduct', {
	   templateUrl: 'Shop-Kamthorn/index.html',
   })
   
     .when('/MemberSelectProduct', {
	   templateUrl: 'Shop-mallika/product-page1.html',
   })
   
     .when('/MemberBasket', {
	   templateUrl: 'Shop-Santipab/index.html',
   })
   
     .when('/AdminResultMoney', {
	   templateUrl: 'Shop-Siraphop/index.html',
   })
   .otherwise({
       redirectTo: '/notfound'
   });
   
// configure html5 to get links working on jsfiddle
   $locationProvider.html5Mode(true);
	 });