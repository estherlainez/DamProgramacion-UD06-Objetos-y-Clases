package Personal;

public class Maquinista {
	String nombre;
	String dni;
	double sueldo;
	String rango;
	
	public Maquinista (String n, String d, double s, String r) {
		this.nombre=n;
		this.dni=d;
		this.sueldo=s;
		this.rango=r;
	}
	
	public String toString () {
					
		return " Nombre: "+this.nombre+
				" DNI: "+this.dni+
				" Sueldo: "+this.sueldo+
				" Rango: "+this.rango;
		
	}
}