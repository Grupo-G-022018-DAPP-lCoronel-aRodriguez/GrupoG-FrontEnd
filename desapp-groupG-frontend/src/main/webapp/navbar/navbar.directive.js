(function() {
  
  'use strict';
  
  angular
    .module('webapp')
    .directive('navbar', navbar);
    
  function navbar() {
    return {
      templateUrl: 'webapp/navbar/navbar.html',
      controller: navbarController,
      controllerAs: 'vm'
    }
  }

  navbarController.$inject = ['authService'];
    
  function navbarController(authService) {
    var vm = this;
    vm.auth = authService;
  }
  
})();