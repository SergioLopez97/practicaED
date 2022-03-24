package ejemplo;

public final class City extends Tienda{
	
	// atributos

	private int SeccionesC;

	// constructor

	public City(int SeccionesC) {
			this.SeccionesC = SeccionesC;
		}

	// getters and setters

	public int getSeccionesC() {
		return SeccionesC;
	}

	public void setSeccionesC(int SeccionesC) {
		this.SeccionesC = SeccionesC;
	}

	// empleados y metros cuadrados

	public int getEmpleadosC() {
		return this.getEmpleados() * 3;
	}

	public int getMetros2C() {
		return this.getMetros2() * 3;
	}

	@Override
	public int empleadosSeccion() {
		int numEmpleadosSeccion = 0;
		numEmpleadosSeccion = (getEmpleadosC() / getSeccionesC());
		System.out.println("Tienda tipo Hipermercado. Empleados: " + getEmpleadosC() + " Secciones: " + getSeccionesC()+ " Empleados por Seccion: " + numEmpleadosSeccion);
		return numEmpleadosSeccion;
	}

}
