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
	var teacherId = 0;
	var courseId = 0;
	var edituser = {};
	var datas = {};
	var baseUrl = 'http://localhost:8080';
	
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
		getTeacherId: function() {
			return teacherId;
		},
		setTeacherId: function(id) {
			teacherId = id;
		},
		getCourseId: function() {
			return courseId;
		},
		setCourseId: function(id) {
			courseId = id;
		}
	};
	
});


sys.app.service('sharedProperties',function(){
	var level = 1;
	var room = 1;
	var groupname = null;
	var semester = 1;
	var years = 2557;
	var teachid = 0;
	var arr = new Array();
	arr = [0];
	return {
		getlevel: function(){
			return level;
		},
		setlevel: function(value){
			level = value;
		},
		getroom: function(){
			return room;
		},
		setroom: function(value){
			room = value;
		},
		getgroupname: function(){
			return groupname;
		},
		setgroupname: function(value){
			groupname = value;
		},
		getsemester: function(){
			return semester;
		},
		setsemester: function(value){
			semester = value;
		},
		getteachid: function(){
			return teachid;
		},
		setteachid: function(value){
			teachid = value
		},
		getyears: function(){
			return years;
		},
		setyears: function(value){
			years = value;
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
