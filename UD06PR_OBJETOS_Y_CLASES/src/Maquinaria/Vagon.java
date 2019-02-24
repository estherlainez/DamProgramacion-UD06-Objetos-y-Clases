package Maquinaria;

public class Vagon {
	int capacidadMax;
	int capacidadActual;
	String mercancia;
	
	public Vagon (int cM, int cA, String m) {
		this.capacidadMax=cM;
		this.capacidadActual=cA;
		this.mercancia=m;
	}
	
	public String toString() {
		return " \nDatos del vagon :\n"+
				" Capacidad Actual: "+this.capacidadActual+
				" Capacidad Máxima: "+this.capacidadMax+
				" tipo de mercancia: "+this.mercancia;
	}
}
