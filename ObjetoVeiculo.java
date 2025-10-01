package aula9;

public class ObjetoVeiculo {
	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo("Toyota", "Corolla", 2021, "Prata");
		System.out.println("Veiculo: ");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano: " + veiculo.getAno());
		System.out.println("Cor: " + veiculo.getCor());
		
		System.out.println();
		
		Automovel automovel = new Automovel("Honda", "Civic EXL", 2022, "Preto", 4, "2.0 Flex, 155 cv");
		System.out.println("Automóvel: ");
		System.out.println("Marca: " + automovel.getMarca());
		System.out.println("Modelo: " + automovel.getModelo());
		System.out.println("Ano: " + automovel.getAno());
		System.out.println("Cor: " + automovel.getCor());
		System.out.println("Número de Portas: " + automovel.getNumeroPortas());
		System.out.println("Motor: " + automovel.getMotor());
		
		System.out.println();
		
		Moto moto = new Moto("Yamaha", "MT-07", 2021, "Azul", 689);
		System.out.println("Moto: ");
		System.out.println("Marca: " + moto.getMarca());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Ano: " + moto.getAno());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Cilindrada: " + moto.getCilindrada());
		
	}

}
