/* Este codigo ha sido generado por el modulo psexport 20180802-mac de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CALCULAR_LA_VELOCIDAD_DE_UN_AUTOMOVIL.java."

import java.io.*;

public class calcular_la_velocidad_de_un_automovil {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double distancia;
		double tiempo;
		double velocidad;
		System.out.println("Escribe la distancia en kilometros");
		distancia = Double.parseDouble(bufEntrada.readLine());
		System.out.println(" Escribe el tiempo en horas");
		tiempo = Double.parseDouble(bufEntrada.readLine());
		velocidad = distancia/tiempo;
		System.out.println(" La velocidad del automovil es: "+velocidad+" kilometros X hora");
		System.out.println(" Gonzalez Piñon Oscar Zair N.L:17 ");
	}


}

