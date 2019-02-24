package Ejercicio3_Persona;

import java.util.Scanner;

public class PersonaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int opcion=0,edad=0,imc=0,numero=0;
		double peso=0,altura=0;
		boolean prueba = false,genero;

		Persona [] arrayPersona=new Persona[3];

		arrayPersona[0]=new Persona("Pepe",25,'H',60,1.70);		
		
		System.out.println("Introduzca los datos de la primera persona");
		System.out.println("Nombre");
		arrayPersona[0].setNombre(teclado.nextLine());		
		System.out.println("Edad");
		arrayPersona[0].setEdad(teclado.nextInt());	
		System.out.println("Sexo");
		teclado.nextLine();
		arrayPersona[0].setSexo(teclado.nextLine().charAt(0));
		System.out.println("Peso");
		arrayPersona[0].setPeso(teclado.nextDouble());
		System.out.println("Altura");
		arrayPersona[0].setAltura(teclado.nextDouble());
		arrayPersona[0].toString();
		
		arrayPersona[1]=new Persona("Jesus",21,'H');
		arrayPersona[1].toString();
		
		arrayPersona[2]=new Persona();
		System.out.println("Cambie los valores de la tercera persona");
		System.out.println("Nombre");
		teclado.nextLine();
		arrayPersona[2].setNombre(teclado.nextLine());		
		System.out.println("Edad");
		arrayPersona[2].setEdad(teclado.nextInt());	
		System.out.println("Sexo");
		teclado.nextLine();
		arrayPersona[2].setSexo(teclado.nextLine().charAt(0));
		System.out.println("Peso");
		arrayPersona[2].setPeso(teclado.nextDouble());
		System.out.println("Altura");
		arrayPersona[2].setAltura(teclado.nextDouble());
		arrayPersona[2].toString();
		
		for(Persona e:arrayPersona) {
			e.setDni();
			e.toString();
		}
		do {
			System.out.println("MENU");
			System.out.println("1.Acceder a la informacion de una persona");
			System.out.println("2.Comprobar su imc");
			System.out.println("3.Comprobar si es mayor de edad");
			System.out.println("4.Mostrar datos de las personas");
			System.out.println("5.Mostrar dni de una persona");
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("1.Acceder a la informacion de una persona");
				System.out.println("Nombre a buscar:");
				teclado.nextLine();
				String n=teclado.nextLine();
				//Dos opciones, una con for 
				for(int i=0;i<3;i++) {
		
					if(arrayPersona[i].getNombre().equals(n)) {
					arrayPersona[i].toString();
					}
				}
				
				//otra con for each
				for(Persona a:arrayPersona) {
					if(a.getNombre().equals(n)) {
						a.toString();
					}
				}
				
			break;
			case 2:
				System.out.println("Comprobar su imc");
				System.out.println("introduce peso");
				peso=teclado.nextDouble();
				System.out.println("introduce altura");
				altura=teclado.nextDouble();
				for(int i=0;i<3;i++) {
					imc=arrayPersona[i].calcularIMC(peso, altura);
				}
				System.out.println("su imc es de "+imc);
				if (imc==0) {
					System.out.println("Esta es su peso ideal");
				}else if(imc==1) {
					System.out.println("Esta por encima de su peso ideal");
					}else if(imc==-1) {	
						System.out.println("Esta por debajo de su peso ideal");
						}
				
				break;
			case 3:
				System.out.println("Comprobar si es mayor de edad");
				System.out.println("¿Cuantos años tiene?");
				edad=teclado.nextInt();
				for(int i=0;i<3;i++) {
					prueba=arrayPersona[i].mayorEdad(edad);
				}
				
				if (prueba==true) {
					System.out.println("Es mayor de edad");
				}else {
					System.out.println("Es menor de edad");
				}
				break;
			case 4:
				System.out.println("Mostrar datos de las personas");
				for(Persona e:arrayPersona) {
					e.toString();
				}
				break;
			case 5:
				System.out.println("Mostrar dni");
				
				for(Persona e:arrayPersona) {
					e.setDni();
					e.toString();
				}
				
				break;
			}
			
		}while(opcion!=5);
	}

}
