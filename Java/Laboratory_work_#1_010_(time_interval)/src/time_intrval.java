import java.util.Scanner;

public class time_intrval {

	private static Scanner in;

	public static void main(String[] args) {
		/*
		 * «аданы моменты начала и конца некоторого промежутка времени в часа€, минутах и сеундах (в пределах одних суток).
		 * Ќайти продолжительность этого промежутка в техже единицах
		 * 
		 * h - часы
		 * m - минуры
		 * s - секунды
		 * 
		 * begin - начало
		 * end - конец
		 * diff - разница
		 * 
		 */
		
		System.out.println("ѕродолжительность промежутка времени");
		System.out.println();
		
		in = new Scanner (System.in);
		
		System.out.println("¬ведите часы (начала промежутка): ");
		int h1 = in.nextInt();
		System.out.println("¬ведите минуты (начала промежутка): ");
		int m1 = in.nextInt();
		System.out.println("¬ведите секунды (начала промежутка): ");
		int s1 = in.nextInt();
		
		
		System.out.println("¬ведите часы (конца промежутка): ");
		int h2 = in.nextInt();
		System.out.println("¬ведите минуты (конца промежутка): ");
		int m2 = in.nextInt();
		System.out.println("¬ведите секунды (конца промежутка): ");
		int s2 = in.nextInt();
		
		/*
		 * 	ѕереведем часы и менуты в секунды с последующим их слодением
		 *  
		 */
		
		int begin = (((h1 * 60) + m1) * 60 + s1);
		int end = (((h2 * 60) + m2) * 60 + s2);
		
		System.out.println("Ќачало промежутка в секундах: " + begin);
		System.out.println(" онец промежутка в секундах: " + end);
		
		int diff = (end - begin);
		
		int diff_h = (diff/3600);
		int diff_m = ((diff - (diff_h * 3600))/60);
		int diff_s = (diff - (diff_h * 3600) - (diff_m * 60));
		
		System.out.println(h1 + " " + m1 + " " + s1);
		System.out.println(h2 + " " + m2 + " " + s2);
		
		System.out.println("–азница составл€ет " + diff_h + " " + diff_m  + " " + diff_s);

	}

}
