var modProf = angular.module('moduloCursos',[]);

modProf.controller('cursosController',function($scope,$http){

	
	urlCurso = 'http://localhost:8080/Projeto2httpJasRS/rest/cursos';
	urlProfessor = 'http://localhost:8080/Projeto2httpJasRS/rest/professores';

	$scope.listarCursos = (function(){
		$http.get(urlCurso).success(function (cursosJSON) {
			$scope.cursos = cursosJSON;
			
		
		}).error(function(erro){
			alert(erro);
		});
				
	});

	$scope.listarProfessores = (function(){
		$http.get(urlProfessor).success(function (professoresJSON) {
			$scope.professores = professoresJSON;
		
		}).error(function(erro){
			alert(erro);
		});
				
	});// fim listarProf


	$scope.limparDados = (function(){
		$scope.curso = "";
		
	});
	
	$scope.selecionarCurso= (function(cursoSelecionado){
		$scope.curso = cursoSelecionado;
	});

	$scope.valorPesquisado ="";
	
	$scope.gravar = (function (curso){
		
		if($scope.curso.codigo	 == undefined){
			
			$http.post(urlCurso,$scope.curso).success(function (){
				//$scope.cursoes.push($scope.curso);
				$scope.limparDados();
				$scope.listarCursos();
			}).error(function(erro){
				alert(erro);
			});
		}else{
			$http.put(urlCurso,$scope.curso).success(function (){
			//	$scope.cursoes.push($scope.curso);
				$scope.listarCursos();
				$scope.limparDados();
			}).error(function(erro){
				alert(erro);
			});
		}
		
	});// fim gravar
	
	$scope.excluirCurso = (function (){
		if($scope.curso.codigo == undefined){
			alert('Favor selecionar um curso para ser excluído!');
		}else{
			$http.delete(urlCurso+'/'+$scope.curso.codigo).success(function (){
				$scope.listarCursos();
				$scope.limparDados();
			}).error(function(erro){
				alert(erro);
			});
		}
	});
	
	
	
	
	//EXECUTA
	$scope.listarCursos();
	$scope.listarProfessores();

	
});// fim do controller