package Ejercicio1_CuentaCorriente;
import java.util.Scanner;
public class CtaCorrienteMainEjemplo {

			public static void main(String[] args) {
				// TODO Apéndice de método generado automáticamente
				
				Scanner teclado=new Scanner (System.in);
				/*construir el objeto mediante el constructor
				 * SINTAXIS:
				 * NombreClase nombreObjeto= new Constructor();
				 * */
				String nombre="perico Garcia";
				CuentaCorriente cc1=new CuentaCorriente (nombre, "22333444T");
				System.out.println("Dni:"+cc1.dni+"\nNombre "+
						cc1.nombre+"\nSaldo: "+cc1.saldo
						+"\nLimite descubierto:"+cc1.limite+"\n\n");
						
				
				System.out.println("Introduce la cantidad a sacar");
				double cantidad=teclado.nextDouble();
				
				/*llamamos al metodo para sacar dinero*/
				boolean operacion=cc1.sacarDinero(cantidad);
				System.out.println(operacion);
				cc1.toString();
				
				System.out.println("Introduce la cantidad a ingresar");
				cantidad=teclado.nextDouble();
				cc1.ingresarDinero(cantidad);
				cc1.toString();
				
				
								
				
			}

		}
