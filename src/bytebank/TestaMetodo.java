package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 100;
		conta1.deposita(50);		
		System.out.println("Saldo da conta: " + conta1.saldo);
		
		conta1.saca(20);
		System.out.println(conta1.saldo);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		
		if (conta2.transfere(300, conta1)) {
			System.out.println("Transferencia com sucesso");
		} else
			System.out.println("Transferencia falhou. Dinheiro insuficiente");
		
		System.out.println("Saldo atual da conta1: " + conta1.saldo);
		
		
	}
}
