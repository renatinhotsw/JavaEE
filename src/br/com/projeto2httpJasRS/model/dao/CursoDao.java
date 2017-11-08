package br.com.projeto2httpJasRS.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.projeto2httpJasRs.model.Curso;

public class CursoDao implements CursoDaoInterface {

	@PersistenceContext(unitName = "Projeto2httpJasRSPersistenceUnit")
	private EntityManager entityManager;
	
	@Override
	public Curso salvarCurso(Curso curso) {
		entityManager.persist(curso);
		return curso;
	}

	@Override
	public void alterarCurso(Curso curso) {
		Curso cursorMerge = entityManager.merge(curso);
		entityManager.persist(cursorMerge);
		
	}

	@Override
	public void excluirCurso(Curso curso) {
		Curso cursorMerge = entityManager.merge(curso);
		entityManager.remove(cursorMerge);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Curso> getCursos() {
		Query query = entityManager.createQuery("from Curso");
		return query.getResultList();
	}

}
