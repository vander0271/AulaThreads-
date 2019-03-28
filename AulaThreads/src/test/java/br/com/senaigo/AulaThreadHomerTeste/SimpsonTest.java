package br.com.senaigo.AulaThreadHomerTeste;

import br.com.senaigo.AulaThreadHomer.Homer;
import br.com.senaigo.AulaThreadHomer.JarraBiscoitos;
import br.com.senaigo.AulaThreadHomer.Marge;

public class SimpsonTest {

	public static void main(String[] args) {
		JarraBiscoitos jar = new JarraBiscoitos();
		
		Homer homer = new Homer(jar);
		Marge marge = new Marge(jar);
		
		new Thread (homer).start();
		new Thread (marge).start();
	}
}
