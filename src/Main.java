import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import clases.Administrador;
import clases.Bebida;
import clases.Cajeros;
import clases.Empleado;
import clases.Hamburguesas;
import clases.Mesas;
import clases.UsuarioRegular;
import clases.Usuarios;

public class Main {

	public static void main(String[] args) {
		
		List<Usuarios> usuarios = new ArrayList<>();
        usuarios.add(new Administrador("Mica", "plataplata123"));
        usuarios.add(new Cajeros("CajaTM", "nomellamesmas69"));
        usuarios.add(new UsuarioRegular("LHPlayaGrande", "bacana2021"));

        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Ana", "Mozo", 1));
        listaEmpleados.add(new Empleado("Angie", "Mozo", 2));
        listaEmpleados.add(new Empleado("Cristóbal", "Mozo", 3));
        listaEmpleados.add(new Empleado("Joaquín", "Mozo", 4));
        listaEmpleados.add(new Empleado("Fernando", "Barra", 5));
        listaEmpleados.add(new Empleado("Alexis", "Cocina", 6));
        listaEmpleados.add(new Empleado("Melany", "Cocina", 7));
        listaEmpleados.add(new Empleado("Valentina", "Cocina", 8));
        listaEmpleados.add(new Empleado("Micaela", "Cocina", 9));
        listaEmpleados.add(new Empleado("Brenda", "Caja", 10));
        listaEmpleados.add(new Empleado("Daniela", "Limpieza", 11));
        
        List<Mesas> listaMesas = new ArrayList<>();
        listaMesas.add(new Mesas(10));
        listaMesas.add(new Mesas(11));
        listaMesas.add(new Mesas(12));
        listaMesas.add(new Mesas(13));
        listaMesas.add(new Mesas(20));
        listaMesas.add(new Mesas(21));
        listaMesas.add(new Mesas(22));
        listaMesas.add(new Mesas(23));
        listaMesas.add(new Mesas(50));
        listaMesas.add(new Mesas(51));
        listaMesas.add(new Mesas(52));
        listaMesas.add(new Mesas(53));
        
        List<Hamburguesas> listaHamburguesas = new ArrayList<>();
        listaHamburguesas.add(new Hamburguesas("Cheddar Bacon 'OK-Style'", "Carne 130 grs, panceta crocante, doble queso cheddar, cebolla", 2500.00, 1));
        listaHamburguesas.add(new Hamburguesas("Tex-Mex", "Carne 130 grs, panceta caramelizada, doble queso cheddar, cebolla crispy, BBQ", 2750.00, 2));
        listaHamburguesas.add(new Hamburguesas("La Completa", "Carne 130 grs, jamón cocido, queso pategras, lechuga, tomate, huevo", 2500.00, 3));
        listaHamburguesas.add(new Hamburguesas("Mejicana", "Carne 130 grs, queso cheddar, guacamola, pico de gallo, nachos", 2600.00, 4));
        listaHamburguesas.add(new Hamburguesas("Americana", "Carne 130 grs, lechuga, tomate, cebolla morada, queso cheddar, huevo, panceta crocante, pepinos agridulces", 2750.00, 5));
        listaHamburguesas.add(new Hamburguesas("La Provo", "Carne 130 grs, provoleta sellada, cherrys asados, pesto de albahaca, alioli, rúcula", 3100.00, 6));
        listaHamburguesas.add(new Hamburguesas("Porto-Bello", "Hongo portobello, espinaca, queso azul, cebolla morada, salsa pesto de albahaca", 2150.00, 7));
        listaHamburguesas.add(new Hamburguesas("Junior", "Carne 100 grs, queso cheddar", 2200.00, 8));
        listaHamburguesas.add(new Hamburguesas("LH triple", "Triple carne de 60 grs, triple cheddar, dip de BBQ", 2750.00, 9));
        listaHamburguesas.add(new Hamburguesas("Tenders de pollo", "Pollo rebozado servidos con mostaza y miel, acompañados de papas fritas", 2150.00, 10));
        
        List<Bebida> listaBebida = new ArrayList<>();
        listaBebida.add(new Bebida("Jarra de Limonada", "Jarra 1 litro, con menta y limón", 1700.00, 1));
        listaBebida.add(new Bebida("Coca-Cola", "Común", 600.00, 2));
        listaBebida.add(new Bebida("Coca-Cola", "Zero", 600.00, 3));
        listaBebida.add(new Bebida("Coca-Cola", "Light", 600.00, 4));
        listaBebida.add(new Bebida("Sprite", "Común", 600.00, 5));
        listaBebida.add(new Bebida("Sprite", "Zero", 600.00, 6));
        listaBebida.add(new Bebida("Fanta", "Común", 600.00, 7));
        listaBebida.add(new Bebida("Agua sin gas", "Agua", 600.00, 8));
        listaBebida.add(new Bebida("Agua con gas", "Agua, pero con gas", 600.00, 9));
        listaBebida.add(new Bebida("Agua saborizada (Levite)", "Manzana", 600.00, 10));
        listaBebida.add(new Bebida("Agua saborizada (Levite)", "Naranja", 600.00, 11));
        listaBebida.add(new Bebida("Agua saborizada (Levite)", "Pomelo", 600.00, 12));
        listaBebida.add(new Bebida("Agua saborizada (Levite)", "Pera", 600.00, 13));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Administración de LH Playa Grande");
        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        boolean autenticado = false;
        Usuarios usuarioAutenticado = null;

        for (Usuarios usuario : usuarios) {
            if (usuario.autenticar(nombreUsuario, contraseña)) {
                autenticado = true;
                usuarioAutenticado = usuario;
                break;
            }
        }

        if (autenticado) {
        	System.out.println(" ");
            System.out.println("Inicio de sesión exitoso. Tipo de usuario: " + usuarioAutenticado.getTipoUsuario());
            System.out.println("Bienvenidx de nuevo " + nombreUsuario);
            System.out.println(" ");
            usuarioAutenticado.realizarOperacionesAdmin(listaEmpleados, listaHamburguesas, listaBebida, listaMesas, scanner);
            usuarioAutenticado.realizarOperacionesCaja(listaMesas, listaHamburguesas, listaBebida, scanner);
            usuarioAutenticado.realizarOperacionesMeseros(listaMesas, listaHamburguesas, listaBebida, scanner);
            
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
        }
		
		
	}
}


