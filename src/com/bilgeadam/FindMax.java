package com.bilgeadam;

public class FindMax {

	public static int findMax(int arr[]) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
