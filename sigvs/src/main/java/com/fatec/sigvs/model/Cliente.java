package com.fatec.sigvs.model;

public class Cliente {
  int id;
  String nome;
  String endereço;
 
  
  public Cliente(int id, String nome, String endereço) {
	  this.id=id;
	  this.nome=nome;
	  this.endereço=endereço;
	  
  }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEndereço() {
	return endereço;
}

public void setEndereço(String endereço) {
	this.endereço = endereço;
}


@Override
public String toString() {
	return "Cliente id=" + id + ", nome=" + nome + ", endereço=" + endereço ;
}
  
}
