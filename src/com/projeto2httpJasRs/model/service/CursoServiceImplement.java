package com.projeto2httpJasRs.model.service;

import java.util.List;



import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.projeto2httpJasRS.model.dao.CursoDaoInterface;

import com.projeto2httpJasRs.model.Curso;

public class CursoServiceImplement implements CursoServiceInterface{

	@Inject
	private CursoDaoInterface cursoDaoInterface;
	
	@Override
	public List<Curso> getCursos() {
		
		return cursoDaoInterface.getCursos();
	}
	
	
	
	@Override
	@Transactional
	public Curso salvarCurso(Curso curso) {
		
		return cursoDaoInterface.salvarCurso(curso);
	}

	@Override
	@Transactional
	public void alterarCurso(Curso curso) {
		cursoDaoInterface.alterarCurso(curso);
		
	}

	@Override
	@Transactional
	public void excluirCurso(Curso curso) {
		cursoDaoInterface.excluirCurso(curso);
		
	}

	

	
	
	
}
