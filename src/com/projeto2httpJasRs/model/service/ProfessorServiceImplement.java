package com.projeto2httpJasRs.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.projeto2httpJasRS.model.dao.ProfessorDaoInterface;

import com.projeto2httpJasRs.model.Professor;

public class ProfessorServiceImplement implements ProfessorServiceInterface{

	@Inject
	private ProfessorDaoInterface professorDaoInterface;
	
	
	@Override
	public List<Professor> getProfessores() {
		
		return professorDaoInterface.getProfessores();
	}
	
	
	@Override
	@Transactional
	public Professor salvarProfessor(Professor professor) {
		return professorDaoInterface.salvarProfessor(professor);
	}

	@Override
	@Transactional
	public void alterarProfessor(Professor professor) {
		professorDaoInterface.alterarProfessor(professor);
		
	}

	@Override
	@Transactional
	public void excluirProfessor(Professor professor) {
		professorDaoInterface.excluirProfessor(professor);
		
	}

	
	
}
