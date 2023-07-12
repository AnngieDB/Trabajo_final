package clases;
import java.util.List;
import java.util.Scanner;

public abstract class Usuarios implements Autenticable {
    private String nombreUsuario;
    private String contraseña;

    public Usuarios(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean autenticar(String usuario, String contraseña) {
        return this.nombreUsuario.equals(usuario) && this.contraseña.equals(contraseña);
    }

    public abstract String getTipoUsuario();
    public abstract void realizarOperacionesAdmin(List<Empleado> listaEmpleados, List<Hamburguesas> listaHamburguesas, List<Bebida> listaBebida, List<Mesas> listaMesas, Scanner scanner);
    
    public abstract String setTipoUsuario();
    public abstract void realizarOperacionesCaja(boolean[] configurarMesas, List<Mesas> listaMesas, List<Hamburguesas> listaHamburguesas, List<Bebida> listaBebida, Scanner scanner);
    
    public abstract String getTipoUsuario2();
    public abstract void realizarOperacionesMeseros(List<Mesas> listaMesas, List<Hamburguesas> listaHamburguesas, List<Bebida> listaBebida, Scanner scanner);
    	


			
		}


