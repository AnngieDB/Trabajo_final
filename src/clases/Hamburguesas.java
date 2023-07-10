package clases;

public class Hamburguesas extends Menu {
	public Hamburguesas(String nombre, String ingredientes, double precio, int indice) {
		 super(nombre, ingredientes, precio, indice);

	}

	
	@Override
	public String toString() {
		return indice + ". " + nombre + ". " + " Ingredientes: " + ingredientes + ". Precio: $" + precio;
	}

	
	
	
	}


