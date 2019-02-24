package Maquinaria;
import Personal.Maquinista;
public class Tren {
	Locomotora datosLocomotora;
	Maquinista datosMaquinista;
	Vagon vagones[];
	private int numVagones; //numero de vagones que tiene el tren
	int numero;
	
	
	public Tren (Locomotora dL, Maquinista mQ) {
		this.datosLocomotora=dL;
		this.datosMaquinista=mQ;
//aqui reservamos memoria del array del atributo
		this.vagones = new Vagon[5]; 
		this.numVagones=0;
	}
	
		
	public String toString () {
		String d=
				"D A T O S   D E L  T R E N"
				+ "\nDATOS DE LA LOCOMOTORA\n"+
				datosLocomotora.toString()+
				"\nDATOS DEL MAQUINISTA\n"+
				datosMaquinista.toString();
			for (int i=0;i<this.numVagones;i++) {
				d=d+vagones[i].toString();
			}
	
		return d;
		
		}
	
	public void engancharVagon(int cM, int cA, String merc) {
		
		if (numVagones<5) {
			Vagon v= new Vagon (cM, cA, merc);
			vagones[numVagones]=v;
			numVagones++;
		}else {
			System.out.println("El tren no admite más vagones");
		}
	}
	
	public boolean desengancharVagon() {
		boolean hecho=false;
		if(numVagones>0) {
			numVagones=numVagones-1;
			hecho=true;
		}else {
			System.out.println("El tren no permite quitar más vagones");
		}
		return hecho;
		
	}
	
	
	public int getNumero() {
		return this.numero; 
	}
	

	public void setNumero(int n) {
			this.numero=n;
	}


	
}
