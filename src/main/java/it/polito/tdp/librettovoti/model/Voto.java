package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;


//POJO - Plan Old Java Object
//Java Bean
//semplice contenitore di dati -- non ha "logica" 

/**
 * 
 * @author Alessandro
 *
 */

public class Voto {                    //ANCHE QUESTO FA PARTE DEL MODELLO
	private String nome;
	private int voto;   //30L come lo rappresento?
	private LocalDate data;  //data superamento esame
	
	
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getVoto() {
		return voto;
	}

	
	public void setVoto(int voto) {
		this.voto = voto;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Esame " + nome + " superato con " + voto + " il " + data;
	}
	
	

}
