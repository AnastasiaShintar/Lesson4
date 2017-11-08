package by.htp.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		int x, n = 0, k = 5;
		
		Scanner in = new Scanner (System.in);
		System.out.println("¬ведите число от 0 до 10, количество которого необходимо посчитать в массиве:");
		
		x = in.nextInt();
		
		int matr[][] = new int[k][k];

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				matr[i][j] = (int) (0 + Math.random() * 10);
			}
		}
		for (int m = 0; m < matr.length; m++) {
			System.out.println(Arrays.toString(matr[m]));
		}
		
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				if (matr[i][j] == x) {
					n++;
				}
			}
		}
		in.close();
		
		System.out.println("„исло " + x + " повтор€етс€ в заданном массиве " + n + " раз(а).");
		
	}
}
