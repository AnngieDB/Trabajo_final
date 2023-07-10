package clases;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Administrador extends Usuarios {

	public Administrador(String nombreUsuario, String contraseña) {
		 super(nombreUsuario, contraseña);
		 
	 }
	 
	 public String getTipoUsuario() {
		 return "Administrador";
	 }
	 
	 public void realizarOperacionesAdmin(List<Empleado> listaEmpleados, List<Hamburguesas> listaHamburguesas, List<Bebida> listaBebida, List<Mesas> listaMesas, Scanner scanner) {
	        int opcion = 0;

	        while (opcion != 5) {
	            System.out.println("------ Menú ------");
	            System.out.println("1. Ver lista de empleados");
	            System.out.println("2. Cambiar datos de un empleado");
	            System.out.println("3. Añadir un nuevo empleado");
	            System.out.println("4. Quitar un empleado");
	            System.out.println("5. Ver menú");
	            System.out.println("6. Configurar menú");
	            System.out.println("7. Salir");

	            try {
	                System.out.print("Ingrese una opción: ");
	                opcion = scanner.nextInt();
	                scanner.nextLine();

	                switch (opcion) {
	                    case 1:
	                        mostrarListaEmpleados(listaEmpleados);
	                        break;
	                    case 2:
	                        cambiarDatosEmpleado(listaEmpleados, scanner);
	                        break;
	                    case 3:
	                        agregarEmpleado(listaEmpleados, scanner);
	                        break;
	                    case 4:
	                        quitarEmpleado(listaEmpleados, scanner);
	                        break;
	                    case 5:
						    mostrarListaMenu(listaHamburguesas, listaBebida);
	                    	break;
	                    case 6:
	                    	System.out.println("Ingrese una opción: ");
	                    	System.out.println("1. Agregar plato");
	                    	System.out.println("2. Eliminar plato");
	                    	opcion = scanner.nextInt();
	    	                scanner.nextLine();
						if (opcion == 1) {
	                    	    	agregarListaMenu(listaHamburguesas, listaBebida, scanner, scanner);
	                    	    } else {
	                    	    	quitarListaMenu(listaHamburguesas, listaBebida, scanner);
	                    	    	
	                    	    }
	                    	break;
	                    case 7:
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
	    }

	    private void mostrarListaMenu(List<Hamburguesas> listaHamburguesas, List<Bebida> listaBebida) {
		
	    	if (listaHamburguesas.isEmpty()) {
	    		System.out.println("No hay elementos en el menú.");
	    	} else {
	    		System.out.println("--- Menú --- ");
	    		System.out.println("Hamburguesas: ");
	    		for (Hamburguesas hamburguesas : listaHamburguesas) {
	    			System.out.println(hamburguesas);
	    		}
	    		System.out.println("Bebidas: ");
	    		for (Bebida bebidas : listaBebida) {
	    			System.out.println(bebidas);
	    		}
	  
	    	}

	}
	    private void agregarListaMenu(List<Hamburguesas> listaHamburguesas, List<Bebida> listaBebida, Scanner scanner2, Scanner scanner) {
	    	System.out.println("Agregar: ");
	    	System.out.println("1. Comida");
	    	System.out.println("2. Bebida");
	    	int respuesta = scanner.nextInt();
	        scanner.nextLine();
	         if (respuesta == 1) {
	    	   System.out.print("Ingrese el nombre de la nueva hamburguesa: ");
	           String nombre = scanner.nextLine();
	           System.out.println("Ingrese sus ingredientes: ");
	           String ingredientes = scanner.nextLine();
	           System.out.println("Ingrese su precio: ");
	           double precio = scanner.nextDouble();
	           int indice = 0;
			   listaHamburguesas.add(new Hamburguesas(nombre, ingredientes, precio, indice));
			   System.out.println("Hamburguesa agregada exitosamente al menú");
	         } else if (respuesta == 2) {
	    	     System.out.println("Ingrese el nombre de la nueva bebida: ");
	    	     String nombre2 = scanner.nextLine();
	    	     System.out.println("Ingrese sus ingredientes: ");
	    	     String ingredientes2 = scanner.nextLine();
	    	     System.out.println("Ingrese su precio: ");
	    	     double precio2 = scanner.nextDouble();
	    	     int indice2 = 0;
	    	     listaBebida.add(new Bebida(nombre2, ingredientes2, precio2, indice2));
	    	     System.out.println("Bebida agregada exitosamente al menú");
	    	  
	      }
	    }
	    
	    private void quitarListaMenu(List<Hamburguesas> listaHamburguesas, List<Bebida> listaBebida, Scanner scanner) {
	    	System.out.print("Quitar:");
	    	System.out.println(" ");
	    	System.out.println("1. Comida");
	    	System.out.println("2. Bebida");
	        int respuesta =  scanner.nextInt();
	        scanner.nextLine();
	        
	        if (respuesta == 1) {
	        	System.out.println(listaHamburguesas);
	        	System.out.println("Ingrese el índice de la hamburguesa que desea eliminar del menú: ");
	        	int indice = scanner.nextInt();
	        	scanner.nextLine();
	        	if (indice >= 0 && indice < listaHamburguesas.size()) {
		            listaHamburguesas.remove(indice);
		            System.out.println("Plato eliminado correctamente.");
	        	} else {
		            System.out.println("Índice inválido. No se puede quitar el plato.");
		        }
	        } else if (respuesta == 2) {
	        	System.out.println(listaBebida);
	        	System.out.println("Ingrese el índice de la bebida que desea eliminar del menú: ");
	        	int indice = scanner.nextInt();
	        	scanner.nextLine();
	        	if (indice >= 0 && indice < listaBebida.size()) {
		            listaBebida.remove(indice);
		            System.out.println("Bebida eliminada correctamente.");
	        	} else {
		            System.out.println("Índice inválido. No se puede quitar la bebida.");
	        	}
	        }

	        
	        
	    }

		private void mostrarListaEmpleados(List<Empleado> listaEmpleados) {
	        if (listaEmpleados.isEmpty()) {
	            System.out.println("No hay empleados en la lista.");
	        } else {
	            System.out.println("Lista de empleados:");
	            for (Empleado empleado : listaEmpleados) {
	                System.out.println(empleado);
	            }
	        }
	    }

	    private void cambiarDatosEmpleado(List<Empleado> listaEmpleados, Scanner scanner) {
	        System.out.print("Ingrese el índice del empleado a modificar: ");
	        int indice = scanner.nextInt();
	        scanner.nextLine();

	        if (indice >= 0 && indice < listaEmpleados.size()) {
	            Empleado empleado = listaEmpleados.get(indice);
	            System.out.print("Ingrese el nuevo nombre del empleado: ");
	            String nuevoNombre = scanner.nextLine();
	            empleado.setNombre(nuevoNombre);
	            System.out.println("Datos del empleado actualizados correctamente.");
	        } else {
	            System.out.println("Índice inválido. No se puede modificar el empleado.");
	        }
	    }

	    private void agregarEmpleado(List<Empleado> listaEmpleados, Scanner scanner) {
	        System.out.print("Ingrese el nombre del nuevo empleado: ");
	        String nombre = scanner.nextLine();
	        System.out.println("Ingrese su puesto de trabajo: ");
	        String puesto = scanner.nextLine();
	        int indice = 0;
			listaEmpleados.add(new Empleado(nombre, puesto, indice));
	        System.out.println("Nuevo empleado agregado correctamente.");
	    }

	    private void quitarEmpleado(List<Empleado> listaEmpleados, Scanner scanner) {
	        System.out.print("Ingrese el índice del empleado a quitar: ");
	        int indice = scanner.nextInt();
	        scanner.nextLine();

	        if (indice >= 0 && indice < listaEmpleados.size()) {
	            listaEmpleados.remove(indice);
	            System.out.println("Empleado eliminado correctamente.");
	        } else {
	            System.out.println("Índice inválido. No se puede quitar el empleado.");
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
		public void realizarOperacionesMeseros(List<Mesas> listaMesas, List<Hamburguesas> listaHamburguesas, List<Bebida> listaBebida, Scanner scanner) {
			
		}


			
		}

 

