package by.htp.lesson4;

public class Task2 {
	public static void main(String[] args) {

		double array[] = new double[] { 327, 381, 891, 918, 212, 848, 770, 363, 416, 736 };

		double max = array[0];
		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);

		for (int i = 0; i < array.length; i++) {
			double div = array[i];
			double res = div / max;
			String formattedDouble = String.format("%.2f", res);
			System.out.print(formattedDouble + " ");

		}
	}

}
