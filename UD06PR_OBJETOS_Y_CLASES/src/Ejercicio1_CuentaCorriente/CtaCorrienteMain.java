package Ejercicio1_CuentaCorriente;
import java.util.Scanner;

import Ejemplo2_Alumno.Alumno;
public class CtaCorrienteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		boolean hecho=false;
		int opcion=0;
		double cantidad=0;	
		String d="22333444";
		
		//Array de objetos
		CuentaCorriente[] arrayClientes = new CuentaCorriente[5];
		arrayClientes[0]=new CuentaCorriente("Miguel","22333444");
		arrayClientes[1]=new CuentaCorriente("Marcos","72345678");
		arrayClientes[2]=new CuentaCorriente("Esther","73082576");
		arrayClientes[3]=new CuentaCorriente("Pilar","73457890");
		arrayClientes[4]=new CuentaCorriente("Luis","24578912");

		do {
			System.out.println("Menu de opciones");
			System.out.println("¿Que opcion desea realizar?");
			System.out.println("1. Sacar dinero");
			System.out.println("2. Ingresar dinero");
			System.out.println("3. Ver detalles de la cuenta de un usuario");
			System.out.println("4. Ver detalles de la cuenta de todos usuarios");
			System.out.println("5. Salir");
			System.out.print("Introduzca la opcion que desea realizar: ");
			opcion=teclado.nextInt();
			
			switch(opcion) {
			
			case 1:
				System.out.println("1. Sacar dinero");
				System.out.println("Introduce tu dni");
				teclado.nextLine();
				d=teclado.nextLine();
				
				for(int i=0;i<5;i++) {
					if(arrayClientes[i].getDni().equals(d)) {
						System.out.println("Introduce la cantidad a sacar");
						cantidad=teclado.nextDouble();
						System.out.println("VAMOS A SACAR "+cantidad+"\n\n");
						arrayClientes[i].sacarDinero(cantidad);
						hecho=true;
					}
				}
				if(hecho==true) {
					System.out.println("Su operacion se ha completado, hasta pronto");
				}else {
					System.out.println("La operacion no ha podido realizarse");
				}
				break;
			case 2:
				System.out.println("2. Ingresar dinero");
				System.out.println("Introduce tu dni");
				teclado.nextLine();
				d=teclado.nextLine();
				for(int i=0;i<5;i++) {
					if(arrayClientes[i].getDni().equals(d)) {
						System.out.println("Introduce la cantidad a ingresar");
						cantidad=teclado.nextDouble();
						System.out.println("VAMOS A INGRESAR "+cantidad+"\n\n");
						arrayClientes[i].ingresarDinero(cantidad);
						hecho=true;
					}
				}
				if(hecho==true) {
					System.out.println("Su operacion se ha completado, hasta pronto");
					
				}else {
					System.out.println("La operacion no ha podido realizarse");
				}
				
				break;
			case 3:
				System.out.println("3. Ver informacion de la cuenta por dni");
				System.out.println("Introduzca dni a consultar");
				teclado.nextLine();
				d=teclado.nextLine();
				for(int i=0;i<5;i++) {			
					if(arrayClientes[i].getDni().equals(d)) {
						arrayClientes[i].toString();
					}				
				}
				
				break;
			case 4:
				System.out.println("4. Ver informacion de la cuenta de los clientes");
				for(int i=0;i<5;i++) {
						arrayClientes[i].toString();	
				}
				//con for each seria:
				/*for(CuentaCorriente e:arrayClientes) {
					e.toString();
				}*/
				
				break;
			case 5:
				System.out.println("5. Salir");	
				System.out.println("Hasta pronto!!!");
				break;
		
			}
		}while (opcion!=5);
				
	}

}
