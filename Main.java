package cocolove;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y= 2020;
		double hour=17.305555;
		Locale.setDefault(Locale.US); //convertando a virgula para padr�o "."
		System.out.printf("%.2f%n", hour);
		System.out.println("Ol� Mundo!");//o println da a quebra de linha
		System.out.print("Mais um Ano se passando,que tenhamos muita paz e Amor."); // N�o quebra linha print
		System.out.printf("Estamos Perto de " + y + " Fique ligado no futuro!" );  // Vers�o formatada
		//Repare que usamos virgula para concatena��o e o sinal + tamb�m nos exemplos
		
		
		 
	
		
		
	}

}
