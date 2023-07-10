package clases;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UsuarioRegular extends Usuarios {
	 public UsuarioRegular(String nombreUsuario, String contraseña) {
		 super(nombreUsuario, contraseña);
		 
	 }
	 
	 public String getTipoUsuario() {
		 return "Usuario regular";
		 
	 }
	 public void realizarOperacionesMeseros(List<Mesas> listaMesas, List<Hamburguesas> listaHamburguesas, List<Bebida> listaBebida, Scanner scanner) {
		 int opcion = 0;
		 
	        System.out.println("------ Menú ------");
	        System.out.println("1. Comandar");
	        System.out.println("2. Estado de mesas");
	        System.out.println("3. Salir");

	        try {
	            System.out.print("Ingrese una opción: ");
	            opcion = scanner.nextInt();
	            scanner.nextLine();

	            switch (opcion) {
	                case 1:
	                	mostrarListaMesas(listaMesas);
	                	System.out.println("Inserte el número de la mesa: ");
	                	opcion = scanner.nextInt();
	                	mostrarListaMenu(listaHamburguesas, listaBebida);
	                    break;
	                case 2:
	                	mostrarListaMesas(listaMesas);
	                	break;
	                case 3:
	                    System.out.println("Saliendo del sistema...");
	                    break;
	                default:
	                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Error: Ingrese un número entero para seleccionar una opción.");
	            scanner.nextLine();
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
		
		private void mostrarListaMenu(List<Hamburguesas> listaHamburguesas, List<Bebida> listaBebida) {
			if (listaHamburguesas.isEmpty() && listaBebida.isEmpty()) {
				System.out.println("No hay nada en el menú.");
			} else if (listaHamburguesas.isEmpty()) {
				for (Bebida bebida : listaBebida) {
					System.out.println(bebida);
					System.out.println("No hay comida en el menú.");
				}
					} else if (listaBebida.isEmpty()) {
						for (Hamburguesas hamburguesas : listaHamburguesas) {
							System.out.println(hamburguesas);
							System.out.println("No hay bebidas en el menú.");
				}
			} else {
				System.out.println("Menú: ");
				for (Hamburguesas hamburguesas : listaHamburguesas) {
					System.out.println(hamburguesas);
				}
			} for (Bebida bebida : listaBebida) {
				System.out.println(bebida);
			}
		}

		@Override
		public String setTipoUsuario() {
			return null;
		}

		@Override
		public void realizarOperacionesCaja(List<Mesas> listaMesas, List<Hamburguesas> listaHamburguesas, List<Bebida> listaBebida, Scanner scanner) {
			
		}

		@Override
		public String getTipoUsuario2() {
			return null;
		}



		@Override
		public void realizarOperacionesAdmin(List<Empleado> listaEmpleados, List<Hamburguesas> listaHamburguesas,
				List<Bebida> listaBebida, List<Mesas> listaMesas, Scanner scanner) {
			
			
		}
}
	 
 