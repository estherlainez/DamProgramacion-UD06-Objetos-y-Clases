package Ejemplo2_Alumno;

public class AlumnoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno a1=new Alumno("Pepe","Garcia",6.7);
		/*Esto es incorrecto
		 *System.out.println(a1.nombre);*/	
		System.out.println(a1.getNombre()); 
		/*Esto es incorrecto
		a1.nombre="Maria";*/
		a1.setNombre("Maria");
	
	/*vamos a crear un array de objetos*/
		int[] arrayEnteros=new int [4];
	
	
	Alumno[] arrayAlumnos = new Alumno[5];
	
	/*creamos  el objeto directamente en el array*/	
	arrayAlumnos[0]=new Alumno("JoseLuis","perez",7.6);
	/*podemos introducir un objeto directamente en el array*/
	arrayAlumnos[1]=a1;
	
	/*vemos como poder acceder a los objetos del array*/
	System.out.println(
			arrayAlumnos[0].getNombre()+
			arrayAlumnos[0].getApellidos()+
			arrayAlumnos[0].getnotaMedia());
	
	arrayAlumnos[0].getApellidos();
	arrayAlumnos[0].getNombre();
	arrayAlumnos[0].getnotaMedia();
	arrayAlumnos[0].setNombre("Hector");
	arrayAlumnos[0].toString();
	
	arrayAlumnos[1].toString();
	
	
	
	
	
	
	
	
	
	
	}

}
