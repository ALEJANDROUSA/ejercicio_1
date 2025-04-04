package Ejercicio1;

public class Circulo extends Figura {
    private double radio;
    
    
    public Circulo(double radio) {
		super();
		this.radio = radio;
	}

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2); 
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio; 
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }
}