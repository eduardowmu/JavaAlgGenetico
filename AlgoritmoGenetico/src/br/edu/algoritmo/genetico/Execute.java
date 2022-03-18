package br.edu.algoritmo.genetico;

import java.util.ArrayList;
import java.util.List;

class Produto 
{	private String nome;
	private Double espaco;
	private Double valor;
	
	public Produto(String nome, Double espaco, Double valor) 
	{	this.nome = nome;
		this.espaco = espaco;
		this.valor = valor;
	}
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	
	public Double getEspaco() {return espaco;}
	public void setEspaco(Double espaco) {this.espaco = espaco;}
	
	public Double getValor() {return valor;}
	public void setValor(Double valor) {this.valor = valor;}

	@Override
	public String toString() 
	{	return "Produto ["
			+ "nome=" + nome 
			+ ", espaco=" + espaco 
			+ ", valor=" + valor + "]";
	}
}

public class Execute 
{	public static void main(String args[])
	{	Produto p1 = new Produto("Maçã", 12.0, 6.5);
		
		//System.out.println(p1.getNome());
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(p1);
		produtos.add(new Produto("Pera", 6.0, 4.05));
		produtos.add(new Produto("Banana", 6.0, 4.05));
		produtos.add(new Produto("Mamão", 11.0, 9.05));
		
		produtos.stream().forEach(p -> System.out.println(p.toString()));
	}
}