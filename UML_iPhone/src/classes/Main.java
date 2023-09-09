package classes;

public class Main {

	public static void main(String[] args) {
		Smartphone iPhone = new Smartphone(
				"Apple", "iPhone 1", (short) 2007, "128MB", "4GB"
				);
		
		System.out.println(iPhone);
		
		iPhone.exibirPagina("www.google.com");
		iPhone.atualizarPagina();
		iPhone.adicionarNovaAba();
		iPhone.selecionarMusica("DVRST - Dream Space");
		iPhone.tocar();
		iPhone.pausar();
		iPhone.ligar("21 955555555");
		iPhone.iniciarCorreioVoz();
		iPhone.atender();

	}

}
