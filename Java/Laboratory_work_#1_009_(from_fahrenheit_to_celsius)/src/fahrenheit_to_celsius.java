import java.util.Scanner;

public class fahrenheit_to_celsius {

	private static Scanner in;

	public static void main(String[] args) {
		/*
		 
		 �������� ��������� ��� �������� ����������� � �������� �� ���������� � ������� �� ������� �� ������� C = 5/9(F - 32)
		 
		 
		 
		 */
		
		in = new Scanner (System.in);
		
		System.out.print("������� ����������� � �������� �� ����������: ");
		float F = in.nextFloat();
		
		float C;
		
		C = (5 * (F-32)) / 9;
		
		System.out.println("����������� � �������� ����������: " + C);
	}

}
