package Personal;

public class Mecanico {
	String nombre;
	String telefono;
	String especialidad;
	
	public Mecanico (String n, String t, String e) {
		this.nombre=n;
		this.telefono=t;
		this.especialidad=e;
	}
	
	
	public String toString () {
		
		return "\nDATOS DEL MECANICO\n Nombre: "+this.nombre+
				" Teléfono: "+this.telefono+
				" Especialidad: "+this.especialidad;
	}

}
