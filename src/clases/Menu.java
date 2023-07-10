package clases;

public class Menu {
	
    protected int indice;
	protected String nombre;
	protected String ingredientes;
	protected double precio;
	
	public Menu(String nombre, String ingredientes, double precio, int indice) {
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.precio = precio;
		this.indice = indice;
		
	}
	
	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	

	
	

}
