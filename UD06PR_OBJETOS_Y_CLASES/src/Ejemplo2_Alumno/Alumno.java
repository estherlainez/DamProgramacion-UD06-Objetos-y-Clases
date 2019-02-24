package Ejemplo2_Alumno;

public class Alumno {
	/*creamos los atributos*/
	String nombre;
	String apellidos;
	double notaMedia;
	
	public Alumno(String n,String a,double not) {
		nombre=n;
		apellidos=a;
		notaMedia=not;
	}
	/*ejemplo de sobrecarga de constructores
	 public Alumno(String n,double not) {
		nombre=n;
		apellidos=" ";
		notaMedia=not;
	}
	public Alumno(String n,double not) {
		nombre=n;
		apellidos=" ";
		notaMedia=not;
	} */	
   /*metodos get: nos dan el dato del atributo
    * get=obtener*/
	
	public String getNombre () {	 
		return this.nombre; 
	}
	
	public String getApellidos () {	 
		return this.apellidos; 
	}
	public double getnotaMedia () {	 
		return this.notaMedia; 
	}
	
	/*metodos set: nos permiten  modificar el
	 *  valor de un atributo */
	public void setNombre(String n) {
		this.nombre=n;
	}
	public void setApellidos(String a) {
		this.apellidos=a;
	}
	public void setNotaMedia(double n) {
		this.notaMedia=n;
	}
	public String toString() {
		System.out.println("Nombre: "+this.nombre+"  Apellidos: "
				+" Nota Media: "+this.notaMedia);
		return "Nombre:"+this.nombre+"Apellidos: "
		+"Nota Media: "+this.notaMedia;
	}
	
}
