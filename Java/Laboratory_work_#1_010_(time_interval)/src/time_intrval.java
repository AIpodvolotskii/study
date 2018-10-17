import java.util.Scanner;

public class time_intrval {

	private static Scanner in;

	public static void main(String[] args) {
		/*
		 * ������ ������� ������ � ����� ���������� ���������� ������� � �����, ������� � ������� (� �������� ����� �����).
		 * ����� ����������������� ����� ���������� � ����� ��������
		 * 
		 * h - ����
		 * m - ������
		 * s - �������
		 * 
		 * begin - ������
		 * end - �����
		 * diff - �������
		 * 
		 */
		
		System.out.println("����������������� ���������� �������");
		System.out.println();
		
		in = new Scanner (System.in);
		
		System.out.println("������� ���� (������ ����������): ");
		int h1 = in.nextInt();
		System.out.println("������� ������ (������ ����������): ");
		int m1 = in.nextInt();
		System.out.println("������� ������� (������ ����������): ");
		int s1 = in.nextInt();
		
		
		System.out.println("������� ���� (����� ����������): ");
		int h2 = in.nextInt();
		System.out.println("������� ������ (����� ����������): ");
		int m2 = in.nextInt();
		System.out.println("������� ������� (����� ����������): ");
		int s2 = in.nextInt();
		
		/*
		 * 	��������� ���� � ������ � ������� � ����������� �� ���������
		 *  
		 */
		
		int begin = (((h1 * 60) + m1) * 60 + s1);
		int end = (((h2 * 60) + m2) * 60 + s2);
		
		System.out.println("������ ���������� � ��������: " + begin);
		System.out.println("����� ���������� � ��������: " + end);
		
		int diff = (end - begin);
		
		int diff_h = (diff/3600);
		int diff_m = ((diff - (diff_h * 3600))/60);
		int diff_s = (diff - (diff_h * 3600) - (diff_m * 60));
		
		System.out.println(h1 + " " + m1 + " " + s1);
		System.out.println(h2 + " " + m2 + " " + s2);
		
		System.out.println("������� ���������� " + diff_h + " " + diff_m  + " " + diff_s);

	}

}
