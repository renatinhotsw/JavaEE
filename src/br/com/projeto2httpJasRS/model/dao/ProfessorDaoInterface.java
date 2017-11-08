package br.com.projeto2httpJasRS.model.dao;

import java.util.List;

import com.projeto2httpJasRs.model.Professor;

public interface ProfessorDaoInterface {
	Professor salvarProfessor(Professor professor);
	
	void alterarProfessor(Professor professor);
	void excluirProfessor(Professor professor);
	
	List<Professor> getProfessores();
}
