package br.com.db1.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity (name = "lembrete")
public class Lembrete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	@Temporal (TemporalType.DATE)
	
	private Date data;
	
	@Column(nullable = false, length = 200)
	private String Descricao;
	
	

}
