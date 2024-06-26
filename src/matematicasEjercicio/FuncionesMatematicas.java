package matematicasEjercicio;


public class FuncionesMatematicas {

	public static void main(String[] args) {
	
		int areaPrimerTriangulo = areaTriangulo(5,4);
		
		System.out.println(areaTriangulo(areaPrimerTriangulo,50));
		
		System.out.println(areaTriangulo(8,7));

		System.out.println(areaCirculo(3));
		
		System.out.println(areaRombo(5,5));
		
		System.out.println(areaCuadrado(4));
		
		System.out.println(areaTrapecio(4,5,4));
		
		System.out.println(areaRectangulo(3,3));

	}

	public static int areaTriangulo(double base, double altura) {
		double area = (base*altura)/2;
		
		//return "El área del triángulo es: "+area;
		//CASTING (DISFRAZAR UN TIPO EN OTRO. OJO. P.S.----INDICO QUE VA A SALIR ADE+ D DD HAGO EL CASTING.
		return (int)area;
	}
	public static double areaCirculo(double radio) {
		
		double area =Math.PI * Math.pow(radio, 2);
		return area;
	}
	public static double areaRombo(double diagonal1,double diagonal2) {
		
		double area = 0.5* diagonal1*diagonal2;
		return area;
	}
	public static double areaCuadrado(double lado)	{
		double area = Math.pow(lado,2);
		return area;
	}
	public static double areaTrapecio (double base1, double base2, double altura) {
		double area = 0.5*(base1+base2)*altura;
		return area;
	}
	public static double areaElipse(double radioMayor, double radioMenor) {
		double area = Math.PI*radioMayor*radioMenor;
		return area;
	}
	public static double areaRectangulo (double ancho, double altura) {
		double area = ancho*altura;
		return area;
	}
	public static double areaTrianguloEquilatero(double lado) {
		double area = Math.sqrt(3)/4*Math.pow(lado,2);
		return area;
	}
	
		
}

