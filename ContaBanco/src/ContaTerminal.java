import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		Conta conta = new Conta();
		
		System.out.println("Por favor, digite o número da Conta: ");
		int numeroConta = sc.nextInt();
		conta.setNumero(numeroConta);
		
		System.out.println("Por favor, digite o número da Agência: ");
		String numeroAgencia = sc.next();
		conta.setAgencia(numeroAgencia);
		
		System.out.println("Por favor, digite seu nome: ");
		sc.nextLine(); // clean input data
		String nome = sc.nextLine();
		conta.setNomeCliente(nome.toUpperCase());
		
		System.out.println("Por favor, informe seu saldo (x.xx): ");
		BigDecimal saldo = sc.nextBigDecimal();
		conta.setSaldo(saldo);
		
		sc.close();
		
		System.out.println(
				"Olá "+ conta.getNomeCliente() +", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é "+ conta.getAgencia() +", conta "+ conta.getNumero() +" e seu "
				+ "saldo R$"+ conta.getSaldo() +" já está disponível para saque"
			);
		
	}

}
