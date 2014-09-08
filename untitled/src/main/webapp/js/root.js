(function() {
	var root = angular.module("root", []);
	root.controller("RootController", ['$scope','$rootScope', function($scope, $rootScope) {
		$rootScope.selectedTab = 0;
		
	}]);
})();