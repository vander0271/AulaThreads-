package br.com.senaigo.AulaThreadHomer;

public class Marge implements Runnable{

	JarraBiscoitos jar;
	
	public Marge(JarraBiscoitos jar) {
		this.jar = jar;
	}
	public void bake(int numBiscoitos) {
		jar.colocarBiscoito("Marge ", numBiscoitos);
		try {
			Thread.sleep((int)Math.random()*500);
		}catch(InterruptedException ie) {}
	}
	public void run() {
		for (int i = 0; i < 10; i++) bake(i); 
	}
}
