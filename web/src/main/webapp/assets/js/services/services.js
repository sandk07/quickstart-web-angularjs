app.service('loginService', function() {
	this.getUserDetails = function(firstName, lastName) {
		return firstName +" "+ lastName;
	}
});