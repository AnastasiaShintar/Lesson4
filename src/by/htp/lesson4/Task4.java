package by.htp.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		int[][] matr = new int[][] { { 18, 11, 5, 4, 11 },
									 { 18, 1, 6, 7, 2 },
									 { 2, 14, 14, 10, 12 },
									 { 13, 5, 11, 19, 19 },
									 { 6, 6, 13, 13, 16 },
									 { 0, 17, 14, 6, 0 },
									 { 14, 0, 2, 11, 7 }};
									 
		int [] tmp = new int [matr[0].length];
	
		
		Scanner in = new Scanner (System.in);
		System.out.println("¬ведите номера строк массива от 0 до 6, которые необходимо помен€ть:");
		int str1 = in.nextInt();
		int str2 = in.nextInt();
		
		tmp = matr [str1];
		matr [str1] = matr [str2];
		matr [str2] = tmp;
		
		for(int i = 0; i < matr.length; i++ ) {
			System.out.println(Arrays.toString(matr[i]));
		}
		in.close();
		

	}

}



