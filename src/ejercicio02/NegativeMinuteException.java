package ejercicio02;

public class NegativeMinuteException extends Exception {
	public String toString() {
		return "Se ha introducido un minuto negativo.";
	}
}
