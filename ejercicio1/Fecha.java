package ejercicio1;

public class Fecha {
	private int anio;
	private int mes;
	private int dia;
	
	public Fecha(int anio, int mes, int dia) {
		this.anio=anio;
		this.dia=dia;
		this.mes=mes;		
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	@Override
	public String toString() {
		return "Fecha de vencimiento en el año: " + anio + ", mes: " + mes + ", dia: " + dia + "";
	}
}
