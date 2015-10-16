app.controller("loginController", function($scope, loginService) {
	
	/**
	 * Function to bind on login submit
	 */
	$scope.loginSubmit = function() {
		var fname = $scope.user.firstName;
		var lname = $scope.user.lastName;
		$scope.userName = loginService.getUserDetails(fname, lname);
	};
	
});



