package br.com.projeto2httpJasRS.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.projeto2httpJasRs.model.Professor;

public class ProfessorDao implements ProfessorDaoInterface {

	@PersistenceContext(unitName = "Projeto2httpJasRSPersistenceUnit")
	private EntityManager entityManager;
	
	@Override
	public Professor salvarProfessor(Professor professor) {
		entityManager.persist(professor);
		return professor;
	}

	@Override
	public void alterarProfessor(Professor professor) {
		Professor professorMerge = entityManager.merge(professor);
		entityManager.persist(professorMerge);
		
	}

	@Override
	public void excluirProfessor(Professor professor) {
		Professor professorMerge = entityManager.merge(professor);
		entityManager.remove(professorMerge);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Professor> getProfessores() {
		Query query = entityManager.createQuery("from Professor");
		return query.getResultList();
	}

}
