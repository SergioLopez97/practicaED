package ejemplo;

import java.util.Scanner;

public class UsoTiendas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		int secciones=0;
		
		do {

			System.out.println("Que tipo de tienda quieres crear: (1=Hipermercado, 2=Supermercado y 3=CiTy");

			opcion = sc.nextInt();

			// switch con las distintas opciones a tener en cuenta

			switch (opcion) {

			case 1:

				System.out.println("Cuantas secciones quieres que tenga el hipermercado: ");
				secciones=sc.nextInt();
				Hipermercado hipermercado = new Hipermercado(secciones);
				altaTienda(hipermercado);
				System.out.println();
				System.out.println();
				break;

			case 2:
				System.out.println("Cuantas secciones quieres que tenga el supermercado: ");
				secciones=sc.nextInt();
				Supermercado supermercado = new Supermercado(secciones);
				altaTienda(supermercado);
				System.out.println();
				break;

			case 3:
				System.out.println("Cuantas secciones quieres que tenga el city: ");
				secciones=sc.nextInt();
				City city = new City(secciones);
				altaTienda(city);
				System.out.println();
				break;

			default:
				System.out.println("Has salido del menu");
				System.out.println();
				break;
			}

		} while (opcion < 4);
		
		System.out.println("El numero total de tiendas creadas es: " + Tienda.getnumTiendas());


	}
	
	public static void altaTienda(Tienda t1) {
		t1.empleadosSeccion();
		if(t1.empleadosSeccion()<10) {
			System.out.println( "Es necesario más empleados en esta tienda, vamos a aumentarlos");
			int empleadosAumentados= t1.empleadosSeccion();
			empleadosAumentados = t1.empleadosSeccion() + 10;
			t1.empleadosSeccion();
		}
	}
	
	

}
