package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entero: ");
		int test = Utils.readInt(sc);
		
		System.out.println("Introduce un número con decimales: ");
		double test2 = Utils.readDouble(sc);
		
		
		sc.close();
	}

}
