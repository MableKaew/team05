sys.app.factory('Auth', function() {
	var user = {};
	
	return {
		setUser: function(newuser) {
			user = newuser;
		},
		getUser: function() {
			return user;
		},
		isLoggedIn: function() {
			return (typeof(user.id) != 'undefined') ? true : false;
		}
	};
});

sys.app.factory('Shared', function() {
	var id = 0;
	var memberId = 0;
	
	var edituser = {};
	var datas = {};
	var baseUrl = 'http://localhost:8080';
	var productypes= 1;
	var products= {};
	
	return {
		getId: function() {
			return id;
		},
		setId: function(ID) {
			id = ID;
		},
		getDatas: function(){
			return datas;
		},
		setDatas: function(data){
			datas = data;
		},
		getBaseUrl: function() {
			return baseUrl;
		},
		setEditUser: function(val) {
			edituser = val;
		},
		getEditUser: function() {
			return edituser;
		},
		getMemberId: function() {
			return memberId;
		},
		setMemberId: function(id) {
			memberId = id;
		},
		getProductypes: function() {
			return productypes;
		},
		setProductypes: function(Productype) {
			productypes = Productype;
		},
		getProducts: function() {
			return products;
		},
		setProducts: function(Product) {
			products = Product;
		}
	};
	
});


sys.app.service('sharedProperties',function(){

	var memberid = 0;
	var arr = new Array();
	arr = [];
	return {
	
		getmemberid: function(){
			return memberid;
		},
		setmemberid: function(value){
			memberid = value
		},
	
		getarr:function(){
			return arr;
		},
		setarr:function(value){
			arr.push(value);
		},
		deletearr: function(value){
			var index;
			for(index = 0 ;index < arr.length; index++){
				if(value == arr[index]){
					arr.splice(index,1);
				}
			}
		}
	};
});
