package Aula1;

public class Controller {

	public Controller() {
	     super();
	}
	//Projeto: Uma opera��o que receba um vetor de 1000 posi��es e gere o tempo gasto para percorrer o vetor. 
	//Repetir para 10000 e 100000 posi��es. Responder com o tempo (em nS ou S) de cada opera��o.
	
	//Concatena os caracteres, 1 a 1, em uma var. String
	
	public void concatenaString() {
		String conc = "";
		double TI = System.nanoTime();
		
		int j = 1000; 
		System.out.println("Segundos: ");
		
		do {
			for (int i = 0; i <= j; i++) {
				conc = conc + "a";
			}
				double TF = System.nanoTime();
				double TT = TF - TI;
				
				
				TT = TT / Math.pow(10, 9);    //Papa deixar em segundos e n�o em nano segundos
				
				System.out.println(j+ " -> "+ TT+"s.");
				
				j = j * 10;
			
		} while (j < 100001); 
		
	}
}
