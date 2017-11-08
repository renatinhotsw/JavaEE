package br.com.projeto2httpJasRS.model.dao;

import java.util.List;

import com.projeto2httpJasRs.model.Curso;

public interface CursoDaoInterface {
	Curso salvarCurso(Curso curso);
	
	void alterarCurso(Curso curso);
	void excluirCurso(Curso curso);
	
	List<Curso> getCursos();
}
