package classes;

import interfaces.Navegador;
import interfaces.ReprodutorMusical;
import interfaces.Telefone;

public class Smartphone implements Telefone, ReprodutorMusical, Navegador {

	private String marca;
	
	private String modelo;
	
	private short anoLancamento;
	
	private String memoriaRAM;
	
	private String armazenamento;

	public Smartphone(String marca, String modelo, short anoLancamento, String memoriaRAM, String armazenamento) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoLancamento = anoLancamento;
		this.memoriaRAM = memoriaRAM;
		this.armazenamento = armazenamento;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public short getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(short anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(String memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Smartphone [marca=" + marca + ", anoLancamento=" + anoLancamento + ", memoriaRAM=" + memoriaRAM
				+ ", armazenamento=" + armazenamento + "]";
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo p�gina: " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Aba adicionada.");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando p�gina...");
		System.out.println("P�gina atualizada.");
		
	}

	@Override
	public void tocar() {
		System.out.println("Reproduzindo m�sica...");
		
	}

	@Override
	public void pausar() {
		System.out.println("M�sica pausada.");
		
	}

	@Override
	public void selecionarMusica(String nome) {
		System.out.println("M�sica " + nome + " selecionada.");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Liga��o atendida.");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
		System.out.println("Correio de voz iniciado.");
		
	}

	
}
