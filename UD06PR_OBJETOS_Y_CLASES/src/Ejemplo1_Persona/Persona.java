package Ejemplo1_Persona;

public class Persona {
	/*En java los nombres de las clases se escriben con la
	 * primera letra en mayuscula mientras que los nombres de las 
	 * instancias comienzan con una letra en minuscula.
	 * 
	 */
	/*Vamos a definir los atributos nombre,edad y estatura*/	
	
	/*SINTAXIS:
	 * tipoDeDato Identificar
	 */
	String nombre="MariaJose";
	int edad=16;
	double estatura=1.67;
	
	/*Creamos el constructor se define en la clase
	 *Este es constructor por defecto,sin argumentos*/
	public Persona() {
		 nombre="Por Defecto";
		 edad=0;
		 estatura=1.00;
	}
	/*Podemos crear varios constructores, cada uno con 
	 * diferentes parametros, de forma que los usemos segun
	 * lo que necesitemos en cada momento
	 */
	public Persona(String n, int e, double a) {
		nombre=n;
		edad=e;
		estatura=a;
	}
	
	public Persona(String n) {
		nombre=n;
		edad=0;
		estatura=1.00;
	}
	
}
