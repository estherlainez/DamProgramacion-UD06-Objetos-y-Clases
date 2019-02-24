package Maquinaria;
import Personal.Mecanico;
public class Locomotora {
	String matricula;
	int añoFabricacion;
	int potencia;
	Mecanico datosMecanico;
	
	public Locomotora(String m,int p, int aF, Mecanico mec) {
		this.matricula=m;
		this.potencia=p;
		this.añoFabricacion=aF;
		this.datosMecanico=mec;
	}
	
	public String toString () {
		
		return " Año Matricula: "+ this.matricula+
				" Potencia "+this.potencia+
				" Año de Fabricacion: "+this.añoFabricacion+
				" "+datosMecanico.toString();
	}

}
