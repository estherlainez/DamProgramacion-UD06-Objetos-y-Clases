package Maquinaria;
import java.util.Scanner;
import Personal.Maquinista;
import Personal.Mecanico;

public class Main_Tren_Copia {

	public static void main(String[] args) {
		//vamos a crear un tren
		//creamos un objeto de tipo tren
		Scanner teclado=new Scanner(System.in);
		int opcion=0;
		boolean operacion = false;
		
		Mecanico mec1=new Mecanico("Francisco García Perez", "605432123","frenos");
		Mecanico mec2=new Mecanico("Jorge Perez Jimenez","649234956","montaje");
		Mecanico mec3=new Mecanico("Marcos Navarro Carcavilla", "656478912","chapa y pintura");
		Locomotora l1=new Locomotora ("5432-HJK", 5000, 1982,mec1);
		Locomotora l2=new Locomotora ("7457-DJD", 4000, 1980,mec2);
		Locomotora l3=new Locomotora ("3318-JZJ",5400, 2017,mec3);
		Maquinista maq1=new Maquinista ("Maria Lopez Galvan", "45678976-T", 45000, "Maquinista becario");
		Maquinista maq2=new Maquinista ("Agustin Moreno Garcia","34512987-S",5400,"Maquinista profesional");
		Maquinista maq3=new Maquinista ("Esther Sadaba Magallon","72456123-F",5000,"Maquinista becaria");
		
		Tren[] arrayTren = new Tren[3];
		Tren t1=new Tren(l1, maq1);
		Tren t2=new Tren(l2, maq2);
		Tren t3=new Tren(l3, maq3);
		arrayTren[0]=t1;
		arrayTren[1]=t2;
		arrayTren[2]=t3;
		/*		
		t1.engancharVagon(5000, 2500, "Robles");
		t1.engancharVagon(100000, 100, "Manzanas");
		t1.engancharVagon(4000, 3000, "Piñas");
		t1.engancharVagon(6000, 1000, "Naranjas");
		t2.engancharVagon(7500, 2000, "Quimicas");
		t2.engancharVagon(10500, 4000, "Resinas");
		t2.engancharVagon(15500, 2000, "Grafitos");
		t3.engancharVagon(8000, 3000, "Lavanderia");
		t3.engancharVagon(9000,500, "Textil");
		t3.engancharVagon(5000, 1200, "Menaje");
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		*/
		
		do {
			System.out.println("MENU");
			System.out.println("1.AÑADIR VAGON");
			System.out.println("2.QUITAR VAGON");
			System.out.println("3.INFORMACION DE UN DETERMINADO TREN");
			System.out.println("4.INFORMACION DE TODOS LOS TRENES");
			System.out.println("5.SALIR");
			System.out.println("INTRODUZCA OPCION");
			opcion=teclado.nextInt();
			switch(opcion) {
			
			case 1:
				System.out.println("1.AÑADIR VAGON");
				System.out.println("INTRODUZCA TREN AL QUE LE AÑADIREMOS EL VAGON 0, 1, 2");
				int num=teclado.nextInt();
				for(int i=0;i<3;i++) {
					String nuevo = null;
					if(arrayTren[i].equals(num)) {
						arrayTren[i].engancharVagon( 5000,  1000,  nuevo);
						arrayTren[i].toString();
					}
				}
				/*
				if(num==1) {
					t1.engancharVagon(8000, 2500, "Pinos");
					t1.engancharVagon(5000, 2500, "Robles");
					t1.toString();
				}else if(num==2) {
					t2.engancharVagon(20000, 10500, "Piritas");
					t2.toString();
				}else if(num==3) {
					t3.engancharVagon(20000, 2500, "Todo para el hogar");
					t3.toString();
				}*/
				break;
			
			case 2:
				System.out.println("2.QUITAR VAGON");
				System.out.println("INTRODUZCA TREN AL QUE LE QUITAREMOS EL VAGON");
				num=teclado.nextInt();
				String ultimo = null;
				
				if(operacion==true) {
					for(int i=0;i<3;i++) {
						if(arrayTren[i].equals(num)) {
							operacion=arrayTren[i].desengancharVagon ();
							arrayTren[i].toString();
						}
					}
				}else {
					System.out.println("NO SE PUEDE QUITAR VAGON");
				}
				
				/*
				 if(num==1) {
						t1.desengancharVagon(6000, 1000, "Naranjas");
						
						t1.toString();
					}else if(num==2) {
						t2.desengancharVagon(15500, 2000, "Grafitos");
						t2.toString();
					}else if(num==3) {
						t3.desengancharVagon(5000, 1200, "Menaje");
						t3.toString();
					}*/
				break;
				
			case 3:
				System.out.println("3.INFORMACION DE UN DETERMINADO TREN");
				System.out.println("Introduzca el tren a consultar informacion: 0,1,2");
				int n=teclado.nextInt();
				/*
				if(n==1) {
					System.out.println(t1.toString());
				}else if(n==2) {
					System.out.println(t2.toString());
				}else if(n==3) {
					System.out.println(t3.toString());
				}
				*/
				
				for(Tren a:arrayTren) {
					System.out.println("HOLA"+a.getNumero());
					if(a.getNumero()==n) {
						System.out.println("halo caracola");
						a.toString();
					}
				}
				
				break;
				
			case 4:
				System.out.println("4.INFORMACION DE TODOS LOS TRENES");
				System.out.println(t1.toString());
				System.out.println();
				System.out.println(t2.toString());
				System.out.println();
				System.out.println(t3.toString());
				
				/*
				for(Tren a:arrayTren) {
						a.toString();	
				}
				*/
				break;
				
			
			case 5:
				System.out.println("5.SALIR");
				break;
			
			
		    }
			
		}while(opcion!=5);
	}

}
