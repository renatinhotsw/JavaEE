var modProf = angular.module('moduloProfessores',[]);

modProf.controller('professoresController',function($scope,$http){

	urlProfessor = 'http://localhost:8080/Projeto2httpJasRS/rest/professores';

	$scope.listarProfessores = (function(){
		$http.get(urlProfessor).success(function (professoresJSON) {
			$scope.professores = professoresJSON;
		
		}).error(function(erro){
			alert(erro);
		});
				
	});// fim listarProf


	$scope.limparDados = (function(){
		$scope.professor = "";
	});// fim limparDados
	
	$scope.selecionarProf = (function(professorSelecionado){
		$scope.professor = professorSelecionado;
	});// fim SelecionarProf

	$scope.valorPesquisado ="";
	
	$scope.gravar = (function (professor){
		
		if($scope.professor.codigo	 == undefined){
			
			$http.post(urlProfessor,$scope.professor).success(function (){
				//$scope.professores.push($scope.professor);
				$scope.limparDados();
				$scope.listarProfessores();
			}).error(function(erro){
				alert(erro);
			});
		}else{
			$http.put(urlProfessor,$scope.professor).success(function (){
			//	$scope.professores.push($scope.professor);
				$scope.listarProfessores();
				$scope.limparDados();
			}).error(function(erro){
				alert(erro);
			});
		}
		
	});// fim gravar
	
	
	$scope.excluirProf = (function (){
		if($scope.professor.codigo == undefined){
			alert('Favor selecionar um registro para ser excluído!');
		}else{
			$http.delete(urlProfessor+'/'+$scope.professor.codigo).success(function (){
				$scope.listarProfessores();
				$scope.limparDados();
			}).error(function(erro){
				alert(erro);
			});
		}
	});
		
	
	
	
	//EXECUTA
	$scope.listarProfessores();

	
});// fim do controller