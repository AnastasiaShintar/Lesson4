package by.htp.lesson4;

import java.util.Arrays;

public class Task1 {
	public static void main(String[] args) {

		double array[] = new double[] { 0.92, 1.00, 0.42, 0.40, 0.48 };
		{
			System.out.println(Arrays.toString(array));
		}
		int nMin = 0;
		int nMax = 0;

		double max = array[0];
		double min = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
				nMax = i;
			}
			if (array[i] < min) {
				min = array[i];
				nMin = i;
			}
		}
		double tmp = array[nMax];
		array[nMax] = array[nMin];
		array[nMin] = tmp;

		System.out.println(Arrays.toString(array));
	}
}
