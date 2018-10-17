import java.util.Scanner;

public class triangular_pyramid {

	public static void main(String[] args) {
		/* Объем треугольной пирамиды, в основании которой лежит приямоугольный треугольник с катетами a и b. Высота пирамижы h.

		
		*/
		Scanner in = new Scanner (System.in);	
		
		System.out.print("Введите первый катет a: ");
		double a = in.nextDouble();
		System.out.print("Введите второй катет b: ");
		double b = in.nextDouble();
		System.out.print("Введите высоту пирамиды h: ");
		double h = in.nextDouble();
		
		double s;
		
		s = (a * b)/2;
		
		double v;
		
		v = (s * h)/3;
		
		System.out.println("Объем треугольной пирамиды равет " + v);
	}

}
