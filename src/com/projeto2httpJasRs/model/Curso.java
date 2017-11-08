package com.projeto2httpJasRs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name="curso")
public class Curso implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id //indica a chave primaria da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) //gera o codigo automaticamente
	@Column(name="curso_codigo")
	private Integer codigo;
	
	@Column(name="curso_descricao", length=50, nullable =false)
	private String descricao;
	
	@Column(name="curso_diasHorarios", length=50, nullable =true)
	private String diasHorarios;
	
	@ManyToOne
	@JoinColumn(name="prof_codigo", referencedColumnName="prof_codigo")
	Professor professor;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	
	
	
	//constructor vazio
	public Curso(){
		
	}
	
	
	public Curso(Integer codigo, String descricao, String diasHorarios,
			Professor professor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.diasHorarios = diasHorarios;
		this.professor = professor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDiasHorarios() {
		return diasHorarios;
	}

	public void setDiasHorarios(String diasHorarios) {
		this.diasHorarios = diasHorarios;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (diasHorarios == null) {
			if (other.diasHorarios != null)
				return false;
		} else if (!diasHorarios.equals(other.diasHorarios))
			return false;
		if (professor == null) {
			if (other.professor != null)
				return false;
		} else if (!professor.equals(other.professor))
			return false;
		return true;
	}
	

	
	
	
	

	
	

	
	
	

}
