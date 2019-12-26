package cocolove;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y= 2020;
		double hour=17.305555;
		Locale.setDefault(Locale.US); //convertando a virgula para padrão "."
		System.out.printf("%.2f%n", hour);
		System.out.println("Olá Mundo!");//o println da a quebra de linha
		System.out.print("Mais um Ano se passando,que tenhamos muita paz e Amor."); // Não quebra linha print
		System.out.printf("Estamos Perto de " + y + " Fique ligado no futuro!" );  // Versão formatada
		//Repare que usamos virgula para concatenação e o sinal + também nos exemplos
		
		
		 
	
		
		
	}

}
