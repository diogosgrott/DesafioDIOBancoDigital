package BancoDigital;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\n---\tConta Poupança\t---");
		this.imprimirInfosComuns();
	}
	
	public void simulacaoPoupanca(int tempo) {
		double rendimento = 0d;
		double valorFinal = 0d;
		for (int i = 0;i<tempo;i++) {
			rendimento = this.getSaldo()*0.005; //simulação a 0.5% de rendimento ao mês
			valorFinal +=rendimento;
		}
		System.out.println("Valor de rendimento após " + tempo + "= R$ " + valorFinal);
	}

}
