var cursoJsonModulo = angular.module('moduloCursosJson',[]);

cursoJsonModulo.controller('cursoJsonController',function($scope,$http){
	$http.get('dados/cursosJson.json') //pega os dados desse arquivo .json
		.then(function(response) { // me devolve os dados com a resposta
			$scope.cursos = response.data.cursos;
		})
});