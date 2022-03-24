package ejemplo;

public final class Supermercado extends Tienda {
	
	//atributos
	
		private int SeccionesS;
		
		//constructor

		public Supermercado(int SeccionesS) {
			this.SeccionesS = SeccionesS;
		}
		
		//getters and setters
		
		public int getSeccionesS() {
			return SeccionesS;
		}

		public void setSeccionesS(int SeccionesS) {
			this.SeccionesS = SeccionesS;
		}
		
		//metodo que lleva la cuenta de los empleados
		
		@Override
		public int empleadosSeccion() {
			int numEmpleadosSeccion=0;
			numEmpleadosSeccion= (getEmpleados()/getSeccionesS());
			System.out.println("Tienda tipo Hipermercado. Empleados: " + getEmpleados() + " Secciones: " + getSeccionesS() + " Empleados por Seccion: " + numEmpleadosSeccion);
			return numEmpleadosSeccion;
		}

}
