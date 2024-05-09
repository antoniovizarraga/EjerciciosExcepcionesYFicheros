package ejercicio01ficheros;

import java.io.*;

public class Principal {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("src/ejercicio01ficheros/NumerosReales.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Error al leer el archivo.");
		}

	}

}
