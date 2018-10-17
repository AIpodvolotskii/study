import java.util.Scanner;

public class io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int a = in.nextInt(); //считываем целое число
		byte b = in.nextByte(); //считываем байтовое число
		short c = in.nextShort(); //считываем короткое целое число
		long d = in.nextLong(); //считываем длинное целое число
		double e = in.nextDouble(); //считывает байтовое число
		String srt = in.nextLine(); //считываем одну строку целиком
		String word = in.next(); //считываем строку до первого пробела
		char ch = in.next().charAt(0); //считываем символ
	}

}
