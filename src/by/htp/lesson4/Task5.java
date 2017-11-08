package by.htp.lesson4;

import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {
		int N = 10;
		int max = 0;
		int matr[][] = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				matr[i][j] = 1 + (int) (Math.random() * 100);
			}
		}
		for (int m = 0; m < matr.length; m++) {
			System.out.println(Arrays.toString(matr[m]));
		}

		int[] maxArray = new int[N];

		for (int i = 0; i < N; i++) {
			max = matr[0][i];
			for (int j = 0; j < N; j++) {
				if (matr[j][i] > max) {
					max = matr[j][i];
				}
			}
			maxArray[i] = max;
		}
		System.out.println();
		System.out.println(Arrays.toString(maxArray));

	}

}
