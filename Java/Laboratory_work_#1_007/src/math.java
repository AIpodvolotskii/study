
public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.abs(-2.33)); //выводим модуль числа
		System.out.println(Math.round(Math.PI)); //возврашает целое число от PI
		System.out.println(Math.round(9.5)); //округление в большую сторону
		System.out.println(Math.round(9.5-0.0001)); //округдение в ментшую сторону
		System.out.println(Math.ceil(9.4)); //возврашает целое число справа
		double c = Math.sqrt(3 * 3 + 4 * 4); //квадратный корень
		System.out.println(c); // гипотинуза треугольника
		double s1 = Math.cos(Math.toRadians(60));
		System.out.println(s1); //ввыведет косунус угла в 60 градусов
	}

}
