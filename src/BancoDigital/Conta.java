package BancoDigital;

public abstract class Conta {

	private static final String agenciaPadrao = "0001";
	private static int sequencial = 1;

	protected String agencia;
	protected int numero;
	protected double saldo = 0d;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.agenciaPadrao;
		this.numero = sequencial++;
		this.cliente = cliente;
	}

	public void sacar(double valor) {
		this.saldo -= valor;
		this.imprimirExtrato();

	}

	public void depositar(double valor) {
		this.saldo += valor;
		this.imprimirExtrato();

	}

	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		this.imprimirExtrato();
		contaDestino.imprimirExtrato();
	}

	public void imprimirExtrato() {

	}

	protected void imprimirInfosComuns() {
		System.out.println("Cliente = " + this.cliente.getNome());
		System.out.println("Agência = " + this.agencia);
		System.out.println("Número = " + this.numero);
		System.out.printf("Saldo = R$ %.2f \n", this.saldo);
	}

	public String getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

}
