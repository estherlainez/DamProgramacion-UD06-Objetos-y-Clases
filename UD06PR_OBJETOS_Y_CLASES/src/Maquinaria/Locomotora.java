package Maquinaria;
import Personal.Mecanico;
public class Locomotora {
	String matricula;
	int aņoFabricacion;
	int potencia;
	Mecanico datosMecanico;
	
	public Locomotora(String m,int p, int aF, Mecanico mec) {
		this.matricula=m;
		this.potencia=p;
		this.aņoFabricacion=aF;
		this.datosMecanico=mec;
	}
	
	public String toString () {
		
		return " Aņo Matricula: "+ this.matricula+
				" Potencia "+this.potencia+
				" Aņo de Fabricacion: "+this.aņoFabricacion+
				" "+datosMecanico.toString();
	}

}
