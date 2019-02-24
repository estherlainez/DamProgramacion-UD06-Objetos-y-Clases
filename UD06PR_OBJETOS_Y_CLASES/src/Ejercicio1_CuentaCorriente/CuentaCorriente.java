package Ejercicio1_CuentaCorriente;

public class CuentaCorriente {
	/* Dise�ar la clase CuentaCorriente, sabiendo que los datos necesarios son: saldo, l�mite de descubierto, 
	 * nombre y dni del titular. Crear la cuenta: se necesita nombre y DNI del titular. El saldo inicial ser� 0 y
	 *  el l�mite de descubierto ser� -50 euros. Solo se podr� sacar dinero hasta el l�mite de descubierto. El
	 *  m�todo debe indicar si ha sido posible llevar a cabo la operaci�n. Al ingresar dinero se incrementa 
	 *  el saldo. Mostrar informaci�n: muestra la informaci�n disponible de la cuenta corriente
	 */
	
	/*creamos los atributos*/
	String dni;
	String nombre;
	double saldo;
	double limite;
	
	/*creamos el constructor, su nombre siempre es igual al nombre de la clase*/
	public CuentaCorriente (String n, String d) {
		dni=d;
		nombre=n;
		saldo=0;
		limite=-50;
	}
	
	//otros constructores
	public CuentaCorriente (double saldo ) {	
		limite=0;
		
	}
	public CuentaCorriente (double s,double l, String d) {
		dni=d;
		saldo=s;
		limite=l;
	}
	
	//metodos get
	public String getNombre () {	 
		return this.nombre; 
	}
	public String getDni () {	 
		return this.dni; 
	}
	public double getSaldo () {	 
		return this.saldo; 
	}
	public double getLimite () {	 
		return this.limite; 
	}
	
	//metodos set
	public void setNombre(String n) {
		this.nombre=n;
	}
	public void setDni(String d) {
		this.dni=d;
	}
	public void setSaldo(double s) {
		this.saldo=s;
	}
	public void setLimite(double l) {
		this.limite=l;
	}
	
	
	public boolean sacarDinero (double cantidad) {
		boolean operacionRealizada;
		if ((saldo-cantidad)>=limite) {
			saldo=saldo-cantidad;
			operacionRealizada=true;
			System.out.println("La operaci�n ha sido realizada con �xito");
		}else {
			operacionRealizada=false;
			System.out.println("La operaci�n no ha podido realizarse");
		}
		return operacionRealizada;
	}
	public void ingresarDinero (double cantidad) {
		saldo=saldo+cantidad;
	}
	
	public String toString () {
		
		System.out.println("\nDNI "+dni+"\nNombre "+nombre+"\nSaldo: "+saldo
				+"\nL�mite descubierto: "+limite);
		return"\nDNI "+dni+"\nNombre "+nombre+"\nSaldo: "+saldo
				+"\nL�mite descubierto: "+limite;
	}
	

}

