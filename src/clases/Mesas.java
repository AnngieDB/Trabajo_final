package clases;

public class Mesas {
	
	private int numero;
    private String estado;
 

    public Mesas(int numero) {
        this.numero = numero;
        this.estado = "Cerrada";
       
    }

    public int getNumero() {
        return numero;
    }

    public String getEstado() {
        return estado;
    }

    public void abrir() {
        estado = "Abierta";
    }

    public void cerrar() {
        estado = "Cerrada";
     
    }
    
    

	@Override
	public String toString() {
		return "Mesa " + numero + ". Estado: " + estado;
	}

	public static void put(int opcion, boolean b) {
		
	}

}
    
