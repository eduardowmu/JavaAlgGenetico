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

class Individuo {
	private List espacos = new ArrayList<>();
	private List valores = new ArrayList<>();
	private Double limiteEspacos;
	private Double notaAvaliacao;
	private int geracao;
	private List cromossomos = new ArrayList<>();
	
	public Individuo(List espacos, List valores, Double limiteEspacos) {
		this.espacos = espacos;
		this.valores = valores;
		this.limiteEspacos = limiteEspacos;
		this.notaAvaliacao = 0.0;
		this.geracao = 0;
		
		/*Estamos fazendo a inicialização do cromossomo*/
		for(int i = 0; i < this.espacos.size(); i++) {
			if(Math.random() < 0.5) {
				this.cromossomos.add("0");
			} else {
				this.cromossomos.add("1");
			}
		}
	}

	public List getEspacos() {return espacos;}
	public void setEspacos(List espacos) {this.espacos = espacos;}

	public List getValores() {return valores;}
	public void setValores(List valores) {this.valores = valores;}

	public Double getLimiteEspacos() {return limiteEspacos;}
	public void setLimiteEspacos(Double limiteEspacos) {this.limiteEspacos = limiteEspacos;}

	public Double getNotaAvaliacao() {return notaAvaliacao;}
	public void setNotaAvaliacao(Double notaAvaliacao) {this.notaAvaliacao = notaAvaliacao;}

	public int getGeracao() {return geracao;}
	public void setGeracao(int geracao) {this.geracao = geracao;}

	public List getCromossomos() {return cromossomos;}
	public void setCromossomos(List cromossomos) {this.cromossomos = cromossomos;}
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
		
		List espacos = new ArrayList<>();
		List valores = new ArrayList<>();
		List nomes = new ArrayList<>();
		
		produtos.forEach(p -> addValues(p, espacos, valores, nomes));
	}

	private static void addValues(Produto p, List espacos, List valores, List nomes)
	{	espacos.add(p.getEspaco());
		valores.add(p.getValor());
		nomes.add(p.getNome());
	}
}