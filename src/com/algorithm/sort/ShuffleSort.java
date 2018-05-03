package com.algorithm.sort;

public class ShuffleSort {

	public static void main(String[] args) {
		ShuffleSort shuffleSort = new ShuffleSort();
		shuffleSort.execute();
	}

	private void execute() {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] result = sort(arr);
		for (int i : result) {
			System.out.println(i);
		}
	}

	private int[] sort(int[] arr) {
		int size = arr.length;
		int[] result = new int[size];
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				result[i] = arr[size - 1 - i/2];
			}else {
				result[i] = arr[i/2];
			}
		}
		return result;
	}
}
