package com.skx.hust.algorithmDaily.sort;

public class QuickSortUtil {

	public static void quickSort(int[] data, int low, int high) {
		if (low < high) {
			int povitIndex = partition(data, low, high);
			quickSort(data, low, povitIndex - 1);
			quickSort(data, povitIndex + 1, high);
		}
	}

	public static int partition(int[] data, int low, int high) {
		int pivot = data[low];
		while (low < high) {
			while (low < high && data[high] >= pivot) {
				high--;
			}
			if (low < high) {
				int temp = data[low];
				data[low] = data[high];
				data[high] = temp;
				low++;
			}
			while (low < high && data[low] <= pivot) {
				low++;
			}
			if (low < high) {
				int temp = data[low];
				data[low] = data[high];
				data[high] = temp;
				high--;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		int[] source = { 1, 5, 3, 9, 7, 6, 3 };
		int length = source.length;
		QuickSortUtil.quickSort(source, 0, length - 1);
		for (int i = 0; i < source.length; i++) {
			System.out.println(source[i]);
		}
	}

}
