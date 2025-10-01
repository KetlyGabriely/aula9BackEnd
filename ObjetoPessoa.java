package aula9;

public class ObjetoPessoa {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("João Silva", "(11)998765432");
		System.out.println("Pessoa: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());
		
		System.out.println();
		
		PessoaFisica pessoaFisica = new PessoaFisica("Maria Oliveira", "(15)991234567", "123.456.789-01", "09.876.543-X");
		System.out.println("Pessoa Física: ");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CPF: " + pessoaFisica.getCpf());
		System.out.println("RG: " + pessoaFisica.getRg());
		
		System.out.println();
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Empreza XYZ", "3276-9812", "12.345.678/1029-48");
		System.out.println("Pessoa Jurídica: ");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: " + pessoaJuridica.getTelefone());
		System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
		
	}

}
