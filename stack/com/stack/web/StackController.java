package com.stack.web;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.contest.service.DSAContest3Service;
import com.stack.service.SwamiStack;

public class StackController {

	static Scanner scan = new Scanner(System.in);
	static SwamiStack stack = new SwamiStack();

	public static void main(String[] args) {
		
		

		 addIntoStack();
		 System.out.println(stack.peek());
		 System.err.println(stack.size());
		 System.err.println(stack.pop());
		 System.err.println(stack.peek());
		 System.err.println(stack.size());

	}

	public static SwamiStack addIntoStack() {
		int size = scan.nextInt();
		for (int i = 0; i < size; i++) {
			stack.push(scan.nextInt());
		}

		return stack;
	}

	public static void oneDArrayTest() {
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}

	}

	public static void twoDArrayTest() {
		int row = scan.nextInt();
		int[][] cordinates = new int[row][2];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < 2; j++) {
				cordinates[i][j] = scan.nextInt();
			}
		}
	}

}
