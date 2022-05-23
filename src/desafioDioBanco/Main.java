package desafioDioBanco;

public class Main {

	public static void main(String[] args) {
		
		Cliente thiago = new Cliente();
		thiago.setNome("thiago");
		
		Conta contaCorrente = new ContaCorrente(thiago);
		contaCorrente.depositar(100);
		
		Conta contaPoupanca = new ContaPoupanca(thiago);
		
		contaCorrente.transferir(101, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
		
	}

}
