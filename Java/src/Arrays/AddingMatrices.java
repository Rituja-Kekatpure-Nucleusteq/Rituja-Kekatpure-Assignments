package Arrays;

import java.util.Scanner;

public class AddingMatrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Rows:");
		int r = sc.nextInt();
		System.out.print("Enetr the number of Columns");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		int[][] arr1 = new int[r][c];
		int[][] sum = new int[r][c];

		System.out.println("Enter the elements of First Array:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the elements of Second Array:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}

		System.out.println("The elements of First Array:");
		for (int i[] : arr) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

		System.out.println("The elements of Second Array:");
		for (int i[] : arr1) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sum[i][j] = arr[i][j] + arr1[i][j];
			}
		}

		System.out.println("The elements of Final Array:");
		for (int i[] : sum) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

	}
}
