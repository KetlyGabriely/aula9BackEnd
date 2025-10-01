package aula9;

public class Produto {
	
	private String nome;
	private double preco;
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void exibirInformacoes(){
		System.out.println("Produto: " + nome);
		System.out.println("Preço: " + preco);
	}

}
