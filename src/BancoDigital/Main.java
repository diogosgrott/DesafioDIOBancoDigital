package BancoDigital;

public class Main {

	public static void main(String[] args) {
		Cliente diogo = new Cliente("Diogo Sgrott", "077.064.089-30", "Joinville-SC");
		
		ContaCorrente cc = new ContaCorrente(diogo);
		cc.depositar(100);
		
		ContaPoupanca cp = new ContaPoupanca(diogo);
		cc.transferir(50, cp);		
		cp.simulacaoPoupanca(5);
		
		
	}

}
