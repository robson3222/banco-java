package banco;

public class Main {

	public static void main(String[] args) {
		Cliente Rob = new Cliente();
		Rob.setNome("rob");
		
		Conta cc = new ContaCorrente(Rob);
		Conta poupanca = new ContaPoupanca(Rob);

		cc.depositar(100);
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}