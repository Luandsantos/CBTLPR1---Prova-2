package Prova02;

import java.util.Scanner;
import java.util.Locale;

public class TesteHora {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));
	
	Scanner userInput = new Scanner(System.in);  
	
	System.out.println("Digite os valores do horário.");
	
	System.out.print("Hora: ");
	int hora = userInput.nextInt();
	
	System.out.print("Minutos: ");
	int min = userInput.nextInt();
	
	System.out.print("Segundos: ");
	int seg = userInput.nextInt();
	
	while (hora > 24 || hora < 0 || min > 59 || min < 0 || seg > 59 || seg < 0){
		System.out.println("Algum valor é inválido. Digite os valores do horário novamente.");
		
		System.out.print("Hora: ");
		hora = userInput.nextInt();
		
		System.out.print("Minutos: ");
		min = userInput.nextInt();
		
		System.out.print("Segundos: ");
		seg = userInput.nextInt();
	}
	
	Hora hora1 = new Hora(hora, min, seg);
	
	System.out.println(hora1.getHora1());
	System.out.println(hora1.getHora2());
	System.out.println("Horário convertido para segundos: " + hora1.getSegundos() + " segundos");

	userInput.close();
  }
}
