package ejercicio1;

public class Productos {
	private int codigo;
    private String nombreProducto;
    private Tipo tipo;
    private Fecha fechaVencimiento;
    private int precio;
    private int cantidad;

    public Productos(int codigo, String nombreProducto, Tipo tipo, Fecha fechaVencimiento, int precio, int cantidad) {
		super();
		this.codigo = codigo;
		this.nombreProducto = nombreProducto;
		this.tipo = tipo;
		this.fechaVencimiento = fechaVencimiento;
		this.precio = precio;
		this.cantidad = cantidad;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNombreProducto() {
		return nombreProducto;
	}

	
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}



	public Tipo getTipo() {
		return tipo;
	}



	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}



	public Fecha getFechaVencimiento() {
		return fechaVencimiento;
	}



	public void setFechaVencimiento(Fecha fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	
	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "codigo: " + codigo + ", nombre: " + nombreProducto + "/nprecio "   + precio + " Iva " + (precio * tipo.getIva()) + " Precio Total ";
	}
}









