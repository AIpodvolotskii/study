import java.util.Scanner;

public class io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int a = in.nextInt(); //��������� ����� �����
		byte b = in.nextByte(); //��������� �������� �����
		short c = in.nextShort(); //��������� �������� ����� �����
		long d = in.nextLong(); //��������� ������� ����� �����
		double e = in.nextDouble(); //��������� �������� �����
		String srt = in.nextLine(); //��������� ���� ������ �������
		String word = in.next(); //��������� ������ �� ������� �������
		char ch = in.next().charAt(0); //��������� ������
	}

}
