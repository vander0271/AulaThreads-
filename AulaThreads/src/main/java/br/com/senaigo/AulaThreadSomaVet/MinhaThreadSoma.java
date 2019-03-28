package br.com.senaigo.AulaThreadSomaVet;

public class MinhaThreadSoma implements Runnable {

	private String nome;
	private int[] nums;
	private static SomadorVetor somador = new SomadorVetor();
	
	public MinhaThreadSoma(String nome, int[] nums) {
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start();
	}
	
	public void run() {
		
		System.out.println(this.nome + "iniciada");
		int soma = somador.somaArray(this.nums);
		
		System.out.println("Result da soma T." + this.nome + "�:" + soma);
		System.out.println(this.nome + "Terminada");
	}
}
