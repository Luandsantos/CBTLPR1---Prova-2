package Prova02;

import java.util.Scanner;
import java.util.Locale;

public class TesteConsultaAgendada {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        
        Scanner userInput = new Scanner(System.in);  

        System.out.println("Dados p1: \n");

        ConsultaAgendada p1 = new ConsultaAgendada(21, 13, 53, 8, 10, 2013, "Rafael Vieira", "Perícles Moura");
        System.out.println("Data p1: " + p1.getData());
        System.out.println("Hora p1: " + p1.getHora());
        System.out.println("Nome do paciente p1: " + p1.getNomePaciente());
        System.out.println("Nome do médico p1: " + p1.getNomeMedico());
        System.out.println("Quantidade de Consultas: " + p1.getAmostra());


        System.out.println("\nInserindo valores do p2: \n");

        ConsultaAgendada p2 = new ConsultaAgendada();

        System.out.println("\nDados p2: \n");

        System.out.println("Data p2: " + p2.getData());
        System.out.println("Hora p2: " + p2.getHora());
        System.out.println("Nome do paciente p2: " + p2.getNomePaciente());
        System.out.println("Nome do médico p2: " + p2.getNomeMedico());
        System.out.println("Quantidade de Consultas: " + p1.getAmostra());

        
        System.out.println("\nAtualizando informações de p1: \n");

        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();

        System.out.println("\nInformações de p1 atualizadas: \n");

        System.out.println("Data p1: " + p1.getData());
        System.out.println("Hora p1: " + p1.getHora());
        System.out.println("Nome do paciente p1: " + p1.getNomePaciente());
        System.out.println("Nome do médico p1: " + p1.getNomeMedico() + "\n");
        System.out.println("Quantidade de Consultas: " + p1.getAmostra());

        userInput.close();
    }
}
