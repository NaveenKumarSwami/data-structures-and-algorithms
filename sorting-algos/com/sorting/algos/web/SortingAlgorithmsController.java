package com.sorting.algos.web;

import java.util.Scanner;

import com.sorting.algo.service.SortingAlgortihmsService;

public class SortingAlgorithmsController {
	static Scanner scanner = new Scanner(System.in);
	static SortingAlgortihmsService sortingAlgortihmsService = new SortingAlgortihmsService();

	public static void main(String[] args) {
		// takeInputsWithTestCases();
		withOutTestCase();

	}

	static void withOutTestCase() {
		int size1 = scanner.nextInt();
		// int size2 = scanner.nextInt();
		int[] arr1 = insertValueIntoArray(size1);
		// int[] arr2 = insertValueIntoArray(size2);
		int[] mergeArray = sortingAlgortihmsService.implementMergeSort(arr1, 0, arr1.length-1);
//		int[] mergeArray = sortingAlgortihmsService.quickSort(arr1, 0, arr1.length -1);
		sortingAlgortihmsService.display(mergeArray);
	}

	static void takeInputsWithTestCases() {
		int testCases = scanner.nextInt();
		while (testCases-- > 0) {
			int findNumber = scanner.nextInt();
			int size = scanner.nextInt();
			int[] arr = insertValueIntoArray(size);
			// sortingAlgortihmsService.display(arr);
			// sortingAlgortihmsService.bubbleSort(arr, arr.length);
			sortingAlgortihmsService.insertionSort(arr, arr.length);
			// sortingAlgortihmsService.selectionSort(arr, arr.length);
			// System.out.println();
			// sortingAlgortihmsService.display(arr);

			// Binary search algo
			System.out.println(sortingAlgortihmsService.checkIfNumberHave(arr, arr.length, findNumber));
		}
	}

	static int[] insertValueIntoArray(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
}
