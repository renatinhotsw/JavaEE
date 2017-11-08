package com.projeto2httpJasRs.model.service;

import java.util.List;

import com.projeto2httpJasRs.model.Professor;

public interface ProfessorServiceInterface {
	
	Professor salvarProfessor(Professor professor);
	
	void alterarProfessor(Professor professor);
	void excluirProfessor(Professor professor);
	
	List<Professor> getProfessores();
}
