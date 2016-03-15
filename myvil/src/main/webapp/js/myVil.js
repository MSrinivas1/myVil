'use strict';

/* App Module */

var myVil = angular.module('myVil', [
  'ngRoute',
  'ngTable',
  'ui.bootstrap',
  'myVil.homeModules'
]);

myVil.config(['$routeProvider',
  function ($routeProvider) {
    console.log("configuring routes");
    $routeProvider.
      when('/home', {
        templateUrl: 'partials/home.tpl.html',
        controller: 'HomeController'
      }).
      otherwise({
        redirectTo: '/'
      });
  }]);