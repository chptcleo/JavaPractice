package com.algorithm.find;

public class TwoArraySearch {

	public static void main(String[] args) {
		TwoArraySearch twoArraySearch = new TwoArraySearch();
		twoArraySearch.execute();
	}

	private void execute() {
		int[] arrayA = { 2, 4, 5 };
		int[] arrayB = { 1, 3, 4, 5, 7, 9, 12 };
		int[] arrayC = search(arrayA, arrayB, 6);
		for (int i = 0; i < arrayC.length; i++) {
			System.out.println(arrayC[i]);
		}
	}

	private int[] search(int[] arrayA, int[] arrayB, int count) {
		int[] newArray = new int[count];

		int lengthA = arrayA.length;
		int lengthB = arrayB.length;

		int n = 0;
		int m = 0;
		outer: for (int i = lengthA - 1; i > -1; i--) {
			inner: for (int j = lengthB - 1 - m; j > -1; j--) {
				if (n == count) {
					return newArray;
				}
				if (arrayA[i] >= arrayB[j]) {
					newArray[n] = arrayA[i];
					n++;
					continue outer;
				} else if (arrayA[i] <= arrayB[j]) {
					newArray[n] = arrayB[j];
					n++;
					m++;
					continue inner;
				}
			}
		}
		return newArray;
	}

}
