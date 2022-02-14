package BancoDigital;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\n---\tConta Poupan�a\t---");
		this.imprimirInfosComuns();
	}
	
	public void simulacaoPoupanca(int tempo) {
		double rendimento = 0d;
		double valorFinal = 0d;
		for (int i = 0;i<tempo;i++) {
			rendimento = this.getSaldo()*0.005; //simula��o a 0.5% de rendimento ao m�s
			valorFinal +=rendimento;
		}
		System.out.println("Valor de rendimento ap�s " + tempo + "= R$ " + valorFinal);
	}

}
