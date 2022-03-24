package ejemplo;

public final class Hipermercado extends Tienda{
	
	//atributos
	
	private int SeccionesH;
	
	//constructor

	public Hipermercado(int seccionesH) {
		this.SeccionesH = seccionesH;
	}
	
	//getters and setters
	
	public int getSeccionesH() {
		return SeccionesH;
	}

	public void setSeccionesH(int seccionesH) {
		this.SeccionesH = seccionesH;
	}
	
	//empleados y metros cuadrados
	
	public int getEmpleadosH() {
		return this.getEmpleados()*3;
	}

	public int getMetros2H() {
		return this.getMetros2()*3;
	}
	
	//metodo que controla los empleados

	@Override
	public int empleadosSeccion() {
		int numEmpleadosSeccion=0;
		numEmpleadosSeccion= (getEmpleadosH()/getSeccionesH());
		System.out.println("Tienda tipo Hipermercado. Empleados: " + getEmpleadosH() + " Secciones: " + getSeccionesH() + " Empleados por Seccion: " + numEmpleadosSeccion);
		return numEmpleadosSeccion;
	}
	
	
	
	

}
