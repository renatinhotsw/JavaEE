package com.projeto2httpJasRs.model.service;

import java.util.List;

import com.projeto2httpJasRs.model.Curso;



public interface CursoServiceInterface {
	
	Curso salvarCurso(Curso curso);
	
	void alterarCurso(Curso curso);
	void excluirCurso(Curso curso);
	
	List<Curso> getCursos();
}
