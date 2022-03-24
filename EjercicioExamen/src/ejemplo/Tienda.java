package ejemplo;

public abstract class Tienda {
	
	//atributos
	
	private int empleados;
	private  int metros2;
	
	//atributo que cuenta las tiendas instanciadas
	
	private static int numeroTiendas = 0;
	
	//constructor
	
	public  Tienda() {
		empleados=50;
		metros2=200;
		numeroTiendas++;
	}
	
	//getters and setters metodos
	
	public int getEmpleados() {
		return empleados;
	}

	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}

	public int getMetros2() {
		return metros2;
	}

	public void setMetros2(int metros2) {
		this.metros2 = metros2;
	}
	
	public static int getnumTiendas() {
		return numeroTiendas;
	}
	
	//metodo que tienen que implementar todas las clases
	
	public abstract int empleadosSeccion();

}
