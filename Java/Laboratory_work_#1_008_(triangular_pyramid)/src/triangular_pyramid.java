import java.util.Scanner;

public class triangular_pyramid {

	public static void main(String[] args) {
		/* ����� ����������� ��������, � ��������� ������� ����� �������������� ����������� � �������� a � b. ������ �������� h.

		
		*/
		Scanner in = new Scanner (System.in);	
		
		System.out.print("������� ������ ����� a: ");
		double a = in.nextDouble();
		System.out.print("������� ������ ����� b: ");
		double b = in.nextDouble();
		System.out.print("������� ������ �������� h: ");
		double h = in.nextDouble();
		
		double s;
		
		s = (a * b)/2;
		
		double v;
		
		v = (s * h)/3;
		
		System.out.println("����� ����������� �������� ����� " + v);
	}

}
