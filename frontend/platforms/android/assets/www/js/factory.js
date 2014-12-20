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
	
	var tranid = "";
	var edituser = {};
	var editbill = {};
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
		setEditBill: function(value) {
			editbill = value;
		},
		getEditBill: function() {
			return editbill;
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
		},
		//for tranfer
		

		gettranid: function() {
			return tranid;
		},
		settranid: function(id) {
			tranid = id;
		}
	};
	
});


sys.app.service('sharedProperties',function(){

	var memberid = 0;
	var arr = new Array();
	arr = [];
	var arrProduct = new Array();
	arrProduct = [];
	//ส่วนคำนวณในตะกร้า
	var price =0;
	var amount=0;
	var discount=0;
	var normalprice=0;
	var balance=0;
	
	return {
		
		getprice: function(){
			return price;
		},
		setprice: function(value){
			price = value;
		},
		
		getamount: function(){
			return amount;
		},
		setamount: function(value){
			amount = value;
		},
		
		getdiscount: function(){
			return discount;
		},
		setdiscount: function(value){
			discount = value;
		},
		
		getnormalprice: function(){
			return normalprice;
		},
		setnormalprice: function(value){
			normalprice = normalprice+value;
		},

		setnormalpriceMinus: function(value){
			normalprice = normalprice-value;
		},
		
		getbalance: function(){
			return balance;
		},
		setbalance: function(value){
			balance = balance+value;
		},
		setbalanceMinus: function(value){
			balance = balance-value;
		},
		deleteCalculateBasket: function(value){
			balance = 0;
			normalprice=0;
			amount = 0;
			price = 0;
			discount=0;
		},
	
		getmemberid: function(){
			return memberid;
		},
		setmemberid: function(value){
			memberid = value;
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
		},
		deletearrAll: function(){
			arr = [];
		},
		arrSize: function(){
			return arr.length;  
		}
		
		
	};
});
