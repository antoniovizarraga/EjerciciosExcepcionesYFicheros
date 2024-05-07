package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	
	public static int readInt(Scanner sc) {
		int res = 0;
		
		try {
			res = sc.nextInt();
			sc.next();
		} catch(InputMismatchException e) {
			sc.next();
			
			System.out.println("El valor introducido no es de tipo int");
		}
		
		return res;
	}
	
	public static double readDouble(Scanner sc) {
		double res = 0.0;
		
		try {
			
		} catch(InputMismatchException e) {
			
		}
		
		return res;
	}

}
