package Ejemplo1_Persona;

import Ejemplo1_Persona.Persona;

public class PersonaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Una vez definida la clase podemos definir objetos*/	
		/*SINTAXIS definicion de Objetos:* 
		 * 
		 *NombreClase NombreObjeto= new Constructor();
		 */		
		Persona p1=new Persona();	
		/*SINTAXIS para acceder a los atributos del objeto
		 * nombreObjeto.atributo;
		 * */
		System.out.println(p1.nombre);
		System.out.println(p1.edad);
		System.out.println(p1.estatura);
		
		Persona p2=new Persona();
		/*Podemos cambiar los valores de los atributos con los que
		 * se han creado inicialmente. Esta practica no es correcta.
		 */
		p2.nombre="Andres";
		p2.edad=45;
		p2.estatura=1.89;		
		System.out.println(p2.nombre);
		System.out.println(p2.edad);
		System.out.println(p2.estatura);
		/*Vamos a usar el otro constructor del que disponemos*/
	    Persona p3=new Persona("Jose",13,1.5);
		
		System.out.println(p3.nombre+" "+p3.edad+" "+p3.estatura);
		
		Persona p4=new Persona("Pedro",21,1.60);
		System.out.println(p4.nombre+" "+p4.edad+" "+p4.estatura);

		Persona p5=new Persona();
		System.out.println(p5.nombre+" "+p5.edad+" "+p5.estatura);
		
		Persona p6=new Persona("martinica");
		System.out.println(p6.nombre+" "+p6.edad+" "+p6.estatura);
		
		
	}

}
