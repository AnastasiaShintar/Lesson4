package by.htp.lesson4;

import java.util.Arrays;

public class Task3 {
	public static void main(String[] args) {
		double arrayA[] = new double[] { -30.6, 15, 80, -66, 36.1, -1.1, 8.3, 8.8, 19.2, 10, -31.6, 16, 85, -67, 34.1,
				-1.6, 8.4, 18.8, 59.2, 18.6 };
		int num = 0;

		double sum = 0;

		for (int i = 2; i < arrayA.length; i += 2) {
			if (arrayA[i] > 0) {
				num++;

			}
		}
		double arrayB[] = new double[num];
		int m = 0;
		for (int j = 2; j < arrayA.length; j += 2) {
			if (arrayA[j] > 0) {
				arrayB[m] = arrayA[j];
				m++;

			}
		}
		System.out.println(Arrays.toString(arrayB));

		for (m = 0; m < arrayB.length; m++) {
			sum += arrayB[m] * arrayB[m];
		}
		String formattedDouble = String.format("%.2f", sum);
		System.out.println("sq.sum =" + formattedDouble);
	}

}
