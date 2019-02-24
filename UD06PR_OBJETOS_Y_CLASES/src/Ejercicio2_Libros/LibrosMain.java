package Ejercicio2_Libros;
import java.util.Scanner;
public class LibrosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array objetos
		Libros[] arrayLibros = new Libros[5];
		arrayLibros[0]= new Libros("12345678","El regreso de Mary Poppins","Disney",240);
		arrayLibros[1]= new Libros("22113344","Sin mirar atras","Carlos Acosta",220);
		arrayLibros[2]= new Libros("33355577","Stranger things","Gina Mcintyre",310);
		arrayLibros[3]= new Libros("66655544","Lo que no mata te hace mas fuerte","David Lagercrantz",500);
		arrayLibros[4]= new Libros("11223344","Infiltrado en el kkklan","Ron Stallworth",430);
		
		for(int i=0;i<5;i++) {
			arrayLibros[i].toString();
		}
			
	}

}
