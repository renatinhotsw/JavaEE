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

import com.projeto2httpJasRs.model.Professor;
import com.projeto2httpJasRs.model.service.ProfessorServiceInterface;



@Path("/professores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfessoresFacade {
	
	/* Direto sem o uso de service
	@Inject
	private ProfessorDao professorDao;
	
	@GET
	public List<Professor> getProfessores(){
		return professorDao.getProfessores();
	}
	*/
	
	@Inject
	private ProfessorServiceInterface profServInter;
	
	@GET
	public List<Professor> getProfessores(){
		return profServInter.getProfessores();
	}
	
	@POST
	public Professor salvarProf(Professor professor){
		return profServInter.salvarProfessor(professor);
	}
	
	@PUT
	public void atualizar(Professor professor){
		profServInter.alterarProfessor(professor);
	}
	
	@DELETE
	@Path("/{codigoProfessor}")
	public void excluir(@PathParam("codigoProfessor") Integer codigoProfessor){
		Professor professor = new Professor();
		professor.setCodigo(codigoProfessor);
		profServInter.excluirProfessor(professor);
	}
	
	
}
