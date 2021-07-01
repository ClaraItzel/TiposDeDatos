/**
 * 
 */

/**
 * @author USER
 *
 */
public class conversion_datos {

	/**
	 * Tipos de datos en java
	 * byte->short->int->long->float->double
	 * Numericos: byte, short, int, long, float, double
	 * Booleanos: true, false
	 * Cadenas: String
	 */
	public static void main(String[] args) {
	int numero1= 1000;
	long numero2= numero1;
	float numero3= numero2;
	
	//pasar long a int 
	long n1=1030;
	int n2= (int) n1;
	
	System.out.println(n1);
	System.out.println(numero1);
	System.out.println(numero2);
	System.out.println(numero3);

	}

}
