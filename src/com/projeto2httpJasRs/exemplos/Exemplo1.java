package com.projeto2httpJasRs.exemplos;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/exemplowsrs")
public class Exemplo1 {
	
	@GET
	public String executaGet(){
		return "Executou um GET";
	}
	
	@POST
	public String executaPost(){
		return "Executou um Post";
	}
	
	
}
