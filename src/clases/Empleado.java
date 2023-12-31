package clases;

public class Empleado {
	
	private int indice;
	private String nombre;
	private String puesto;

    public Empleado(String nombre, String puesto, int indice) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.indice = indice;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	@Override
	public String toString() {
		return "Empleado " + indice + ": " + nombre + ", " + puesto;
	}
    
    

  
}

