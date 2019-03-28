package br.com.senaigo.AulaThreadHomer;

public class JarraBiscoitos {
 private int conteudo;
 private boolean disponivel = false;
 
 public synchronized void pegarBiscoitos(String quem) {
	 while(!disponivel) {
		 try {
			 wait();
		 }catch (InterruptedException e) {
			 
		 }
	 }
	 disponivel = false;
	 notifyAll();
	 System.out.println(quem + "comeu os biscoitos " + conteudo);
 }
 public synchronized void colocarBiscoito(String quem, int value) {
	 while(disponivel) {
		 try {
			 wait();
		 }catch (InterruptedException e) {
			 
		 }
	 }
	conteudo = value;
	disponivel = true;
	System.out.println(quem + "colocou o biscoito " + conteudo + " na Jarra.");
	notifyAll();
 }
 
 
}
