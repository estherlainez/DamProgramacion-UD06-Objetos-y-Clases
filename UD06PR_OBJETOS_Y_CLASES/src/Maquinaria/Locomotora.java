package Maquinaria;
import Personal.Mecanico;
public class Locomotora {
	String matricula;
	int a�oFabricacion;
	int potencia;
	Mecanico datosMecanico;
	
	public Locomotora(String m,int p, int aF, Mecanico mec) {
		this.matricula=m;
		this.potencia=p;
		this.a�oFabricacion=aF;
		this.datosMecanico=mec;
	}
	
	public String toString () {
		
		return " A�o Matricula: "+ this.matricula+
				" Potencia "+this.potencia+
				" A�o de Fabricacion: "+this.a�oFabricacion+
				" "+datosMecanico.toString();
	}

}
