package br.com.projeto2httpJasRS.model.rest.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.projeto2httpJasRs.model.Curso;

import com.projeto2httpJasRs.model.service.CursoServiceInterface;



@Path("/cursos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CursosFacade {

	//@Inject
	//private CursoDao cursodao;
	
	//@GET
//	public List<Curso> getCursos(){
//		return cursoDao.getCursos();
//	}
	
	@Inject
	private CursoServiceInterface cursoServInter;
	
	@GET
	public List<Curso> getCursos(){
		return cursoServInter.getCursos();
	}
	
	@POST
	public Curso salvarCurso(Curso curso){
		return cursoServInter.salvarCurso(curso);
	}
	
	@PUT
	public void atualizar(Curso curso){
		cursoServInter.alterarCurso(curso);
	}
	
	@DELETE
	@Path("/{codigoCurso}")
	public void excluir(@PathParam("codigoCurso") Integer codigoCurso){
		Curso curso = new Curso();
		curso.setCodigo(codigoCurso);
		cursoServInter.excluirCurso(curso);
	}
	
}
