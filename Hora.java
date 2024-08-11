package Prova02;

public class Hora {
	
	private int hora;
	private int min;
	private int seg;
	
	public Hora() {
	}
	
	public Hora(int h, int m, int s) {
		this.hora = h;
		this.min = m;
		this.seg = s;
	}
	
	public void setHor(int h) {
		this.hora = h;
	}
	
	public int getHor() {
		return hora;
	}
	
	public void setMin(int m) {
		this.min = m;
	}
	
	public int getMin() {
		return min;
	}
	
	public void setSeg(int s) {
		this.seg = s;
	}
	
	public int getSeg() {
		return seg;
	}
	
	public String getHora1() {
		return "Horário: " + String.format("%02d", getHor()) + ":" +
		String.format("%02d", getMin()) + ":" + String.format("%02d", getSeg());
	}
	
	public String getHora2() {
		if (getHor() > 12) {
			return "Horário em AM/PM: " + String.format("%02d", getHor()) + ":" + 
			String.format("%02d", getMin()) + ":" + String.format("%02d", getSeg()) + " PM";
		} else {
			return "Horário em AM/PM: " + String.format("%02d", getHor()) + ":" + 
			String.format("%02d", getMin()) + ":" + String.format("%02d", getSeg()) + " AM";
		}
	}
	
	public int getSegundos() {
		return (getHor() * 3600 + getMin() * 60 + getSeg());
	}
	
}
