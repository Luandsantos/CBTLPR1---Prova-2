package Prova02;
import java.util.Scanner;

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade = 0;
    private String nomeMedico;

    private Scanner userInput = new Scanner(System.in);  


    public ConsultaAgendada() {
        System.out.print("Digite o dia: ");
        int dia = userInput.nextInt();

        System.out.print("Digite o mês: ");
        int mes = userInput.nextInt();

        System.out.print("Digite o ano: ");
        int ano = userInput.nextInt();  

        System.out.print("Hora: ");
        int hor = userInput.nextInt();

        System.out.print("Minutos: ");
        int min = userInput.nextInt();

        System.out.print("Segundos: ");
        int seg = userInput.nextInt();  

        System.out.print("Nome do paciente: ");
        String nP = userInput.next();  

        System.out.print("Nome do médico: ");
        String nM = userInput.next();  
  
        this.data = new Data(dia, mes, ano);
        this.hora = new Hora(hor, min, seg);
        this.nomePaciente = nP;
        this.nomeMedico = nM;
        quantidade++;
    }

    public ConsultaAgendada (int h, int min, int s, int d, int m, int a, String p, String me) { // tinha duas variaveis chamadas de m na folha
        this.hora = new Hora(h, min, s);
        this.data = new Data(d, m, a); 
        this.nomePaciente = p;
        this.nomeMedico = me;
        quantidade++;
    }

    public ConsultaAgendada (Data d, Hora h, String p, String me) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = me;
        quantidade++;
    }

    public void setData(int a, int b, int c) {
        this.data.setDia(a);
        this.data.setMes(b);
        this.data.setAno(c);        
    }

    public void setData() {
        System.out.print("Digite o dia: ");
        int dia = userInput.nextInt();

        System.out.print("Digite o mês: ");
        int mes = userInput.nextInt();

        System.out.print("Digite o ano: ");
        int ano = userInput.nextInt();  

        this.data.setDia(dia);
        this.data.setMes(mes);
        this.data.setAno(ano);   
    }

    public void setHora(int a, int b, int c) {
        this.hora.setHor(a);
        this.hora.setMin(b);
        this.hora.setSeg(c);    
    }

    public void setHora() {
        System.out.print("Hora: ");
        int hor = userInput.nextInt();

        System.out.print("Minutos: ");
        int min = userInput.nextInt();

        System.out.print("Segundos: ");
        int seg = userInput.nextInt();  

        this.hora.setHor(hor);
        this.hora.setMin(min);
        this.hora.setSeg(seg);     
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomePaciente() {
        System.out.print("Nome do paciente: ");
        this.nomePaciente = userInput.next();    
    }

    public void setNomeMedico(String me) {
        this.nomeMedico = me;
    }

    public void setNomeMedico() {
        System.out.print("Nome do médico: ");
        this.nomeMedico = userInput.next();      
    }

    public int getAmostra() { 
        return quantidade;    
    } 

    public String getData() {
        return "Data: " + String.format("%02d", data.getDia()) + "/" + 
                String.format("%02d", data.getMes()) +
                "/" + data.getAno();
    }

    public String getHora() {
		return "Horário: " + String.format("%02d", hora.getHor()) + ":" +
		String.format("%02d", hora.getMin()) + ":" + String.format("%02d", hora.getSeg());
	}

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }
}