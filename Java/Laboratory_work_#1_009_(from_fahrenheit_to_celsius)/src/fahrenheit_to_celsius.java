import java.util.Scanner;

public class fahrenheit_to_celsius {

	private static Scanner in;

	public static void main(String[] args) {
		/*
		 
		 Напишите программу для перевода температуры в градусах по Фаренгейту в градусы по Цельсию по формуле C = 5/9(F - 32)
		 
		 
		 
		 */
		
		in = new Scanner (System.in);
		
		System.out.print("Введите темпиратуру в градусах по Фаренгейту: ");
		float F = in.nextFloat();
		
		float C;
		
		C = (5 * (F-32)) / 9;
		
		System.out.println("Температура в Сельсиях составляет: " + C);
	}

}
