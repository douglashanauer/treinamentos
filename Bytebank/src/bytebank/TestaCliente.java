package bytebank;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		Cliente Cliente01 = new Cliente();
		
		Cliente01.setNome("pedro");
		Cliente01.setCpf(587785655);
		Cliente01.setProfissao("QA");
		
		System.out.println("meu nome é " + Cliente01.getNome());
		System.out.println(Cliente01.getCpf());
		System.out.println(Cliente01.getProfissao());	
	}
}
