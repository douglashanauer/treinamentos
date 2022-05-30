package bytebank;

public class TestaConta {
	
	
	public static void main(String[] args) {
		double saque = 110.00;
		double transfere = 50.00;
		Conta contaOrigem = new Conta(1337, 23334);
		Conta contaDestino = new Conta(1223, 25896);
		
		
		contaOrigem.deposita(200.0);
		
		System.out.println("o saldo da conta origem e de: " + contaOrigem.getSaldo());
		
		contaOrigem.setAgencia(1234);
		
		System.out.println("a agencia da conta origem agora é; " + contaOrigem.getAgencia());
		
		System.out.println("o total de contas sao : " + Conta.getTotal());
		//saldo das contas
		System.out.println("o saldo da conta origem: " + contaOrigem.getSaldo());
		System.out.println("o saldo da conta destino: "+ contaDestino.getSaldo());
		
		contaOrigem.saca(saque);
		System.out.println("o valor do saque foi de: " + saque);
		System.out.println("o saldo da conta origem após saque: " +contaOrigem.getSaldosaque());
		
		contaOrigem.transfere(transfere, contaDestino);
		System.out.println("o valor da transferencia foi de: "+ transfere);
		
		//saldo das contas após saque e transferência
		System.out.println("o saldo da conta origem após realizar transferência: " +contaOrigem.getSaldo());
		System.out.println("o saldo da conta destinho atualizado: " +contaDestino.getSaldo());
		
	}
	
}
