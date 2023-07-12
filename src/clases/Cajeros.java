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
	 
	 public void realizarOperacionesCaja(boolean[] configurarMesas, List<Mesas> listaMesas, List<Hamburguesas> listaHamburguesas, List<Bebida> listaBebida, Scanner scanner) {
	     int opcion = 0;
	     int numeroMesas = obtenerNumeroMesas();
	     boolean[] mesasAbiertas = new boolean[numeroMesas];

	        while (opcion != 5) {
	            System.out.println("------ Menú ------");
	            System.out.println("1. Ver mesas");
	            System.out.println("2. Modificar mesas");
	            System.out.println("3. Venta directa");
	            System.out.println("4. Salir");

	            try {
	            	System.out.println(" ");
	                System.out.print("Ingrese una opción: ");
	                opcion = scanner.nextInt();
	                scanner.nextLine();

	                switch (opcion) {
	                    case 1:
	                    	mostrarEstadoMesas(configurarMesas);
	                    	break;
	                    case 2:
	                    	System.out.println("Ingrese el número de la mesa que desea modificar: ");
	                    	opcion = scanner.nextInt();
	                    	scanner.nextLine();
	                    	if (opcion >= 0 && opcion < configurarMesas.length) {
	                    		System.out.println("1. Abrir mesa " + opcion);
	                    		System.out.println("2. Cerrar mesa " + opcion);
	                    		opcion = scanner.nextInt();
	                    		scanner.nextLine();
	                    		switch (opcion) {
	                    		case 1:
	                                abrirMesa(configurarMesas);
	                                break;
	                            case 2:
	                                cerrarMesa(configurarMesas);
	                                break;
	                    	
	                    		}
	                    	}
	                    case 3:
	                    	break;
	                    case 4:
	                    	System.out.println("Saliendo del sistema...");
	                    	break;
						}
	                
	            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número entero para seleccionar una opción.");
                scanner.nextLine();
            }
	            }
	        
	 
}

	 private int obtenerNumeroMesas() {
		// TODO Auto-generated method stub
		return 0;
	}
	 
	 private static void mostrarEstadoMesas(boolean[] configurarMesas) {
	        System.out.println();
	        System.out.println("=== Estado de las Mesas ===");
	        for (int i = 0; i < configurarMesas.length; i++) {
	            String estado = configurarMesas[i] ? "Abierta" : "Cerrada";
	            System.out.println("Mesa " + (i + 1) + ": " + estado);
	        }
	    }

	    private static void abrirMesa(boolean[] configurarMesas) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese el número de mesa a abrir: ");
	        int numeroMesa = scanner.nextInt();

	        if (numeroMesa >= 1 && numeroMesa <= configurarMesas.length) {
	        	configurarMesas[numeroMesa - 1] = true;
	            System.out.println("La mesa " + numeroMesa + " ha sido abierta.");
	        } else {
	            System.out.println("Número de mesa inválido. Intente nuevamente.");
	        }
	    }

	    private static void cerrarMesa(boolean[] configurarMesas) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese el número de mesa a cerrar: ");
	        int numeroMesa = scanner.nextInt();

	        if (numeroMesa >= 1 && numeroMesa <= configurarMesas.length) {
	        	configurarMesas[numeroMesa - 1] = false;
	            System.out.println("La mesa " + numeroMesa + " ha sido cerrada.");
	        } else {
	            System.out.println("Número de mesa inválido. Intente nuevamente.");
	        }
	    }

	    private static void tomarComanda(boolean[] configurarMesas, String[] comandas) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese el número de mesa para tomar la comanda: ");
	        int numeroMesa = scanner.nextInt();

	        if (numeroMesa >= 1 && numeroMesa <= configurarMesas.length) {
	            if (configurarMesas[numeroMesa - 1]) {
	                scanner.nextLine(); // Consumir el salto de línea pendiente

	                System.out.print("Ingrese la comanda para la mesa " + numeroMesa + ": ");
	                String comanda = scanner.nextLine();
	                comandas[numeroMesa - 1] = comanda;

	                System.out.println("La comanda para la mesa " + numeroMesa + " ha sido tomada.");
	            } else {
	                System.out.println("La mesa " + numeroMesa + " está cerrada. No se puede tomar la comanda.");
	            }
	        } else {
	            System.out.println("Número de mesa inválido. Intente nuevamente.");
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

	

