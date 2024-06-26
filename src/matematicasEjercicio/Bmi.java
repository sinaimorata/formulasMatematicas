package matematicasEjercicio;

public class Bmi {

	public static void main(String[] args) {
		System.out.println(Bmi(63,1.68));
		
	}
	public static double Bmi(double peso, double altura) {
		double indiceMasaCorporal = peso/Math.pow(altura, 2);
		return indiceMasaCorporal;
	}
}
