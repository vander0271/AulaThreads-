package br.com.senaigo.AulaThreadHomer;

public class Homer implements Runnable {

	JarraBiscoitos jar;
	
	public Homer(JarraBiscoitos jar) {
		this.jar = jar;
	}
	public void comer() {
		jar.pegarBiscoitos("Homer ");
		try {
			Thread.sleep((int) Math.random() *1000);
		}catch (InterruptedException ie) {}
		
		}
	public void run() {
		for (int i = 1; i <=10; i++) {
			comer();
		}
}

}
