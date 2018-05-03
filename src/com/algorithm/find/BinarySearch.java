package com.algorithm.find;

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		binarySearch.execute();
	}

	private void execute() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int number = 7;
		int index = search(arr, number);
		System.out.println(number + " at the index of " + index);
	}

	private int search(int[] arr, int number) {
		int left = 0;
		int size = arr.length;
		int right = size - 1;
		int mid;

		while (left < right) {
			mid = left + (right - left) / 2;
			if (number > arr[mid]) {
				left = mid + 1;
			} else if (number < arr[mid]) {
				right = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
