package com.sort;

public class BubbleSort {

	private void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - i; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bubbleSort = new BubbleSort();
		int[] array = { 5, 2, 3, 6, 8, 1 };
		bubbleSort.sort(array);
	}

}
