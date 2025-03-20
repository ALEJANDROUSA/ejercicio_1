package ejerciciotienda;

public class Productos {
	 private int codigo;
	    private String nombreProducto;
	    private Tipo tipo;
	    private Fecha fechaVencimiento;

	    public Productos(int codigo, String nombreProducto, Tipo tipo, Fecha fechaVencimiento) {
	        this.codigo = codigo;
	        this.nombreProducto = nombreProducto;
	        this.tipo = tipo;
	        this.fechaVencimiento = fechaVencimiento;
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


		@Override
		public String toString() {
			return "codigo: " + codigo + ", nombre: " + nombreProducto + "| IVA: " + tipo.getIva() + "%"
					+ (fechaVencimiento != null ? " | Vence: " + fechaVencimiento : " | No perecedero");
		}	
}
