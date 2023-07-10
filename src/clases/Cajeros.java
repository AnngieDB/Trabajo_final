package clases;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Cajeros extends Usuarios {
	public Cajeros(String nombreUsuario, String contraseña) {
		 super(nombreUsuario, contraseña);
		 
	 }
	 
	 public String getTipoUsuario() {
		 return "Caja";
	 }
	 
	 public void realizarOperacionesCaja(List<Mesas> listaMesas, List<Hamburguesas> listaHamburguesas, List<Bebida> listaBebida, Scanner scanner) {
	     int opcion = 0;

	        while (opcion != 5) {
	            System.out.println("------ Menú ------");
	            System.out.println("1. Ver mesas");
	            System.out.println("2. Modificar mesas");
	            System.out.println("3. Venta directa");
	            System.out.println("4. Cerrar turno");
	            System.out.println("5. Salir");

	            try {
	            	System.out.println(" ");
	                System.out.print("Ingrese una opción: ");
	                opcion = scanner.nextInt();
	                scanner.nextLine();

	                switch (opcion) {
	                    case 1:
	                    	mostrarListaMesas(listaMesas);
	                    	break;
	                    case 2:
	                    	mostrarListaMesas(listaMesas);
	                    	System.out.println("Ingrese el número de la mesa que desea modificar: ");
	                    	opcion = scanner.nextInt();
	                    	scanner.nextLine();
	                    	if (opcion >= 0 && opcion < listaMesas.size()) {
	                    		System.out.println("1. Abrir mesa " + opcion);
	                    		System.out.println("2. Cerrar mesa " + opcion);
	                    		opcion = scanner.nextInt();
	                    		scanner.nextLine();
	                    		if (opcion == 1) {
	                    			Mesas.put(opcion, true);
	                    			System.out.println("Mesa abierta correctamente.");
	                    		} else if (opcion == 2) {
	                    			Mesas.put(opcion, true);
	                	            System.out.println("Mesa cerrada correctamente.");
	                    	  }
	                    	}
	                    	break;
	                    case 3:
	                    	break;
	                    case 4:
	                    	break;
	                    case 5:
	                    	break;
						}
	                
	            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número entero para seleccionar una opción.");
                scanner.nextLine();
            }
	            }
	        
	 
}

	 private void mostrarListaMesas(List<Mesas> listaMesas) {
	        if (listaMesas.isEmpty()) {
	            System.out.println("No hay mesas en la lista.");
	        } else {
	            System.out.println("Lista de mesas:");
	            for (Mesas mesas : listaMesas) {
	                System.out.println(mesas);
	            }
	        }
	 }


	@Override
	public void realizarOperacionesMeseros(List<Mesas> listaMesas, List<Hamburguesas> listaHamburguesas, List<Bebida> listaBebida, Scanner scanner) {
		
		
	}

	@Override
	public void realizarOperacionesAdmin(List<Empleado> listaEmpleados, List<Hamburguesas> listaHamburguesas,
			List<Bebida> listaBebida, List<Mesas> listaMesas, Scanner scanner) {
		
	}

	@Override
	public String setTipoUsuario() {
		return null;
	}

	@Override
	public String getTipoUsuario2() {
		return null;
	}
}
