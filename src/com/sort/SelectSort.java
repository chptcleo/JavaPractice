package com.sort;

public class SelectSort {

	private void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectSort selectSort = new SelectSort();
		int[] array = { 4, 7, 2, 3, 5, 9, 1 };
		selectSort.sort(array);
	}

}
